package maxiPago.DataContract.Transactional;

public class SaveOnFile {

    private String customerToken;

    private String onFileEndDate;

    private String onFilePermission;

    private String onFileComment;

    private String onFileMaxChargeAmount;

	public String getCustomerToken() {
		return customerToken;
	}

	public void setCustomerToken(String customerToken) {
		this.customerToken = customerToken;
	}

	public String getOnFileEndDate() {
		return onFileEndDate;
	}

	public void setOnFileEndDate(String onFileEndDate) {
		this.onFileEndDate = onFileEndDate;
	}

	public String getOnFilePermission() {
		return onFilePermission;
	}

	public void setOnFilePermission(String onFilePermission) {
		this.onFilePermission = onFilePermission;
	}

	public String getOnFileComment() {
		return onFileComment;
	}

	public void setOnFileComment(String onFileComment) {
		this.onFileComment = onFileComment;
	}

	public String getOnFileMaxChargeAmount() {
		return onFileMaxChargeAmount;
	}

	public void setOnFileMaxChargeAmount(String onFileMaxChargeAmount) {
		this.onFileMaxChargeAmount = onFileMaxChargeAmount;
	}
    
    
	
}
