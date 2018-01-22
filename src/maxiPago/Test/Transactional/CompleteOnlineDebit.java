package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class CompleteOnlineDebit {
	
	public static void main(String[] args) {
		Transaction transaction = new Transaction();
		
		try {
			transaction.OnlineDebit("100", //ID_LOJA
					"merchant_key", //CHAVE_LOJA
					"Order-001", //NUMERO_REFERENCIA
					5.00d, //VALOR
					"1", //PROCESSOR_ID
					"responseCode=0&responseCode=1",
					"127.0.0.1", //ENDERECO_IP
					"123.456.789-12", //CPF_CLIENTE
					"Fulano", //NOME_CLIENTE
					"Rua da republica", //ENDERECO_CLIENTE
					"Casa", //ENDERECO2_CLIENTE
					"Guarulhos", //CIDADE_CLIENTE 
					"SP", //ESTADO_CLIENTE
					"0700-000", //CEP_CLIENTE
					"Brasil", //PAIS_CLIENTE
					"(11) 99999-9999", //TELEFONE_CLIENTE 
					"email@email.com" //EMAIL_CLIENTE
					);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}