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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Private Login Page/logo_Marketplace'), 0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Private Register Page/textfield_YourEmailUsername'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Private Register Page/textfield_YourEmailUsername'), 'buyer01')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Private Register Page/textfield_YourPassword'), '123')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Private Register Page/textfield_ReconfirmPassword'), '123')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Private Register Page/textfield_NotificationEmail'), 'buyer01@gmail.com')

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Private Register Page/button_CreateAccount'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Private Register Page/warning_6Characters'), 0)

WebUI.verifyElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Private Register Page/warning_6Characters'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.refresh()

