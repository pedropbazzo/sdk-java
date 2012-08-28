package maxiPago.Gateway;
import maxiPago.DataContract.*;
import maxiPago.DataContract.NonTransactional.ApiRequest;
import maxiPago.DataContract.NonTransactional.ApiResponse;
import maxiPago.DataContract.NonTransactional.CommandRequest;

public class Api extends ServiceBase {

	public Api() {
        this.setEnvironment("TEST");
    }

    private ApiRequest request;

    /*
     * Adds customer profile
     */
    public ApiResponse AddConsumer(String merchantId, String merchantKey, String customerIdExt, String firstName, String lastName
                                    , String address1, String address2, String city, String state, String zip, String phone, String email
                                    , String dob, String ssn, String sex) throws Exception {


        this.request = new ApiRequest(merchantId, merchantKey);

        this.request.setCommand("add-consumer");
        CommandRequest commandRequest = new CommandRequest();
        this.request.setRequest(commandRequest);

        commandRequest.setCustomerIdExt(customerIdExt);
        commandRequest.setFirstName(firstName);
        commandRequest.setLastName(lastName);
        commandRequest.setAddress1(address1);
        commandRequest.setAddress2(address2);
        commandRequest.setCity(city);
        commandRequest.setState(state);
        commandRequest.setZip(zip);
        commandRequest.setPhone(phone);
        commandRequest.setEmail(email);
        commandRequest.setDob(dob);
        commandRequest.setSsn(ssn);
        commandRequest.setSex(sex);

        return (ApiResponse)new Utils().SendRequest(this.request, this.getEnvironment());
    }
    
    /*
     * Removes customer profile
     */
    public ApiResponse DeleteConsumer(String merchantId, String merchantKey, String customerId) throws Exception {

        this.request = new ApiRequest(merchantId, merchantKey);

        this.request.setCommand("delete-consumer");
        CommandRequest commandRequest = new CommandRequest();
        this.request.setRequest(commandRequest);

        commandRequest.setCustomerId(customerId);

        return (ApiResponse)new Utils().SendRequest(this.request, this.getEnvironment());

    }
    
    /*
     * Updates customer profile
     */
    public ApiResponse UpdateConsumer(String merchantId, String merchantKey, String customerId, String customerIdExt, String firstName
                                    , String lastName, String address1, String address2, String city, String state, String zip, String phone
                                    , String email, String dob, String ssn, String sex) throws Exception {

        this.request = new ApiRequest(merchantId, merchantKey);

        this.request.setCommand("update-consumer");
        CommandRequest commandRequest = new CommandRequest();
        this.request.setRequest(commandRequest);

        commandRequest.setCustomerId(customerId);
        commandRequest.setCustomerIdExt(customerIdExt);
        commandRequest.setFirstName(firstName);
        commandRequest.setLastName(lastName);
        commandRequest.setAddress1(address1);
        commandRequest.setAddress2(address2);
        commandRequest.setCity(city);
        commandRequest.setState(state);
        commandRequest.setZip(zip);
        commandRequest.setPhone(phone);
        commandRequest.setEmail(email);
        commandRequest.setDob(dob);
        commandRequest.setSsn(ssn);
        commandRequest.setSex(sex);

        return (ApiResponse)new Utils().SendRequest(this.request, this.getEnvironment());
    }
    

    /*
     * Saves a card on file
     */
    public ApiResponse AddCardOnFile(String merchantId, String merchantKey, String customerId, String creditCardNumber, String expirationMonth
                                    , String expirationYear, String billingName, String billingAddress1, String billingAddress2, String billingCity
                                    , String billingState, String billingZip, String billingCountry, String billingPhone, String billingEmail) throws Exception { 

        this.request = new ApiRequest(merchantId, merchantKey);

        this.request.setCommand("add-card-onfile");
        CommandRequest commandRequest = new CommandRequest();
        this.request.setRequest(commandRequest);

        commandRequest.setCustomerId(customerId);
        commandRequest.setCreditCardNumber(creditCardNumber);
        commandRequest.setExpirationMonth(expirationMonth);
        commandRequest.setExpirationYear(expirationYear);
        commandRequest.setBillingName(billingName);
        commandRequest.setBillingAddress1(billingAddress1);
        commandRequest.setBillingAddress2(billingAddress2);
        commandRequest.setBillingCity(billingCity);
        commandRequest.setBillingState(billingState);
        commandRequest.setBillingZip(billingZip);
        commandRequest.setBillingCountry(billingCountry);
        commandRequest.setBillingPhone(billingPhone);
        commandRequest.setBillingEmail(billingEmail);

        return (ApiResponse)new Utils().SendRequest(this.request, this.getEnvironment());

    }
    
    /*
     * Deletes a card on file
     */
    public ApiResponse DeleteCardOnFile(String merchantId, String merchantKey, String customerId, String token) throws Exception {

        this.request = new ApiRequest(merchantId, merchantKey);

        this.request.setCommand("delete-card-onfile");
        CommandRequest commandRequest = new CommandRequest();
        this.request.setRequest(commandRequest);

        commandRequest.setCustomerId(customerId);
        commandRequest.setToken(token);

        return (ApiResponse)new Utils().SendRequest(this.request, this.getEnvironment());

    }
    
    
    /*
	 * Cancels a recurring payment
	 */
	public ApiResponse CancelRecurring(String merchantId, String merchantKey, String orderID) throws Exception{
			
		this.request = new ApiRequest(merchantId, merchantKey);

		this.request.setCommand("cancel-recurring");
		CommandRequest commandRequest = new CommandRequest();
		commandRequest.setOrderId(orderID);		
		this.request.setRequest(commandRequest);
		 
		return (ApiResponse)new Utils().SendRequest(this.request, this.getEnvironment());
		
	}
    
    
	
}
