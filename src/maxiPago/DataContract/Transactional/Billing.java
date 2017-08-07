package maxiPago.DataContract.Transactional;

public class Billing extends Address {
	
	private Phones phones;
	private Documents documents;
	
	public Phones getPhones() {
		return phones;
	}
	
	public Documents getDocuments() {
		return documents;
	}
	
	public void setPhones(Phones phones) {
		this.phones = phones;
	}
	
	public void setDocuments(Documents documents) {
		this.documents = documents;
	}
}