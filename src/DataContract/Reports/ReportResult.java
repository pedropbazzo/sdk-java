package maxiPago.DataContract.Reports;

public class ReportResult {

    private String requestToken;

    private String statusMessage;

    private ResultSetInfo resultSetInfo;

    private Records records;

	public String getRequestToken() {
		return requestToken;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public ResultSetInfo getResultSetInfo() {
		return resultSetInfo;
	}

	public Records getRecords() {
		return records;
	}
    
    
	
}
