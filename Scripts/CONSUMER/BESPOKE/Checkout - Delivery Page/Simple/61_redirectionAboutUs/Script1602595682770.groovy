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

WebUI.scrollToElement(findTestObject('BESPOKE DEL 2/MERCHANT/Footers/linktext_ABOUTUS'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Footers/linktext_ABOUTUS'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Seller Menu/icon_Message'), 0)

WebUI.verifyTextPresent('ABOUT US', false)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Footers/linktext_ABOUTUS'), 0)

