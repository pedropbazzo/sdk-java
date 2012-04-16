import maxiPago.DataContract.NonTransactional.ApiResponse;
import maxiPago.Gateway.Api;

public class MaxiPagoExample {

    public static void main(String[] args) {

          try {

                 Api api = new Api();
			
                 ApiResponse response = api.AddConsumer("merchantId", "merchantKey", "customerIdExt", "firstName" , "lastName", "address1", "address2", "city", "state", "zip", "phone", "email", "dob", "ssn", "sex");
			
                 if(response.getErrorCode() == "0") {
					// Success
					// Customer ID in response.getResult().CustomerId
                  }
                  else {
					 //  Fail
                  }

            } catch (Exception e) {
e.printStackTrace();
                }
         }
}