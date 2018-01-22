package maxiPago.Test.ReportsAPI;

import maxiPago.Gateway.Report;

public class ReportsPage {
	public static void main(String[] args) {
		Report report = new Report();
		
		try {
			report.GetTransactionDetailReport("100", //ID_LOJA
					"merchant_key", //CHAVE_LOJA
					"temp1488833129891.1", //TOKEN DA PAGINA
					"1" //NUMERO DA PAGINA
					);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}