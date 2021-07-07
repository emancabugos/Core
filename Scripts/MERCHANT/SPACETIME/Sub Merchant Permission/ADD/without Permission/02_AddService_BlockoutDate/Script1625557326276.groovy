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
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Header/header_Add Service'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Header/header_Add Service'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Select Category')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/Category Commission/category99'), 
    0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/Category Commission/category99'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_service name'), 'Test Permission')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_description'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.selectOptionByLabel(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/dropdown_booking type'), 'Default', 
    false)

WebUI.comment('Service Duration')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/Default Duration/label_ day'), 
    0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/Default Duration/label_ day'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_price'), '10')

WebUI.comment('Unlimited Bookings')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/toggle_unlimited bookings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_max bookings'), '2')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/button_ Negotiation'))

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/button_Next basic details'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Schedule')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Blockout Dates/btn_Block this datetime'), 
    0)

WebUI.mouseOver(findTestObject('SPACETIME/MERCHANT/Service Creation/Blockout Dates/btn_Block this datetime'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('You need permission to perform this action', false)

