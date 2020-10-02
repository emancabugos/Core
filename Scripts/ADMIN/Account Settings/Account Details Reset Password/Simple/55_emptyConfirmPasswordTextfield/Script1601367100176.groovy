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

WebUI.setText(findTestObject('ADMIN/Reset Password/textfield_OldPassword'), GlobalVariable.CustomPass)

WebUI.setText(findTestObject('ADMIN/Reset Password/textfield_NewPassword'), '123456')

WebUI.clearText(findTestObject('ADMIN/Reset Password/textfield_ConfirmNewPassword'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Reset Password/button_Save'))

css_color = WebUI.getCSSValue(findTestObject('ADMIN/Reset Password/textfield_ConfirmNewPassword'), 'color')

println(css_color)

WebUI.verifyEqual(css_color, rgb(255, 0, 0))

WebUI.refresh()

