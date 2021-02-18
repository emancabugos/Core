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

WebUI.verifyElementPresent(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/Holding Funds/input_Please note that your payment will be automatically released 00 days from your date of checkout_Delivery'), 
    0)

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/Holding Funds/input_Please note that your payment will be automatically released 00 days from your date of checkout_Delivery'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/Button_Save'))

css_color = WebUI.getCSSValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Purchase History/Holding Funds/input_Please note that your payment will be automatically released 00 days from your date of checkout_Delivery'))

println(css_color)

WebUI.verifyEqual(css_color, rgb(225, 0, 0))

