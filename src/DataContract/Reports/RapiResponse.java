package maxiPago.DataContract.Reports;

import maxiPago.DataContract.ResponseBase;

public class RapiResponse extends ResponseBase {
	
    private HeaderResponse header;
    private ReportResult result;
	
    public HeaderResponse getHeader() {
		return header;
	}
	public ReportResult getResult() {
		return result;
	}
    
    
	
}
