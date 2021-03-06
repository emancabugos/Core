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

WebUI.waitForElementVisible(findTestObject('ADMIN/New Item List/sidemenu_Items'), 0)

WebUI.click(findTestObject('ADMIN/New Item List/sidemenu_Items'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/New Item List/textbox_search'), 0)

WebUI.setText(findTestObject('ADMIN/New Item List/textbox_search'), 'Instant to Nego')

WebUI.click(findTestObject('ADMIN/New Item List/button_apply'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/New Item List/icon_edit'), 0)

WebUI.click(findTestObject('ADMIN/New Item List/icon_edit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Edit Item Spacetime/button_Back'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Admin Edit Item Spacetime/checkbox_ Instant Buy'), 0)

WebUI.click(findTestObject('ADMIN/Admin Edit Item Spacetime/checkbox_ Instant Buy'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Admin Edit Item Spacetime/checkbox_ Negotiation'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Admin Edit Item Spacetime/buton_Save'), FailureHandling.CONTINUE_ON_FAILURE)

