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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/28_redirectionSetupPayment'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Setup Payments/a_Stripe Holding Funds/button_Holding Funds_Not Added'), 
    0)

WebUI.click(findTestObject('ADMIN/Setup Payments/a_Stripe Holding Funds/button_Holding Funds_Not Added'))

'input 15'
WebUI.callTestCase(findTestCase('ADMIN/Setup Payments/ARC-9834/SIMPLE/TC074'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Without Variants'
WebUI.callTestCase(findTestCase('CONSUMER/BESPOKE/Checkout Scenarios/Holding Funds/No Variants/checkout_MultiItemMultiSeller'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/28_redirectionSetupPayment'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Setup Payments/a_Stripe Holding Funds/button_Holding Funds_Not Added'), 
    0)

WebUI.click(findTestObject('ADMIN/Setup Payments/a_Stripe Holding Funds/button_Holding Funds_Not Added'))

'Edit 20'
WebUI.callTestCase(findTestCase('ADMIN/Setup Payments/ARC-9834/SIMPLE/TC074'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CONSUMER/BESPOKE/Purchase History List/Pre Requisite/navigate_PurchaseList'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CONSUMER/BESPOKE/Purchase History List/Simple/25_redirectionPaymentStatus'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History Details/Release Funds/button_Release Payment'), 
    0)

