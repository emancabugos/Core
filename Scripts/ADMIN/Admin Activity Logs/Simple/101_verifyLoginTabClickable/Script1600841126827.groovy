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

WebUI.verifyElementClickable(findTestObject('ADMIN/Admin Activity Logs/tab_Login'))

WebUI.click(findTestObject('ADMIN/Admin Activity Logs/tab_Login'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Activity Logs/column_StartDateTime'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Activity Logs/column_EndDateTime'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Activity Logs/column_City'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Activity Logs/column_Country'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Activity Logs/column_Browser'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Activity Logs/column_UserID'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Activity Logs/column_Username'), 0)

