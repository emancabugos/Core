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

WebUI.callTestCase(findTestCase('SOC/BUYER/login_Buyer'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), 0)

WebUI.comment('Search on Homepage')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), 'Item no Variants')

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.comment('Search Result Page')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/button_Filters'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/item_Result'))

WebUI.waitForElementVisible(findTestObject('SOC/Item Details/button_AddToCart'), 0)

WebUI.comment('Item Details Page')

DecimalFormat df = new DecimalFormat('#,###.00')

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/dropdown_Quantity'), '1', true)

def itemprice = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/textlabel_ItemPrice'))

def quantity = WebUI.getAttribute(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/dropdown_Quantity'), 'value')

BigDecimal intitemprice = new BigDecimal(itemprice)

BigDecimal intquantity = new BigDecimal(quantity)

def subtotal = intitemprice * intquantity

println(df.format(new BigDecimal(subtotal)))

WebUI.click(findTestObject('SOC/Item Details/button_AddToCart'))

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details Page/button_ViewCart'), 0)

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

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/button_ProceedPayment'))

WebUI.comment('Payment Page')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Cash on delivery', 
    true)

WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Thank You Page/button_PurchaseHistory'), 0)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Verify Merchant Details')

WebUI.callTestCase(findTestCase('SOC/SELLER/login_Seller'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SOC/Order List/menu_Orders'), 0)

WebUI.click(findTestObject('SOC/Order List/menu_Orders'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/OrderStatus_dropdown'), 'Acknowledged', 
    false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SOC/Merchant Order Details/button_Okay'), 0)

WebUI.click(findTestObject('SOC/Merchant Order Details/button_Okay'))

WebUI.verifyOptionSelectedByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/OrderStatus_dropdown'), 
    'Acknowledged', false, 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/orderNo_value'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/OrderStatus_dropdown'), 
    0)

WebUI.verifyOptionSelectedByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/OrderStatus_dropdown'), 
    'Acknowledged', false, 0)

WebUI.back()

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/OrderStatus_dropdown'), 0)

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('SOC/BUYER/login_Buyer'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Buyer Seller Logout/button_dropdown'), 0)

WebUI.click(findTestObject('Utilities/Buyer Seller Logout/button_dropdown'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Bespoke Usermenu/linktext_Purchases'), 0)

WebUI.click(findTestObject('Utilities/Bespoke Usermenu/linktext_Purchases'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/linktext_invoiceID'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/linktext_invoiceID'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textabel_Delivery2'), 0)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/textlabel_OrderStatus'), 'Acknowledged')

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

WebUI.comment('Verify Admin Details')

WebUI.callTestCase(findTestCase('SOC/ADMIN/login_Dashboard'), [('DashboardURL') : GlobalVariable.DashboardURL, ('dUsername') : GlobalVariable.dUsername
        , ('dPassword') : GlobalVariable.dPassword, ('HomepageURL') : GlobalVariable.SOCHomepageURL], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/18_redirectionTransactionList'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/value_timestamp'))

WebUI.delay(2)

WebUI.verifyOptionSelectedByLabel(findTestObject('SOC/Transaction/dropdown_OrderStatus'), 'Acknowledged', false, 0)

WebUI.back()

WebUI.waitForElementVisible(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/value_OrderStatus'), 
    0)

WebUI.verifyOptionSelectedByLabel(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/value_OrderStatus'), 
    'Acknowledged', false, 0)

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

