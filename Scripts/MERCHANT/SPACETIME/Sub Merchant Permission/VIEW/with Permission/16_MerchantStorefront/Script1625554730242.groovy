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

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Validation on Homepage')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/button_Search'), 0)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Function/textfield_Keyword'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Search Function/textfield_Keyword'), 'per Hour 24/7 D')

WebUI.click(findTestObject('SPACETIME/CONSUMER/Search Function/button_Search'))

WebUI.comment('Verify in Search Result Page')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Result Page/image_Item'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Search Result Page/image_Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Verify in Item Details Page')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_MerchantStorefront'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_MerchantStorefront'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Storefornt/tab_ITEMS FOR SALE'), 0)

WebUI.verifyElementVisible(findTestObject('SPACETIME/CONSUMER/Storefornt/tab_ITEMS FOR SALE'), FailureHandling.CONTINUE_ON_FAILURE)

