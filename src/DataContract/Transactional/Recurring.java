package maxiPago.DataContract.Transactional;

public class Recurring {

	private String action;
	private String startDate;
	private String period;
	private String frequency;
	private String installments;
	private String failureThreshold;
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String getStartDate() {
		return startDate;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getPeriod() {
		return period;
	}
	
	public void setPeriod(String period) {
		this.period = period;
	}
	
	public String getFrequency() {
		return frequency;
	}
	
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	public String getInstallments() {
		return installments;
	}
	
	public void setInstallments(String installments) {
		this.installments = installments;
	}
	
	public String getFailureThreshold() {
		return failureThreshold;
	}
	
	public void setFailureThreshold(String failureThreshold) {
		this.failureThreshold = failureThreshold;
	}
	
}
