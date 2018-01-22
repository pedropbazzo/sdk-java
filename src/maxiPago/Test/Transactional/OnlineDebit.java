package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class OnlineDebit {
	
	public static void main(String[] args) {
		
		Transaction transaction = new Transaction();
		
		try {
			transaction.OnlineDebit("100", //ID_LOJA
					"merchant_id", //CHAVE_LOJA
					"Order-001", //NUMERO_REFERENCIA
					5.00d, //VALOR
					"1", //PROCESSOR_ID
					"responseCode=0&responseCode=1",
					"127.0.0.1", //ENDERECO_IP
					"123.456.789-12" //CPF_CLIENTE
					);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}