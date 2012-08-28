package maxiPago.DataContract.Transactional;

public class CreditInstallment {

	private String numberOfInstallments;
	private String chargeInterest;
	
	public String getNumberOfInstallments() {
		return numberOfInstallments;
	}
	public void setNumberOfInstallments(String numberOfInstallments) {
		this.numberOfInstallments = numberOfInstallments;
	}
	public String getChargeInterest() {
		return chargeInterest;
	}
	public void setChargeInterest(String chargeInterest) {
		this.chargeInterest = chargeInterest;
	}
	
}
