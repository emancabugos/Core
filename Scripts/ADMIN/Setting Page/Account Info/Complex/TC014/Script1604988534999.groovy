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

'Login using Admin Custon Login'
WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Setting Page/Redirection to Account Information Page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Setting Sidebar Menu/button_Edit'))

WebUI.waitForElementPresent(findTestObject('ADMIN/Setting Sidebar Menu/Account Details of Custom Login Admins/textlabel_Old password'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Setting Sidebar Menu/Account Details of Custom Login Admins/textfield_old password'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Setting Sidebar Menu/Account Details of Custom Login Admins/textlabel_NewPassword'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Setting Sidebar Menu/Account Details of Custom Login Admins/textfield_NewPassword'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Setting Sidebar Menu/Account Details of Custom Login Admins/textlabel_confirmNewPass'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Setting Sidebar Menu/Account Details of Custom Login Admins/textfield_ConfirmNewPass'), 
    0)

