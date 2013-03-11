package maxiPago.Gateway;

import maxiPago.DataContract.*;
import maxiPago.DataContract.Transactional.Billing;
import maxiPago.DataContract.Transactional.CaptureOrReturn;
import maxiPago.DataContract.Transactional.CreditCard;
import maxiPago.DataContract.Transactional.CreditInstallment;
import maxiPago.DataContract.Transactional.OnFile;
import maxiPago.DataContract.Transactional.Order;
import maxiPago.DataContract.Transactional.PayType;
import maxiPago.DataContract.Transactional.Payment;
import maxiPago.DataContract.Transactional.Recurring;
import maxiPago.DataContract.Transactional.RequestBase;
import maxiPago.DataContract.Transactional.SaveOnFile;
import maxiPago.DataContract.Transactional.Shipping;
import maxiPago.DataContract.Transactional.TransactionDetail;
import maxiPago.DataContract.Transactional.TransactionRequest;
import maxiPago.DataContract.Transactional.Boleto;
import maxiPago.DataContract.Transactional.OnlineDebit;


public class Transaction extends ServiceBase {

	public Transaction() {
		this.setEnvironment("TEST");
	}
	
	private TransactionRequest request;
	
	
	/**
	 * Metodo Sale
	 * @param merchantId @param merchantKey @param referenceNum
	 * @param chargeTotal @param creditCardNumber @param expMonth
	 * @param expYear @param cvvInd @param cvvNumber @param authentication
	 * @param processorId @param numberOfInstallments @param chargeInterest
	 * @param ipAddress  @param customerIdExt @param currencyCode @param fraudCheck
	 * @return
	 * @throws Exception
	 */
	public ResponseBase Sale(String merchantId, String merchantKey, String referenceNum, double chargeTotal, String creditCardNumber
			, String expMonth, String expYear, String cvvInd, String cvvNumber, String authentication, String processorId
			, String numberOfInstallments, String chargeInterest, String ipAddress, String customerIdExt, String currencyCode, String fraudCheck) throws Exception {
		
		this.FillRequestBase("sale", merchantId, merchantKey, referenceNum, chargeTotal, creditCardNumber, expMonth
				, expYear, cvvInd, cvvNumber, authentication, processorId, numberOfInstallments
				, chargeInterest, ipAddress, customerIdExt, currencyCode, fraudCheck);
		
		return new Utils().SendRequest(this.request, this.getEnvironment());
		
	}
	
	
	/**
	 * M�todo FillRequestBase
	 * Popula o requestBase com as informacoes em comum a todos os métodos.
	 * @param operation
	 * @param merchantId
	 * @param merchantKey
	 * @param referenceNum
	 * @param chargeTotal
	 * @param creditCardNumber
	 * @param expMonth
	 * @param expYear
	 * @param cvvInd
	 * @param cvvNumber
	 * @param authentication
	 * @param processorId
	 * @param numberOfInstallments
	 * @param chargeInterest
	 * @param ipAddress
	 * @param customerIdExt
	 * @param currencyCode
	 * @param fraudCheck
	 * @throws Exception
	 */
	private void FillRequestBase(String operation, String merchantId, String merchantKey, String referenceNum, double chargeTotal, String creditCardNumber
			, String expMonth, String expYear, String cvvInd, String cvvNumber, String authentication, String processorId
			, String numberOfInstallments, String chargeInterest, String ipAddress, String customerIdExt, String currencyCode, String fraudCheck) throws Exception {
		
			this.request = new TransactionRequest(merchantId, merchantKey);
			
			Order order = this.request.getOrder();
			RequestBase rBase = new RequestBase();
			
			if(operation.equals("sale"))
				order.setSale(rBase);
			else if(operation.equals("auth"))
				order.setAuth(rBase);
			
			rBase.setReferenceNum(referenceNum);
			rBase.setProcessorID(processorId);
			rBase.setAuthentication(authentication);
			rBase.setIpAddress(ipAddress);
			rBase.setCustomerIdExt(customerIdExt);
			if(fraudCheck != null && fraudCheck.length() > 0)
				rBase.setFraudCheck(fraudCheck);
	
			Payment payment = new Payment();
			rBase.setPayment(payment);
			payment.setChargeTotal(chargeTotal);
			
			if(currencyCode != null && currencyCode.length() > 0)
				payment.setCurrencyCode(currencyCode);
			
			if(numberOfInstallments == null || numberOfInstallments.length() == 0)
				numberOfInstallments = "0";
			
			int tranInstallments = Integer.parseInt(numberOfInstallments);
			
			//Verifica se vai precisar criar o nó de parcelas e juros.
			if ((chargeInterest != null && chargeInterest.length() > 0) && tranInstallments > 1 ) {
				
				payment.setCreditInstallment(new CreditInstallment());
				payment.getCreditInstallment().setChargeInterest(chargeInterest.toUpperCase());
				payment.getCreditInstallment().setNumberOfInstallments(String.valueOf(tranInstallments));
				
			}
			
			TransactionDetail detail = rBase.getTransactionDetail();
			PayType payType  = detail.getPayType();
			
			CreditCard creditCard = new CreditCard();
			payType.setCreditCard(creditCard);
			
			creditCard.setCvvInd(cvvInd);
			creditCard.setCvvNumber(cvvNumber);
			creditCard.setExpMonth(expMonth);
			creditCard.setExpYear(expYear);
			creditCard.setNumber(creditCardNumber);
		
	}
	
