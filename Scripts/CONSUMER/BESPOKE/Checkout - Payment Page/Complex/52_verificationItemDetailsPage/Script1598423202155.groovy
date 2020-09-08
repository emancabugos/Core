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

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 1/MERCHANT/Dashboard/linktext_Your Items'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/textbox_search-item'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/textbox_search-item'), 'Item 01')

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/textbox_search-item'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/Item Info/icon_edit'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_qty'), 0)

def stock = WebUI.getAttribute(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_qty'), 'value')

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CONSUMER/BESPOKE/Checkout - Payment Page/Pre Requisite/checkout_item'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.HomepageURL, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), 'Item 01')

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/CONSUMER/Homepage/textfield_Search'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(0)

WebUI.comment('Search Result Page')

BigDecimal intstock = new BigDecimal(stock)

def finalstock = stock - 2

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/button_Filters'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Search Results Page/item_Result'))

WebUI.waitForElementVisible(findTestObject('SUNTEC/Item Details Page/button_AddToCart'), 0)

WebUI.verifyOptionPresentByValue(findTestObject('BESPOKE DEL 2/CONSUMER/Item Details/dd_qty'), finalstock, false, 0)

