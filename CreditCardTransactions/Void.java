import maxiPago.DataContract.ResponseBase;
import maxiPago.DataContract.Transactional.TransactionResponse;
import maxiPago.Gateway.Transaction;

public class MaxiPagoExample {

    public static void main(String[] args) {
        try {
            Transaction transaction = new Transaction();
            transaction.setEnvironment("TEST");

            ResponseBase  response = transaction.Void(
				"merchantId", // REQUIRED - Merchant ID assigned by maxiPago!  //
				"merchantKey", // REQUIRED - Merchant Key assigned by maxiPago! //
				"transactionID", // REQUIRED - Transaction ID created by maxiPago! //
				"ipAddress" // Optional //
			);
            
            if(response.IsTransactionResponse()) {
                TransactionResponse result = (TransactionResponse)response;
                
                if(result.getResponseCode().equals("0")) {
                    // APPROVED
                }
                else {
                    // DECLINED
                }
            }
            else if(response.IsErrorResponse()) {
                // ERROR
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}