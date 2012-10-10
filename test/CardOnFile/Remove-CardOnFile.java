import maxiPago.DataContract.NonTransactional.ApiResponse;
import maxiPago.Gateway.Api;

public class MaxiPagoExample {

	public static void main(String[] args) {
	
		try {

			Api api = new Api();
			api.setEnvironment("TEST");
			
			ApiResponse response = api.DeleteCardOnFile(
				"100", // 'merchantId' - REQUIRED: Merchant ID assigned by maxiPago! //
				"merchant-key", // 'merchantKey' - REQUIRED: Merchant Key assigned by maxiPago! //
				"238292", // 'customerId' - REQUIRED: Customer ID created by maxiPago! after the "add-customer" command //
				"eBUv/SIBJv0=" // 'token' - REQUIRED: Credit card token create by maxiPago! //
			);
			
			if(response.getErrorCode().equals("0")) {
				// Success
			}
			else {
				// Fail
			}

		}
		catch (Exception e) { e.printStackTrace(); }
	}
}