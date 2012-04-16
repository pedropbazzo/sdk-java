import maxiPago.DataContract.NonTransactional.ApiResponse;
import maxiPago.Gateway.Api;

public class MaxiPagoExample {

    public static void main(String[] args) {

          try {

                 Api api = new Api();
			
                 ApiResponse response = api.DeleteConsumer("merchantId", "merchantKey", "customerId");
			
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