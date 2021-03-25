import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.testobject.ConditionType as ConditionType

Path projectDir = Paths.get(RunConfiguration.getProjectDir())

Path tmpDir = projectDir.resolve('tmp')

if (!(Files.exists(tmpDir))) {
    Files.createDirectory(tmpDir)
}

// Prepare File object
File OrderTotal1Tmp = tmpDir.resolve('OrderTotal1.txt').toFile()

File OrderTotal2Tmp = tmpDir.resolve('OrderTotal2.txt').toFile()

File seller01Tmp = tmpDir.resolve('seller01.txt').toFile()

File seller02Tmp = tmpDir.resolve('seller02.txt').toFile()

File invoiceTmp = tmpDir.resolve('invoice.txt').toFile()

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Search Item1')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), 'Item no Variants - Seller 01')

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.comment('Search Result Page')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/button_Filters'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/item_Result'))

WebUI.waitForElementVisible(findTestObject('SUNTEC/Item Details Page/button_AddToCart'), 0)

WebUI.comment('Items no Variants - Seller 01')

WebUI.selectOptionByLabel(findTestObject('SUNTEC/Item Details Page/dropdown_Quantity'), '2', true)

WebUI.click(findTestObject('SUNTEC/Item Details Page/textlabel_ItemPrice'))

WebUI.waitForElementPresent(findTestObject('SUNTEC/Item Details Page/dropdown_Quantity'), 0)

DecimalFormat df = new DecimalFormat('#,###.00')

def itemprice1 = WebUI.getText(findTestObject('SUNTEC/Item Details Page/textlabel_ItemPrice'))

def quantity1 = WebUI.getAttribute(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details/dd_qty'), 'value')

BigDecimal intitemprice1 = new BigDecimal(itemprice1)

BigDecimal intquantity1 = new BigDecimal(quantity1)

def subtotal1 = intitemprice1 * intquantity1

println(df.format(new BigDecimal(subtotal1)))

WebUI.delay(2)

WebUI.click(findTestObject('SUNTEC/Item Details Page/button_AddToCart'))

WebUI.navigateToUrl(GlobalVariable.cartURL)

WebUI.comment('Cart Page')

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Item Cart/button_Checkout'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Item Cart/button_Checkout'))

WebUI.comment('Checkout - Delivery Page')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/textfield_FirstName'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/button_SelectAddress'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/button_Selected'), 0)

WebUI.scrollToElement(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/button_Next'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Checkout Delivery Page/button_Next'))

WebUI.comment('Checkout Review Page')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/dropdown_SelectDeliveryMethod'), 
    0)

WebUI.selectOptionByIndex(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/dropdown_SelectDeliveryMethod'), '1', 
    FailureHandling.CONTINUE_ON_FAILURE)

def del1 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/textlabel_DeliveryCost'))

seller1 = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/name_seller01'))

seller02Tmp.text = seller1

BigDecimal intsubtotal1 = new BigDecimal(subtotal1)

BigDecimal intdel1 = new BigDecimal(del1)

// Seller 01 Total Cost
def totalcost2 = intsubtotal1 + intdel1

println(df.format(new BigDecimal(totalcost2)))

OrderTotal2Tmp.text = totalcost2

WebUI.selectOptionByIndex(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/dropdown_SelectDeliveryMethod'), '1', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Review Details Page/button_ProceedPayment'))

WebUI.comment('Payment Page')

WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Stripe', true)

WebUI.scrollToElement(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_Email'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_Email'), 'test321@gmail.com')

WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Stripe_New/textfield_CardNumber'), '4242 4242 4242 4242')

WebUI.delay(2)

WebUI.closeBrowser()

