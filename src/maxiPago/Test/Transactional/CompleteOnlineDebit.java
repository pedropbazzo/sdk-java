package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class CompleteOnlineDebit {
	
	public static void main(String[] args) {
		Transaction transaction = new Transaction();
		
		try {
			transaction.OnlineDebit("23859", //ID_LOJA
					"fyagh4eoab1nxd3gt4681x8a", //CHAVE_LOJA
					"Order-001", //NUMERO_REFERENCIA
					5.00d, //VALOR
					"1", //PROCESSOR_ID
					"responseCode=0&responseCode=1",
					"127.0.0.1", //ENDERECO_IP
					"393.009.378-20", //CPF_CLIENTE
					"Leonardo", //NOME_CLIENTE
					"Rua Pedro Luiz", //ENDERECO_CLIENTE
					"Casa", //ENDERECO2_CLIENTE
					"Guarulhos", //CIDADE_CLIENTE 
					"SP", //ESTADO_CLIENTE
					"07151-385", //CEP_CLIENTE
					"Brasil", //PAIS_CLIENTE
					"(11) 96478-0733", //TELEFONE_CLIENTE 
					"leonardo.nascimento@maxipago.com" //EMAIL_CLIENTE
					);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}