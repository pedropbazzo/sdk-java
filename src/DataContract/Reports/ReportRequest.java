package maxiPago.DataContract.Reports;

public class ReportRequest {

	public ReportRequest() {
        this.filterOptions = new FilterOptions();
    }

    private FilterOptions filterOptions;

    private String requestToken;

	public FilterOptions getFilterOptions() {
		return filterOptions;
	}

	public void setFilterOptions(FilterOptions filterOptions) {
		this.filterOptions = filterOptions;
	}

	public String getRequestToken() {
		return requestToken;
	}

	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}
    
    
	
}
