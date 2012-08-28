package maxiPago.DataContract.Transactional;


public class TransactionDetail {

	public TransactionDetail(){
		this.payType = new PayType();
	}
	
	private PayType payType;

	public PayType getPayType() {
		return this.payType;
	}


}
