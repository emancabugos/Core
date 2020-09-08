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

WebUI.waitForElementVisible(findTestObject('ADMIN/Transaction List and Details/ARC-9044/dropdown_PaymentStatus'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Transaction List and Details/ARC-9044/dropdown_PaymentStatus'), 0)

WebUI.verifyOptionPresentByLabel(findTestObject('ADMIN/Transaction List and Details/ARC-9044/dropdown_PaymentStatus'), 'Acknowledged', 
    false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('ADMIN/Transaction List and Details/ARC-9044/dropdown_PaymentStatus'), 'Pending', 
    false, 0)

WebUI.verifyOptionPresentByLabel(findTestObject('ADMIN/Transaction List and Details/ARC-9044/dropdown_PaymentStatus'), 'Paid', 
    false, 0)

