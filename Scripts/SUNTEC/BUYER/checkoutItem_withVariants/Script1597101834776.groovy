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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.text.DecimalFormat as DecimalFormat

WebUI.callTestCase(findTestCase('SUNTEC/ADMIN/impersonate_Buyer'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUNTEC/Homepage/button_Search'), 0)

WebUI.click(findTestObject('SUNTEC/Homepage/button_Search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUNTEC/Homepage/textfield_Search'), 0)

WebUI.comment('Search on Homepage')

WebUI.setText(findTestObject('SUNTEC/Homepage/textfield_Search'), 'Item with Variants')

WebUI.sendKeys(findTestObject('SUNTEC/Homepage/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.comment('Search Result Page')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/button_Filters'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/item_Result'))

WebUI.waitForElementVisible(findTestObject('SUNTEC/Item Details Page/button_AddToCart'), 0)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('SUNTEC/Item Details Page/dropdown_VarOpt1'), 'White', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('SUNTEC/Item Details Page/dropdown_VarOpt2'), 'Small', false)

WebUI.comment('Item Details Page')

DecimalFormat df = new DecimalFormat('#,###.00')

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/dropdown_Quantity'), '1', true)

def itemprice = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/textlabel_ItemPrice'))

def quantity = WebUI.getAttribute(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/dropdown_Quantity'), 'value')

BigDecimal intitemprice = new BigDecimal(itemprice)

BigDecimal intquantity = new BigDecimal(quantity)

def subtotal = intitemprice * intquantity

println(df.format(new BigDecimal(subtotal)))

WebUI.click(findTestObject('SUNTEC/Item Details Page/button_AddToCart'))

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/button_ViewCart'), 0)

WebUI.navigateToUrl(GlobalVariable.SCartURL)

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

itemname = WebUI.getText(findTestObject('SOC/Checkout - Review Page/textlabel_itemName'))

WebUI.comment('Computation of Total Cost')

def actualsubtotal = WebUI.getText(findTestObject('SOC/Checkout - Review Page/textlabel_SubTotal'))

println(df.format(new BigDecimal(subtotal)))

WebUI.verifyEqual(subtotal, actualsubtotal)

def deliverycost = WebUI.getText(findTestObject('SOC/Checkout - Review Page/textlabel_Delivery'))

BigDecimal intsubtotal = new BigDecimal(subtotal)

BigDecimal intdeliverycost = new BigDecimal(deliverycost)

def totalcost = intsubtotal + intdeliverycost

println(df.format(new BigDecimal(totalcost)))

def actualtotal = WebUI.getText(findTestObject('SOC/Checkout - Review Page/textlabel_Total'))

println(df.format(new BigDecimal(actualtotal)))

WebUI.verifyEqual(totalcost, actualtotal)

WebUI.delay(2)

fdelivery = WebUI.getText(findTestObject('SOC/Checkout - Review Page/textlabel_DeliveryValue'))

fmlt = WebUI.getText(findTestObject('SOC/Checkout - Review Page/textlabel_MinimumLeadTimeValue'))

fsubtotal = WebUI.getText(findTestObject('SUNTEC/Checkout - Review Page/textlabel_SubTotal'))

ftotal = WebUI.getText(findTestObject('SUNTEC/Checkout - Review Page/textlabel_Total'))

WebUI.click(findTestObject('SUNTEC/Checkout - Review Page/button_ProceedToPayment'))

WebUI.comment('Payment Page')

WebUI.waitForElementVisible(findTestObject('SUNTEC/Pay Page/button_PayNow'), 0)

WebUI.verifyElementText(findTestObject('SUNTEC/Pay Page/texlabel_SubTotal'), fsubtotal)

WebUI.verifyElementText(findTestObject('SUNTEC/Pay Page/textlabel_Delivery'), fdelivery)

WebUI.verifyElementText(findTestObject('SUNTEC/Pay Page/textlabel_Total'), ftotal)

WebUI.click(findTestObject('SUNTEC/Pay Page/button_PayNow'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SUNTEC/Payment Page/tab_Card'), 0)

WebUI.click(findTestObject('SUNTEC/Payment Page/tab_Card'))

WebUI.waitForElementVisible(findTestObject('SUNTEC/Payment Page/dropdown_Card'), 0)

WebUI.setText(findTestObject('SUNTEC/Payment Page/textfield_CardNumber'), '4242 4242 4242 4242')

WebUI.setText(findTestObject('SUNTEC/Payment Page/textfield_Name'), 'Jane Doe')

WebUI.setText(findTestObject('SUNTEC/Payment Page/textfield_CVVCode'), '123')

WebUI.setText(findTestObject('SUNTEC/Payment Page/textfield_ExpiDate'), '1123')

WebUI.delay(1)

WebUI.click(findTestObject('SUNTEC/Payment Page/button_PlaceYourOrder'))

WebUI.waitForElementVisible(findTestObject('SUNTEC/Payment Page/button_Finish'), 0)

WebUI.click(findTestObject('SUNTEC/Payment Page/button_Finish'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Thank You Page/button_PurchaseHistory'), 0)

WebUI.comment('Verify Buyer Purchase List')

finvoice = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Thank you Page/textlabel_inoviceID'))

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Thank you Page/button_PurchaseHistory'))

WebUI.verifyEqual(findTestObject('Object Repository/SUNTEC/Purchase History List - Buyer/linktext_InvoiceID'), finvoice)

WebUI.verifyElementText(findTestObject('SUNTEC/Purchase History List - Buyer/textlabel_Quantity'), '1')

WebUI.verifyElementText(findTestObject('SUNTEC/Purchase History List - Buyer/textlabel_OrderTotal'), ftotal)

WebUI.verifyElementText(findTestObject('SUNTEC/Purchase History List - Buyer/textlabel_PaymentType'), 'Rapyd')

WebUI.verifyElementText(findTestObject('SUNTEC/Purchase History List - Buyer/textlabel_PaymentStatus'), 'Fully paid')

WebUI.click(findTestObject('SUNTEC/Purchase History List - Buyer/buttn_Details'))

WebUI.comment('Verify Buyer Purchase Details')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textabel_Delivery2'), 0)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textlabel_InvoiceID'), finvoice)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textlabel_PaymentMethod'), 'Rapyd')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textlabel_buyerName'), 'Daniel Pendragon')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textlabel_buyerAddress'), 'Residencias de Manila')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textlabel_buyerCountry'), 'PH')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textlabel_buyerState'), 'Pandacan')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textlabel_buyerCity'), 'Metro Manila')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textlabel_buyerPostalCode'), '1011')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textabel_TransctionTotal'), ftotal)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textlabel_SubTotal'), fsubtotal)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textabel_Delivery'), fdelivery)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textabel_Delivery2'), fdelivery)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textabel_MLT'), fmlt)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textlabel_OrderStatus'), 'Acknowledged')

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

