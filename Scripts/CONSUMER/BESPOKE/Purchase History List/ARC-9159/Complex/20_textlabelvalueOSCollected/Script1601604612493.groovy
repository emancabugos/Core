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

WebUI.callTestCase(findTestCase('CONSUMER/BESPOKE/Purchase History List/Pre Requisite/checkout_PickupCOD'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SOC/Order List/menu_Orders'), 0)

WebUI.click(findTestObject('SOC/Order List/menu_Orders'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order List/dropdown_OrderStatus'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order List/dropdown_OrderStatus'), 
    'Collected', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SOC/Merchant Order Details/button_Okay'), 0)

WebUI.click(findTestObject('SOC/Merchant Order Details/button_Okay'))

WebUI.verifyOptionSelectedByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/MAJOR WORKFLOW - DO NOT DELETE/Order List/dropdown_OrderStatus'), 
    'Collected', false, 0)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Bespoke Usermenu/icon_usermenu'), 0)

WebUI.click(findTestObject('Utilities/Bespoke Usermenu/icon_usermenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Bespoke Usermenu/linktext_Purchases'), 0)

WebUI.click(findTestObject('Utilities/Bespoke Usermenu/linktext_Purchases'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/textlabelvalue_OrderStatus1'), 'Collected')

