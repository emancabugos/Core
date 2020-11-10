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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Buyer Pages/Chat Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Clear all textfield')

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Chat/input_Type a message_item-has-been-added'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Chat/input_Please wait while channel is loading_channel-loading'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Chat/input_SEND_btn_view_cart'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

WebUI.comment('Verification highlight textfield')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Chat/input_Type a message_item-has-been-added'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Chat/input_Please wait while channel is loading_channel-loading'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Chat/label_SEND'), 'class', 'form-control error-con', 
    0)

