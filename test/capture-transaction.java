import maxiPago.DataContract.ResponseBase;
import maxiPago.DataContract.Transactional.TransactionResponse;
import maxiPago.Gateway.Transaction;

public class MaxiPagoExample {

  public static void main(String[] args) {

    try {

      Transaction transaction = new Transaction();
      transaction.setEnvironment("TEST");
      
      ResponseBase response = transaction.Capture(
        "100", // 'merchantId' - REQUIRED: Merchant ID assigned by maxiPago!  //
        "merchant-key", // 'merchantKey' - REQUIRED: Merchant Key assigned by maxiPago! //
        "7F000001:013829A1C09E:8DE9:016891F0", // 'orderID'- REQUIRED: Order ID replied by maxiPago! after authorization //
        "ORD12397372", // 'referenceNum' - REQUIRED: Merchant internal order number //
        "23.33" // 'chargeTotal' - REQUIRED: Transaction amount in US format //
      );		
      
      
      if(response.IsTransactionResponse()) {
        TransactionResponse result = (TransactionResponse)response;
      
        if(result.getResponseCode().equals("0")) {
          // APPROVED.
        }
        else {
          // DECLINED
        }
      }
      else if(response.IsErrorResponse()) {
        // Fail 
      }
    
    } catch (Exception e) { e.printStackTrace(); }
  }
}