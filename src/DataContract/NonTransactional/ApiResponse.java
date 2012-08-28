package maxiPago.DataContract.NonTransactional;

import maxiPago.DataContract.ResponseBase;

public class ApiResponse extends ResponseBase {

    // Command return code. Success = 0
    private String errorCode;

    // Error message, if there is one
    private String errorMessage;

    // Confirmation of the command sent
    private String command;
   
    // Transaction date/time in epoch format
    private String time;

    private ApiResult result;

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public String getCommand() {
		return command;
	}

	public String getTime() {
		return time;
	}

	public ApiResult getResult() {
		return result;
	}
    
}
