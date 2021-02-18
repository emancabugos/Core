import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Onboarding_Settings Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Portuguese', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_USER SETTINGS_marketplace-name'), 
    'value', 'CONFIGURAÇÕES DO USUÁRIO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Configure your profile your delivery methods and how you receive payments_item_details'), 
    'value', 'Configure seu perfil, seus métodos de entrega e como você recebe pagamentos.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PROFILE_tab-title'), 
    'value', 'PERFIL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CHANGE_btn_upload'), 
    'value', 'MUDANÇA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DISPLAY NAME_display-name'), 
    'value', 'MOSTRAR NOME', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DESCRIPTION_description'), 
    'value', 'DESCRIÇÃO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_FIRST NAME_first-name'), 
    'value', 'PRIMEIRO NOME', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_LAST NAME_last-name'), 
    'value', 'ÚLTIMO NOME', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NOTIFICATION EMAIL_notification-email'), 
    'value', 'EMAIL DE NOTIFICAÇÃO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CONTACT NUMBER_contact-number'), 
    'value', 'NÚMERO DE CONTATO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_OPENID LOGIN_open-id-login'), 
    'value', 'LOGIN LOGIN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SELLER LOCATION_seller_location'), 
    'value', 'Localização do vendedor', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_For each transaction that is made through the marketplace there will be a seller transaction fee of'), 
    'value', 'Para cada transação feita através do mercado, haverá uma taxa de transação do vendedor de:', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NEXT_btn_next'), 
    'value', 'PRÓXIMO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESS_tab-title'), 
    'value', 'ENDEREÇO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NEW DELIVERY ADDRESS_new-delivery-address'), 
    'value', 'NOVO ENDEREÇO ​​DE ENTREGA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESSEE FIRST NAME_addressee-first-name'), 
    'value', 'ADDRESSEE PRIMEIRO NOME', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESSEE LAST NAME_addressee-last-name'), 
    'value', 'ENDEREÇO ​​DE NOME', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESS_address'), 
    'value', 'ENDEREÇO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SELECT COUNTRY_select-country'), 
    'value', 'SELECIONE O PAIS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_COUNTRY_address-country'), 
    'value', 'PAÍS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_STATE_address-state'), 
    'value', 'ESTADO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CITY_address-city'), 
    'value', 'CIDADE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_POSTAL CODE_address-postalcode'), 
    'value', 'CÓDIGO POSTAL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADD ADDRESS_btn_add'), 
    'value', 'ADICIONAR ENDEREÇO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SAVED ADDRESSES_address-saved'), 
    'value', 'ENDEREÇOS SALVADOS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Next_btn_next (1)'), 
    'value', 'PRÓXIMO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PAYMENT ACCEPTANCE_tan-title'), 
    'value', 'ACEITAÇÃO DE PAGAMENTO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PAYMENT METHOD_payment_method'), 
    'value', 'Método de pagamento', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Select your preferred payment method_select_payment_method'), 
    'value', 'Selecione o seu método de pagamento preferido.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_LINK ACCOUNT_btn_link_account'), 
    'value', 'Link da conta', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_VERIFIED_verified'), 
    'value', 'Verificado', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_This payment method is compulsory_this_method_compulsory'), 
    'value', 'Este método de pagamento é obrigatório.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_No account linked yet_no-account-linked'), 
    'value', 'Nenhuma conta ligada ainda', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_next3'), 
    'value', 'PRÓXIMO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY METHODS_tab-title1'), 
    'value', 'MÉTODOS DE ENTREGA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY OPTIONS_delivery-option'), 
    'value', 'OPÇÕES DE ENTREGA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY OPTIONS_delivery-txt2'), 
    'value', 'Defina o que os serviços de entrega utilizados e a sobretaxa para cada opção. (Selecione pelo menos uma opção de entrega ou local de retirada)', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Offer reduced shipping costs to buyers when they buy more than one item from you_delivery-txt2'), 
    'value', 'Oferecer custos de transporte reduzidos aos compradores quando eles compram mais de um item de você!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_total delivery'), 
    'value', 'Entrega total = entrega de item único (mais alta de A) recarga individual com outro item (B para cada item)', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY SERVICE_delivery-service'), 
    'value', 'SERVIÇO DE ENTREGA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SINGLE ITEM DELIVERY (A)_single-item-delivery'), 
    'value', 'ENTREGA DO ÚNICO ITEM (A)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_WITH OTHER ITEM (B)_with-other-item'), 
    'value', 'COM OUTRO ARTIGO (B)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_add1'), 
    'value', 'ADICIONAR', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PICK-UP LOCATIONS_pick-up-option'), 
    'value', 'LOCAIS DE PICK-UP', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_Define the full address where the buyer can pick up from (You must have at least a delivery option or a pick-up location selected)'), 
    'value', 'Defina o endereço completo de onde o comprador pode retirar (Você deve ter pelo menos uma opção de entrega ou um local de picking selecionado).', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PICK-UP LOCATION ADDRESS_pick-up-address'), 
    'value', 'ENDEREÇO ​​DE LOCALIZAÇÃO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_add1'), 
    'value', 'ADICIONAR', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SAVE_btn_save'), 
    'value', 'SALVE ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Are you sure want to delete_popup-title'), 
    'value', 'Tem certeza de que deseja excluir?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CANCEL_btn_cancel'), 
    'value', 'CANCELAR', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Okay_btn_okay'), 
    'value', 'OK', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_REMOVE ITEM_popup-title'), 
    'value', 'REMOVER ITEM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_concat(Are you sure about removing this item from your list (It  ll be gone forever))_popup-title'), 
    'value', 'Tem certeza de remover esse item da sua lista? (Será para sempre!)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CANCEL_btn_cancel2'), 
    'value', 'CANCELAR', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Okay_btn_okay2'), 
    'value', 'OK', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Custom Payment_popup-title'), 
    'value', 'This payment method requires offline settlement with the marketplace adminstrator.Please check with them for more details.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Back_tab-title'), 
    'value', 'Costas', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ACCOUNT CONFIGURATION_tab-title'), 
    'value', 'CONFIGURAÇÃO DA CONTA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_Your details entered here will be saved and verified by Omise Money you earn from your sales will be accredited to your bank account directly'), 
    'value', 'Os seus dados aqui inseridos serão salvos e verificados pelo Omise. O dinheiro que você ganha de suas vendas será credenciado diretamente em sua conta bancária', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_TYPE_tab-title'), 
    'value', 'TIPO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Tax identification number (optional)_tab-title'), 
    'value', 'Número de identificação fiscal (opcional)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Individual_tab-title'), 
    'value', 'Individual', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Corporate_tab-title'), 
    'value', 'Corporativo', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank  branch code_tab-title'), 
    'value', 'Código bancário / sucursal', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank account number_tab-title'), 
    'value', 'número da conta de banco', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank account name_tab-title'), 
    'value', 'nome da conta do Banco', 0)

