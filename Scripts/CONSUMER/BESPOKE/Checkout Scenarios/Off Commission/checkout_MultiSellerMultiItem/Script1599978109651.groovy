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
import java.text.NumberFormat as NumberFormat

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), 0)

WebUI.comment('Search on Homepage')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), itemName1)

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.comment('Search Result Page')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/button_Filters'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/item_Result'))

WebUI.waitForElementVisible(findTestObject('SUNTEC/Item Details Page/button_AddToCart'), 0)

WebUI.comment('Item Details Page')

if (variant1 == 'no') {
    WebUI.delay(2)
} else if (variant1 == 'yes') {
    WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Item Details/dd_VarOpt1'), 
        var1, false)

    WebUI.delay(1)

    WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Item Details/dd_VarOpt2'), 
        var2, false)

    WebUI.delay(1)

    WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Item Details/dd_VarOpt3'), 
        var3, false)
}

DecimalFormat df = new DecimalFormat('#,###.00')

WebUI.selectOptionByValue(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details/dd_qty'), qty, true)

def itemprice1 = WebUI.getText(findTestObject('SUNTEC/Item Details Page/textlabel_ItemPrice'))

def quantity1 = WebUI.getAttribute(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details/dd_qty'), 'value')

BigDecimal intitemprice1 = new BigDecimal(itemprice1)

BigDecimal intquantity1 = new BigDecimal(quantity1)

def subtotal1 = intitemprice1 * intquantity1

println(df.format(new BigDecimal(subtotal1)))

WebUI.click(findTestObject('SUNTEC/Item Details Page/button_AddToCart'))

WebUI.delay(2)

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), itemName2)

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.comment('Search Result Page')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/button_Filters'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/item_Result'))

WebUI.waitForElementVisible(findTestObject('SUNTEC/Item Details Page/button_AddToCart'), 0)

WebUI.comment('Item Details Page')

if (variant2 == 'no') {
    WebUI.delay(2)
} else if (variant2 == 'yes') {
    WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Item Details/dd_VarOpt1'), 
        var1, false)

    WebUI.delay(1)

    WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Item Details/dd_VarOpt2'), 
        var2, false)

    WebUI.delay(1)

    WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Item Details/dd_VarOpt3'), 
        var3, false)
}

WebUI.selectOptionByValue(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details/dd_qty'), qty, true)

def itemprice2 = WebUI.getText(findTestObject('SUNTEC/Item Details Page/textlabel_ItemPrice'))

def quantity2 = WebUI.getAttribute(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details/dd_qty'), 'value')

BigDecimal intitemprice2 = new BigDecimal(itemprice2)

BigDecimal intquantity2 = new BigDecimal(quantity2)

def subtotal2 = intitemprice2 * intquantity2

println(df.format(new BigDecimal(subtotal2)))

WebUI.click(findTestObject('SUNTEC/Item Details Page/button_AddToCart'))

WebUI.delay(2)

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.comment('Search on Homepage')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), itemName3)

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.comment('Search Result Page')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/button_Filters'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/item_Result'))

WebUI.waitForElementVisible(findTestObject('SUNTEC/Item Details Page/button_AddToCart'), 0)

WebUI.comment('Item Details Page')

if (variant3 == 'no') {
    WebUI.delay(2)
} else if (variant3 == 'yes') {
    WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Item Details/dd_VarOpt1'), 
        var1, false)

    WebUI.delay(1)

    WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Item Details/dd_VarOpt2'), 
        var2, false)

    WebUI.delay(1)

    WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Item Details/dd_VarOpt3'), 
        var3, false)
}

WebUI.selectOptionByValue(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details/dd_qty'), qty, true)

def itemprice3 = WebUI.getText(findTestObject('SUNTEC/Item Details Page/textlabel_ItemPrice'))

def quantity3 = WebUI.getAttribute(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details/dd_qty'), 'value')

BigDecimal intitemprice3 = new BigDecimal(itemprice3)

BigDecimal intquantity3 = new BigDecimal(quantity3)

def subtotal3 = intitemprice3 * intquantity3

println(df.format(new BigDecimal(subtotal3)))

WebUI.click(findTestObject('SUNTEC/Item Details Page/button_AddToCart'))

WebUI.delay(2)

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), itemName4)

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.comment('Search Result Page')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/button_Filters'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/item_Result'))

