package maxiPago.Test.Api;

import maxiPago.Gateway.Api;

public class AddCardOnFile {
	public static void main(String[] args) {
		
		Api api = new Api();
		
		try{
			api.AddCardOnFile("100", //ID_LOJA
					"merchant_key", //CHAVE_LOJA
					"66556", //ID_CLIENTE
					"4111111111111111", //NUMERO_CARTAO
					"12", //MES_VALIDADE_CARTAO
					"2018", //ANO_VALIDADE_CARTAO
					"Fulano de tal", //NOME_CLIENTE
					"Rua da republica, 134", //ENDERECO_CLIENTE
					"Casa", //ENDERECO2 *COMPLEMENTO
					"Guarulhos", //CIDADE_CLIENTE
					"SP", //ESTADO_CLIENTE
					"07000-000", //CEP_CLIENTE
					"Brasil", //PAIS_CLIENTE
					"(11) 99999-9999", //TELEFONE_CLIENTE
					"email@email.com", 
					"dd/mm/aaaa", //DATA_LIMITE_MANTER_CARTAO_SALVO *MM/DD/AAAA
					"ongoing", //DURACAO_LIMITE_DO_USO_CARTAO *ONGOING = INDEFINIDAMENTE USE_ONCE = APENAS UAM VEZ APOS 1 COBRANCA
					"Cartao prorpio", //COMETARIOS_ADICIONAIS 
					"400.00" //VALOR_MAXIMO_PERMITIDO_PARA_CARTAO
					);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}