package maxiPago.DataContract.NonTransactional;

public class ApiResult {

    // Unique ID returned by maxiPago! after saving a customer profile
	public String customerId;
    // Token associated with the credit card number
	public String token;
	
    public String getCustomerId() {
		return customerId;
	}
	public String getToken() {
		return token;
	}
	
}
