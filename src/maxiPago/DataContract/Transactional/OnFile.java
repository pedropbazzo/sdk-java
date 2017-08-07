package maxiPago.DataContract.Transactional;

public class OnFile {
	//Attributes
	private String customerId;
	private String token;
	
	//Getters and Setters
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}	
}