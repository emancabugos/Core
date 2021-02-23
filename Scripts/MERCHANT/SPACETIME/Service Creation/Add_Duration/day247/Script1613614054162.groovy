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

WebUI.comment('Basic Details')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Header/header_Add Service'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Header/header_Add Service'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Schedule')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/02_Custom Fields/m_textfield'), 'Textfield')

WebUI.comment('Images')

WebUI.selectOptionByLabel(findTestObject('SPACETIME API/MERCHANT/Create Listing/dd_bookingType'), 'Default', false)

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/sd_ day'))

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_price'), '25.52')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_maximumBookings'), '2')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_Add-On Name'), 'Extra Service')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_Surcharge'), '10.01')

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/btn_ADD addOns'))

WebUI.comment('Additional Services')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_address'), '29th floor Rufino Pacific Tower')

WebUI.selectOptionByLabel(findTestObject('SPACETIME API/MERCHANT/Create Listing/dd_country'), 'Philippines', false)

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/text_State'), 'N/A')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textboxcity'), 'Makati')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_postalcode'), '1200')

WebUI.comment('Location')

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/cb_availablePickup'))

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/cb_availableShipping'))

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/btn_Add Item'))

WebUI.waitForElementVisible(findTestObject('SPACETIME API/MERCHANT/Create Listing/text_Inventory'), 0)

WebUI.comment('Delivery')

