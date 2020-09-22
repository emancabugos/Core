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

WebUI.waitForElementVisible(findTestObject('ADMIN/Waiting List/textbox_search'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Waiting List/text_Clear'), 0)

WebUI.setText(findTestObject('ADMIN/Waiting List/textbox_search'), 'Test')

WebUI.selectOptionByValue(findTestObject('ADMIN/Waiting List/dd_AllInterestedInvited'), 'Invited', false)

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Waiting List/text_Clear'))

WebUI.delay(2)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Waiting List/textbox_search'), 'value', '', 0)

WebUI.verifyOptionSelectedByValue(findTestObject('ADMIN/Waiting List/dd_AllInterestedInvited'), 'All', false, 0)

