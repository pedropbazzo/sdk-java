import maxiPago.DataContract.NonTransactional.ApiResponse;
import maxiPago.Gateway.Api;

public class MaxiPagoExample {

    public static void main(String[] args) {

          try {

                 Api api = new Api();
			
                 ApiResponse response = api.AddCardOnFile(
	                "merchantId", // REQUIRED - Merchant ID assigned by maxiPago! //
	                "merchantKey", // REQUIRED - Merchant Key assigned by maxiPago! //
	                "customerId", // REQUIRED - Internal merchant customer code //
	                "creditCardNumber", // REQUIRED - Full credit card number //
	                "expirationMonth", // REQUIRED - Credit card expiration month //
	                "expirationYear", // REQUIRED - Credit card expiration year //
	                "billingName", // REQUIRED - Customer name //
	                "billingAddress1", // REQUIRED - Customer address //
	                "billingAddress2", // Optional - Customer address 2 //
	                "billingCity", // REQUIRED - Customer city //
	                "billingState", // REQUIRED - Customer state with 2 characters //
	                "billingZip", // REQUIRED - Customer zip code //
	                "billingCountry", // REQUIRED - Customer country code per ISO 3166-2 //
	                "billingPhone", // REQUIRED - Customer phone number //
	                "billingEmail" // REQUIRED - Customer email address //
	            );

                 if(response.getErrorCode().equals("0")) {
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