package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class Void {
	
	public static void main(String[] args) {
		
		Transaction transaction = new Transaction();
		
		try{
			transaction.Void("100", //ID_LOJA
					"merchant_id", //CHAVE_LOJA
					"1628312", //ID_TRANSACAO
					"127.0.0.1" //ENDERECO_IP
					);
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}