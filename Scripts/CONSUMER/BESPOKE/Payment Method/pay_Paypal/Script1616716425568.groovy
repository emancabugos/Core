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

WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'PayPal', true)

WebUI.verifyOptionSelectedByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'PayPal', 
    true, 0)

WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/tab_Paypal'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/tab_Paypal'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal/textfield_Email'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/textfield_Email'), 'hiveboxstaging03@yopmail.com')

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/textfield_Password'), 'welcome8')

WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/button_Login'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/button_Pay'), 0)

WebUI.delay(0.5)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/button_Pay'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/button_Return'), 0)

WebUI.delay(0.5)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/button_Return'))

