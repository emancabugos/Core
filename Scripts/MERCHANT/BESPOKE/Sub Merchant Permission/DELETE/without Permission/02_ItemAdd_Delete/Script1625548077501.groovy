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

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textlabel_Category(s)'), 0)

WebUI.comment('Listing Name')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_listing-name'), 'Item 01_Permission')

WebUI.comment('Categories')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Category/Category Commission/category0'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Category/Category Commission/category0'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Price')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_price'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_price'), '100')

WebUI.comment('SKU')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_SKU'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_SKU'), 'SKU001')

WebUI.comment('Item Cover Image')

WebUI.delay(2)

WebUI.delay(3)

WebUI.comment('Variants')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Variants/toggle_variant'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Variants/toggle_variant'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Variant Options')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Variants/textbox_option1'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Variants/textbox_option1'), 'Color')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Variants/textbox_choices1'), 'Blue,')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Variants/textbox_option2'), 'Size')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Variants/textbox_choices2'), 'Small,Medium,')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Variants/textbox_option3'), 'Material')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Variants/textbox_choices3'), 'Glass,Plastic,')

WebUI.mouseOver(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Variants/icon_delete var'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('You need permission to perform this action', false)

