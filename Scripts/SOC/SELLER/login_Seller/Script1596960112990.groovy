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

WebUI.navigateToUrl(GlobalVariable.SOCHomepageURL)

WebUI.waitForElementVisible(findTestObject('SOC/Register Login Page/linktext_BeASupplier'), 0)

WebUI.click(findTestObject('SOC/Register Login Page/linktext_BeASupplier'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('SOC/Register Login Page/button_SignInAsSupplier'), 0)

WebUI.click(findTestObject('SOC/Register Login Page/button_SignInAsSupplier'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SOC/Register Login Page/textfield_YourEmailUsername'), 0)

WebUI.setText(findTestObject('SOC/Register Login Page/textfield_YourEmailUsername'), GlobalVariable.CustomMerch)

WebUI.setText(findTestObject('SOC/Register Login Page/textfield_YourPassword'), GlobalVariable.CustomPass)

WebUI.click(findTestObject('SOC/Register Login Page/button_Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SOC/Add Item/button_AcceptCookies'), 0)

WebUI.click(findTestObject('SOC/Add Item/button_AcceptCookies'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('SOC/Add Item/button_AcceptCookies'), 0)

