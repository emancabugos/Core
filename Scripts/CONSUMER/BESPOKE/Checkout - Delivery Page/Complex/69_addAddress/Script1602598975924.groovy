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

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/button_AddNew'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/textfield_FirstName'), 'Jane')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/textfield_LastName'), 'Doe')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/textfield_NotificationEmail'), 'janedoe@yopmail.com')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/textfield_ContactNumber'), '09123456789')

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/button_AddNew'))

WebUI.waitForElementClickable(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/textfield_Address'), 0)

WebUI.verifyElementClickable(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/textfield_Address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/textfield_Address'), 'Rufino Pacific Tower')

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/dropdown_Country'), 'Philippines', 
    false)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/textfield_State'), 'Makati')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/textfield_City'), 'Metro Manila')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/textfield_PostalCode'), '1011')

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/button_AddNew'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/button_Selected'), 0)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/value_Name'), 'Jane Doe')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/value_Address'), 'Rufino Pacific Tower')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/value_Country'), 'Philippines')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/value_City'), 'Metro Manila')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/value_State'), 'Makati')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/value_PostalCode'), '1011')

