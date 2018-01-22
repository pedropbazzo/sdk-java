package maxiPago.Test.Api;

import maxiPago.Gateway.Api;

public class TokenUpdateCreditAccountInfo {
	public static void main(String[] args) {
		
		Api api = new Api();
		
		try{
			api.TokenUpdateCreditAccountInfo("100", //ID_LOJA
					"merchant_key", //CHAVE_LOJA
					"Token==", //TOKEN_CARTAO
					"123.456.789.12", //CPF_CLIENTE
					"4000000000000002", //NUMERO_CARTAO
					"12", //MES_VALIDADE_CARTAO
					"2018", //ANO_VALIDADE_CARTAO
					"Fulano", //NOME_CLIENTE
					"Rua da republica, 134", //ENDERECO_CLIENTE
					"Casa", //ENDERECO2 *COMPLEMENTO
					"Guarulhos", //CIDADE_CLIENTE
					"SP", //ESTADO_CLIENTE
					"07000-000", //CEP_CLIENTE
					"Brasil", //PAIS_CLIENTE
					"(11) 99999-9999", //TELEFONE_CLIENTE
					"email@email.com", //EMAIL_CLIENTE
					"dd/mm/aaaa", //DATA_LIMITE_MANTER_CARTAO_SALVO *MM/DD/AAAA
					"ongoing", //DURACAO_LIMITE_DO_USO_CARTAO *ONGOING = INDEFINIDAMENTE USE_ONCE = APENAS UAM VEZ APOS 1 COBRANCA
					"Cartao prorpio", //COMETARIOS_ADICIONAIS 
					"500.00" //VALOR_MAXIMO_PERMITIDO_PARA_CARTAO)
					); 
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}