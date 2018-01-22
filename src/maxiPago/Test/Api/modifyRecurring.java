package maxiPago.Test.Api;

import maxiPago.Gateway.Api;

public class modifyRecurring {
	
	public static void main(String[] args) {
		
		Api api = new Api();
		
		try {
			api.modifyRecurring("100",
					"merchant_key",
					"0A011599:015C1281AAF6:E535:3ED4347A",
					2.0d,
					"4111111111111111",
					"05",
					"2018",
					"1",
					"enable",
					"2",
					"2018-02-25",
					"25",
					"quarterly",
					"2018-05-12",
					2.0d
					);
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}
}