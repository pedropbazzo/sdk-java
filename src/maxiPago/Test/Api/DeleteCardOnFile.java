package maxiPago.Test.Api;

import maxiPago.Gateway.Api;

public class DeleteCardOnFile {
	public static void main(String[] args) {
		
		Api api = new Api();
		
		try{
			api.DeleteCardOnFile("100", //ID_LOJA
					"merchant_key", //CHAVE_LOJA
					"11111", //ID_CLIENTE
					"Token==" //CARTAO_CLIENTE
					);			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}