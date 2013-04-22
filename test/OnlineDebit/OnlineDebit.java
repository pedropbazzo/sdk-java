import maxiPago.DataContract.ResponseBase;
import maxiPago.DataContract.Transactional.TransactionResponse;
import maxiPago.Gateway.Transaction;

public class MaxiPagoExample {

    public static void main(String[] args) {
        try {
            Transaction transaction = new Transaction();
            transaction.setEnvironment("TEST");

            ResponseBase response = transaction.OnlineDebit(
                "100", // REQUIRED: Merchant ID assigned by maxiPago! //
                "merchant-key", // REQUIRED: Merchant Key assigned by maxiPago! //
                "ORD238937282", // REQUIRED: Merchant internal order number //
                1.00, // REQUIRED: Transaction amount in US format //
                "17", // REQUIRED: Bank chosen to process transaction. Use '17' for testing //
                "key=value", // Optional: Passed back in GET when customer is redirected //
                "127.0.0.1", // Optional //
                "12345678909", // REQUIRED FOR ITAU: Merchant code for customer //
                "Fulano de Tal", // REQUIRED FOR ITAU: Customer name //
                "Av. República do Chile, 230", // REQUIRED FOR ITAU: Customer address //
                "Centro", // REQUIRED FOR ITAU: Customer address 2 (Bairro) //
                "Rio de Janeiro", // REQUIRED FOR ITAU: Customer city //
                "RJ", // REQUIRED FOR ITAU: Customer state with 2 letters //
                "20031170", // REQUIRED FOR ITAU: Customer zip code, numbers only //
                "BR", // REQUIRED FOR ITAU: Customer country, 2 letters per ISO-3166-2 //
                "552122924746", // Optional: Customer phone number, numbers only //
                "fulano@email.com" // Optional: Customer email address //
            );

            if(response.IsTransactionResponse()) {
                TransactionResponse result = (TransactionResponse)response;
                
                if(result.getResponseCode().equals("0")) {
                	//Redirecionar para a URL abaixo.
                	result.getOnlineDebitURL();
                }
                else {
                    // Decline
                }
            }
            else if(response.IsErrorResponse()) {
                // Fail
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}