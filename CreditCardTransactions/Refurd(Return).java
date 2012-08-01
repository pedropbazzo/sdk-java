import maxiPago.DataContract.ResponseBase;
import maxiPago.DataContract.Transactional.TransactionResponse;
import maxiPago.Gateway.Transaction;

public class MaxiPagoExample {

    public static void main(String[] args) {

        try {
            Transaction transaction = new Transaction();
            transaction.setEnvironment("TEST");

            ResponseBase response = transaction.Return(
                "merchantId", // REQUIRED - Merchant ID assigned by maxiPago!  //
                "merchantKey", // REQUIRED - Merchant Key assigned by maxiPago! //
				"orderID", // REQUIRED - Order ID replied by maxiPago! after authorization //
                "referenceNum", // REQUIRED - Merchant internal order number //
                "chargeTotal" // REQUIRED - Transaction amount in US format //
			);
            
            if(response.IsTransactionResponse()) {
                TransactionResponse result = (TransactionResponse)response;
                
                if(result.getResponseCode() == "0") {
                    //  APPROVED.
                }
                else {
                    //  DECLINED
                }
            }
            else if(response.IsErrorResponse()) {
                //  ERROR 
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}