WebUI.waitForElementVisible(findTestObject('SUNTEC/Item Details Page/button_AddToCart'), 0)

WebUI.comment('Item Details Page')

if (variant4 == 'no') {
    WebUI.delay(2)
} else if (variant4 == 'yes') {
    WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Item Details/dd_VarOpt1'), 
        var1, false)

    WebUI.delay(1)

    WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Item Details/dd_VarOpt2'), 
        var2, false)

    WebUI.delay(1)

    WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Item Details/dd_VarOpt3'), 
        var3, false)
}

WebUI.selectOptionByValue(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details/dd_qty'), qty, true)

def itemprice4 = WebUI.getText(findTestObject('SUNTEC/Item Details Page/textlabel_ItemPrice'))

def quantity4 = WebUI.getAttribute(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details/dd_qty'), 'value')

BigDecimal intitemprice4 = new BigDecimal(itemprice4)

BigDecimal intquantity4 = new BigDecimal(quantity2)

def subtotal4 = intitemprice4 * intquantity4

println(df.format(new BigDecimal(subtotal4)))

WebUI.click(findTestObject('SUNTEC/Item Details Page/button_AddToCart'))

WebUI.delay(2)

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

WebUI.selectOptionByIndex(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/dropdown_SelectDeliveryMethod'), delivery1, 
    FailureHandling.CONTINUE_ON_FAILURE)

def del1 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/textlabel_DeliveryCost'))

WebUI.selectOptionByIndex(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/dropdown_SelectDeliveryMethod'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Checkout Review Page/dropdown_delivery1'), 
    delivery2, FailureHandling.CONTINUE_ON_FAILURE)

def del2 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/textlabel_DeliveryCost'))

WebUI.selectOptionByIndex(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/dropdown_SelectDeliveryMethod'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

BigDecimal intdel1 = new BigDecimal(del1)

BigDecimal intdel2 = new BigDecimal(del2)

def deliverycost = intdel1 + intdel2

println(df.format(new BigDecimal(deliverycost)))

WebUI.selectOptionByIndex(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/dropdown_SelectDeliveryMethod'), delivery1, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Checkout Review Page/dropdown_delivery1'), 
    delivery2, FailureHandling.CONTINUE_ON_FAILURE)

def actualdelcost = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/textlabel_DeliveryCost'))

println(df.format(new BigDecimal(actualdelcost)))

WebUI.verifyEqual(deliverycost, actualdelcost)

WebUI.comment('Get Consumer Details')

itemname = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/textlabel_ItemName'))

WebUI.comment('Computation of Total Cost')

//Computation over all total
BigDecimal intsubtotal1 = new BigDecimal(subtotal1)

BigDecimal intsubtotal2 = new BigDecimal(subtotal2)

BigDecimal intsubtotal3 = new BigDecimal(subtotal3)

BigDecimal intsubtotal4 = new BigDecimal(subtotal4)

def csubtotal1 = intsubtotal1 + intsubtotal2

println(df.format(new BigDecimal(csubtotal1)))

def csubtotal2 = intsubtotal3 + intsubtotal4

println(df.format(new BigDecimal(csubtotal2)))

BigDecimal intcsubtotal1 = new BigDecimal(csubtotal1)

BigDecimal intcsubtotal2 = new BigDecimal(csubtotal2)

def subtotal = intcsubtotal1 + intcsubtotal2

println(df.format(new BigDecimal(subtotal)))

def actualsubtotal = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/textlabel_SubTotal'))

// Seller 01 Total Cost
def totalcost1 = intcsubtotal1 + intdel1

println(df.format(new BigDecimal(totalcost1)))

// Seller 02 Total Cost
def totalcost2 = intcsubtotal2 + intdel2

println(df.format(new BigDecimal(totalcost2)))

WebUI.verifyEqual(subtotal, actualsubtotal)

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

WebUI.comment('Payment Page')

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
} else if (payment == 'custom') {
    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Custom Payment', 
        true)

    WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Custom Payment/button_Accept'), 
        0)

    WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Custom Payment/textfield_Note'), 'test')

    WebUI.delay(1)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Custom Payment/button_Accept'))
} else if (payment == 'cod') {
    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Cash on delivery', 
        true)

    WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

    WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Thank you Page/textlabel_inoviceID'), 0)

