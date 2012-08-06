import maxiPago.DataContract.Reports.RapiResponse;
import maxiPago.Gateway.Report;

public class MaxiPagoExample {

      public static void main(String[] args) {

               try {

				Report report = new Report();
						
				RapiResponse response = report.GetTransactionDetailReport(
					"merchantId", // REQUIRED - Merchant ID assigned by maxiPago!  //
					"merchantKey", // REQUIRED - Merchant Key assigned by maxiPago! //
					"pageToken", // REQUIRED - Token of the page replied by maxiPago! //
					"pageNumber" // REQUIRED - PAge number you want to view //
				);
			
				if (response.getHeader().getErrorCode().equals("0")) {
			    	// Success
				}
				else { 
			        // Fail
			    }

              }
              catch (Exception e) {
					e.printStackTrace();
              }
        }
}