import maxiPago.DataContract.ResponseBase;
import maxiPago.DataContract.Transactional.TransactionResponse;
import maxiPago.Gateway.Transaction;

public class MaxiPagoExample {

    public static void main(String[] args) {

        try {
            Transaction transaction = new Transaction();
            transaction.setEnvironment("TEST");

            ResponseBase response = transaction.Recurring("merchantId", "merchantKey", "referenceNum", "chargeTotal", "creditCardNumber" , "expMonth", "expYear", "cvvInd", "cvvNumber", "processorId", "numberOfInstallments", "chargeInterest", "ipAddress", "customerIdExt", "action" , "startDate", "frequency" , "period", "installments", "failureThreshold");
            
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