invoiceid = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Thank you Page/textlabel_inoviceID'))

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/menu_Orders'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/menu_Orders'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/textbox_search-item'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/textbox_search-item'), invoiceid)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/textbox_search-item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order List/textlabelvalue_InvoiceID'), 
    0)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order List/textlabelvalue_InvoiceID'), 
    invoiceid)

orderid = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order List/textlabelvalue_OrderID'))

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order List/textlabelvalue_OrderID'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_AdminFee'), 
    0)

WebUI.comment('Computation Admin Fee')

actualsellersub1 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_SubTotal'))

actualsellerdel1 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_DeliveryCost'))

WebUI.verifyEqual(csubtotal1, actualsellersub1)

WebUI.verifyEqual(del1, actualsellerdel1)

WebUI.delay(5)

//Convert Subtotal to String
String newSub1 = csubtotal1

def newSubld1 = newSub1.replace(',', '')

BigDecimal fnewSub1 = new BigDecimal(newSubld1)

println(fnewSub1)

//Convert string commission to float
String fcom1 = com

Float comfloat1 = Float.parseFloat(fcom1)

println(comfloat1)

//Computation AdminFee
def adminfee1 = fnewSub1 * comfloat1

BigDecimal fadminfee1 = new BigDecimal(adminfee1)

println(fadminfee1)

String ladminfee1 = fadminfee1.setScale(2, BigDecimal.ROUND_HALF_UP)

println(ladminfee1)

//Get Actual Admin Fee
String actadminfee1 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_AdminFee'))

def factadminfee1 = actadminfee1.replace(',', '')

String lactadminfee1 = new BigDecimal(factadminfee1)

println(lactadminfee1)

//Verify expected to actual
WebUI.verifyMatch(ladminfee1, lactadminfee1, false)

WebUI.comment('Computation Transaction Total')

def transactotal1 = totalcost1 - adminfee1

BigDecimal ftransactotal1 = new BigDecimal(transactotal1)

println(ftransactotal1)

String ltransactotal1 = ftransactotal1.setScale(2, BigDecimal.ROUND_HALF_UP)

println(ltransactotal1)

String actransactotal1 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_TransactionTotal'))

def factransactotal1 = actransactotal1.replace(',', '')

String lactransactotal1 = new BigDecimal(factransactotal1)

println(lactransactotal1)

WebUI.verifyMatch(ltransactotal1, lactransactotal1, false)

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.comment('Verify seller 2')

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant 2 Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/menu_Orders'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/menu_Orders'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/textbox_search-item'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/textbox_search-item'), invoiceid)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/textbox_search-item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order List/textlabelvalue_InvoiceID'), 
    0)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order List/textlabelvalue_InvoiceID'), 
    invoiceid)

orderid = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order List/textlabelvalue_OrderID'))

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order List/textlabelvalue_OrderID'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_AdminFee'), 
    0)

WebUI.comment('Computation Admin Fee')

actualsellersub2 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_SubTotal'))

actualsellerdel2 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_DeliveryCost'))

WebUI.verifyEqual(csubtotal2, actualsellersub2)

WebUI.verifyEqual(del2, actualsellerdel2)

WebUI.delay(5)

//Convert Subtotal to String
String newSub2 = csubtotal2

def newSubld2 = newSub2.replace(',', '')

BigDecimal fnewSub2 = new BigDecimal(newSubld2)

println(fnewSub2)

//Convert string commission to float
String fcom2 = com

Float comfloat2 = Float.parseFloat(fcom2)

println(comfloat2)

//Computation AdminFee
def adminfee2 = fnewSub2 * comfloat2

BigDecimal fadminfee2 = new BigDecimal(adminfee2)

println(fadminfee2)

String ladminfee2 = fadminfee2.setScale(2, BigDecimal.ROUND_HALF_UP)

println(ladminfee2)

//Get Actual Admin Fee
String actadminfee2 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_AdminFee'))

def factadminfee2 = actadminfee2.replace(',', '')

String lactadminfee2 = new BigDecimal(factadminfee2)

