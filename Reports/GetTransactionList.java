import maxiPago.DataContract.Reports.RapiResponse;
import maxiPago.Gateway.Report;

public class MaxiPagoExample {

      public static void main(String[] args) {

               try {

	Report report = new Report();
			
	RapiResponse response = report.GetTransactionDetailReport("merchantId", "merchantKey", "period", "pageSize", "startDate"						, "endDate", "startTime", "endTime", "orderByName", "orderByDirection" , "startRecordNumber", "endRecordNumber");
			
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