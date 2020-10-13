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

WebUI.comment('Subscription Page')

WebUI.click(findTestObject('ADMIN/Getting Started/Step 2/Arcadier_Marketplaces_Logo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Getting Started/Quicklinks/span_Quick Links'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/img_subscription'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Quicklinks/p_View Subscription'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Quicklinks/img_subscription'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Subscription/i_icon icon-doller'), 0)

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/h1_Subscription'), 'Subscription')

