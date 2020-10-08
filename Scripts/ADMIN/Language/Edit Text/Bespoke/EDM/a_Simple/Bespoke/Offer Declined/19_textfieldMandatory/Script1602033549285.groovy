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

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Offer Declined/input_Click here to continue negotiating_continue_negotiationg'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Offer Declined/input_has been declined_has_declined'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Offer Declined/input_Hi'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Offer Declined/input_Offer declined'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Offer Declined/input_Regards_regards'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Offer Declined/input_Thank you_thankyou'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Offer Declined/input_The offer that you sent to_offer_sent'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/_Notif message/input_Page_btn btn-blue'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/_Notif message/Toaster message'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/_Notif message/Toaster message'), 0)

