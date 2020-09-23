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

WebUI.clearText(findTestObject('ADMIN/Admin Activity Logs/datepicker_From'))

WebUI.clearText(findTestObject('ADMIN/Admin Activity Logs/datepicker_To'))

WebUI.click(findTestObject('ADMIN/Admin Activity Logs/button_ExportLog'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Activity Logs/toaster_InvalidExport'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Admin Activity Logs/toaster_InvalidExport'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Admin Activity Logs/toaster_InvalidExport'), 0)

