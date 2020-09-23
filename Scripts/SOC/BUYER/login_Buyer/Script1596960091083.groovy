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

WebUI.click(findTestObject('SPACETIME/CONSUMER/Homepage/a_REGISTER  SIGN IN'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Login Buyer/input_username'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Login Buyer/input_username'), GlobalVariable.CustomConsumer)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Login Buyer/input_password'), GlobalVariable.CustomPass)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Login Buyer/a_Sign In'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SOC/Add Item/button_AcceptCookies'), 0)

WebUI.click(findTestObject('SOC/Add Item/button_AcceptCookies'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('SOC/Add Item/button_AcceptCookies'), 0)

