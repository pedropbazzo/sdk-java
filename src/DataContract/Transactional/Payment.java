package maxiPago.DataContract.Transactional;


public class Payment {

	public Payment() {

	}
	
	private CreditInstallment creditInstallment;

	public CreditInstallment getCreditInstallment() {
		return creditInstallment;
	}

	public void setCreditInstallment(CreditInstallment creditInstallment) {
		this.creditInstallment = creditInstallment;
	}

	private double chargeTotal;

	public double getChargeTotal() {
		return this.chargeTotal;
	}

	public void setChargeTotal(double chargeTotal) {
		this.chargeTotal = chargeTotal;
	}
	
	
	private String currencyCode;

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	private String softDescriptor;
	
	public String getSoftDescriptor() {
		return softDescriptor;
	}

	public void setSoftDescriptor(String softDescriptor) {
		this.softDescriptor = softDescriptor;
	}
	
	private Double iataFee;
	
	public Double getIataFee() {
		return iataFee;
	}

	public void setIataFee(Double iataFee) {
		this.iataFee = iataFee;
	}

}
