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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'English', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_ORDER ID_order-id-txt'), 
    'value', 'ORDER ID', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_INVOICE ID_invoice-id-txt'), 
    'value', 'INVOICE ID', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_TIMESTAMP_timestamp-txt'), 
    'value', 'TIMESTAMP', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_TRANSACTION ID_transaction-id'), 
    'value', 'TRANSACTION ID', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_BUYER INFO_buyer-info-txt'), 
    'value', 'BUYER INFO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_DELIVERY ADDRESS_delivery-address-txt'), 
    'value', 'DELIVERY ADDRESS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_EMAIL_email-txt'), 
    'value', 'EMAIL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_CONTACT_contact-txt'), 
    'value', 'CONTACT', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_TRANSACTION TOTAL_transaction-total'), 
    'value', 'TRANSACTION TOTAL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Subtotal_subtotal-txt'), 
    'value', 'Subtotal', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Delivery_delivery-txt'), 
    'value', 'Delivery', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Admin fee_admin-fee'), 
    'value', 'Admin fee', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_ITEM_item-txt'), 
    'value', 'ITEM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_PRICE_price-txt'), 
    'value', 'PRICE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_QTY_qty-txt'), 
    'value', 'QTY', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_DELIVERY_buyer-info-txt'), 
    'value', 'DELIVERY', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_ORDER STATUS_order-status-txt'), 
    'value', 'ORDER STATUS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Payment Status_pay-txt'), 
    'value', 'PAYMENT STATUS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Payment Method_pay-info-txt'), 
    'value', 'PAYMENT METHOD', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_REVIEW_review-txt'), 
    'value', 'REVIEW', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_New Review_review-txt'), 
    'value', 'New Review!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Seller Name_Seller'), 
    'value', 'SELLER NAME', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_DeliveryPick-up_Delivery'), 
    'value', 'Delivery/Pick-up', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Pick-up_Pick-up'), 
    'value', 'Pick-up', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Delivery From_bulk-delivery-discount'), 
    'value', 'Delivery From', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Minimum lead time_bulk-delivery-discount'), 
    'value', 'Minimum lead time', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_BACK TO LIST_btn_back'), 
    'value', 'BACK TO LIST', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_STATUS CHANGED_popup-title'), 
    'value', 'STATUS CHANGED', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/textarea_The order status for this item has been updated'), 
    'value', 'The order status for this item has been updated.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Okay_btn_okay'), 
    'value', 'Okay', 0)

