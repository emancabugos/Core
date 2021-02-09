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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Order Details Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Portuguese', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_ORDER ID_order-id-txt'), 
    'value', 'ID DE ORDEM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_INVOICE ID_invoice-id-txt'), 
    'value', 'IDENTIFICAÇÃO DE FACTURA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_TIMESTAMP_timestamp-txt'), 
    'value', 'Registro de data e hora', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_TRANSACTION ID_transaction-id'), 
    'value', 'ID DE TRANSACÇÃO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_BUYER INFO_buyer-info-txt'), 
    'value', 'INFORMAÇÃO DO COMPRADOR', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_DELIVERY ADDRESS_delivery-address-txt'), 
    'value', 'ENDEREÇO ​​DE ENTREGA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_EMAIL_email-txt'), 
    'value', 'O EMAIL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_CONTACT_contact-txt'), 
    'value', 'CONTATO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_TRANSACTION TOTAL_transaction-total'), 
    'value', 'TOTAL DE TRANSACÇÕES', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Subtotal_subtotal-txt'), 
    'value', 'Subtotal', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Delivery_delivery-txt'), 
    'value', 'Entrega', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Admin fee_admin-fee'), 
    'value', 'taxa de administração', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_ITEM_item-txt'), 
    'value', 'ITEM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_PRICE_price-txt'), 
    'value', 'PREÇO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_QTY_qty-txt'), 
    'value', 'CANTÃO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_DELIVERY_buyer-info-txt'), 
    'value', 'ENTREGA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_ORDER STATUS_order-status-txt'), 
    'value', 'STATUS DO PEDIDO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Payment Status_pay-txt'), 
    'value', 'STATUS DO PAGAMENTO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Payment Method_pay-info-txt'), 
    'value', 'MÉTODO DE PAGAMENTO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_REVIEW_review-txt'), 
    'value', 'REVEJA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_New Review_review-txt'), 
    'value', 'Nova revisão!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Seller Name_Seller'), 
    'value', 'NOME DO VENDEDOR', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_DeliveryPick-up_Delivery'), 
    'value', 'Entrega / Pick-up', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Pick-up_Pick-up'), 
    'value', 'Pegar', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Delivery From_bulk-delivery-discount'), 
    'value', 'Entrega De', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Minimum lead time_bulk-delivery-discount'), 
    'value', 'Prazo mínimo de entrega', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_BACK TO LIST_btn_back'), 
    'value', 'DE VOLTA À LISTA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_STATUS CHANGED_popup-title'), 
    'value', 'STATUS ALTERADO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/textarea_The order status for this item has been updated'), 
    'value', 'O status do pedido para este item foi atualizado.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Okay_btn_okay'), 
    'value', 'OK', 0)

