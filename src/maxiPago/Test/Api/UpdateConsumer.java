package maxiPago.Test.Api;

import maxiPago.Gateway.Api;

public class UpdateConsumer {	
	
	public static void main(String[] args) {
		
		Api api = new Api();
		
		try{
			
			api.UpdateConsumer("100", //ID_LOJA
					"21g8u6gh6szw1gywfs165vui", //CHAVE_LOJA
					"66083", //ID_CONSUMIDOR
					"393.009.378-21", //CPF_CLIENTE
					"Leonardo",  //NOME_CLIENTE
					"Lopes", //SOBRENOME_CLIENTE
					"Rua Pedro Luiz", //ENDERECO_CLIENTE
					"Casa", //ENDERECO2_CLIENTE
					"Guarulhos", //CIDADE_CLIENTE
					"SP", //ESTADO_CLIENTE
					"07151-385", //CEP_CLIENTE
					"(11) 96478-0733",  //TELEFONE_CLIENTE
					"leonardo.nascimento@maxipago.com", //EMAIL_CLIENTE
					"05/12/1996", //DATA_NASCIMENTO_CLIENTE
					"393.009.378-20", //CPF_CLIENTE
					"M" //SEXO_CLIENTE
					);
			
			}catch (Exception e){
				e.printStackTrace();
			}
	}
}