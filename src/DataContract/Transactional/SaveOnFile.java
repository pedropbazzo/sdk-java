package maxiPago.DataContract.Transactional;

public class SaveOnFile {

	/*
	 * ID ?nico do cadastro, retornado quando o cliente foi adicionado ? base (customerId).
	 */
    private String customerToken;

    /*
     * Data limite para manter o cart?o na base, Formato MM/DD/AAAA.
     */
    private String onFileEndDate;

    /*
     * Dura??o limite do uso do cart?o salvo, ongoing = indefinidamente, use_once = apenas uma vez ap?s a 1a. cobran?a
     */
    private String onFilePermissions;

    /*
     * Coment?rios adicionais sobre este cart?o
     */
    private String onFileComment;

    /*
     * Valor m?ximo que ? permitido cobrar deste cart?o
     */
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
		return onFilePermissions;
	}

	public void setOnFilePermission(String onFilePermission) {
		this.onFilePermissions = onFilePermission;
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
