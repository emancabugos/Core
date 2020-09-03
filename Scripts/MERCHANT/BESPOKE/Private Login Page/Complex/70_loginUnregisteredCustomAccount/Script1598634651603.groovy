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

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.waitForPageLoad(0)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Private Login Page/button_SignInAsSeller'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Private Login Page/button_SignInAsSeller'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Private Login Page/button_ContinueWithFacebook'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Private Login Page/textfield_YourEmailUsername'), '')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Private Login Page/textfield_YourPassword'), '')

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Private Login Page/button_SignIn'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Private Login Page/toaster_IncorrectCredentials'), 0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Private Login Page/toaster_IncorrectCredentials'), 0)

WebUI.closeBrowser()

