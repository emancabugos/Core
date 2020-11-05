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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Common Words/Common Words Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Clear all textfield')

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Cash on delivery_cash-delivery'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Paid_Paid'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_To be collected_to_be_collected'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Delivery_delivery'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Pick up_pickup'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_SKU_sku'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Save_sku'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Search_search'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Acknowledged_Acknowledged'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Processing_Processing'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Pending_Pending'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Waiting for payments_Waitingforpayments'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Created_Created'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Fully Paid_FullyPaid'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Delivered_Delivered'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Ready for Pick-up_ReadyforPick-up'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Collected_Collected'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Refunded_Refunded'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_MERCHANT ACCESS DENIED_merchant-access'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_concat(Your action is not allowed Please contact the site  s administrator)_action-not-allowed'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_No email allowed_no-email-allowed'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

WebUI.comment('Verification highlight textfield')


WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Cash on delivery_cash-delivery'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Paid_Paid'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_To be collected_to_be_collected'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Delivery_delivery'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Pick up_pickup'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_SKU_sku'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Save_sku'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Search_search'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Acknowledged_Acknowledged'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Processing_Processing'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Pending_Pending'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Waiting for payments_Waitingforpayments'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Created_Created'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Fully Paid_FullyPaid'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Delivered_Delivered'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Ready for Pick-up_ReadyforPick-up'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Collected_Collected'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_Refunded_Refunded'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_MERCHANT ACCESS DENIED_merchant-access'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_concat(Your action is not allowed Please contact the site  s administrator)_action-not-allowed'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Common Words/input_No email allowed_no-email-allowed'), 'class', 'form-control error-con', 0)
