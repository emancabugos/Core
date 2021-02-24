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

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_service name'), 0)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_service name'), 'per Custom 150min 24/7 D')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/checkbox_cat1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/button_ Negotiation'))

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/button_Browse'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/image_container'), 'C:\\\\Katalon\\\\BespokeAPI\\\\Images\\\\UN Items\\\\item1.jpg')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/browse_img/button_ok'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/browse_img/button_ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('Description')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_description'), 0)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_description'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.comment('Custom Fields')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Custom Fields/input_txt-field'), 'Textfield')

WebUI.comment('Pricing')

WebUI.selectOptionByLabel(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/dropdown_booking type'), 'Default', 
    false)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/Default Duration/label_custom'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/Default Duration/dropdown_custom duration'), 
    0)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/Default Duration/dropdown_custom duration'), 
    'Minute(s)', false)

WebUI.delay(1)

for (int click = 0; click < 29; click++) {
    WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/increase_duration'))
}

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_price'), '25.52')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_max bookings'), '2')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Add Ons/textbox_add on name'), 'Extra Service')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Add Ons/textbox_surcharge'), '10.01')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Add Ons/button_Add'))

WebUI.comment('Location')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/textbox_address'), '29th floor Rufino Pacific Tower')

WebUI.selectOptionByLabel(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/dropdown_(SELECT COUNTRY)'), 'Philippines', 
    false)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/textbox_state'), 'N/A')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/textbox_city'), 'Makati')

WebUI.setText(findTestObject('SPACETIME API/MERCHANT/Create Listing/textbox_postalcode'), '1200')

WebUI.comment('Shipping')

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/cb_availablePickup'))

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/cb_availableShipping'))

WebUI.click(findTestObject('SPACETIME API/MERCHANT/Create Listing/btn_Add Item'))

WebUI.waitForElementVisible(findTestObject('SPACETIME API/MERCHANT/Create Listing/text_Inventory'), 0)

