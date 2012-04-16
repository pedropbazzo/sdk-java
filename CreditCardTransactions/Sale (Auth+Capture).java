import maxiPago.DataContract.ResponseBase;
import maxiPago.DataContract.Transactional.TransactionResponse;
import maxiPago.Gateway.Transaction;

public class MaxiPagoExample {

    public static void main(String[] args) {

        try {
            Transaction transaction = new Transaction();
            transaction.setEnvironment("TEST");
	
            ResponseBase response = transaction.Sale("merchantId", "merchantKey", "referenceNum", "chargeTotal", "creditCardNumber", "expMonth", "expYear", "cvvInd", "cvvNumber", "processorId", "numberOfInstallments", "chargeInterest", "ipAddress", "customerToken", "onFileEndDate", "onFilePermission", "onFileComment", "onFileMaxChargeAmount", "billingName", "billingAddress", "billingAddress2", "billingCity", "billingState", "billingPostalCode", "billingCountry", "billingPhone", "billingEmail");
            
            if(response.IsTransactionResponse()) {
                TransactionResponse result = (TransactionResponse)response;
                
                if(result.getResponseCode() == "0") {
                    //  APPROVED
                }
                else {
                    //  DECLINED
                }
            }
            else if(response.IsErrorResponse()) {
                //  Fail.
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}