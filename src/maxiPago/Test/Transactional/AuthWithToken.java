package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class AuthWithToken {
	
	public static void main(String[] args) {
		
		Transaction transaction = new Transaction();
		
		try{
			transaction.Auth("100", //ID_LOJA
					"merchant_key", //CHAVE_LOJA
					"Order-001", //NUMERO_REFERENCIA
					400.0d, //VALOR
					"1", //PROCESSOR_ID
					"JVte6KAE8MA=", //TOKEN_CARTAO
					"66556", //ID_CLIENTE
					"1", //NUMERO_PARCELAS
					"N", //COM_SEM_JUROS *Y = SIM N = NAO
					"127.0.0.1", //ENDERECO_IP
					"BRL", //TIPO_MOUSE
					"N",  //REVISAO_FRAUD *Y = SIM N = NAO
					"TESTE", //SOFTDESCRIPTOR
					1.00d //IATAFEE
					);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}