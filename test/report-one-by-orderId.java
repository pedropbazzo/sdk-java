import maxiPago.DataContract.Reports.RapiResponse;
import maxiPago.Gateway.Report;

public class MaxiPagoExample {

  public static void main(String[] args) {
  
    try {
    
      Report report = new Report();
      report.setEnvironment("TEST");
      
      RapiResponse response = report.GetTransactionDetailReportByOrderId(
        "100", // 'merchantId' - REQUIRED: Merchant ID assigned by maxiPago!  //
        "merchant-key", // 'merchantKey' - REQUIRED: Merchant Key assigned by maxiPago! //
        "C0A8016E:0143DF410A35:33D0:01A30706" // 'orderId' - REQUIRED:  Order ID created by maxiPago! //
      );
      
      if (response.getHeader().getErrorCode().equals("0") {
        //  Success
      }
      else { 
        //  Fail
      }
    
    } catch (Exception e) { e.printStackTrace(); }
  }
}