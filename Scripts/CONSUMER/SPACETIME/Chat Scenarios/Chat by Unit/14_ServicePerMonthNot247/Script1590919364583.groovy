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

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Validation on Homepage')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/button_Search'), 0)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/textfield_Keyword'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Search Function/textfield_Keyword'), itemName)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Search Function/button_Search'))

WebUI.comment('Verify in Search Result Page')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Result Page/image_Item'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Search Result Page/image_Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Verify in Item Details Page')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_ContactSeller'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_ContactSeller'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Send'), 0)

WebUI.waitForElementClickable(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textarea_chatMsg'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textarea_chatMsg'), 'Hello')

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Send'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/first_Chat'), 0)

WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/first_Chat'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Inbox/button_inbox'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Inbox/button_inbox'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Inbox/button_Enquiry'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Inbox/textfield_Search'), itemName)

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

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textfield_Date'), offerDate)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textfield_Unit'), offerUni)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textfield_Offer'), offerPrice)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_sendNow'))

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Validation on Homepage')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/button_Search'), 0)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Inbox/button_inbox'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Inbox/button_inbox'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Pending'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Inbox/textfield_Search'), itemName)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Inbox/button_Search'))

WebUI.delay(1)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Pending'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Pending'), 0)

WebUI.waitForElementClickable(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textarea_chatMsg'), 0)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Decline'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Decline'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(0)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Inbox/button_inbox'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Inbox/button_inbox'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Inbox/button_Enquiry'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Inbox/textfield_Search'), itemName)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Inbox/button_Search'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Decline'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Decline'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Send'), 0)

WebUI.waitForElementClickable(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textarea_chatMsg'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_CreateOffer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_sendNow'), 0)

WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'), 0)

WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/timepicker_Time'))

WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'))

WebUI.delay(1)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textfield_Date'), offerDate)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textfield_Time'), offerTime)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textfield_Duration'), offerDuration)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textfield_Offer'), offerPrice)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_sendNow'))

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Validation on Homepage')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/button_Search'), 0)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Inbox/button_inbox'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Inbox/button_inbox'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Pending'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Inbox/textfield_Search'), itemName)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Inbox/button_Search'))

WebUI.delay(1)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Pending'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Pending'), 0)

WebUI.waitForElementClickable(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textarea_chatMsg'), 0)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_BuyNow'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_BuyNow'), FailureHandling.CONTINUE_ON_FAILURE)

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

if (payment == 'Stripe') {
    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Stripe', true)

    WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_Email'), 0)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_Email'), 'test321@gmail.com')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_CardNumber'), '4242 4242 4242 4242')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_DateExpiry'), '1123')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_CVC'), '123')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_Name'), 'Jane Doe')

    WebUI.delay(0.5)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/button_Pay'))
} else if (payment == 'Paypal') {
    WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'PayPal', true)

    WebUI.verifyOptionSelectedByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'PayPal', 
        true, 0)

    WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'))

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/tab_Paypal'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/tab_Paypal'))

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal/textfield_Email'), 0)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/textfield_Email'), 'hiveboxstaging03@yopmail.com')

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/textfield_Password'), 'welcome8')

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/button_Login'))

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/button_Pay'), 0)

    WebUI.delay(0.5)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/button_Pay'))

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/button_Return'), 0)

    WebUI.delay(0.5)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Paypal_New/button_Return'))
} else if (payment == 'Omise') {
    WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Omise', true)

    WebUI.verifyOptionSelectedByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Omise', 
        true, 0)

    WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'))

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise_New/i_Frame'), 0)

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise_New/textfield_CardNumber'), '4242424242424242')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise_New/textfield_Name'), 'John Doe')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise_New/textfield_Expiry'), '1123')

    WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise_New/textfield_Security'), '123')

    WebUI.delay(0.5)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Omise_New/button_PayNow'))
} else if (delivery == 'Custom') {
    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), Custom, true)

    WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Custom Payment/button_Accept'), 
        0)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Custom Payment/textfield_Note'), 'test')

    WebUI.delay(1)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Custom Payment/button_Accept'))
}

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Thank You Page/button_PurchaseHistory'), 0)

