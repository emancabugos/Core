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

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Checkout Delivery/textlabel_Delivery'), 0)

WebUI.verifyElementPresent(findTestObject('SPACETIME/CONSUMER/Checkout Delivery/btn_Add New'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Checkout Delivery/btn_Add New'))

WebUI.verifyElementPresent(findTestObject('SPACETIME/CONSUMER/Checkout Delivery/Add new Address/textlabel_Enter a new address'), 
    0)

'Input address\r\n'
WebUI.setText(findTestObject('SPACETIME/CONSUMER/Checkout Delivery/Add new Address/textfield_Address_address'), 'Address 1')

'Select Country'
WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Checkout Delivery/Add new Address/dd_Country'), 'Afghanistan', 
    false)

'Input State'
WebUI.setText(findTestObject('SPACETIME/CONSUMER/Checkout Delivery/Add new Address/textfield_State_state'), 'State 1')

'Input City'
WebUI.setText(findTestObject('SPACETIME/CONSUMER/Checkout Delivery/Add new Address/textfield_City_city'), 'City 1')

'Input Postal Code'
WebUI.setText(findTestObject('SPACETIME/CONSUMER/Checkout Delivery/Add new Address/textfield_Postal code_postalcode'), '1234')

WebUI.click(findTestObject('SPACETIME/CONSUMER/Checkout Delivery/Add new Address/btn_Add'))