	/**
	 * M�todo Sale completo
	 * @param merchantId
	 * @param merchantKey
	 * @param referenceNum
	 * @param chargeTotal
	 * @param creditCardNumber
	 * @param expMonth
	 * @param expYear
	 * @param cvvInd
	 * @param cvvNumber
	 * @param authentication
	 * @param processorId
	 * @param numberOfInstallments
	 * @param chargeInterest
	 * @param ipAddress
	 * @param customerIdExt
	 * @param billingName
	 * @param billingAddress
	 * @param billingAddress2
	 * @param billingCity
	 * @param billingState
	 * @param billingPostalCode
	 * @param billingCountry
	 * @param billingPhone
	 * @param billingEmail
	 * @param shippingName
	 * @param shippingAddress
	 * @param shippingAddress2
	 * @param shippingCity
	 * @param shippingState
	 * @param shippingPostalCode
	 * @param shippingCountry
	 * @param shippingPhone
	 * @param shippingEmail
	 * @param currencyCode
	 * @param fraudCheck
	 * @return
	 * @throws Exception
	 */
	public ResponseBase Sale(String merchantId, String merchantKey, String referenceNum, double chargeTotal
			, String creditCardNumber, String expMonth, String expYear, String cvvInd, String cvvNumber
			, String authentication, String processorId, String numberOfInstallments, String chargeInterest
			, String ipAddress, String customerIdExt, String billingName, String billingAddress
			, String billingAddress2, String billingCity, String billingState, String billingPostalCode
			, String billingCountry, String billingPhone, String billingEmail, String shippingName, String shippingAddress
			, String shippingAddress2, String shippingCity, String shippingState, String shippingPostalCode
			, String shippingCountry, String shippingPhone, String shippingEmail, String currencyCode, String fraudCheck) throws Exception {
		
		this.FillRequestBase("sale", merchantId, merchantKey, referenceNum, chargeTotal, creditCardNumber, expMonth
				, expYear, cvvInd, cvvNumber, authentication, processorId, numberOfInstallments
				, chargeInterest, ipAddress, customerIdExt, currencyCode, fraudCheck);
		
		RequestBase sale = this.request.getOrder().getSale();
		
		Billing billing = new Billing();
		sale.setBilling(billing);
		
		billing.setAddress(billingAddress);
		billing.setAddress2(billingAddress2);
		billing.setCity(billingCity);
		billing.setCountry(billingCountry);
		billing.setEmail(billingEmail);
		billing.setName(billingName);
		billing.setPhone(billingPhone);
		billing.setPostalcode(billingPostalCode);
		billing.setState(billingState);
		
		Shipping shipping = new Shipping();
		sale.setShipping(shipping);
		
		shipping.setAddress(shippingAddress);
		shipping.setAddress2(shippingAddress2);
		shipping.setCity(shippingCity);
		shipping.setCountry(shippingCountry);
		shipping.setEmail(shippingEmail);
		shipping.setName(shippingName);
		shipping.setPhone(shippingPhone);
		shipping.setPostalcode(shippingPostalCode);
		shipping.setState(shippingState);	
		
		return new Utils().SendRequest(this.request, this.getEnvironment());
		
	}
	
