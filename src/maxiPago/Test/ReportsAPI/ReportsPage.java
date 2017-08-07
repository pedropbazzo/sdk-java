package maxiPago.Test.ReportsAPI;

import maxiPago.Gateway.Report;

public class ReportsPage {
	public static void main(String[] args) {
		Report report = new Report();
		
		try {
			report.GetTransactionDetailReport("23859", //ID_LOJA
					"fyagh4eoab1nxd3gt4681x8a", //CHAVE_LOJA
					"temp1488833129891.1", //TOKEN DA PAGINA
					"1" //NUMERO DA PAGINA
					);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}