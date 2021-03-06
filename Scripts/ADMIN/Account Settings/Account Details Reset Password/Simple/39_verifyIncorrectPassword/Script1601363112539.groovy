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

WebUI.verifyElementPresent(findTestObject('ADMIN/Reset Password/textfield_NewPassword'), 0)

WebUI.setText(findTestObject('ADMIN/Reset Password/textfield_OldPassword'), 'incorrectpassword')

WebUI.setText(findTestObject('ADMIN/Reset Password/textfield_NewPassword'), '1234567')

WebUI.setText(findTestObject('ADMIN/Reset Password/textfield_ConfirmNewPassword'), '1234567')

WebUI.click(findTestObject('ADMIN/Reset Password/button_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Reset Password/warning_OldPasswordIncorrect'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Reset Password/warning_OldPasswordIncorrect'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.refresh()

