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

WebUI.waitForElementVisible(findTestObject('ADMIN/ARC-9449/Page_0613bpdiana/a_Permissions'), 0)

WebUI.click(findTestObject('ADMIN/ARC-9449/Page_0613bpdiana/a_Permissions'))

WebUI.waitForElementVisible(findTestObject('ADMIN/ARC-9449/Page_0613bpdiana/span_Admin Permissions'), 0)

WebUI.click(findTestObject('ADMIN/ARC-9449/Page_0613bpdiana/span_Admin Permissions'))

WebUI.verifyTextNotPresent('Please note that this feature is in beta, if you face any difficulties kindly let us know!', 
    false)

WebUI.verifyTextNotPresent('The feature will be available for Growth and Scale users when fully released.', false)

