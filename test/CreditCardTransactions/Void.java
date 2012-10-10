import maxiPago.DataContract.ResponseBase;
import maxiPago.DataContract.Transactional.TransactionResponse;
import maxiPago.Gateway.Transaction;

public class MaxiPagoExample {

    public static void main(String[] args) {
        try {
            Transaction transaction = new Transaction();
            transaction.setEnvironment("TEST");

            ResponseBase  response = transaction.Void(
				"100", // 'merchantId' - REQUIRED: Merchant ID assigned by maxiPago!  //
				"merchant-key", // 'merchantKey' - REQUIRED: Merchant Key assigned by maxiPago! //
				"293823", // 'transactionID' - REQUIRED: Transaction ID created by maxiPago! //
				"127.0.0.1" // 'ipAddress' - Optional //
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