package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class Void {
	
	public static void main(String[] args) {
		
		Transaction transaction = new Transaction();
		
		try{
			transaction.Void("100", //ID_LOJA
					"21g8u6gh6szw1gywfs165vui", //CHAVE_LOJA
					"1628312", //ID_TRANSACAO
					"127.0.0.1" //ENDERECO_IP
					);
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}