	/**
	 * Método Sale
	 * Faz uma autorizacao com captura passando o token do cartao ja salvo na base.
	 * @param merchantId
	 * @param merchantKey
	 * @param referenceNum
	 * @param chargeTotal
	 * @param processorId
	 * @param token
	 * @param customerId
	 * @param numberOfInstallments
	 * @param chargeInterest
	 * @param ipAddress
	 * @param currencyCode
	 * @return
	 * @throws Exception
	 */
    public ResponseBase Sale(String merchantId, String merchantKey, String referenceNum, double chargeTotal, String processorId
                            , String token, String customerId, String numberOfInstallments, String chargeInterest
                            , String ipAddress, String currencyCode, String fraudCheck) throws Exception {
        
        return this.PayWithToken("sale", merchantId, merchantKey, referenceNum, chargeTotal, processorId, token, customerId
                                , numberOfInstallments, chargeInterest, ipAddress, currencyCode, fraudCheck);
        
    }
    
   
    /**
     * Método Sale
     * Faz uma autorizacao com captura salvando o numero de cartao automaticamente.
     * @param merchantId
     * @param merchantKey
     * @param referenceNum
     * @param chargeTotal
     * @param creditCardNumber
     * @param expMonth
     * @param expYear
     * @param cvvInd
     * @param cvvNumber
     * @param processorId
     * @param numberOfInstallments
     * @param chargeInterest
     * @param ipAddress
     * @param customerToken
     * @param onFileEndDate
     * @param onFilePermission
     * @param onFileComment
     * @param onFileMaxChargeAmount
     * @param billingName
     * @param billingAddress
     * @param billingAddress2
     * @param billingCity
     * @param billingState
     * @param billingPostalCode
     * @param billingCountry
     * @param billingPhone
     * @param billingEmail
     * @param currencyCode
     * @return
     * @throws Exception
     */
    public ResponseBase Sale(String merchantId, String merchantKey, String referenceNum, double chargeTotal
                               , String creditCardNumber, String expMonth, String expYear, String cvvInd, String cvvNumber
                               , String processorId, String numberOfInstallments, String chargeInterest, String ipAddress
                               , String customerToken, String onFileEndDate, String onFilePermission, String onFileComment
                               , String onFileMaxChargeAmount, String billingName, String billingAddress, String billingAddress2
                               , String billingCity, String billingState, String billingPostalCode, String billingCountry
                               , String billingPhone, String billingEmail, String currencyCode, String fraudCheck) throws Exception {

        return PaySavingCreditCardAutomatically("sale", merchantId, merchantKey, referenceNum, chargeTotal, creditCardNumber, expMonth, expYear
                                                , cvvInd, cvvNumber, processorId, numberOfInstallments, chargeInterest, ipAddress, customerToken
                                                , onFileEndDate, onFilePermission, onFileComment, onFileMaxChargeAmount, billingName, billingAddress
                                                , billingAddress2, billingCity, billingState, billingPostalCode, billingCountry, billingPhone, billingEmail
                                                , currencyCode, fraudCheck);

    }
	
    /**
     * Método Auth
     * @param merchantId
     * @param merchantKey
     * @param referenceNum
     * @param chargeTotal
     * @param creditCardNumber
     * @param expMonth
     * @param expYear
     * @param cvvInd
     * @param cvvNumber
     * @param authentication
     * @param processorId
     * @param numberOfInstallments
     * @param chargeInterest
     * @param ipAddress
     * @param customerIdExt
     * @param CurrencyCode
     * @param fraudCheck
     * @return
     * @throws Exception
     */
	public ResponseBase Auth(String merchantId, String merchantKey, String referenceNum
			, double chargeTotal, String creditCardNumber, String expMonth, String expYear, String cvvInd
			, String cvvNumber, String authentication, String processorId, String numberOfInstallments
			, String chargeInterest, String ipAddress, String customerIdExt, String currencyCode, String fraudCheck) throws Exception {
		
		this.FillRequestBase("auth", merchantId, merchantKey, referenceNum, chargeTotal, creditCardNumber, expMonth
				, expYear, cvvInd, cvvNumber, authentication, processorId, numberOfInstallments
				, chargeInterest, ipAddress, customerIdExt, currencyCode, fraudCheck);
		
		return new Utils().SendRequest(this.request, this.getEnvironment());
		
	}
	
	
	/**
	 * M�todo Auth completo
	 * @param merchantId
	 * @param merchantKey
	 * @param referenceNum
	 * @param chargeTotal
	 * @param creditCardNumber
	 * @param expMonth
	 * @param expYear
	 * @param cvvInd
	 * @param cvvNumber
	 * @param authentication
	 * @param processorId
	 * @param numberOfInstallments
	 * @param chargeInterest
	 * @param ipAddress
	 * @param customerIdExt
	 * @param billingName
	 * @param billingAddress
	 * @param billingAddress2
	 * @param billingCity
	 * @param billingState
	 * @param billingPostalCode
	 * @param billingCountry
	 * @param billingPhone
	 * @param billingEmail
	 * @param shippingName
	 * @param shippingAddress
	 * @param shippingAddress2
	 * @param shippingCity
	 * @param shippingState
	 * @param shippingPostalCode
	 * @param shippingCountry
	 * @param shippingPhone
	 * @param shippingEmail
	 * @param currencyCode
	 * @param fraudCheck
	 * @return
	 * @throws Exception
	 */
	public ResponseBase Auth(String merchantId, String merchantKey, String referenceNum, double chargeTotal
			, String creditCardNumber, String expMonth, String expYear, String cvvInd, String cvvNumber
			, String authentication, String processorId, String numberOfInstallments, String chargeInterest
			, String ipAddress, String customerIdExt, String billingName, String billingAddress, String billingAddress2
			, String billingCity, String billingState, String billingPostalCode, String billingCountry
			, String billingPhone, String billingEmail, String shippingName, String shippingAddress
			, String shippingAddress2, String shippingCity, String shippingState, String shippingPostalCode
			, String shippingCountry, String shippingPhone, String shippingEmail, String currencyCode, String fraudCheck) throws Exception {
			
		this.FillRequestBase("auth", merchantId, merchantKey, referenceNum, chargeTotal, creditCardNumber, expMonth
				, expYear, cvvInd, cvvNumber, authentication, processorId, numberOfInstallments
				, chargeInterest, ipAddress, customerIdExt, currencyCode, fraudCheck);
		
		RequestBase auth = this.request.getOrder().getAuth();
		
		Billing billing = new Billing();
		auth.setBilling(billing);
		if(fraudCheck != null && fraudCheck.length() > 0)
			auth.setFraudCheck(fraudCheck);
		
		billing.setAddress(billingAddress);
		billing.setAddress2(billingAddress2);
		billing.setCity(billingCity);
		billing.setCountry(billingCountry);
		billing.setEmail(billingEmail);
		billing.setName(billingName);
		billing.setPhone(billingPhone);
		billing.setPostalcode(billingPostalCode);
		billing.setState(billingState);
		
		Shipping shipping = new Shipping();
		auth.setShipping(shipping);
		
		shipping.setAddress(shippingAddress);
		shipping.setAddress2(shippingAddress2);
		shipping.setCity(shippingCity);
		shipping.setCountry(shippingCountry);
		shipping.setEmail(shippingEmail);
		shipping.setName(shippingName);
		shipping.setPhone(shippingPhone);
		shipping.setPostalcode(shippingPostalCode);
		shipping.setState(shippingState);	
		
		return new Utils().SendRequest(this.request, this.getEnvironment());
		
	}
	
