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

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Buyer Menu/user_Image'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Buyer Menu/linktext_Purchases'))

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Purchase History List/button_Search'), '0803TIM1598252499QEF5')

WebUI.sendKeys(findTestObject('SPACETIME/MERCHANT/Booking List/textbox_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('SPACETIME/MERCHANT/Booking List/button_View order'))

String orderdetailstatus = WebUI.getText(findTestObject('SPACETIME/CONSUMER/Purchase History Details/Page_0803time/textlabel_Orderstatus values PO details'))

WebUI.verifyMatch(orderdetailstatus, 'Acknowledged', false)

