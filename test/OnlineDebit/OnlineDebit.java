import maxiPago.DataContract.ResponseBase;
import maxiPago.DataContract.Transactional.TransactionResponse;
import maxiPago.Gateway.Transaction;

public class MaxiPagoExample {

    public static void main(String[] args) {
        try {
            Transaction transaction = new Transaction();
            transaction.setEnvironment("TEST");

            ResponseBase response = transaction.OnlineDebit(
            		"100", // 'merchantId' - REQUIRED: Merchant ID assigned by maxiPago! //
            		"merchant-key", // 'merchantKey' - REQUIRED: Merchant Key assigned by maxiPago! //
            		"ORD238937282", // 'referenceNum' - REQUIRED: Merchant internal order number //
            		1.00, // 'chargeTotal' - REQUIRED: Transaction amount in US format //
            		"17", // 'processorId' - REQUIRED: Bank chosen to process transaction. Use '17' for testing //
            		"?key=value", // 'parametersUrl' - Optional: Passed back in GET when customer is redirected //
            		"127.0.0.1", // 'ipAddress' - Optional //
            		"CUST12739" // 'customerIdExt' - Optional: Merchant code for customer //
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