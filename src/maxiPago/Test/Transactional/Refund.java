package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class Refund {
	public static void main(String[] args) {
		Transaction transaction = new Transaction();
		
		try {
			transaction.Return("100", //ID_LOJA
					"21g8u6gh6szw1gywfs165vui", //CHAVE_LOJA
					"0A0104A3:015C68F1C5F1:5D33:062E1FB0", //ID_PEDIDO
					"Order-001", //NUMERO DE REFERENCIA
					5.00d //VALOR PARA ESTORNAR
					);
			
		} catch (Exception e) {
			
		}
	}
}