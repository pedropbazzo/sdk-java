package maxiPago.Test.ReportsAPI;

import maxiPago.Gateway.Report;

public class ReportsOnlyTransaction {
	
	public static void main(String[] args) {
		
		Report report = new Report();
		
		try {
			report.GetTransactionDetailReport("100", //ID_LOJA
					"merchant_key", //CHAVE_LOJA
					"181706654" //ID_PEDIDO
					);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}