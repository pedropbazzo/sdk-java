package maxiPago.Test.ReportsAPI;

import maxiPago.Gateway.Report;

public class ReportsOnlyTransaction {
	
	public static void main(String[] args) {
		
		Report report = new Report();
		
		try {
			report.GetTransactionDetailReport("23859", //ID_LOJA
					"fyagh4eoab1nxd3gt4681x8a", //CHAVE_LOJA
					"181706654" //ID_PEDIDO
					);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}