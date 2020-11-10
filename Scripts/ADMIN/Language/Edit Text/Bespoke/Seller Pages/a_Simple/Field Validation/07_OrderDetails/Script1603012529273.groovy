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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Order History Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Clear all textfield')

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_ORDER ID_order-id-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_INVOICE ID_invoice-id-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_TIMESTAMP_timestamp-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_TRANSACTION ID_transaction-id'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_BUYER INFO_buyer-info-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_DELIVERY ADDRESS_delivery-address-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_EMAIL_email-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_CONTACT_contact-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_TRANSACTION TOTAL_transaction-total'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Subtotal_subtotal-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_DELIVERY_buyer-info-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Admin fee_admin-fee'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_ITEM_item-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_PRICE_price-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_QTY_qty-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Delivery_delivery-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_ORDER STATUS_order-status-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Payment Status_pay-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Payment Method_pay-info-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_REVIEW_review-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_New Review_review-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Seller Name_Seller'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_DeliveryPick-up_Delivery'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Minimum lead time_bulk-delivery-discount'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_BACK TO LIST_btn_back'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_STATUS CHANGED_popup-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/textarea_The order status for this item has been updated'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Okay_btn_okay'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

WebUI.comment('Verification highlight textfield')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_ORDER ID_order-id-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_INVOICE ID_invoice-id-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_TIMESTAMP_timestamp-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_TRANSACTION ID_transaction-id'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_BUYER INFO_buyer-info-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_DELIVERY ADDRESS_delivery-address-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_EMAIL_email-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_CONTACT_contact-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_TRANSACTION TOTAL_transaction-total'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Subtotal_subtotal-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_DELIVERY_buyer-info-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Admin fee_admin-fee'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_ITEM_item-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_PRICE_price-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_QTY_qty-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Delivery_delivery-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_ORDER STATUS_order-status-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Payment Status_pay-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Payment Method_pay-info-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_REVIEW_review-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_New Review_review-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Seller Name_Seller'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_DeliveryPick-up_Delivery'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Minimum lead time_bulk-delivery-discount'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_BACK TO LIST_btn_back'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_STATUS CHANGED_popup-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/textarea_The order status for this item has been updated'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Okay_btn_okay'), 
    'class', 'form-control error-con', 0)

