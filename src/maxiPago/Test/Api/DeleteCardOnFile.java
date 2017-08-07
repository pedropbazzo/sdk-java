package maxiPago.Test.Api;

import maxiPago.Gateway.Api;

public class DeleteCardOnFile {
	public static void main(String[] args) {
		
		Api api = new Api();
		
		try{
			api.DeleteCardOnFile("100", //ID_LOJA
					"21g8u6gh6szw1gywfs165vui", //CHAVE_LOJA
					"66111", //ID_CLIENTE
					"KA+ko6ORUjY=" //CARTAO_CLIENTE
					);			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}