	/**
	 * M�todo Auth
	 * Faz uma autorizacao passando o token do cartao ja salvo na base.
	 * @param merchantId
	 * @param merchantKey
	 * @param referenceNum
	 * @param chargeTotal
	 * @param processorId
	 * @param token
	 * @param customerId
	 * @param numberOfInstallments
	 * @param chargeInterest
	 * @param ipAddress
	 * @param currencyCode
	 * @param fraudCheck
	 * @return
	 * @throws Exception
	 */
    public ResponseBase Auth(String merchantId, String merchantKey, String referenceNum, double chargeTotal, String processorId
                            , String token, String customerId, String numberOfInstallments, String chargeInterest
                            , String ipAddress, String currencyCode, String fraudCheck) throws Exception {


        return this.PayWithToken("auth", merchantId, merchantKey, referenceNum, chargeTotal, processorId, token, customerId
                                , numberOfInstallments, chargeInterest, ipAddress, currencyCode, fraudCheck);

    }
    
   
    /**
     * M�todo Auth
     * Faz uma autorizacao salvando o numero de cartão automaticamente.
     * @param merchantId
     * @param merchantKey
     * @param referenceNum
     * @param chargeTotal
     * @param creditCardNumber
     * @param expMonth
     * @param expYear
     * @param cvvInd
     * @param cvvNumber
     * @param processorId
     * @param numberOfInstallments
     * @param chargeInterest
     * @param ipAddress
     * @param customerToken
     * @param onFileEndDate
     * @param onFilePermission
     * @param onFileComment
     * @param onFileMaxChargeAmount
     * @param billingName
     * @param billingAddress
     * @param billingAddress2
     * @param billingCity
     * @param billingState
     * @param billingPostalCode
     * @param billingCountry
     * @param billingPhone
     * @param billingEmail
     * @param currencyCode
     * @param fraudCheck
     * @return
     * @throws Exception
     */
    public ResponseBase Auth(String merchantId, String merchantKey, String referenceNum, double chargeTotal
                               , String creditCardNumber, String expMonth, String expYear, String cvvInd, String cvvNumber
                               , String processorId, String numberOfInstallments, String chargeInterest, String ipAddress
                               , String customerToken, String onFileEndDate, String onFilePermission, String onFileComment
                               , String onFileMaxChargeAmount, String billingName, String billingAddress, String billingAddress2
                               , String billingCity, String billingState, String billingPostalCode, String billingCountry
                               , String billingPhone, String billingEmail, String currencyCode, String fraudCheck) throws Exception {

        return PaySavingCreditCardAutomatically("auth", merchantId, merchantKey, referenceNum, chargeTotal, creditCardNumber, expMonth, expYear
                                                , cvvInd, cvvNumber, processorId, numberOfInstallments, chargeInterest, ipAddress, customerToken
                                                , onFileEndDate, onFilePermission, onFileComment, onFileMaxChargeAmount, billingName, billingAddress
                                                , billingAddress2, billingCity, billingState, billingPostalCode, billingCountry, billingPhone, billingEmail
                                                , currencyCode, fraudCheck);

    }
    
