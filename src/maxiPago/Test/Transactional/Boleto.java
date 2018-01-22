package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class Boleto {
	public static void main(String[] args) {
		
		Transaction transaction = new Transaction();
		
		try{
			transaction.Boleto("100", //ID_LOJA
					"merchant_key", //CHAVE_LOJA
					"Order-001", //NUMERO_REFERENCIA
					5.00d, //VALOR
					"12", //PROCESSOR_ID
					"127.0.0.1", //ENDERECO_IP
					"123.456.789-12", //CPF_CLIENTE
					"2017-06-15", //DATA DE EXPIRACAO - AAAA/MM/DD
					"00000067", //NOSSO_NUMERO
					"TESTE;TESTE", //INSTRUCOES - UTILIZE ";" PARA QUEBRA DE LINHA
					"Fulano", //NOME_CLIENTE
					"Rua da republica", //ENDERECO_CLIENTE
					"Casa", //ENDERECO2_CLIENTE
					"Guarulhos", //CIDADE_CLIENTE 
					"SP", //ESTADO_CLIENTE
					"07000-000", //CEP_CLIENTE
					"Brasil", //PAIS_CLIENTE
					"(11) 99999-9999", //TELEFONE_CLIENTE 
					"email@email.com" //EMAIL_CLIENTE
					);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}