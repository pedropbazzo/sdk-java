import maxiPago.DataContract.NonTransactional.ApiResponse;
import maxiPago.Gateway.Api;

public class MaxiPagoExample {

    public static void main(String[] args) {

          try {

                 Api api = new Api();
			
                 ApiResponse response = api.AddCardOnFile("merchantId", "merchantKey", "customerId", "creditCardNumber", "expirationMonth", "expirationYear", "billingName", "billingAddress1", "billingAddress2", "billingCity", "billingState", "billingZip", "billingCountry", "billingPhone", "billingEmail");
			
                 if(response.getErrorCode() == "0") {
					//  Success
					//  Credit card token in response.getResult().getToken()
                  }
                  else {
					 //  Fail
                  }

            } catch (Exception e) {
e.printStackTrace();
                }
         }
}