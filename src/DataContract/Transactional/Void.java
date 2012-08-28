package maxiPago.DataContract.Transactional;

public class Void {

	public Void() {
		
	}

	private String transactionID;
	private String ipAddress;

	public String getTransactionID() {
		return this.transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

}
