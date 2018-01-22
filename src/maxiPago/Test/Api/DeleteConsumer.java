package maxiPago.Test.Api;

import maxiPago.Gateway.Api;

public class DeleteConsumer {

	public static void main(String[] args) {
		
		Api api = new Api();
		
		try {
			api.DeleteConsumer("100", //ID_LOJA
					"merchant_key", //CHAVE_LOJA
					"11111" //ID_CONSUMIDOR
					);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}