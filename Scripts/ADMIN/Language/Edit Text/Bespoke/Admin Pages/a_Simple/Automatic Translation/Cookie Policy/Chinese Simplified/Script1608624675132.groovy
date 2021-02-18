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

WebUI.comment('Cookie Policy')

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Admin Pages/Cookie Policy Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Arabic', false)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Page_1009bespoke2/input_This website uses cookies to'), 
    'value', '本网站使用cookie来确保您在我们的网站上获得最佳体验。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Page_1009bespoke2/input_Learn More_later_btn'), 
    'value', '学到更多', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Page_1009bespoke2/input_Accept Cookies_add_translations_btn'), 
    'value', '接受饼干', 0)