println(lactadminfee2)

//Verify expected to actual
WebUI.verifyMatch(ladminfee2, lactadminfee2, false)

WebUI.comment('Computation Transaction Total')

def transactotal2 = totalcost2 - adminfee2

BigDecimal ftransactotal2 = new BigDecimal(transactotal2)

println(ftransactotal2)

String ltransactotal2 = ftransactotal2.setScale(2, BigDecimal.ROUND_HALF_UP)

println(ltransactotal2)

String actransactotal2 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order Details/value_TransactionTotal'))

def factransactotal2 = actransactotal2.replace(',', '')

String lactransactotal2 = new BigDecimal(factransactotal2)

println(lactransactotal2)

WebUI.verifyMatch(ltransactotal2, lactransactotal2, false)

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/18_redirectionTransactionList'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History List/search_textfield'), 
    invoiceid)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History List/button_Apply'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History List/Seller 02/textlabelvalue_InvoiceID'), 
    invoiceid)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History List/Seller 01/textlabelvalue_InvoiceID'), 
    invoiceid)

apadminfee1 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History List/Seller 02/textlabelvalue_AdminFee'))

apadminfee2 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History List/Seller 01/textlabelvalue_AdminFee'))

WebUI.verifyMatch(ladminfee1, apadminfee1, false)

WebUI.verifyMatch(ladminfee2, apadminfee2, false)

BigDecimal intlactransactotal1 = new BigDecimal(lactransactotal1)

BigDecimal intlactransactotal2 = new BigDecimal(lactransactotal2)

def ftotalcost = intlactransactotal1 + intlactransactotal2

println(df.format(new BigDecimal(ftotalcost)))

//Convert ftotalcost 2 to string

String faptotalcost = ftotalcost

def newftotalcost = faptotalcost.replace(',', '')

BigDecimal fnewtotalcost = new BigDecimal(newftotalcost)

println(newftotalcost)

aptotalcost1 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History List/Seller 01/textlabelvalue_OrderAmout'))

aptotalcost2 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History List/Seller 02/textlabelvalue_OrderAmout'))

//Convert totalcost 1 to string

String ftotalcost1 = totalcost1

def newftotalcost1 = ftotalcost1.replace(',', '')

BigDecimal fnewtotalcost1 = new BigDecimal(newftotalcost1)

println(newftotalcost1)

//Convert totalcost 2 to string

String ftotalcost2 = totalcost2

def newftotalcost2 = ftotalcost2.replace(',', '')

BigDecimal fnewtotalcost2 = new BigDecimal(newftotalcost2)

println(newftotalcost2)

WebUI.verifyMatch(newftotalcost2, aptotalcost1, false)

WebUI.verifyMatch(newftotalcost1, aptotalcost2, false)

BigDecimal intladminfee1 = new BigDecimal(ladminfee1)
BigDecimal intladminfee2 = new BigDecimal(ladminfee2)

def fadminfee =  intladminfee1 + intladminfee2

println(df.format(new BigDecimal(fadminfee)))

//Convert adminfee to string

String fapadminfee = fadminfee

def newfadminfee = fapadminfee.replace(',', '')

BigDecimal fnewfadminfee = new BigDecimal(newfadminfee)

println(newfadminfee)


WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History List/Seller 01/textlabelvalue_Timestamp'))

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History Details/textlabelvalue_TotalOrderPayout01'), 
    newftotalcost)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History Details/textlabelvalue_TotalOrderPayOut02'), 
    ltransactotal1)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History Details/textlabelvalue_OrderAdminFee01'), 
    newfadminfee)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History Details/textlabelvalue_OrderAdminFee02'), 
    ladminfee1)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History Details/textlabelvalue_DeliveryCost'), 
    del1)

String fsubtotal1 = csubtotal1
def fsubtotal = fsubtotal1.replace(',', '')
String lsubtotal = new BigDecimal(fsubtotal)

println(lsubtotal)

apsubtotal = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History Details/textlabevalue_SubTotal'))

WebUI.verifyMatch(lsubtotal, apsubtotal, false)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Transaction History Details/textlabelvalue_InvoiceID'), 
    invoiceid)

WebUI.delay(2)

WebUI.closeBrowser()

