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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.SOCHomepageURL)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Homepage/a_REGISTER  SIGN IN'), 0)

if (WebUI.verifyElementPresent(findTestObject('Utilities/Cookies/button_Accept Cookies'), 3, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.click(findTestObject('Utilities/Cookies/button_Accept Cookies'), FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.verifyElementPresent(findTestObject('SPACETIME/CONSUMER/Homepage/a_BE A SELLER'), 0)
}

WebUI.click(findTestObject('SPACETIME/CONSUMER/Homepage/a_REGISTER  SIGN IN'))

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/button_create-account'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/textbox_username'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/textbox_username'), 'socbuyer_02')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/textbox_password'), 'welcome8')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/textbox_reconfirm-password'), 'welcome8')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/textbox_notificationemail'), 'arcqatester02@gmail.com')

WebUI.click(findTestObject('SUNTEC/Private Register/button_CreateAccount'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

