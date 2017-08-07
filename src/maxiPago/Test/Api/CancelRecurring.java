package maxiPago.Test.Api;

import maxiPago.Gateway.Api;

public class CancelRecurring {
	public static void main(String[] args) {
		
		Api api = new Api();
		
		try{
			api.CancelRecurring("35229", //ID_LOJA
					"9hi8j0yjuk8pc5vsimrdicp7", //CHAVE_LOJA
					"0A011599:015C1281AAF6:E535:3ED4247A" //ID_PEDIDO
					);
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}