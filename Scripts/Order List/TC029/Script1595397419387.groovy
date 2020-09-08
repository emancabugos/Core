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

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/textbox_search-item'), 0)

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/textbox_search-item'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/textbox_search-item'), '0613BPD1595397692VKJ')

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/textbox_search-item'), Keys.chord(Keys.ENTER))

WebUI.getAttribute(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/OrderStatus_dropdown'), value)

