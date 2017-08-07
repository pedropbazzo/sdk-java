package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class Capture {
	public static void main(String[] args) {
		
		Transaction transaction = new Transaction();
		
		try{
			transaction.Capture("100", //ID_LOJA
					"21g8u6gh6szw1gywfs165vui", //CHAVE_LOJA
					"0A0104A3:015C68E21C58:69C3:553EABB1", //ID_PEDIDO
					"Order-001", //NUMERO_REFERENCIA
					2.00d //VALOR_CAPTURA
					);
		
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}