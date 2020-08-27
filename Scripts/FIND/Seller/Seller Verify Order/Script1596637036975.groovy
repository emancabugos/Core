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

// create directory to locate a temporary file
Path projectDir = Paths.get(RunConfiguration.getProjectDir())

Path tmpDir = projectDir.resolve('tmp')

if (!(Files.exists(tmpDir))) {
    Files.createDirectory(tmpDir)
}

// Prepare File object
File itemNameTmp = tmpDir.resolve('itemName.txt').toFile()

File priceTmp = tmpDir.resolve('subtotal.txt').toFile()

File currencyTmp = tmpDir.resolve('currency.txt').toFile()

File subtotalTmp = tmpDir.resolve('subtotal.txt').toFile()

File totalTmp = tmpDir.resolve('total.txt').toFile()

File invoiceTmp = tmpDir.resolve('invoice.txt').toFile()

File deliveryTmp = tmpDir.resolve('delivery.txt').toFile()

File sellerTotalTmp = tmpDir.resolve('sellerTotal.txt').toFile()

WebUI.callTestCase(findTestCase('FIND/Seller/Seller Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Login/seller_menu'), 0)

WebUI.mouseOver(findTestObject('FIND/SELLER/Login/seller_menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Login/textlink_orders'), 0)

WebUI.click(findTestObject('FIND/SELLER/Login/textlink_orders'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Order Details/search_invoice'), 0)

String invoice = invoiceTmp.text.trim()

WebUI.setText(findTestObject('FIND/SELLER/Order Details/search_invoice'), invoice)

WebUI.click(findTestObject('FIND/SELLER/Order Details/icon_search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Order Details/textvalue_invoice'), 0)

WebUI.verifyElementText(findTestObject('FIND/SELLER/Order Details/textvalue_invoice'), invoice)

WebUI.verifyOptionSelectedByLabel(findTestObject('FIND/SELLER/Order Details/dd_orderStatusOrderList'), 'PO Created', false, 
    0)

WebUI.click(findTestObject('FIND/SELLER/Order Details/textvalue_invoice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('FIND/SELLER/Order Details/textlabel_paymentStatus'), 0)

String extractAdminFee = WebUI.getText(findTestObject('FIND/SELLER/Order Details/value_adminFee')).replaceAll('[^0-9.]', 
    '')

String currency = currencyTmp.text.trim()

String subtotal = subtotalTmp.text.trim()

WebUI.verifyElementText(findTestObject('FIND/SELLER/Order Details/value_subtotal'), ('Subtotal' + currency) + subtotal)

String delivery = deliveryTmp.text.trim()

WebUI.verifyElementText(findTestObject('FIND/SELLER/Order Details/value_delivery'), ('Delivery' + currency) + delivery)

def subtotalValue = subtotal.replace(',', '')

BigDecimal intsubtotal = new BigDecimal(subtotalValue)

BigDecimal intdelivery = new BigDecimal(delivery)

BigDecimal intadminFee = new BigDecimal(extractAdminFee)

String itemName = itemNameTmp.text.trim()



if (itemName == 'Item_01') {
    DecimalFormat df = new DecimalFormat('#,###.00')
	
	String comm1 = "0.00"
	
	BigDecimal intcomm1 = new BigDecimal(comm1)
	
    def partialTotal = intsubtotal + intdelivery
	
	BigDecimal intpartial = new BigDecimal(partialTotal)
	
	def commission = df.format(new BigDecimal(partialTotal.multiply(intcomm1)))
	
	BigDecimal intcomm = new BigDecimal(commission)

    def finaltotal = intpartial - intcomm
    WebUI.verifyElementText(findTestObject('FIND/SELLER/Order Details/value_total'), currency+ finaltotal)
	sellerTotalTmp.text = finaltotal
		
} else if (itemName == 'Item_02') {
	
	DecimalFormat df = new DecimalFormat('#,###.00')
	
	String comm1 = "0.01"
	
	BigDecimal intcomm1 = new BigDecimal(comm1)
	
    def partialTotal = intsubtotal + intdelivery
	
	BigDecimal intpartial = new BigDecimal(partialTotal)
	
	def commission = df.format(new BigDecimal(partialTotal.multiply(intcomm1)))
	
	BigDecimal intcomm = new BigDecimal(commission)

    def finaltotal = intpartial - intcomm
    WebUI.verifyElementText(findTestObject('FIND/SELLER/Order Details/value_total'), currency+ finaltotal)
	sellerTotalTmp.text = finaltotal
		
} else if (itemName == 'Item_03') {

	DecimalFormat df = new DecimalFormat('#,###.00')
	
	String comm1 = "0.99"
	
	BigDecimal intcomm1 = new BigDecimal(comm1)
	
    def partialTotal = intsubtotal + intdelivery
	
	BigDecimal intpartial = new BigDecimal(partialTotal)
	
	def commission = new BigDecimal(partialTotal.multiply(intcomm1))
	
	BigDecimal intcomm = new BigDecimal(commission)

    def finaltotal = intpartial - intcomm
	
	def DFfinaltotal = df.format (finaltotal)
	
    WebUI.verifyElementText(findTestObject('FIND/SELLER/Order Details/value_total'), currency+DFfinaltotal)
	sellerTotalTmp.text = finaltotal
	
} else if (itemName == 'Item_04') {
    DecimalFormat df = new DecimalFormat('#,###.00')
	
	String comm1 = "1.00"
	
	BigDecimal intcomm1 = new BigDecimal(comm1)
	
    def partialTotal = intsubtotal + intdelivery
	
	BigDecimal intpartial = new BigDecimal(partialTotal)
	
	def commission = new BigDecimal(partialTotal.multiply(intcomm1))
	
	BigDecimal intcomm = new BigDecimal(commission)

    def finaltotal = intpartial - intcomm
	
    WebUI.verifyElementText(findTestObject('FIND/SELLER/Order Details/value_total'), currency+ finaltotal)
	
	sellerTotalTmp.text = finaltotal
}

WebUI.callTestCase(findTestCase('FIND/Seller/Seller Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

