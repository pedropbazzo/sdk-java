import maxiPago.DataContract.ResponseBase;
import maxiPago.DataContract.Transactional.TransactionResponse;
import maxiPago.Gateway.Transaction;

public class MaxiPagoExample {

    public static void main(String[] args) {
        try {
            Transaction transaction = new Transaction();
            transaction.setEnvironment("TEST");

           ResponseBase response = transaction.Boleto(
                "merchantId", // REQUIRED - Merchant ID assigned by maxiPago! //
                "merchantKey", // REQUIRED - Merchant Key assigned by maxiPago! //
                "referenceNum", // REQUIRED - Merchant internal order number //
                "chargeTotal", // REQUIRED - Transaction amount in US format //
                "processorId", // REQUIRED - Use '12' for Boleto testing. Contact our team for production values //
                "ipAddress", // Optional //
                "customerIdExt", // Optional - Merchant customer code //
                "expirationDate", // REQUIRED - Boleto expiration date (YYYY-MM-DD format) //
                "number", // REQUIRED and UNIQUE - Boleto number with maximum of 8 numbers //
                "instructions", // Optional - Instructions printed in the boleto slip //
                "billingName", // REQUIRED - Customer name //
                "billingAddress", // Optional - Customer address //
                "billingAddress2", // Optional - Customer address //
                "billingCity", // Optional - Customer city //
                "billingState", // Optional - Customer state with 2 characters //
                "billingPostalCode", // Optional - Customer zip code //
                "billingCountry", // Optional - Customer country code per ISO 3166-2 //
                "billingPhone", // Optional - Customer phone number //
                "billingEmail" // Optional - Customer email address //
			);

            if(response.IsTransactionResponse()) {
                TransactionResponse result = (TransactionResponse)response;
                
                if(result.getResponseCode().equals("0")) {
                    // Success
                }
                else {
                    // Decline
                }
            }
            else if(response.IsErrorResponse()) {
                //  Fail
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}