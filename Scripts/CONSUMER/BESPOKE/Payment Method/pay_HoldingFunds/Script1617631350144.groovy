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

WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Stripe Fund', true)

WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_Email'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_Email'), 'test321@gmail.com')

WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_CardNumber'), '4242 4242 4242 4242')

WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_DateExpiry'), '1123')

WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_CVC'), '123')

WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_Name'), 'Jane Doe')

WebUI.delay(0.5)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/button_Pay'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Thank you Page/textlabel_inoviceID'), 0)

