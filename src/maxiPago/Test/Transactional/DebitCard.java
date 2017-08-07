package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class DebitCard {

	public static void main(String[] args){
		Transaction transaction = new Transaction();
		
		try{
			transaction.debitCard("23859", //ID_LOJA
					"fyagh4eoab1nxd3gt4681x8a", //CHAVE_LOJA
					"Order-001", //NUMERO_REFERENCIA
					40.0d, //VALOR
					"4000000000000002", //NUMERO_CARTAO
					"05", //MES_VALIDADE
					"2018", //ANO_VALIDADE
					"123", //CVV_CODIGO_SEGURANCA 
					"1", //PROCESSOR_ID
					"41",
					"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.112 Safari/537.36",
					"decline",
					"0", //NUMERO_PARCELAS
					"N", //COM_SEM_JUROS *Y = SIM N = NAO
					"127.0.0.1", //ENDERECO_IP
					"393.009.378-20", //CPF_CLIENTE
					"Leonardo", //NOME_CLIENTE
					"Rua Pedro Luiz", //ENDERCO_CLIENTE
					"Casa", //ENDERECO2_CLIENTE
					"Guarulhos", //CIDADE_CLIENTE 
					"SP", //ESTADO_CLIENTE
					"07151-385", //CEP_CLIENTE
					"Brasil", //PAIS_CLIENTE
					"(11) 96478-0733", //TELEFONE_CLIENTE 
					"leonardo.nascimento@maxipago.com", //EMAIL_CLIENTE
					"Leonardo", //NOME_CLIENTE
					"Rua Pedro Luiz", //ENDERECO_CLIENTE
					", Casa", //ENDERECO2_CLIENTE
					"Guarulhos", //CIDADE_CLIENTE 
					"SP", //ESTADO_CLIENTE
					", 07151-385", //CEP_CLIENTE
					"Brasil", //PAIS_CLIENTE
					"(11) 96478-0733", //TELEFONE_CLIENTE 
					"leonardo.nascimento@maxipago.com", //EMAIL_CLIENTE
					"BRL", //MOEDA_CLIENTE
					"Y", //REVISAO_FRAUD *Y = SIM N = NAO
					"TESTE", //SOFTDESCRIPTOR 
					2.00d
					);
			
		}catch(Exception e ){
			e.printStackTrace();
		}
	}
}