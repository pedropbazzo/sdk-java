import maxiPago.DataContract.NonTransactional.ApiResponse;
import maxiPago.Gateway.Api;

public class MaxiPagoExample {

    public static void main(String[] args) {

          try {

                 Api api = new Api();
			
                 ApiResponse response = api.DeleteCardOnFile("merchantId", "merchantKey", "customerId", "token");
			
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