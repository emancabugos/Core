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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Buyer Pages/Purchase Details Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Clear all textfield')

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_INVOICE ID_purchase-invoice-id'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_TIMESTAMP_purchase-timestamp'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_DELIVERY ADDRESS_purchase-delivery'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_TRANSACTION TOTAL_purchase-transaction-total'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Subtotal_purchase-subtotal-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_PAYMENT METHOD_payment_method'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Delivery_Delivery'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_PAYMENT STATUS_payment_status'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Bulk Delivery Discount_purchase-bulk-delivery-discount-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_PRICE_purchase-price-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_QTY_purchase-qty-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_DELIVERY_purchase-delivery-txt (1)'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_ORDER STATUS_purchase-orderstatus-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_REVIEWS_purchase-review-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Sold By_sold-by'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Contact_Contact'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Delivery_Delivery'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Pickup_Pickup'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Leave a feedback_purchase-leave-feedback-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Left feedback_purchase-left-feedback-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_BACK TO LIST_btn_back'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_LEFT A FEEDBACK FOR_popup-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_How much do you rate this item_popup-desc'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Leave a feedback_leave-feedback'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Excellent_excellent'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Great_great'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Good_good'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Okay_ok'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Unsatisfied_Unsatisfied'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_SUBMIT_btn_okay'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

WebUI.comment('Verification highlight textfield')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_INVOICE ID_purchase-invoice-id'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_TIMESTAMP_purchase-timestamp'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_DELIVERY ADDRESS_purchase-delivery'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_TRANSACTION TOTAL_purchase-transaction-total'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Subtotal_purchase-subtotal-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_PAYMENT METHOD_payment_method'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Delivery_Delivery'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_PAYMENT STATUS_payment_status'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Bulk Delivery Discount_purchase-bulk-delivery-discount-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_ITEM_purchase-item-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_PRICE_purchase-price-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_QTY_purchase-qty-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Delivery_purchase-delivery-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_ORDER STATUS_purchase-orderstatus-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_REVIEWS_purchase-review-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Sold By_sold-by'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Contact_Contact'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Delivery_Delivery'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Pickup_Pickup'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Leave a feedback_purchase-leave-feedback-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Left feedback_purchase-left-feedback-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_BACK TO LIST_btn_back'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_LEFT A FEEDBACK FOR_popup-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_How much do you rate this item_popup-desc'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Leave a feedback_leave-feedback'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Excellent_excellent'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Great_great'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Good_good'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Okay_ok'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_Unsatisfied_Unsatisfied'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase Details/input_SUBMIT_btn_okay'), 
    'class', 'form-control error-con', 0)

