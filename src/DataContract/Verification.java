package maxiPago.DataContract;

public class Verification {

	public Verification(String merchantId, String merchantKey){
		this.merchantId = merchantId;
		this.merchantKey = merchantKey;
	}
	
	private String merchantId;
	private String merchantKey;

	public String getMerchantId() {
		return this.merchantId;
	}

	public String getMerchantKey() {
		return this.merchantKey;
	}
}
