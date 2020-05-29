import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Advance Search/a_Features Control'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Advance Search/a_Features Control'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Advance Search/textlabel_Advanced Search'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Advance Search/button_Edit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Advance Search/textlabel_Advanced Search beta'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Advance Search/button_Search by location'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('ADMIN/Features Control/Advance Search/img_search bar look'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Advance Search/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Advance Search/Success Toaster Message/Save successfully'), 
    0)

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Features Control/Advance Search/Success Toaster Message/Save successfully'), 
    0)

WebUI.click(findTestObject('ADMIN/Features Control/Advance Search/button_Save bottom'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Advance Search/Success Toaster Message/Save successfully'), 
    0)

WebUI.waitForElementNotPresent(findTestObject('ADMIN/Features Control/Advance Search/Success Toaster Message/Save successfully'), 
    0)

WebUI.click(findTestObject('Utilities/Admin Logout/button_Logout'), FailureHandling.CONTINUE_ON_FAILURE)

