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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Item List Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Clear all textfield')

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_YOUR ITEMS_item_name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_manage your'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_Search by item name_search-by'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_Upload_btn_upload'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_ITEM_item-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_Translate Button_btn_upload'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_PRICE_price-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_STOCK_stock-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_ACROSS_across-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_COMBINATION_combination-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_PURCHASABLE_purchasable-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_YES_yes-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_NO_no-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_REMOVE ITEM_popup-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/textarea_You sure about removing this item from your list (Itll be gone forever)'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_YES_yes-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_Okay_btn_okay'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

WebUI.comment('Verification highlight textfield')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_YOUR ITEMS_item_name'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_manage your'), 'class', 
    'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_Search by item name_search-by'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_Upload_btn_upload'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_ITEM_item-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_Translate Button_btn_upload'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_PRICE_price-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_STOCK_stock-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_ACROSS_across-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_COMBINATION_combination-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_PURCHASABLE_purchasable-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_YES_yes-txt'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_NO_no-txt'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_REMOVE ITEM_popup-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/textarea_You sure about removing this item from your list (Itll be gone forever)'),'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_YES_yes-txt'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item List/input_Okay_btn_okay'), 'class', 'form-control error-con', 0)

