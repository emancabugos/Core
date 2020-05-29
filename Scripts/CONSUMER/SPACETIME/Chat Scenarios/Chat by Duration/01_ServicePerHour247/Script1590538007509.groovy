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

WebUI.comment('Validation on Homepage')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/button_Search'), 0)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/textfield_Keyword'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Search Function/textfield_Keyword'), 'Duration Item')

WebUI.delay(1)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Search Function/button_Search'))

WebUI.click(findTestObject('SPACETIME/CONSUMER/Search Function/button_Search'))

WebUI.comment('Verify in Search Result Page')

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Result Page/image_Item'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Search Result Page/image_Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.comment('Verify in Item Details Page')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_ContactSeller'), 0)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_ContactSeller'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Send'), 0)

WebUI.waitForElementClickable(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textarea_chatMsg'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textarea_chatMsg'), 'Hello')

WebUI.delay(1)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Send'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/first_Chat'), 0)

WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/first_Chat'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Inbox/button_inbox'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Inbox/button_inbox'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Inbox/button_Enquiry'), 0)

WebUI.waitForPageLoad(1)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Inbox/textfield_Search'), 'Duration Item')

WebUI.click(findTestObject('SPACETIME/CONSUMER/Inbox/button_Search'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Inbox/button_Enquiry'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Inbox/button_Enquiry'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Send'), 0)

WebUI.waitForElementClickable(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textarea_chatMsg'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_CreateOffer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_sendNow'), 0)

WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'), 0)

WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time'))

WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'))

WebUI.delay(1)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'), '23/04/2021')

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time'), '10:15 AM')

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/textfield_Duration'), '2')

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_sendNow'))

