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
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/User Menu/img_usermenu'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/User Menu/img_usermenu'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/User Menu/linktext_Settings'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/User Menu/linktext_Settings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/browse_img'), 0)

WebUI.verifyElementPresent(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/browse_img'), 0)

WebUI.mouseOver(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/browse_img'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextNotPresent('You need permission to access this page', false)

