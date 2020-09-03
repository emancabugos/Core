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

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Private Login Page/logo_Marketplace'), 0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Private Register Page/textfield_YourEmailUsername'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Private Register Page/textfield_YourPassword'), 'Password1234')

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Private Register Page/button_CreateAccount'))

css_color = WebUI.getCSSValue(findTestObject('BESPOKE DEL 2/CONSUMER/Private Register Page/textfield_YourPassword'), 'color')

println(css_color)

WebUI.verifyEqual(css_color, rgb(118, 118, 118))

