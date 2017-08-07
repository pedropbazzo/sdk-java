package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class RecurringWithToken {
	public static void main(String[] args) {
		
		Transaction transaction = new Transaction();
		
		try {
			transaction.Recurring("100", //ID_LOJA
					"21g8u6gh6szw1gywfs165vui", //CHAVE_LOJA
					"Order-001", //NUMERO_REFERENCIA
					5.0,
					"66556", //ID_CLIENTE
					"JVte6KAE8MA=", //TOKEN_CARTAO
					"1", //PROCESSOR_ID
					"0", //NUMERO_PARCELAS
					"N", //COM_SEM_JUROS *Y = SIM N = NAO
					"127.0.0.1", //ENDERECO_IP
					"new", // NEW - NOVA RECORRENCIA, ENABLE - ATIVA UMA RECORRENCIA, DISABLE - DESATIVA UMA RECORRENCIA
					"2017-09-02", //DATA DE INICIO DA RECORRENCIA - AAAA-MM-DD
					"1", //FREQUENCIA - INTERVALO DE COBRANCA 
					"monthly", //PERIODO - PERIODO QUE SERA COBRADO, ATRELADO A FREQUENCIA 
					"3", //PARCELAS 
					"3", //QUANTAS VEZES INSISTIR PARA CANCELAR
					"BRL" //MOEDA
					);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}