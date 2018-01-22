package maxiPago.Test.ReportsAPI;

import maxiPago.Gateway.Report;

public class ReportsOneOrMoreTransactions {
	
	public static void main(String[] args) {
		
		Report report = new Report();
		
		try {
			report.GetTransactionDetailReportByOrderId("100", //ID_LOJA
					"merchant_key", //CHAVE_LOJA
					"0A01159A:015CC0C7F732:1693:31DC1A43" //ID_PEDIDO
					);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}