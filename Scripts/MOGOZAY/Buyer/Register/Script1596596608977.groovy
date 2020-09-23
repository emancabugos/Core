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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.cmsURL)

WebUI.waitForElementVisible(findTestObject('MOGOZAY/RegisterLogin/textlink_Signup'), 0)

WebUI.click(findTestObject('MOGOZAY/RegisterLogin/textlink_Signup'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MOGOZAY/RegisterLogin/textbox_email'), 0)

WebUI.setText(findTestObject('MOGOZAY/RegisterLogin/textbox_email'), GlobalVariable.buyerCMS)

WebUI.setText(findTestObject('MOGOZAY/RegisterLogin/textbox_password'), 'welcome8')

WebUI.setText(findTestObject('MOGOZAY/RegisterLogin/textbox_repeatPassword'), 'welcome8')

WebUI.click(findTestObject('MOGOZAY/RegisterLogin/button_Sign up'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Buyer/Buyer Settings/Sidemenu/usermenu_Logout'), 0)

WebUI.click(findTestObject('MOGOZAY/Buyer/Buyer Settings/Sidemenu/usermenu_Logout'), FailureHandling.CONTINUE_ON_FAILURE)

