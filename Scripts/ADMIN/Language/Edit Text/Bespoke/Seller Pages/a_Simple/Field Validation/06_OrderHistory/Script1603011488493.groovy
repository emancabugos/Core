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

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDERS_item_name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_manage all'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Search by Order ID_search-by'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_CHANGE STATUS_btn_upload'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER NO_order-id-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_INVOICE NO_invoice-id-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_TIMESTAMP_timestamp-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER TOTAL_item-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_NO OF ITEM(S)_qty-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_PAYMENT TYPE_delivery-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER STATUS CHANGE_order-status-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_REVIEW_review-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_PAYMENT STATUS_payment-type-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Delivery_Delivery'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Pick-up_Delivery'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_New Review_new-review'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER STATUS CHANGE_popup-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Your order(s) selected delivery type is_popup-title2'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER STATUS CHANGE_popup-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_STATUS CHANGED_popup-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/textarea_The order status for this item has been updated'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Okay_btn_okay'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_EXPORT ORDER_popup-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Timestamp_popup-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Export CSV_btn_okay'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

WebUI.comment('Verification highlight textfield')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDERS_item_name'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_manage all'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Search by Order ID_search-by'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_CHANGE STATUS_btn_upload'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER NO_order-id-txt'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_INVOICE NO_invoice-id-txt'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_TIMESTAMP_timestamp-txt'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER TOTAL_item-txt'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_NO OF ITEM(S)_qty-txt'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_PAYMENT TYPE_delivery-txt'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER STATUS CHANGE_order-status-txt'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_REVIEW_review-txt'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_PAYMENT STATUS_payment-type-txt'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Delivery_Delivery'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Pick-up_Delivery'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_New Review_new-review'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER STATUS CHANGE_popup-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Your order(s) selected delivery type is_popup-title2'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER STATUS CHANGE_popup-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_STATUS CHANGED_popup-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/textarea_The order status for this item has been updated'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Okay_btn_okay'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_EXPORT ORDER_popup-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Timestamp_popup-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Export CSV_btn_okay'), 'class', 'form-control error-con', 0)

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), 'class', 'form-control error-con', 0)

