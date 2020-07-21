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

WebUI.waitForElementPresent(findTestObject('BESPOKE/MERCHANT/Private Register/button_ContinuewithFacebook'), 0)

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Private Register/textfield_YourEmailUsername'), '')

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Private Register/textfield_YourPassword'), '')

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Private Register/textfield_ReconfirmPassword'), '')

WebUI.setText(findTestObject('BESPOKE/MERCHANT/Private Register/textfield_EmailNotification'), '')

WebUI.click(findTestObject('BESPOKE/MERCHANT/Private Register/button_CreateAccount'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 1/MERCHANT/User Settings/button_CHANGE'), 0)

