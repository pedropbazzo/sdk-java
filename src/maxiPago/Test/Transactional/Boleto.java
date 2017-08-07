package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class Boleto {
	public static void main(String[] args) {
		
		Transaction transaction = new Transaction();
		
		try{
			transaction.Boleto("100", //ID_LOJA
					"21g8u6gh6szw1gywfs165vui", //CHAVE_LOJA
					"Order-001", //NUMERO_REFERENCIA
					5.00d, //VALOR
					"12", //PROCESSOR_ID
					"127.0.0.1", //ENDERECO_IP
					"393.009.378-20", //CPF_CLIENTE
					"2017-06-15", //DATA DE EXPIRACAO - AAAA/MM/DD
					"00000067", //NOSSO_NUMERO
					"TESTE;TESTE", //INSTRUCOES - UTILIZE ";" PARA QUEBRA DE LINHA
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
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}