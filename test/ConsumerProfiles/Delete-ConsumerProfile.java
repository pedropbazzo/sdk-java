import maxiPago.DataContract.NonTransactional.ApiResponse;
import maxiPago.Gateway.Api;

public class MaxiPagoExample {

	public static void main(String[] args) {

		try {

			Api api = new Api();
			api.setEnvironment("TEST");

			ApiResponse response = api.DeleteConsumer(
				"100", // 'merchantId' - REQUIRED: Merchant ID assigned by maxiPago! //
				"merchant-key", // 'merchantKey' - REQUIRED: Merchant Key assigned by maxiPago! //
				"2938293" // 'customerId'- REQUIRED: Customer ID create by maxiPago! after the "add-customer" command //
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