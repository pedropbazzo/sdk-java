package maxiPago.DataContract.NonTransactional;

import maxiPago.DataContract.Verification;

public class ApiRequest {

	public ApiRequest(String merchantId, String merchantKey) {
		this.verification = new Verification(merchantId, merchantKey);
		
	}
	
	private Verification verification;
	private String command;
	private CommandRequest request;
	
	public Verification getVerification() {
		return verification;
	}
	
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public CommandRequest getRequest() {
		return request;
	}
	public void setRequest(CommandRequest request) {
		this.request = request;
	}
	
	
}
