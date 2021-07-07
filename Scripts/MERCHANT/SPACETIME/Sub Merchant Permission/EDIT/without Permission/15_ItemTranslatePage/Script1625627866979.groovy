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

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Header/header_Your Services'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Header/header_Your Services'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 1/MERCHANT/Your Items/toggleBtn_Purchasable'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 1/MERCHANT/Your Items/btn_Translate'), 0)

WebUI.click(findTestObject('BESPOKE DEL 1/MERCHANT/Your Items/btn_Translate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('BESPOKE/MERCHANT/Item Translate/dropdown_Language'), 0)

WebUI.mouseOver(findTestObject('BESPOKE/MERCHANT/Item Translate/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('You need permission to perform this action', false)

