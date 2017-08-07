package maxiPago.Test.Transactional;

import java.util.ArrayList;
import java.util.List;

import maxiPago.DataContract.Transactional.Documents;
import maxiPago.DataContract.Transactional.FraudDetails;
import maxiPago.DataContract.Transactional.customerDocument;
import maxiPago.DataContract.Transactional.Item;
import maxiPago.DataContract.Transactional.ItemList;
import maxiPago.DataContract.Transactional.Phone;
import maxiPago.DataContract.Transactional.Phones;
import maxiPago.Gateway.Transaction;

public class AuthWithFraud {

	public static void main(String[] args) {
		
		//Billing

		Phones billingPhones = new Phones();
		Phone billingPhone = new Phone();

		billingPhone.setPhoneType("Commercial");
		billingPhone.setPhoneCountryCode(55);
		billingPhone.setPhoneAreaCode(11);
		billingPhone.setPhoneNumber(21218536);
		billingPhone.setPhoneExtension(8535);

		Phone billingPhone02 = new Phone();

		billingPhone02.setPhoneType("Mobile");
		billingPhone02.setPhoneCountryCode(55);
		billingPhone02.setPhoneAreaCode(11);
		billingPhone02.setPhoneNumber(21218536);
		billingPhone02.setPhoneExtension(8532);

		List<Phone> phoneList = new ArrayList<Phone>();
		phoneList.add(billingPhone);
		phoneList.add(billingPhone02);

		billingPhones.setPhoneCount(phoneList.size());
		billingPhones.setPhone(phoneList);

		Documents billingDocuments = new Documents();

		customerDocument billingDocument = new customerDocument();
		billingDocument.setDocumentType("RG");
		billingDocument.setDocumentValue("50.723.858-8");

		customerDocument billingDocument02 = new customerDocument();
		billingDocument02.setDocumentType("CPF");
		billingDocument02.setDocumentValue("393.009.378-20");

		List<customerDocument> documents = new ArrayList<customerDocument>();
		documents.add(billingDocument);
		documents.add(billingDocument02);

		billingDocuments.setDocumentCount(documents.size());
		billingDocuments.setDocuments(documents);
		
		//Shipping
		
		Phones shippingPhones = new Phones();
		Phone shippingPhone = new Phone();

		shippingPhone.setPhoneType("Commercial");
		shippingPhone.setPhoneCountryCode(55);
		shippingPhone.setPhoneAreaCode(11);
		shippingPhone.setPhoneNumber(21218539);
		shippingPhone.setPhoneExtension(8535);

		Phone shippingPhone02 = new Phone();

		shippingPhone02.setPhoneType("Mobile");
		shippingPhone02.setPhoneCountryCode(55);
		shippingPhone02.setPhoneAreaCode(11);
		shippingPhone02.setPhoneNumber(21218530);
		shippingPhone02.setPhoneExtension(8532);

		List<Phone> phoneList2 = new ArrayList<Phone>();
		phoneList2.add(shippingPhone);
		phoneList2.add(shippingPhone02);
		
		shippingPhones.setPhoneCount(phoneList2.size());
		shippingPhones.setPhone(phoneList2);

		Documents shippingDocuments = new Documents();
		customerDocument shippingDocument = new customerDocument();
		
		shippingDocument.setDocumentType("RG");
		shippingDocument.setDocumentValue("50.723.858-8");

		customerDocument shippingDocument02 = new customerDocument();
		
		shippingDocument02.setDocumentType("CPF");
		shippingDocument02.setDocumentValue("393.009.378-20");

		List<customerDocument> documents2 = new ArrayList<customerDocument>();
		documents2.add(shippingDocument);
		documents2.add(shippingDocument02);
		
		
		shippingDocuments.setDocumentCount(documents2.size());
		shippingDocuments.setDocuments(documents2);

		ItemList itemList = new ItemList();
		Item item = new Item();

		item.setItemIndex(1);
		item.setItemProductCode("330678");
		item.setItemDescription("Peras");
		item.setItemQuantity(5);
		item.setItemUnitCost(1.0d);
		item.setItemTotalAmount(5.0d);

		Item item02 = new Item();

		item02.setItemIndex(2);
		item02.setItemProductCode("769455");
		item02.setItemDescription("Laranja");
		item02.setItemQuantity(5);
		item02.setItemUnitCost(1.0d);
		item02.setItemTotalAmount(5.0d);

		List<Item> itens = new ArrayList<Item>();
		itens.add(item);
		itens.add(item02);
		
		itemList.setItemCount(itens.size());
		itemList.setItem(itens);
		
		FraudDetails fraudDetails = new FraudDetails();
		fraudDetails.setFraudProcessorID("99");
		fraudDetails.setCaptureOnLowRisk("N");
		fraudDetails.setVoidOnHighRisk("N");
		fraudDetails.setFraudToken("q1234564987981alksf43549138");
		fraudDetails.setWebsiteId("DEFAULT");

		Transaction transaction = new Transaction();
		try {
			transaction.Auth("23859", // ID_LOJA
					"fyagh4eoab1nxd3gt4681x8a", // CHAVE_LOJA
					"Order-001", // NUMERO_REFERENCIA
					160.04d, // VALOR
					"4000000000000002", // NUMERO_CARTAO
					"05", // MES_VALIDADE
					"2018", // ANO_VALIDADE
					"123", // CVV_CODIGO_SEGURANCA
					"1", // PROCESSOR_ID
					"0", // NUMERO_PARCELAS
					"N", // COM_SEM_JUROS *Y = SIM N = NAO
					"127.0.0.1", // ENDERECO_IP
					"393.009.378-20", // CPF_CLIENTE

					// BILLING
					234, //ID
					"Leonardo", // NOME_CLIENTE
					"Rua Pedro Luiz", // ENDERECO_CLIENTE
					"Casa", // ENDERE�O2_CLIENTE
					"Guarulhos", // CIDADE_CLIENTE
					"SP", // ESTADO_CLIENTE
					"Centro", //District
					"07151-385", // CEP_CLIENTE
					"BR", // PAIS_CLIENTE
					"(11) 96478-0733", // TELEFONE_CLIENTE
					"leonardo.nascimento@maxipago.com", // EMAIL_CLIENTE
					"Individual",
					"1997-05-05", //Data de aniversario

					// SHIPPING
					875, //ID
					"Leonardo", // NOME_CLIENTE
					"Rua Pedro Luiz", // ENDERECO_CLIENTE
					", Casa", // ENDERECO2_CLIENTE
					"Guarulhos", // CIDADE_CLIENTE
					"SP", // ESTADO_CLIENTE
					"Centro", //District
					", 07151-385", // CEP_CLIENTE
					"BR", // PAIS_CLIENTE
					"(11) 96478-0735", // TELEFONE_CLIENTE					
					"leonardo.nascimento@maxipago.com", // EMAIL_CLIENTE
					"Individual",
					"1997-05-05", //Data de aniversario
					
					"BRL", // MOEDA_CLIENTE
					"Y", // REVISAO_FRAUD *Y = SIM N = NAO
					"TESTE", // SOFTDESCRIPTOR
					
					
					2.00d, 
					itemList, 
					shippingPhones,
					shippingDocuments,
					billingPhones,
					billingDocuments,
					
					fraudDetails
					);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
