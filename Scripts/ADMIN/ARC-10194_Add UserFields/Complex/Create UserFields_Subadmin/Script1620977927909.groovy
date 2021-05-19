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

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/button_Add Field'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Permission/ARC-10194/a_Save'), 0)

WebUI.comment('textfield')

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_FieldName'), 'SubadminTextfield')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/toggle_Mandatory Field'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Permission/ARC-10194/dropdown_FieldType'), 'Text', false)

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/checkbox_Consumer'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/checkbox_Merchant'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/a_Save'))

WebUI.verifyTextPresent('SubadminTextfield', false)

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/button_Add Field'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Permission/ARC-10194/a_Save'), 0)

WebUI.comment('SubadminDrpdwn')

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_FieldName'), 'Admin_dropdwn_Consum_Yes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/toggle_Mandatory Field'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Permission/ARC-10194/dropdown_FieldType'), 'DropDown', false)

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_Options_dd1'), 'dd_option1_consumYes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_Options_dd2'), 'dd_option2_consumYes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_Options_dd3'), 'dd_option3_consumYes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_Options_dd4'), 'dd_option4_consumYes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_Options_dd5'), 'dd_option5_consumYes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/checkbox_Consumer'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/a_Save'))

WebUI.verifyTextPresent('SubadminDrpdwn', false)

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/button_Add Field'))

WebUI.comment('SubadminChckbx')

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_FieldName'), 'SubadminChckbx')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/toggle_Mandatory Field'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Permission/ARC-10194/dropdown_FieldType'), 'Checkbox', false)

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption1'), 'cb_option1_consumYes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption2'), 'cb_option2_consumYes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption3'), 'cb_option3_consumYes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption4'), 'cb_option4_consumYes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption5'), 'cb_option5_consumYes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/checkbox_Consumer'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/a_Save'))

WebUI.verifyTextPresent('SubadminChckbx', false)

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/button_Add Field'))

WebUI.comment('SubadminPDF')

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_FieldName'), 'SubadminPDF')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/toggle_Mandatory Field'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Permission/ARC-10194/dropdown_FieldType'), 'PDF', false)

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/checkbox_Consumer'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/a_Save'))

WebUI.verifyTextPresent('SubadminPDF', false)

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/button_Add Field'))

WebUI.comment('SubadminDate')

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_FieldName'), 'SubadminDate')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/toggle_Mandatory Field'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Permission/ARC-10194/dropdown_FieldType'), 'Date', false)

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/checkbox_Consumer'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/a_Save'))

WebUI.verifyTextPresent('SubadminDate', false)

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/button_Add Field'))

WebUI.comment('SubadminImage')

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_FieldName'), 'SubadminImage')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/toggle_Mandatory Field'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Permission/ARC-10194/dropdown_FieldType'), 'Image', false)

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/checkbox_Consumer'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/a_Save'))

WebUI.verifyTextPresent('SubadminImage', false)

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/button_Add Field'))

WebUI.comment('SubadminHyperlink')

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_FieldName'), 'SubadminHyperlink')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/toggle_Mandatory Field'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Permission/ARC-10194/dropdown_FieldType'), 'Hyperlink', false)

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/checkbox_Consumer'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/a_Save'))

WebUI.verifyTextPresent('SubadminHyperlink', false)

