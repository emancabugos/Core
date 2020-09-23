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

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Private Login Page/button_LetUsKnow'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Private Login Page/button_LetUsKnow'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Interested User/radiobutton_Buyer'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Interested User/radiobutton_Seller'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Interested User/textfield_YourName'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Interested User/textfield_YourName'), '')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Interested User/textfield_YourEmail'), '')

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Interested User/button_Send'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Interested User/toaster_SuccessfulInterest'), 0)

WebUI.verifyElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Interested User/toaster_SuccessfulInterest'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

