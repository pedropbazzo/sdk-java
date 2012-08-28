package maxiPago.DataContract.Transactional;

import maxiPago.DataContract.Verification;

public class TransactionRequest {

	private String version;
	private Verification verification;
	private Order order;

	public TransactionRequest(String merchantId, String merchantKey) {
		this.version = "3.1.1.15";
		this.verification = new Verification(merchantId, merchantKey);
		this.order = new Order();
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Verification getVerification() {
		return this.verification;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
