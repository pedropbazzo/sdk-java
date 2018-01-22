package maxiPago.Test.ReportsAPI;

import maxiPago.Gateway.Report;

public class ReportsList {
	
	public static void main(String[] args) {
		
		Report reports = new Report();
		
		try {
			reports.GetTransactionDetailReport("100", //ID_LOJA
					"merchant_key", //CHAVE_LOJA
					"range", //PERIODO DE BUSCA	- PAG 72
					"1", //NUMERO DE TRANSACOES POR PAGINA
					"01/01/2017", //SE RANGE, INFORMAR DATA INICIAL MM/DD/AAAA
					"01/13/2017", //SE RANGE, INFORMAR DATA FINAL MM/DD/AAAA
					"00:00:00", //SE RANGE, INFORMAR HORA INICIAL HH:MM:SS
					"23:00:00", //SE RANGE, INFORMAR HORA FINAL HH:MM:SS 
					"orderId", //ORDENAR POR, PAG 72
					"desc", // ORDENACAO DESC OR ASC
					"30",
					"35"
					);		
			
		} catch (Exception e) {
			e.printStackTrace();			
		}
	}
}