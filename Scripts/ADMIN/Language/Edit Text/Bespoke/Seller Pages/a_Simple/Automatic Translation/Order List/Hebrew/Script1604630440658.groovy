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

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Hebrew', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDERS_item_name'), 
    'value', 'ORDERS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_manage all'), 
    'value', 'Manage all your orders that have been placed with you. Click on any payment ID to view the order details.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Search by Order ID_search-by'), 
    'value', 'Search by Invoice No. or Order No.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_EXPORT CSV_btn_upload'), 
    'value', 'EXPORT CSV', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_CHANGE STATUS_btn_upload'), 
    'value', 'CHANGE STATUS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER NO_order-id-txt'), 
    'value', 'ORDER NO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_INVOICE NO_invoice-id-txt'), 
    'value', 'INVOICE NO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_TIMESTAMP_timestamp-txt'), 
    'value', 'TIMESTAMP', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER TOTAL_item-txt'), 
    'value', 'ORDER TOTAL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_NO OF ITEM(S)_qty-txt'), 
    'value', 'NO OF ITEM(S)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_PAYMENT TYPE_delivery-txt'), 
    'value', 'PAYMENT TYPE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER STATUS_order-status-txt'), 
    'value', 'ORDER STATUS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_REVIEW_review-txt'), 
    'value', 'REVIEW', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_PAYMENT STATUS_payment-type-txt'), 
    'value', 'PAYMENT STATUS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_REFUNDED_payment-status-txt'), 
    'value', 'Refunded', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Delivery_Delivery'), 
    'value', 'Delivery', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Pick-up_Delivery'), 
    'value', 'Pick-up', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_New Review_new-review'), 
    'value', 'New Review!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER STATUS CHANGE_order-status-txt'), 
    'value', 'ORDER STATUS CHANGE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_you will only'), 
    'value', 'You will only be able to change the status of certain orders depending upon their current order status and delivery method.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Your order(s) selected delivery type is_popup-title2'), 
    'value', 'Your order(s) selected delivery type is:', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Your order(s) selected delivery type is_popup-title3'), 
    'value', 'What will be the status of your selected orders be?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Change Status_btn_okay'), 
    'value', 'Change Status', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_EXPORT ORDER_popup-title'), 
    'value', 'EXPORT ORDER', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Timestamp_popup-title'), 
    'value', 'Timestamp', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Export CSV_btn_okay'), 
    'value', 'Export CSV', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_STATUS CHANGED_popup-title'), 
    'value', 'STATUS CHANGED', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/textarea_The order status for this item has been updated'), 
    'value', 'The order status for this item has been updated.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Okay_btn_okay'), 
    'value', 'Okay', 0)

