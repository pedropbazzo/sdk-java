import maxiPago.DataContract.NonTransactional.ApiResponse;
import maxiPago.Gateway.Api;

public class MaxiPagoExample {

    public static void main(String[] args) {

          try {

                 Api api = new Api();
			
                 ApiResponse response = api.UpdateConsumer("merchantId", "merchantKey", "customerId", "customerIdExt", "firstName", "lastName", "address1", "address2", "city", "state", "zip", "phone", "email", "dob", "ssn", "sex");
			
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