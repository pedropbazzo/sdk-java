import maxiPago.DataContract.NonTransactional.ApiResponse;
import maxiPago.Gateway.Api;

public class MaxiPagoExample {
	public static void main(String[] args) {

		try {

			Api api = new Api();
			api.setEnvironment("TEST");

			ApiResponse apiResponse = api.CancelRecurring(
				"100", // 'merchantId' - REQUIRED: Merchant ID assigned by maxiPago! //
				"merchant-key", // 'merchantKey' - REQUIRED: Merchant Key assigned by maxiPago! //
				"C0A8C866:0119C7CF0530:3B39:009770A3" // 'OrderID' - REQUIRED: OrderID assigned by maxiPago! when creating the transaction //
			);

			if (apiResponse.getErrorMessage().equals("0")) {
				// Cancelamento de recorrência aceita
			}
			else {
				// Cancelamento de recorrência negada
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}