package maxiPago.Test.Api;

import maxiPago.Gateway.Api;

public class TokenUpdateCreditAccountInfo {
	public static void main(String[] args) {
		
		Api api = new Api();
		
		try{
			api.TokenUpdateCreditAccountInfo("23859", //ID_LOJA
					"fyagh4eoab1nxd3gt4681x8a", //CHAVE_LOJA
					"zPYtNSJXNPxgJR4AQc9sZQ==", //TOKEN_CARTAO
					"393.009.378.20", //CPF_CLIENTE
					"4000000000000002", //NUMERO_CARTAO
					"12", //MES_VALIDADE_CARTAO
					"2018", //ANO_VALIDADE_CARTAO
					"Leonardo", //NOME_CLIENTE
					"Rua Pedro Luiz, 134", //ENDERECO_CLIENTE
					"Casa", //ENDERECO2 *COMPLEMENTO
					"Guarulhos", //CIDADE_CLIENTE
					"SP", //ESTADO_CLIENTE
					"07151-385", //CEP_CLIENTE
					"Brasil", //PAIS_CLIENTE
					"(11) 6478-0733", //TELEFONE_CLIENTE
					"leonardo.nascimento@maxipago.com", //EMAIL_CLIENTE
					"05/01/2018", //DATA_LIMITE_MANTER_CARTAO_SALVO *MM/DD/AAAA
					"ongoing", //DURACAO_LIMITE_DO_USO_CARTAO *ONGOING = INDEFINIDAMENTE USE_ONCE = APENAS UAM VEZ APOS 1 COBRANCA
					"Cartao prorpio", //COMETARIOS_ADICIONAIS 
					"500.00" //VALOR_MAXIMO_PERMITIDO_PARA_CARTAO)
					); 
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}