	/**
	 * M�todo Boleto
	 * Faz uma requisição de boleto.
	 * @param merchantId
	 * @param merchantKey
	 * @param referenceNum
	 * @param chargeTotal
	 * @param processorId
	 * @param ipAddress
	 * @param customerIdExt
	 * @param expirationDate
	 * @param number
	 * @param instructions
	 * @param billingName
	 * @param billingAddress
	 * @param billingAddress2
	 * @param billingCity
	 * @param billingState
	 * @param billingPostalCode
	 * @param billingCountry
	 * @param billingPhone
	 * @param billingEmail
	 * @return
	 * @throws Exception
	 */
    public ResponseBase Boleto(String merchantId, String merchantKey, String referenceNum, double chargeTotal, String processorId
                             , String ipAddress, String customerIdExt, String expirationDate, String number, String instructions
                             , String billingName, String billingAddress, String billingAddress2, String billingCity, String billingState
                             , String billingPostalCode, String billingCountry, String billingPhone, String billingEmail) throws Exception {

        this.request = new TransactionRequest(merchantId, merchantKey);

        Order order = this.request.getOrder();
        RequestBase sale = new RequestBase();
        order.setSale(sale);
        sale.setReferenceNum(referenceNum);
        sale.setProcessorID(processorId);
        sale.setIpAddress(ipAddress);
        sale.setCustomerIdExt(customerIdExt);

        Billing billing = new Billing();
        sale.setBilling(billing);

        billing.setAddress(billingAddress);
        billing.setAddress2(billingAddress2);
        billing.setCity(billingCity);
        billing.setCountry(billingCountry);
        billing.setEmail(billingEmail);
        billing.setName(billingName);
        billing.setPhone(billingPhone);
        billing.setPostalcode(billingPostalCode);
        billing.setState(billingState);

        Payment payment = new Payment();
        sale.setPayment(payment);
        payment.setChargeTotal(chargeTotal);

        TransactionDetail detail = sale.getTransactionDetail();
        PayType payType = detail.getPayType();

        Boleto boleto = new Boleto();
        payType.setBoleto(boleto);

        boleto.setExpirationDate(expirationDate);
        boleto.setInstructions(instructions);
        boleto.setNumber(number);

        return new Utils().SendRequest(this.request, this.getEnvironment());

    }

    
    /**
     * M�todo PayWithToken
     * Faz a transação passando o token do cartão já salvo na base.
     * @param operation
     * @param merchantId
     * @param merchantKey
     * @param referenceNum
     * @param chargeTotal
     * @param processorId
     * @param token
     * @param customerId
     * @param numberOfInstallments
     * @param chargeInterest
     * @param ipAddress
     * @param currencyCode
     * @return
     * @throws Exception
     */
    private ResponseBase PayWithToken(String operation, String merchantId, String merchantKey, String referenceNum, double chargeTotal, String processorId
                            , String token, String customerId, String numberOfInstallments, String chargeInterest, String ipAddress, String currencyCode, String fraudCheck) throws Exception {

        this.request = new TransactionRequest(merchantId, merchantKey);

        Order order = this.request.getOrder();
        RequestBase rBase = new RequestBase();
        
        if (operation.equals("sale"))
            order.setSale(rBase);
        else if (operation.equals("auth"))
            order.setAuth(rBase);
        
        rBase.setReferenceNum(referenceNum);
        rBase.setProcessorID(processorId);
        rBase.setIpAddress(ipAddress);
        
        if(fraudCheck != null && fraudCheck.length() > 0)
         rBase.setFraudCheck(fraudCheck);
        
        Payment payment = new Payment();
        rBase.setPayment(payment);
        payment.setChargeTotal(chargeTotal);
        
        if(currencyCode != null && currencyCode.length() > 0)
        	payment.setCurrencyCode(currencyCode);

        if(numberOfInstallments == null || numberOfInstallments.length() == 0)
			numberOfInstallments = "0";
		
		int tranInstallments = Integer.parseInt(numberOfInstallments);
		
		//Verifica se vai precisar criar o nó de parcelas e juros.
		if ((chargeInterest != null && chargeInterest.length() > 0) && tranInstallments > 1 ) {
			
			payment.setCreditInstallment(new CreditInstallment());
			payment.getCreditInstallment().setChargeInterest(chargeInterest.toUpperCase());
			payment.getCreditInstallment().setNumberOfInstallments(String.valueOf(tranInstallments));
			
		}

        TransactionDetail detail = rBase.getTransactionDetail();
        PayType payType = detail.getPayType();

        payType.setOnFile(new OnFile());
        payType.getOnFile().setCustomerId(customerId);
        payType.getOnFile().setToken(token);

        return new Utils().SendRequest(this.request, this.getEnvironment());

    }
    
