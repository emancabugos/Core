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

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), varLanguage, false)

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Welcome Mail/input_welcome-to'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Welcome Mail/input_lbl_hi'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Welcome Mail/input_welcome'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Welcome Mail/input_we-hope-txt'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Welcome Mail/input_login-id'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Welcome Mail/input_btn_next'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Welcome Mail/input_lbl_regard'), '*')

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_success'), 0)

