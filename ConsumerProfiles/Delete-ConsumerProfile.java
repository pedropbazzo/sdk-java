import maxiPago.DataContract.NonTransactional.ApiResponse;
import maxiPago.Gateway.Api;

public class MaxiPagoExample {

    public static void main(String[] args) {

          try {

                 Api api = new Api();
			
                 ApiResponse response = api.DeleteConsumer(
	                "merchantId", // REQUIRED - Merchant ID assigned by maxiPago! //
	                "merchantKey", // REQUIRED - Merchant Key assigned by maxiPago! //
	                "customerId" // REQUIRED - Customer ID create by maxiPago! after the "add-customer" command //
	            );

                 if(response.getErrorCode() == "0") {
					// Success
                  }
                  else {
					// Fail
                  }

            } catch (Exception e) {
e.printStackTrace();
                }
         }
}