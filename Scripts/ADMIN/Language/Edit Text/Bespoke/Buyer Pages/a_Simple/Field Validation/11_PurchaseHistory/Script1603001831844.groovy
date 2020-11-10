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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Buyer Pages/Purchase History Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Clear all textfield')

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_PURCHASE HISTORY_item_name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_Manage all'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_Search by Invoice ID_search-by-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_INVOICE NO_search-by-invid'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_TIMESTAMP_search-by-tmstmp'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_NO OF ITEM(S)_search-by-itm'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_ORDER TOTAL_search-by-qty'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_Delivery_search-by-dlrvy'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_Search by item name_search-by-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_Sold By_sold-by'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_SUBMIT_btn_apply'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

WebUI.comment('Verification highlight textfield')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_PURCHASE HISTORY_item_name'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_Manage all'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_Search by Invoice ID_search-by-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_INVOICE NO_search-by-invid'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_TIMESTAMP_search-by-tmstmp'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_NO OF ITEM(S)_search-by-itm'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_ORDER TOTAL_search-by-qty'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_Delivery_search-by-dlrvy'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_Search by item name_search-by-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_Sold By_sold-by'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/input_SUBMIT_btn_apply'), 
    'class', 'form-control error-con', 0)

