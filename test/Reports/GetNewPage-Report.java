import maxiPago.DataContract.Reports.RapiResponse;
import maxiPago.Gateway.Report;

public class MaxiPagoExample {

      public static void main(String[] args) {

               try {

				Report report = new Report();
						
				RapiResponse response = report.GetTransactionDetailReport(
					"100", // 'merchantId' - REQUIRED: Merchant ID assigned by maxiPago!  //
					"merchant-key", // 'merchantKey' - REQUIRED: Merchant Key assigned by maxiPago! //
					"xyz35Hiua834", // 'pageToken' - REQUIRED: Token of the page replied by maxiPago! //
					"3" // 'pageNumber' - REQUIRED: Page number you want to view //
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