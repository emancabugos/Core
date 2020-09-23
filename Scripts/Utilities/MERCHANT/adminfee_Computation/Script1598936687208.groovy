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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.text.DecimalFormat as DecimalFormat
import org.openqa.selenium.Keys as Keys
import java.text.NumberFormat

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), 0)

WebUI.comment('Search on Homepage')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), 'Item 0 Commission')

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.comment('Search Result Page')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/button_Filters'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/item_Result'))

WebUI.waitForElementVisible(findTestObject('SUNTEC/Item Details Page/button_AddToCart'), 0)

WebUI.comment('Item Details Page')

DecimalFormat df = new DecimalFormat('#,###.00')

WebUI.selectOptionByValue(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details/dd_qty'), '2', true)

def itemprice = WebUI.getText(findTestObject('SUNTEC/Item Details Page/textlabel_ItemPrice'))

def quantity = WebUI.getAttribute(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details/dd_qty'), 'value')

BigDecimal intitemprice = new BigDecimal(itemprice)

BigDecimal intquantity = new BigDecimal(quantity)

def subtotal = intitemprice * intquantity

println(df.format(new BigDecimal(subtotal)))

WebUI.click(findTestObject('SUNTEC/Item Details Page/button_AddToCart'))

WebUI.waitForElementPresent(findTestObject('SUNTEC/Item Details Page/button_ViewCart'), 0)

WebUI.navigateToUrl(GlobalVariable.cartURL)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Cart/button_Checkout'), 0)

WebUI.comment('Cart Page')

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Item Cart/button_Checkout'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Item Cart/button_Checkout'))

WebUI.comment('Checkout - Delivery Page')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Delivery Details Page/textfield_FirstName'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Delivery Details Page/button_SelectAddress'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Delivery Details Page/button_Selected'), 0)

WebUI.scrollToElement(findTestObject('BESPOKE DEL 2/CONSUMER/Delivery Details Page/button_Next'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Delivery Details Page/button_Next'))

WebUI.comment('Checkout Review Page')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/dropdown_SelectDeliveryMethod'), 
    0)

WebUI.selectOptionByIndex(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/dropdown_SelectDeliveryMethod'), 1, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Get Consumer Details')

itemname = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/textlabel_ItemName'))

WebUI.comment('Computation of Total Cost')

def actualsubtotal = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/textlabel_SubTotal'))

println(df.format(new BigDecimal(subtotal)))

WebUI.verifyEqual(subtotal, actualsubtotal)

def deliverycost = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/textlabel_DeliveryCost'))

BigDecimal intsubtotal = new BigDecimal(subtotal)

BigDecimal intdeliverycost = new BigDecimal(deliverycost)

def totalcost = intsubtotal + intdeliverycost

println(df.format(new BigDecimal(totalcost)))

def actualtotal = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/textlabel_TotalCost'))

println(df.format(new BigDecimal(actualtotal)))

WebUI.verifyEqual(totalcost, actualtotal)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/button_ProceedPayment'))

WebUI.comment('Payment Page')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 0)

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

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Thank You Page/button_PurchaseHistory'), 0)

invoiceid = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Thank you Page/textlabel_inoviceID'))

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/menu_Orders'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/menu_Orders'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order List/textlabelvalue_InvoiceID'), 
    0)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order List/textlabelvalue_InvoiceID'), 
    invoiceid)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order List/textlabelvalue_OrderID'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_AdminFee'), 
    0)

WebUI.comment('Computation Admin Fee')

actualsellersub = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_SubTotal'))

actualsellerdel = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_DeliveryCost'))

WebUI.verifyEqual(subtotal, actualsellersub)

WebUI.verifyEqual(deliverycost, actualsellerdel)

float com = 0.20

BigDecimal intcom = new BigDecimal(com)

def adminfee = intsubtotal * intcom

println(df.format(new BigDecimal(adminfee)))

actualadminfee = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_AdminFee'))

WebUI.verifyEqual(adminfee, actualadminfee)

WebUI.comment('Transaction Total')

BigDecimal inttotalcost = new BigDecimal(totalcost)

BigDecimal intadminfee = new BigDecimal(adminfee)

def transactotal = inttotalcost - intadminfee

println(df.format(new BigDecimal(transactotal)))

actualtransactotal = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_TransactionTotal'))

WebUI.verifyEqual(transactotal, actualtransactotal)