WebUI.comment('Verify Merchant Details')

WebUI.callTestCase(findTestCase('SUNTEC/ADMIN/impersonate_Seller'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SOC/Order List/menu_Orders'), 0)

WebUI.click(findTestObject('SOC/Order List/menu_Orders'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('SUNTEC/Orders List/textlabel_Quantity'), '1')

orderid = WebUI.getText(findTestObject('SUNTEC/Orders List/textlabel_OrderID'))

WebUI.verifyElementText(findTestObject('SUNTEC/Orders List/textlabel_OrderTotal'), fsubtotal)

WebUI.verifyElementText(findTestObject('SUNTEC/Orders List/textlabel_PaymentType'), 'Rapyd')

WebUI.verifyElementText(findTestObject('SUNTEC/Orders List/textlabel_PaymentStatus'), 'Paid')

WebUI.verifyOptionSelectedByLabel(findTestObject('SUNTEC/Orders List/dropdown_OrderStatus'), 'Acknowledged', false, 0)

WebUI.click(findTestObject('SUNTEC/Orders List/textlabel_OrderID'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/OrderStatus_dropdown'), 
    0)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/TransactionTotal_value'), 
    ftotal)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/SubTotal_value'), fsubtotal)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/Delivery_value'), fdelivery)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/MinLeadTime_value'), fmlt)

WebUI.verifyOptionSelectedByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/OrderStatus_dropdown'), 
    'Acknowledged', false, 0)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

WebUI.comment('Verify Admin Details')

WebUI.callTestCase(findTestCase('SUNTEC/ADMIN/login_Admin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/18_redirectionTransactionList'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/value_invoiceID'), finvoice)

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/value_OrderID'), orderid)

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/value_seller'), GlobalVariable.sm_username)

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/value_buyer'), 'Daniel Pendragon')

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/value_orderAmt'), ftotal)

WebUI.verifyOptionSelectedByLabel(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/value_OrderStatus'), 
    'Acknowledged', false, 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/value_PaymentStatus'), 
    'Paid', false, 0)

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/value_timestamp'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/textlabel_INVOICE ID'), 
    0)

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/value_InvoiceID'), 
    finvoice)

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/value_buyer Email'), 
    'arcqatester02@gmail.com')

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/value_buyerName'), 
    'Daniel Pendragon')

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/value_buyer contact No'), 
    '0912345678')

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/value_MLT'), fmlt)

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/value_seller contact No'), 
    '0912345678')

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/value_seller Email'), 
    'arcqatester01@gmail.com')

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/value_sellername'), 
    'Calcifer Pendragon')

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/value_Total Order Payout'), 
    ftotal)

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/value_Total Purchase Cost'), 
    ftotal)

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

