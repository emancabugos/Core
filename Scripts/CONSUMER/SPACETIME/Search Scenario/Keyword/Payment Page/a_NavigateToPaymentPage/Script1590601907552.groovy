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

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/textfield_Keyword'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Search Function/textfield_Keyword'), itemName)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Search Function/button_Search'))

WebUI.comment('Verify in Search Result Page')

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Result Page/image_Item'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Search Result Page/image_Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Verify in Item Details Page')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_ContactSeller'), 0)

WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time'))

WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'))

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'), date)

WebUI.delay(1)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time'), time)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/textfield_Duration'), duration)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_BuyNow'), FailureHandling.STOP_ON_FAILURE)

if (delivery == 'del1') {
    WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Delivery1'))
} else if (delivery == 'del2') {
    WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Delivery2'))
} else if (delivery == 'pickup1') {
    WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_PickUp1'))
} else if (delivery == 'pickup2') {
    WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_PickUp2'))
} else if (delivery == 'none') {
    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Delivery Details Page/button_SelectAddress'), 0)
}

WebUI.comment('Checkout - Delivery Page')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Delivery Details Page/button_SelectAddress'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Details Page/button_SelectAddress'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Delivery Details Page/button_Selected'), 0)

WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Delivery Details Page/buttonDelivery_Next'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Details Page/buttonDelivery_Next'))

WebUI.comment('Checkout - Review Page')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Review Details Page/button_Previous'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Review Details Page/textarea_Notes'), 'Service Per Hour 247')

WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Review Details Page/buttonReview_Next'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Review Details Page/buttonReview_Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Checkout - Payment Page')

WebUI.waitForElementPresent(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

