package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class RecurringPayment {
	public static void main(String[] args) {
		
		Transaction transaction = new Transaction();
		
		try {
			transaction.Recurring("100", //ID_LOJA
					"merchant_id", //CHAVE_LOJA
					"Order-001", //NUMERO_REFERENCIA
					5.00d, //VALOR
					"4111111111111111", //NUMERO_CARTAO
					"05", //MES_VALIDADE
					"2018", //ANO_VALIDADE
					"123", //CVV_CODIGO_SEGURANCA 
					"1", //PROCESSOR_ID
					"0", //NUMERO_PARCELAS
					"N", //COM_SEM_JUROS *Y = SIM N = NAO
					"127.0.0.1", //ENDERECO_IP
					"new", // NOVA RECORRENCIA, ENABLE - ATIVA UMA RECORRENCIA, DISABLE - DESATIVA UMA RECORRENCIA
					"2020-12-25", //DATA DE INICIO DA RECORRENCIA - AAAA-MM-DD
					"1", //FREQUENCIA - INTERVALO DE COBRANCA 
					"monthly", //PERIODO - PERIODO QUE SERA COBRADO, ATRELADO A FREQUENCIA 
					"3", //PARCELAS 
					"3", //QUANTAS VEZES INSISTIR PARA CANCELAR
					"BRL" //MOEDA
					);
			
		} catch (Exception e) {
			
		}
	}
}