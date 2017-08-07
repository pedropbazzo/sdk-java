package maxiPago.DataContract.Reports;

import maxiPago.DataContract.ResponseBase;

public class RapiResponse extends ResponseBase {
	//Attributes 
    private HeaderResponse header;
    private ReportResult result;
	
  //Getters and Setters
    public HeaderResponse getHeader() {
		return header;
	}
	public ReportResult getResult() {
		return result;
	}
}