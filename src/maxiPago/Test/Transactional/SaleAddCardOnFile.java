package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class SaleAddCardOnFile {
	public static void main(String[] args) {
		Transaction transaction = new Transaction();
		
		try{
			transaction.Sale("100", //ID_LOJA
					"merchant_id", //CHAVE_LOJA 
					"Order-001", //NUMERO_REFERENCIA
					5.00d, //VALOR 
					"4000000000000002", //NUMERO_CARTAO
					"05", //MES_VALIDADE
					"2018", //ANO_VALIDADE
					"123", //CVV_CODIGO_SEGURANCA 
					"1", //PROCESSOR_ID
					"0", //NUMERO_PARCELAS
					"N", //COM_SEM_JUROS *Y = SIM N = NAO
					"127.0.0.1", //ENDERECO_IP 
					"66328", //ID_CLIENTE
					"05/01/2018", //DATA_LIMITE_MANTER_CARTAO_SALVO *MM/DD/AAAA
					"ongoing", //DURACAO_LIMITE_DO_USO_CARTAO *ONGOING = INDEFINIDAMENTE USE_ONCE = APENAS UAM VEZ APOS 1 COBRANCA
					"Cartao prorpio", //COMETARIOS_ADICIONAIS 
					"400.00", //VALOR_MAXIMO_PERMITIDO_PARA_CARTAO
					"Fulanio", //NOME_CLIENTE
					"Rua da republica, 134", //ENDERECO_CLIENTE
					"Casa", //ENDERECO2 *COMPLEMENTO
					"Guarulhos", //CIDADE_CLIENTE
					"SP", //ESTADO_CLIENTE 
					"07000-000", //CEP_CLIENTE
					"Brasil", //PAIS_CLIENTE
					"(11) 99999-9999", //TELEFONE_CLIENTE
					"email@email.com", //EMAIL_CLIENTE
					"BRL", //MOEDA
					"Y", //REVISAO_FRAUD *Y = SIM N = NAO
					"TESTE", //SOFTDESCRIPTOR
					2.00d //IATAFEE
					);
		}catch (Exception e){
			e.printStackTrace();
		}			
	}
}