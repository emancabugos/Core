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

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('ADMIN/Commission/Page_0902space/input_Default commission_searchTextValue'), 
    0)

WebUI.waitForElementPresent(findTestObject('ADMIN/Commission/Page_0902space/input_Default commission_searchTextValue'), 
    0)

WebUI.setText(findTestObject('ADMIN/Commission/Page_0902space/input_Default commission_searchTextValue'), 'nocattalaga')

searchcat = WebUI.getText(findTestObject('ADMIN/Commission/Page_0902space/textvalue_category'))

WebUI.click(findTestObject('ADMIN/Commission/Page_0902space/icon_magnifying glass'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(searchcat, '', false)

