import maxiPago.DataContract.Reports.RapiResponse;
import maxiPago.Gateway.Report;

public class MaxiPagoExample {

	public static void main(String[] args) {
	
		try {
	
		Report report = new Report();
        report.setEnvironment("TEST");	

		RapiResponse response = report.CheckRequestStatus(
		"100", // 'merchantId' - REQUIRED: Merchant ID assigned by maxiPago!  //
		"merchant-key", // 'merchantKey' - REQUIRED: Merchant Key assigned by maxiPago! //
		"8cIjsO7cmeY=" // 'requestToken' - REQUIRED: Request token created by maxiPago! //
		);
	
		if (response.getHeader().getErrorCode().equals("0")) {
			// Success
		}
		else { 
			// Fail
		}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
s}