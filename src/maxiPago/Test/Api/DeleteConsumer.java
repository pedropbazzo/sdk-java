package maxiPago.Test.Api;

import maxiPago.Gateway.Api;

public class DeleteConsumer {

	public static void main(String[] args) {
		
		Api api = new Api();
		
		try {
			api.DeleteConsumer("100", //ID_LOJA
					"21g8u6gh6szw1gywfs165vui", //CHAVE_LOJA
					"66082" //ID_CONSUMIDOR
					);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}