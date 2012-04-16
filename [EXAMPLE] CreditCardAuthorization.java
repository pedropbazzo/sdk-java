import maxiPago.DataContract.ResponseBase;
import maxiPago.Gateway.Transaction; 
import maxiPago.DataContract.Transactional.TransactionResponse;

public class MaxiPagoExample { 

   public static void main(String[] args) { 

      try { 

         Transaction transaction = new Transaction();
         transaction.setEnvironment("TEST"); 

         ResponseBase response = transaction.Auth("100", "secret-key", "TestTransaction123", 100.00, "5555555555554444", "10", "2020", "", "123", "noAuthentication", "1", "2", "N", "123.123.123.123", "12345678909");

         if(response.IsTransactionResponse()) {
            TransactionResponse result = (TransactionResponse)response; 

            if(result.getResponseCode() == "0") {
               // APPROVED
            }
            else {
               // Declined
            }
         }
         else if(response.IsErrorResponse()) {
            // Fail
         }

      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
}