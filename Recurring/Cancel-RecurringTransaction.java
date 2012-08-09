import maxiPago.DataContract.NonTransactional.ApiResponse;
import maxiPago.Gateway.Api;

public class MaxiPagoExample {
	public static void main(String[] args) {

		try {

						Api api = new Api();
						api.setEnvironment("TEST");

			ApiResponse apiResponse = api.CancelRecurring(
				"merchantId", // Merchant ID assigned by maxiPago! //
				"merchantKey", // Merchant Key assigned by maxiPago! //
				"OrderID" // OrderID assigned by maxiPago! when creating the transaction //
			);

			if (apiResponse.getErrorMessage().equals("0"))
				{
				// Cancelamento de recorrência aceita
			}
			else
			{
				// Cancelamento de recorrência negada
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}