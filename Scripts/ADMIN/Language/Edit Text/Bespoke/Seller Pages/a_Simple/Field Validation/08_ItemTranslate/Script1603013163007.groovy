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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Item Translation Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Clear all textfield')

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_TRANSLATE ITEM_transalate-item'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_Add or edit translations for your item details_transalate-detail'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_Language_Language'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_CANCEL_btn_cancel'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_SAVE_btn_save'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_ITEM NAME_Language'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_ITEM DESCRIPTION_Language'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_OPTION NAME_Language'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_OPTION CHOICE_Language'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_You have not finished_not-finished'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_You are about to leave the page with out saving your progress Would you like to leave this page_about-leave'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_CANCEL_later_btn'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_CONTINUE_later_btn'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

WebUI.comment('Verification highlight textfield')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_TRANSLATE ITEM_transalate-item'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_Add or edit translations for your item details_transalate-detail'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_Language_Language'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_CANCEL_btn_cancel'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_SAVE_btn_save'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_ITEM NAME_Language'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_ITEM DESCRIPTION_Language'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_OPTION NAME_Language'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_OPTION CHOICE_Language'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_You have not finished_not-finished'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_You are about to leave the page with out saving your progress Would you like to leave this page_about-leave'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_CANCEL_later_btn'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_CONTINUE_later_btn'), 
    'class', 'form-control error-con', 0)

