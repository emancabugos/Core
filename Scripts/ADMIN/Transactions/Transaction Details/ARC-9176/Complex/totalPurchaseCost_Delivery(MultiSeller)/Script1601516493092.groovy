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
import java.text.DecimalFormat as DecimalFormat

WebUI.comment('Multi Seller')

WebUI.waitForElementVisible(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/textlabel_TOTAL PURCHASE COST'), 
    0)

orderSubtotal = WebUI.getText(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/value_orderSubtotal'))

delivery = WebUI.getText(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/value_delivery'))

orderSubtotal2 = WebUI.getText(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/value_orderSubtotal2'))

delivery2 = WebUI.getText(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/value_delivery2'))

def intSubtotal = orderSubtotal.replace(',', '')

def intSubtotal2 = orderSubtotal2.replace(',', '')

println(intSubtotal)

println(intSubtotal2)

BigDecimal bdSubtotal = new BigDecimal(intSubtotal)

BigDecimal bdDelivery = new BigDecimal(delivery)

BigDecimal bdSubtotal2 = new BigDecimal(intSubtotal2)

BigDecimal bdDelivery2 = new BigDecimal(delivery2)

def tpc = bdDelivery + bdSubtotal

def tpc2 = bdDelivery2 + bdSubtotal2

println(tpc)

println(tpc2)

def tpcSum = tpc + tpc2

DecimalFormat df = new DecimalFormat('#,###.00')

def finalTPC = df.format(tpcSum)

println(finalTPC)

WebUI.verifyElementText(findTestObject('ADMIN/Transaction List and Details/Admin Transaction Details/value_Total Purchase Cost'), 
    finalTPC)

