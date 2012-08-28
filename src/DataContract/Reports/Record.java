package maxiPago.DataContract.Reports;

public class Record {

	private String referenceNumber;
	String taxAmount;
	String shippingAmount;
	String userId;
	String bankRoutingNumber;
	String achAccountNumber;
	private String customerId1;
	
    private String approvalCode;

    private String comments;

    private String companyName;

    private String creditCardType;

    private String customerId;

    private String orderId;

    private String processorID;

    private String paymentType;

    private String recurringPaymentFlag;

    private String responseCode;

    private String transactionAmount;

    private String transactionId;

    private String transactionStatus;
    
    private String transactionState;

    private String transactionType;

    private String transactionDate;
    private String avsResponseCode;
    private String billingAddress1;
    private String billingAddress2;
    private String billingCity;
    private String billingCountry;
    private String billingEmail;
    private String billingName;
    private String billingPhone;
    private String billingState;
    private String billingZip;

    private String boletoNumber;

    private String expirationDate;

    private String dateOfPayment;

    private String dateOfFunding;

    private String bankOfPayment;

    private String branchOfPayment;

    private String paidAmount;

    private String bankFee;

    private String netAmount;

    private String returnCode;

    private String clearingCode;

    public String getReferenceNumber() {
		return referenceNumber;
	}
    
	public String getApprovalCode() {
		return approvalCode;
	}

	public String getComments() {
		return comments;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public String getRecurringPaymentFlag() {
		return recurringPaymentFlag;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}
	
	public String getTransactionState() {
		return transactionState;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public String getAvsResponseCode() {
		return avsResponseCode;
	}

	public String getBillingAddress1() {
		return billingAddress1;
	}

	public String getBillingAddress2() {
		return billingAddress2;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public String getBillingCountry() {
		return billingCountry;
	}

	public String getBillingEmail() {
		return billingEmail;
	}

	public String getBillingName() {
		return billingName;
	}

	public String getBillingPhone() {
		return billingPhone;
	}

	public String getBillingState() {
		return billingState;
	}

	public String getBillingZip() {
		return billingZip;
	}

	public String getBoletoNumber() {
		return boletoNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public String getDateOfPayment() {
		return dateOfPayment;
	}

	public String getDateOfFunding() {
		return dateOfFunding;
	}

	public String getBankOfPayment() {
		return bankOfPayment;
	}

	public String getBranchOfPayment() {
		return branchOfPayment;
	}

	public String getPaidAmount() {
		return paidAmount;
	}

	public String getBankFee() {
		return bankFee;
	}

	public String getNetAmount() {
		return netAmount;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public String getClearingCode() {
		return clearingCode;
	}

	public String getProcessorID() {
		return processorID;
	}
	
	private String customField1;
    private String customField2;
    private String customField3;
    private String customField4;
    private String customField5;

	public String getCustomField1() {
		return customField1;
	}

	public String getCustomField2() {
		return customField2;
	}

	public String getCustomField3() {
		return customField3;
	}

	public String getCustomField4() {
		return customField4;
	}

	public String getCustomField5() {
		return customField5;
	}
	
}