    /**
     * M�todo PaySavingCreditCardAutomatically
     * Passa uma transação salvando o número de cartão automaticamente.
     * @param operation
     * @param merchantId
     * @param merchantKey
     * @param referenceNum
     * @param chargeTotal
     * @param creditCardNumber
     * @param expMonth
     * @param expYear
     * @param cvvInd
     * @param cvvNumber
     * @param processorId
     * @param numberOfInstallments
     * @param chargeInterest
     * @param ipAddress
     * @param customerToken
     * @param onFileEndDate
     * @param onFilePermission
     * @param onFileComment
     * @param onFileMaxChargeAmount
     * @param billingName
     * @param billingAddress
     * @param billingAddress2
     * @param billingCity
     * @param billingState
     * @param billingPostalCode
     * @param billingCountry
     * @param billingPhone
     * @param billingEmail
     * @param currencyCode
     * @return
     * @throws Exception
     */
    private ResponseBase PaySavingCreditCardAutomatically(String operation, String merchantId, String merchantKey, String referenceNum, double chargeTotal
                                                        , String creditCardNumber, String expMonth, String expYear, String cvvInd, String cvvNumber
                                                        , String processorId, String numberOfInstallments, String chargeInterest, String ipAddress
                                                        , String customerToken, String onFileEndDate, String onFilePermission, String onFileComment
                                                        , String onFileMaxChargeAmount, String billingName, String billingAddress, String billingAddress2
                                                        , String billingCity, String billingState, String billingPostalCode, String billingCountry
                                                        , String billingPhone, String billingEmail, String currencyCode, String fraudCheck) throws Exception {

        this.request = new TransactionRequest(merchantId, merchantKey);

        Order order = this.request.getOrder();
        RequestBase rBase = new RequestBase();

        if (operation.equals("sale"))
            order.setSale(rBase);
        else if (operation.equals("auth"))
            order.setAuth(rBase);

        rBase.setReferenceNum(referenceNum);
        rBase.setProcessorID(processorId);
        rBase.setIpAddress(ipAddress);
        
        if(fraudCheck != null && fraudCheck.length() > 0)
         rBase.setFraudCheck(fraudCheck);
        
        Billing billing = new Billing();
        rBase.setBilling(billing);

        billing.setAddress(billingAddress);
        billing.setAddress2(billingAddress2);
        billing.setCity(billingCity);
        billing.setCountry(billingCountry);
        billing.setEmail(billingEmail);
        billing.setName(billingName);
        billing.setPhone(billingPhone);
        billing.setPostalcode(billingPostalCode);
        billing.setState(billingState);

        Payment payment = new Payment();
        rBase.setPayment(payment);
        payment.setChargeTotal(chargeTotal);
        
        if(currencyCode != null && currencyCode.length() > 0)
        	payment.setCurrencyCode(currencyCode);

        if(numberOfInstallments == null || numberOfInstallments.length() == 0)
			numberOfInstallments = "0";
		
		int tranInstallments = Integer.parseInt(numberOfInstallments);
		
		//Verifica se vai precisar criar o nó de parcelas e juros.
		if ((chargeInterest != null && chargeInterest.length() > 0) && tranInstallments > 1 ) {
			
			payment.setCreditInstallment(new CreditInstallment());
			payment.getCreditInstallment().setChargeInterest(chargeInterest.toUpperCase());
			payment.getCreditInstallment().setNumberOfInstallments(String.valueOf(tranInstallments));
			
		}

        TransactionDetail detail = rBase.getTransactionDetail();
        PayType payType = detail.getPayType();

        CreditCard creditCard = new CreditCard();
        payType.setCreditCard(creditCard);

        creditCard.setCvvInd(cvvInd);
        creditCard.setCvvNumber(cvvNumber);
        creditCard.setExpMonth(expMonth);
        creditCard.setExpYear(expYear);
        creditCard.setNumber(creditCardNumber);

        rBase.setSaveOnFile(new SaveOnFile());
        rBase.getSaveOnFile().setCustomerToken(customerToken);
        rBase.getSaveOnFile().setOnFileComment(onFileComment);
        rBase.getSaveOnFile().setOnFileEndDate(onFileEndDate);
        rBase.getSaveOnFile().setOnFileMaxChargeAmount(onFileMaxChargeAmount);
        rBase.getSaveOnFile().setOnFilePermission(onFilePermission);

        return new Utils().SendRequest(this.request, this.getEnvironment());

    }
    
   
    /**
     * M�todo Capture
     * Captura uma transação.
     * @param merchantId
     * @param merchantKey
     * @param orderID
     * @param referenceNum
     * @param chargeTotal
     * @return
     * @throws Exception
     */
	public ResponseBase Capture(String merchantId, String merchantKey, String orderID, String referenceNum, double chargeTotal) throws Exception {
		
		this.request = new TransactionRequest(merchantId, merchantKey);
		
		CaptureOrReturn capture = new CaptureOrReturn(); 
		this.request.getOrder().setCapture(capture);
		
		capture.setOrderID(orderID);
		capture.setReferenceNum(referenceNum);
		capture.getPayment().setChargeTotal(chargeTotal);
		
		return new Utils().SendRequest(this.request, this.getEnvironment());
		
	}
	
