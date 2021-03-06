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

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Admin Navigation/span_Categories'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Admin Navigation/span_Custom Fields'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Admin Navigation/span_Marketplace Header  Footer'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Admin Navigation/span_About Us'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Admin Navigation/span_Terms of Service'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Admin Navigation/span_Privacy Policy'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Admin Navigation/span_Returns Policy'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Admin Navigation/span_FAQ'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Admin Navigation/span_Contact'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Admin Navigation/span_Private Login'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Admin Navigation/span_Login'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Admin Navigation/span_Cookie Policy'))

