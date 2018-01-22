package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class SaleWithToken {
	public static void main(String[] args) {
		
		Transaction transaction = new Transaction();
		
		try{
			transaction.Sale("100", //ID_LOJA
					"merchant_id", //CHAVE_LOJA
					"Order-001", //NUMERO_REFERENCIA
					400.00d, //VALOR
					"1", //PROCESSOR_ID
					"token==", //TOKEN_CARTAO
					"66328", //ID_CLIENTE
					"1", //NUMERO_PARCELAS
					"N", //COM_SEM_JUROS *Y = SIM N = NAO
					"127.0.0.1", //ENDERECO_IP
					"BRL", //TIPO_MOUSE
					"N",  //REVISAO_FRAUD *Y = SIM N = NAO
					"TESTE", //SOFTDESCRIPTOR
					1.00d //IATAFEE
					);			
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}