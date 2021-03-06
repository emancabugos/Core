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

//WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Header/header_Bookings'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Header/header_Bookings'))

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Booking List/textbox_search'), '0803tim1598250019r3va')

WebUI.sendKeys(findTestObject('SPACETIME/MERCHANT/Booking List/textbox_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('SPACETIME/MERCHANT/Booking List/button_View order'))

WebUI.verifyOptionSelectedByLabel(findTestObject('SPACETIME/MERCHANT/Order Details/dd_order status'), 'Acknowledged', false, 
    0)

