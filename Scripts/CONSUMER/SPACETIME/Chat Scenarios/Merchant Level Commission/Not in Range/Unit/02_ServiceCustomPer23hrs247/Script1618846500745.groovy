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

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Search Function/textfield_Keyword'), ('Custom per 23hr 24/7 U' + ' ') + 
    GlobalVariable.CustomMerchant)

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

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Inbox/textfield_Search'), ('Custom per 23hr 24/7 U' + ' ') + GlobalVariable.CustomMerchant)

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

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textfield_Date'), '21/06/2021')

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textfield_Time'), '10:00 AM')

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textfield_Unit'), '1')

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textfield_Offer'), '20')

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_sendNow'))

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Validation on Homepage')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/button_Search'), 0)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Inbox/button_inbox'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Inbox/button_inbox'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Pending'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Inbox/textfield_Search'), ('Custom per 23hr 24/7 U' + ' ') + GlobalVariable.CustomMerchant)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Inbox/button_Search'))

WebUI.delay(1)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Pending'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Pending'), 0)

WebUI.waitForElementClickable(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textarea_chatMsg'), 0)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_BuyNow'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_BuyNow'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Delivery1'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Delivery1'))

WebUI.delay(1)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Checkout'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Delivery Details Page/button_SelectAddress'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Delivery Popup Window/button_Delivery1'))

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

WebUI.comment('Computation of Total Cost')

DecimalFormat df = new DecimalFormat('#,###.00')

def subtotal = WebUI.getText(findTestObject('SPACETIME/CONSUMER/Review Details Page/textlabelvalue_subtotal'))

println(df.format(new BigDecimal(subtotal)))

def deliverycost = WebUI.getText(findTestObject('SPACETIME/CONSUMER/Review Details Page/textlabelvalue_delivery'))

BigDecimal intsubtotal = new BigDecimal(subtotal)

BigDecimal intdeliverycost = new BigDecimal(deliverycost)

def totalcost = intsubtotal + intdeliverycost

println(df.format(new BigDecimal(totalcost)))

def actualtotal = WebUI.getText(findTestObject('SPACETIME/CONSUMER/Review Details Page/textlabelvalue_total'))

println(df.format(new BigDecimal(actualtotal)))

WebUI.verifyEqual(totalcost, actualtotal)

WebUI.callTestCase(findTestCase('CONSUMER/SPACETIME/Payment Page/pay_CustomPayment'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Thank You Page/button_PurchaseHistory'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Thank you Page/textlabel_inoviceID'), 0)

invoiceid = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Thank you Page/textlabel_inoviceID'))

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Header/header_Bookings'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Header/header_Bookings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Booking List/textbox_search'), 0)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Booking List/textbox_search'), invoiceid)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Booking List/button_Apply'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Booking List/button_View order'), 0)

WebUI.verifyElementText(findTestObject('SPACETIME/MERCHANT/Booking List/button_View order'), invoiceid)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Booking List/button_View order'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Booking details/textlabel_Admin fee'), 0)

WebUI.comment('Computation Admin Fee')

actualsellersub = WebUI.getText(findTestObject('SPACETIME/MERCHANT/Booking details/textlabel_Sub Total'))

actualsellerdel = WebUI.getText(findTestObject('SPACETIME/MERCHANT/Booking details/textlabel_Delivery'))

WebUI.verifyEqual(subtotal, actualsellersub)

WebUI.verifyEqual(deliverycost, actualsellerdel)

WebUI.delay(5)

//Convert Subtotal to String
String newSub = subtotal

def newSubld = newSub.replace(',', '')

BigDecimal fnewSub = new BigDecimal(newSubld)

println(fnewSub)

def com = 0.10

//Convert string commission to float
String fcom = com

Float comfloat = Float.parseFloat(fcom)

println(comfloat)

//Computation AdminFee
def adminfee = fnewSub * comfloat

BigDecimal fadminfee = new BigDecimal(adminfee)

println(fadminfee)

String ladminfee = fadminfee.setScale(2, BigDecimal.ROUND_HALF_UP)

println(ladminfee)

//Get Actual Admin Fee
String actadminfee = WebUI.getText(findTestObject('SPACETIME/MERCHANT/Booking details/textlabel_Admin fee'))

def factadminfee = actadminfee.replace(',', '')

String lactadminfee = new BigDecimal(factadminfee)

println(lactadminfee)

//Verify expected to actual
WebUI.verifyMatch(ladminfee, lactadminfee, false)

WebUI.comment('Computation Transaction Total')

def transactotal = totalcost - adminfee

BigDecimal ftransactotal = new BigDecimal(transactotal)

println(ftransactotal)

String ltransactotal = ftransactotal.setScale(2, BigDecimal.ROUND_HALF_UP)

println(ltransactotal)

String actransactotal = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_TransactionTotal'))

def factransactotal = actransactotal.replace(',', '')

String lactransactotal = new BigDecimal(factransactotal)

println(lactransactotal)

WebUI.verifyMatch(ltransactotal, lactransactotal, false)

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/18_redirectionTransactionList'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History List/search_textfield'), 
    invoiceid)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History List/button_Apply'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History List/Seller 01/textlabelvalue_InvoiceID'), 
    invoiceid)

apadminfee = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History List/Seller 01/textlabelvalue_AdminFee'))

WebUI.verifyMatch(ladminfee, apadminfee, false)

String faptotalcost = totalcost

def aptotalcost1 = faptotalcost.replace(',', '')

String laptotalcost = new BigDecimal(aptotalcost1)

println(laptotalcost)

aptotalcost = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History List/Seller 01/textlabelvalue_OrderAmout'))

WebUI.verifyMatch(laptotalcost, aptotalcost, false)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History List/Seller 01/textlabelvalue_Timestamp'))

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History Details/textlabelvalue_TotalOrderPayout01'), 
    ltransactotal)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History Details/textlabelvalue_TotalOrderPayOut02'), 
    ltransactotal)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History Details/textlabelvalue_OrderAdminFee01'), 
    ladminfee)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History Details/textlabelvalue_OrderAdminFee02'), 
    ladminfee)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History Details/textlabelvalue_DeliveryCost'), 
    deliverycost)

String fsubtotal = subtotal

def fsubtotal1 = fsubtotal.replace(',', '')

String lsubtotal = new BigDecimal(fsubtotal1)

println(lsubtotal)

apsubtotal = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History Details/textlabevalue_SubTotal'))

WebUI.verifyMatch(lsubtotal, apsubtotal, false)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History Details/textlabelvalue_InvoiceID'), 
    invoiceid)

WebUI.delay(2)

WebUI.closeBrowser()

