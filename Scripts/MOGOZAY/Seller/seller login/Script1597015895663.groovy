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

WebUI.navigateToUrl(GlobalVariable.mogoSandbox)

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Seller/Login/textlink_BE A SELLER'), 0)

WebUI.click(findTestObject('MOGOZAY/Seller/Login/textlink_BE A SELLER'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Seller/Login/btn_sign as aseller'), 0)

WebUI.click(findTestObject('MOGOZAY/Seller/Login/btn_sign as aseller'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Seller/Login/textbox_username'), 0)

WebUI.setText(findTestObject('MOGOZAY/Seller/Login/textbox_username'), GlobalVariable.sellerCMS)

WebUI.setText(findTestObject('MOGOZAY/Seller/Login/textbox_password'), 'welcome8')

WebUI.click(findTestObject('MOGOZAY/Seller/Login/btn_signin'), FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementPresent(findTestObject('FIND/SELLER/Login/btn_acceptCookies'), 2, FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('FIND/SELLER/Login/btn_acceptCookies'))
} else {
    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
}

