package maxiPago.DataContract.Transactional;

import maxiPago.DataContract.ResponseBase;

public class ErrorResponse extends ResponseBase {

	private String errorCode;
	private String errorMsg;
	
	public String getErrorCode(){
		return this.errorCode;
	}
	
	public String getErrorMsg(){
		return this.errorMsg;
	}
	
}
