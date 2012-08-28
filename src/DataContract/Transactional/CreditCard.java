package maxiPago.DataContract.Transactional;

public class CreditCard {

	public CreditCard() {
		this.eCommInd = "eci";
	}

	private String number;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	private String expMonth;

	public String getExpMonth() {
		return this.expMonth;
	}

	public void setExpMonth(String expMonth) {
		this.expMonth = expMonth;
	}

	private String expYear;

	public String getExpYear() {
		return this.expYear;
	}

	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}

	private String cvvInd;

	public String getCvvInd() {
		return this.cvvInd;
	}

	public void setCvvInd(String cvvInd) {
		this.cvvInd = cvvInd;
	}

	private String cvvNumber;

	public String getCvvNumber() {
		return this.cvvNumber;
	}

	public void setCvvNumber(String cvvNumber) {
		this.cvvNumber = cvvNumber;
	}


	private String eCommInd;

	public String getECommInd() {
		return this.eCommInd;
	}

}
