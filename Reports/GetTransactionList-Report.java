import maxiPago.DataContract.Reports.RapiResponse;
import maxiPago.Gateway.Report;

public class MaxiPagoExample {

      public static void main(String[] args) {

               try {

	Report report = new Report();
			
	RapiResponse response = report.GetTransactionDetailReport(
		"merchantId", // REQUIRED - Merchant ID assigned by maxiPago!  //
		"merchantKey", // REQUIRED - Merchant Key assigned by maxiPago! //
		"period", // REQUIRED - Period of search ("today", "yesterday", "range") //
		"pageSize", // Optional - Number of transactions per page. Max of 100 //
		"startDate", // REQUIRED if period=range - Start date for filter //
		"endDate", // REQUIRED if period=range - End date for filter //
		"startTime", // REQUIRED if period=range - Start time for filter //
		"endTime", // REQUIRED if period=range - End time for filter //
		"orderByName", // Optional - Field to order transactions by ("transactionDate", "status", etc) //
		"orderByDirection", // Optional - Direction of order ("asc" or "desc") //
		"startRecordNumber", // Optional - '1' by default //
		"endRecordNumber" // Optional - null by default //
	);

	if (response.getHeader().getErrorCode() == "0") {

                if (response.getResult().getRequestToken() == null) {
                    //  Success
                }
                else {
                    //  If response.Result.RequestToken != null then must execute 'checkRequestStatus'
                }

  }
  else { 
        // Fail
  }

              } catch (Exception e) {
	e.printStackTrace();
              }
        }
}