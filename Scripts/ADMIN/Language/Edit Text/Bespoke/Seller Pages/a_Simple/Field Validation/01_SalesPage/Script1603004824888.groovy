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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Sales Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Clear all textfield')

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Sales page/input_YOUR SALES_item_name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Sales page/input_Keep track of the items that you have sold_item_details'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Sales page/input_Search by item name_search-by-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Sales page/input_Total items sold_total-item-sold'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Sales page/input_ITEM_purchase-item-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Sales page/input_SOLD_purchase-sold-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Sales page/input_TOTAL EARNED_purchase-total-earned-txt'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

WebUI.comment('Verification highlight textfield')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Sales page/input_YOUR SALES_item_name'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Sales page/input_Keep track of the items that you have sold_item_details'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Sales page/input_Search by item name_search-by-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Sales page/input_Total items sold_total-item-sold'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Sales page/input_ITEM_purchase-item-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Sales page/input_SOLD_purchase-sold-txt'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Sales page/input_TOTAL EARNED_purchase-total-earned-txt'), 
    'class', 'form-control error-con', 0)

