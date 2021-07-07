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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), 0)

WebUI.comment('Search on Homepage')

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), 'Item_02 01seller')

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.comment('Search Result Page')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/button_Filters'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/item_Result'))

WebUI.waitForElementVisible(findTestObject('SUNTEC/Item Details Page/button_AddToCart'), 0)

WebUI.comment('Item Details Page')

WebUI.delay(2)

DecimalFormat df = new DecimalFormat('#,###.00')

WebUI.selectOptionByValue(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details/dd_qty'), '1', true)

def itemprice = WebUI.getText(findTestObject('SUNTEC/Item Details Page/textlabel_ItemPrice'))

def quantity = WebUI.getAttribute(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details/dd_qty'), 'value')

BigDecimal intitemprice = new BigDecimal(itemprice)

BigDecimal intquantity = new BigDecimal(quantity)

def subtotal = intitemprice * intquantity

println(df.format(new BigDecimal(subtotal)))

WebUI.click(findTestObject('SUNTEC/Item Details Page/button_AddToCart'))

WebUI.delay(2)

WebUI.navigateToUrl(GlobalVariable.cartURL)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Item Cart/button_Checkout'), 0)

WebUI.comment('Cart Page')

WebUI.mouseOver(findTestObject('BESPOKE DEL 2/CONSUMER/Item Cart/button_Delete'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextNotPresent('You need permission to perform this action', false)

