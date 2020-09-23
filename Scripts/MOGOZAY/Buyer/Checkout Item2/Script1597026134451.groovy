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

File subtotalTmp = tmpDir.resolve('subtotal.txt').toFile()

File totalTmp = tmpDir.resolve('total.txt').toFile()

File invoiceTmp = tmpDir.resolve('invoice.txt').toFile()

File deliveryTmp = tmpDir.resolve('delivery.txt').toFile()

WebUI.callTestCase(findTestCase('MOGOZAY/Buyer/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Search Item')

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Buyer/ItemSearch/textbox_search'), 0)

WebUI.setText(findTestObject('MOGOZAY/Buyer/ItemSearch/textbox_search'), 'Item_02')

itemName = WebUI.getAttribute(findTestObject('MOGOZAY/Buyer/ItemSearch/textbox_search'), 'value')

itemNameTmp.text = itemName

WebUI.click(findTestObject('MOGOZAY/Buyer/ItemSearch/btn_search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Search Result')

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Buyer/ItemSearch/text_itemNameResult'), 0)

WebUI.verifyElementText(findTestObject('MOGOZAY/Buyer/ItemSearch/text_itemNameResult'), itemName)

WebUI.click(findTestObject('MOGOZAY/Buyer/ItemSearch/text_itemNameResult'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Item Details')

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Buyer/ItemSearch/text_itemNameItemD'), 0)

WebUI.verifyElementText(findTestObject('MOGOZAY/Buyer/ItemSearch/text_itemNameItemD'), itemName)

WebUI.setText(findTestObject('MOGOZAY/Buyer/ItemSearch/textbox_qty'), '2')

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Buyer/ItemSearch/textvalue_itemPrice'), 0)

String extractItemPrice = WebUI.getText(findTestObject('MOGOZAY/Buyer/ItemSearch/textvalue_itemPrice')).replaceAll('[^0-9.]', 
    '')

println(extractItemPrice)

priceTmp.text = extractItemPrice

WebUI.selectOptionByLabel(findTestObject('MOGOZAY/Buyer/ItemSearch/dd_deliveryMethod'), 'Delivery 01', false)

WebUI.click(findTestObject('MOGOZAY/Buyer/ItemSearch/button_Add to cart'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Cart Summary')

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Buyer/Cart Summary/btn_proceed'), 0)

WebUI.click(findTestObject('MOGOZAY/Buyer/Cart Summary/btn_proceed'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Checkout')

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Buyer/Checkout/button_ProceedCOD'), 0)

WebUI.click(findTestObject('MOGOZAY/Buyer/Checkout/button_ProceedCOD'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Checkout Complete')

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Buyer/Complete Checkout/button_Place order'), 0)

WebUI.click(findTestObject('MOGOZAY/Buyer/Complete Checkout/button_Place order'), FailureHandling.CONTINUE_ON_FAILURE)

