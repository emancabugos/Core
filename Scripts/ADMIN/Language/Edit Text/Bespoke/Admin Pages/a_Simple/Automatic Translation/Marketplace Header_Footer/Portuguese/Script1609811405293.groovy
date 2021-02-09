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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Admin Pages/Header_Footer Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Portuguese', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Search_search'), 
    'value', 'Pesquisa...', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_BE A SELLER_be_seller'), 
    'value', 'SEJA UM VENDEDOR', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_MORE_more'), 'value', 
    'Mais', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_VIEW CART_btn_next'), 
    'value', 'VER CARRINHO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_REGISTER  SIGN IN_register_signin'), 
    'value', 'INSCRIÇÃO / SINALIZAÇÃO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_SELLER_sell'), 
    'value', 'VENDEDOR', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_PROFILE_profile'), 
    'value', 'PERFIL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Dashboard_Dashboard'), 
    'value', 'painel de controle', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Purchases_Purchases'), 
    'value', 'Compras', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Your Items_Your Items'), 
    'value', 'Seus itens', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Settings_Settings'), 
    'value', 'Configurações', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Add Item_Upload'), 
    'value', 'Adicionar Item', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Logout_Logout'), 
    'value', 'Sair', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Orders_Orders'), 
    'value', 'Encomendas', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Sub-accounts_Sub-accounts'), 
    'value', 'Subcontas', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Sales_Sales'), 
    'value', 'Vendas', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_delivery'), 'value', 
    'Entrega', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Browse_Browse'), 
    'value', 'Squeaky toy', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_SELLER_sell1'), 
    'value', 'VENDEDOR', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_PROFILE_profile1'), 
    'value', 'PERFIL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Dashboard_Dashboard1'), 
    'value', 'painel de controle', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Purchases_Purchases1'), 
    'value', 'Compras', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Your Items_Your Items1'), 
    'value', 'Seus itens', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Settings_Settings1'), 
    'value', 'Configurações', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Upload_Upload1'), 
    'value', 'Envio', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Logout_Logout1'), 
    'value', 'Sair', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Orders_Orders1'), 
    'value', 'Encomendas', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Sales_Sales1'), 
    'value', 'Vendas', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_ABOUT US_ABOUT US'), 
    'value', 'SOBRE NÓS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_SERVICE TERMS_SERVICE TERMS'), 
    'value', 'TERMOS DE SERVIÇO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_PRIVACY_PRIVACY'), 
    'value', 'POLÍTICA DE PRIVACIDADE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_RETURNS_RETURNS'), 
    'value', 'POLÍTICA DE DEVOLUÇÃO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_FAQ_FAQ'), 'value', 
    'Perguntas frequentes', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_CONTACT_CONTACT'), 
    'value', 'CONTATE-NOS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_All rights reserved _foot_copyright'), 
    'value', 'Todos os direitos reservados. ©', 0)

