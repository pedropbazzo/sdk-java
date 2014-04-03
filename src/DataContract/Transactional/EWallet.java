package maxiPago.DataContract.Transactional;

public class EWallet {
	
	private String supressShipping;
	private String acceptedCards;
	private String acquirerID;
	private String parametersURL;
	private String transactionID;
	
	public String getSupressShipping() {
		return supressShipping;
	}
	public void setSupressShipping(String supressShipping) {
		this.supressShipping = supressShipping;
	}
	public String getAcceptedCards() {
		return acceptedCards;
	}
	public void setAcceptedCards(String acceptedCards) {
		this.acceptedCards = acceptedCards;
	}
	public String getAcquirerID() {
		return acquirerID;
	}
	public void setAcquirerID(String acquirerID) {
		this.acquirerID = acquirerID;
	}
	public String getParametersUrl() {
		return parametersURL;
	}
	public void setParametersUrl(String parametersURL) {
		this.parametersURL = parametersURL;
	}
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

}
