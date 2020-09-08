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

WebUI.scrollToElement(findTestObject('ADMIN/Transaction List and Details/ARC-9044/dropdown_OrderStatus'), 0)

WebUI.click(findTestObject('ADMIN/Transaction List and Details/ARC-9044/dropdown_OrderStatus'))

WebUI.delay(5)

String selectpaystatus = WebUI.selectOptionByLabel(findTestObject('ADMIN/Transaction List and Details/ARC-9044/dropdown_OrderStatus'), 
    'Delivered', false)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('ADMIN/Transaction List and Details/ARC-9044/button_Okay'), 0)

WebUI.click(findTestObject('ADMIN/Transaction List and Details/ARC-9044/button_Okay'))

WebUI.verifyOptionSelectedByLabel(findTestObject('ADMIN/Transaction List and Details/ARC-9044/dropdown_OrderStatus'), 'Delivered', 
    false, 0)

