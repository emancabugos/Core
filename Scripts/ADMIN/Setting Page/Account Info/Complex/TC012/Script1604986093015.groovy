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

WebUI.callTestCase(findTestCase('ADMIN/Setting Page/Redirection to Account Information Page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Setting Sidebar Menu/button_Edit'))

WebUI.waitForElementPresent(findTestObject('ADMIN/Setting Sidebar Menu/textlabel_Account Details'), 0)

'leave textfield blank'
WebUI.setText(findTestObject('ADMIN/Setting Sidebar Menu/textfield_Notification Email_email'), '')

WebUI.click(findTestObject('ADMIN/Setting Sidebar Menu/button_Save'))

css_color = WebUI.getCSSValue(findTestObject('ADMIN/Setting Sidebar Menu/textfield_Notification Email_email'),'color')

println(css_color)

WebUI.verifyEqual(css_color, rgb(225,0,0))