	/**
	 * M�todo Return
	 * @param merchantId
	 * @param merchantKey
	 * @param orderID
	 * @param referenceNum
	 * @param chargeTotal
	 * @return
	 * @throws Exception
	 */
	public ResponseBase Return(String merchantId, String merchantKey, String orderID, String referenceNum, double chargeTotal) throws Exception {
		
		this.request = new TransactionRequest(merchantId, merchantKey);
		
		CaptureOrReturn _return = new CaptureOrReturn(); 
		this.request.getOrder().setReturn(_return);
		
		_return.setOrderID(orderID);
		_return.setReferenceNum(referenceNum);
		_return.getPayment().setChargeTotal(chargeTotal);
		
		return new Utils().SendRequest(this.request, this.getEnvironment());
		
	}
	
	/**
	 * M�todo void
	 * Cancela uma transação.
	 * @param merchantId
	 * @param merchantKey
	 * @param transactionID
	 * @param ipAddress
	 * @return
	 * @throws Exception
	 */
	public ResponseBase Void(String merchantId, String merchantKey, String transactionID, String ipAddress) throws Exception {
		
		this.request = new TransactionRequest(merchantId, merchantKey);
		
		maxiPago.DataContract.Transactional.Void _void = new maxiPago.DataContract.Transactional.Void(); 
		this.request.getOrder().setVoid(_void);
		
		_void.setIpAddress(ipAddress);
		_void.setTransactionID(transactionID);
		
		return new Utils().SendRequest(this.request, this.getEnvironment());
		
	}
	
	
	/**
	 * M�todo Recurring
	 * Faz uma recorrencia.
	 * @param merchantId
	 * @param merchantKey
	 * @param referenceNum
	 * @param chargeTotal
	 * @param creditCardNumber
	 * @param expMonth
	 * @param expYear
	 * @param cvvInd
	 * @param cvvNumber
	 * @param processorId
	 * @param numberOfInstallments
	 * @param chargeInterest
	 * @param ipAddress
	 * @param action
	 * @param startDate
	 * @param frequency
	 * @param period
	 * @param installments
	 * @param failureThreshold
	 * @param currencyCode
	 * @return
	 * @throws Exception
	 */
	public ResponseBase Recurring(String merchantId, String merchantKey, String referenceNum, double chargeTotal
			, String creditCardNumber, String expMonth, String expYear, String cvvInd, String cvvNumber, String processorId
			, String numberOfInstallments, String chargeInterest, String ipAddress, String action
			, String startDate, String frequency, String period, String installments, String failureThreshold
			, String currencyCode) throws Exception {
		
		FillRecurringBase(merchantId, merchantKey, referenceNum, chargeTotal, processorId, numberOfInstallments
				, chargeInterest, ipAddress, action, startDate, frequency, period, installments
				, failureThreshold, currencyCode);
		
		TransactionDetail detail = this.request.getOrder().getRecurringPayment().getTransactionDetail();
		PayType payType  = detail.getPayType();
		
		CreditCard creditCard = new CreditCard();
		payType.setCreditCard(creditCard);
		
		creditCard.setCvvInd(cvvInd);
		creditCard.setCvvNumber(cvvNumber);
		creditCard.setExpMonth(expMonth);
		creditCard.setExpYear(expYear);
		creditCard.setNumber(creditCardNumber);
		
		return new Utils().SendRequest(this.request, this.getEnvironment());
	}
	
	
	/**
	 * M�todo Recurring
	 * Efetua um Recurring com token
	 * @param merchantId
	 * @param merchantKey
	 * @param referenceNum
	 * @param chargeTotal
	 * @param customerId
	 * @param token
	 * @param processorId
	 * @param numberOfInstallments
	 * @param chargeInterest
	 * @param ipAddress
	 * @param action
	 * @param startDate
	 * @param frequency
	 * @param period
	 * @param installments
	 * @param failureThreshold
	 * @param currencyCode
	 * @return
	 * @throws Exception
	 */
	public ResponseBase Recurring(String merchantId, String merchantKey, String referenceNum, double chargeTotal
			, String customerId, String token, String processorId
			, String numberOfInstallments, String chargeInterest, String ipAddress, String action
			, String startDate, String frequency, String period, String installments, String failureThreshold
			, String currencyCode) throws Exception {
		
		FillRecurringBase(merchantId, merchantKey, referenceNum, chargeTotal, processorId, numberOfInstallments
				, chargeInterest, ipAddress, action, startDate, frequency, period, installments
				, failureThreshold, currencyCode);
		
		TransactionDetail detail = this.request.getOrder().getRecurringPayment().getTransactionDetail();
		PayType payType  = detail.getPayType();
		
		OnFile onFile = new OnFile();
		payType.setOnFile(onFile);
		
		onFile.setCustomerId(customerId);
		onFile.setToken(token);
		
		return new Utils().SendRequest(this.request, this.getEnvironment());
	}
	

