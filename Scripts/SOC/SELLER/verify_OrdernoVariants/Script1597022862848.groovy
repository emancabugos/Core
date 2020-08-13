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

WebUI.callTestCase(findTestCase('SOC/SELLER/login_Seller'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SOC/Order List/menu_Orders'), 0)

WebUI.click(findTestObject('SOC/Order List/menu_Orders'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/noOfItems_value'), '1')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/orderTotal_value'), fsubtotal)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/PaymentType_value'), 'Custom Payment')

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/PaymentStatus_value'), 'Paid')

WebUI.verifyOptionSelectedByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/OrderStatus_dropdown'), 
    'Acknowledged', false, 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Orders/orderNo_value'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/OrderStatus_dropdown'), 
    0)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/TransactionTotal_value'), 
    ftotal)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/SubTotal_value'), fsubtotal)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/Delivery_value'), fdelivery)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/MinLeadTime_value'), fmlt)

WebUI.verifyOptionSelectedByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/OrderStatus_dropdown'), 
    'Acknowledged', false, 0)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/MERCHANT/Orders and Details/Order Details/ItemName_value'), itemname)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

