package maxiPago.DataContract.Transactional;


public class RequestBase {

	public RequestBase() {

		this.payment = new Payment();
		this.transactionDetail = new TransactionDetail();

	}
	
	private String processorID;
	
	public String getProcessorID() {
		return processorID;
	}

	public void setProcessorID(String processorID) {
		this.processorID = processorID;
	}
		
	private String fraudCheck;
	
	public String getFraudCheck() {
		return fraudCheck;
	}

	public void setFraudCheck(String fraudCheck) {
		this.fraudCheck = fraudCheck;
	}

	public String authentication;

	public String getAuthentication() {
		return authentication;
	}

	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}

	private String referenceNum;

	public String getReferenceNum() {
		return this.referenceNum;
	}

	public void setReferenceNum(String referenceNum) {
		this.referenceNum = referenceNum;
	}
	
	private String ipAddress;

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	private Billing billing;

	public Billing getBilling() {
		return this.billing;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

	private Shipping shipping;

	public Shipping getShipping() {
		return this.shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	private TransactionDetail transactionDetail;

	public TransactionDetail getTransactionDetail() {
		return this.transactionDetail;
	}

	public void setTransactionDetail(TransactionDetail transactionDetail) {
		this.transactionDetail = transactionDetail;
	}

	private Payment payment;

	public Payment getPayment() {
		return this.payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	private String customerIdExt;

	public String getCustomerIdExt() {
		return this.customerIdExt;
	}

	public void setCustomerIdExt(String customerIdExt) {
		this.customerIdExt = customerIdExt;
	}
	
	private Recurring recurring;

	public Recurring getRecurring() {
		return recurring;
	}

	public void setRecurring(Recurring recurring) {
		this.recurring = recurring;
	}
	
	private SaveOnFile saveOnFile;

	public SaveOnFile getSaveOnFile() {
		return saveOnFile;
	}

	public void setSaveOnFile(SaveOnFile saveOnFile) {
		this.saveOnFile = saveOnFile;
	}
	
	private ItemList itemList;

	public ItemList getItemList() {
		return itemList;
	}

	public void setItemList(ItemList itemList) {
		this.itemList = itemList;
	}
	
	

}