	/**
	 * M�todo FillRecurringBase
	 * @param merchantId
	 * @param merchantKey
	 * @param referenceNum
	 * @param chargeTotal
	 * @param processorId
	 * @param numberOfInstallments
	 * @param chargeInterest
	 * @param ipAddress
	 * @param action
	 * @param startDate
	 * @param frequency
	 * @param period
	 * @param installments
	 * @param failureThreshold
	 * @param currencyCode
	 */
	private void FillRecurringBase(String merchantId, String merchantKey, String referenceNum, double chargeTotal
			, String processorId, String numberOfInstallments, String chargeInterest
			, String ipAddress, String action, String startDate
			, String frequency, String period, String installments, String failureThreshold
			, String currencyCode) {
		
		this.request = new TransactionRequest(merchantId, merchantKey);

		Order order = this.request.getOrder();
		RequestBase recurringPayment = new RequestBase();
		order.setRecurringPayment(recurringPayment);
		
		recurringPayment.setReferenceNum(referenceNum);
		recurringPayment.setProcessorID(processorId);
		recurringPayment.setIpAddress(ipAddress);
		//recurringPayment.setCustomerIdExt(customerIdExt);

		Payment payment = new Payment();
		recurringPayment.setPayment(payment);
		payment.setChargeTotal(chargeTotal);
		
		if(currencyCode != null && currencyCode.length() > 0)
			payment.setCurrencyCode(currencyCode);
		
		if(numberOfInstallments == null || numberOfInstallments.length() == 0)
			numberOfInstallments = "0";
		
		int tranInstallments = Integer.parseInt(numberOfInstallments);
		
		//Verifica se vai precisar criar o nó de parcelas e juros.
		if ((chargeInterest != null && chargeInterest.length() > 0) && tranInstallments > 1 ) {
			
			payment.setCreditInstallment(new CreditInstallment());
			payment.getCreditInstallment().setChargeInterest(chargeInterest.toUpperCase());
			payment.getCreditInstallment().setNumberOfInstallments(String.valueOf(tranInstallments));
			
		}

        Recurring recurring = new Recurring();
        recurringPayment.setRecurring(recurring);

        recurring.setAction(action);
        recurring.setFailureThreshold(failureThreshold);
        recurring.setFrequency(frequency);
        recurring.setInstallments(installments);
        recurring.setPeriod(period);
        recurring.setStartDate(startDate);
		
	}
	
	
	/**
	 * M�todo OnlineDebit
	 * Faz uma transa�‹o de dŽbito.
	 * @param merchantId
	 * @param merchantKey
	 * @param referenceNum
	 * @param chargeTotal
	 * @param processorId
	 * @param parametersUrl
	 * @param ipAddress
	 * @param customerIdExt
	 * @return
	 * @throws Exception
	 */
	public ResponseBase OnlineDebit(String merchantId, String merchantKey, String referenceNum, double chargeTotal
			, String processorId, String parametersUrl, String ipAddress, String customerIdExt) throws Exception {
		
		this.request = new TransactionRequest(merchantId, merchantKey);

        Order order = this.request.getOrder();
        RequestBase sale = new RequestBase();
        order.setSale(sale);
        sale.setReferenceNum(referenceNum);
        sale.setProcessorID(processorId);
        sale.setIpAddress(ipAddress);
        sale.setCustomerIdExt(customerIdExt);

        Payment payment = new Payment();
        sale.setPayment(payment);
        payment.setChargeTotal(chargeTotal);

        TransactionDetail detail = sale.getTransactionDetail();
        PayType payType = detail.getPayType();

        OnlineDebit debit = new OnlineDebit();
        payType.setOnlineDebit(debit);
        
        if(parametersUrl == null)
        	parametersUrl = "";
        
        debit.setParametersUrl(parametersUrl);

        return new Utils().SendRequest(this.request, this.getEnvironment());
	}
	
	public ResponseBase SendRequest(TransactionRequest request) throws Exception {
		this.request = request;
		
		return new Utils().SendRequest(this.request, this.getEnvironment());
	}
	

	
	
	
}
