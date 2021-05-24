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

WebUI.comment('Admin_checkbx_Consum_Yes')

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_FieldName'), 'Admin_checkbx_Consum_Yes')

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

WebUI.verifyTextPresent('Admin_checkbx_Consum_Yes', false)

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/button_Add Field'))

WebUI.comment('Admin_checkbx_Merch_Yes')

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_FieldName'), 'Admin_checkbx_Merch_Yes')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Permission/ARC-10194/dropdown_FieldType'), 'Checkbox', false)

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption1'), 'cb_option1_Merch_Yes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption2'), 'cb_option2_Merch_Yes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption3'), 'cb_option3_Merch_Yes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption4'), 'cb_option4_Merch_Yes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption5'), 'cb_option5_Merch_Yes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/checkbox_Merchant'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/a_Save'))

WebUI.verifyTextPresent('Admin_checkbx_Merch_Yes', false)

WebUI.comment('Admin_checkbx_ConsMer_Yes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/button_Add Field'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_FieldName'), 'Admin_checkbx_ConsMer_Yes')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Permission/ARC-10194/dropdown_FieldType'), 'Checkbox', false)

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption1'), 'cb_option1_ConsMer_Yes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption2'), 'cb_option2_ConsMer_Yes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption3'), 'cb_option3_ConsMer_Yes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption4'), 'cb_option4_ConsMer_Yes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption5'), 'cb_option5_ConsMer_Yes')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/checkbox_Merchant'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/checkbox_Consumer'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/a_Save'))

WebUI.verifyTextPresent('Admin_checkbx_ConsMer_Yes', false)

WebUI.comment('Admin_checkbx_Consum_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/button_Add Field'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_FieldName'), 'Admin_checkbx_Consum_No')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Permission/ARC-10194/dropdown_FieldType'), 'Checkbox', false)

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/toggle_Mandatory Field'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption1'), 'cb_option1_Consum_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption2'), 'cb_option2_Consum_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption3'), 'cb_option3_Consum_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption4'), 'cb_option4_Consum_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption5'), 'cb_option5_Consum_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/checkbox_Consumer'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/toggle_Available for Public'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/a_Save'))

WebUI.verifyTextPresent('Admin_checkbx_Consum_No', false)

WebUI.comment('Admin_dropdwn_Merch_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/button_Add Field'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_FieldName'), 'Admin_checkbx_Merch_No')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Permission/ARC-10194/dropdown_FieldType'), 'Checkbox', false)

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/toggle_Mandatory Field'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption1'), 'cb_option1_Merch_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption2'), 'cb_option2_Merch_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption3'), 'cb_option3_Merch_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption4'), 'cb_option4_Merch_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption5'), 'cb_option5_Merch_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/checkbox_Merchant'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/toggle_Available for Public'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/a_Save'))

WebUI.verifyTextPresent('Admin_checkbx_Merch_No', false)

WebUI.comment('Admin_checkbx_ConsMer_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/button_Add Field'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_FieldName'), 'Admin_checkbx_ConsMer_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/toggle_Mandatory Field'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Admin Permission/ARC-10194/dropdown_FieldType'), 'Checkbox', false)

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption1'), 'cb_option1_ConsMer_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption2'), 'cb_option2_ConsMer_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption3'), 'cb_option3_ConsMer_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption4'), 'cb_option4_ConsMer_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/i_ADD OPTION_icon icon-addopt_checkbx'))

WebUI.setText(findTestObject('ADMIN/Admin Permission/ARC-10194/textfield_choption5'), 'cb_option5_ConsMer_No')

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/checkbox_Merchant'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/checkbox_Consumer'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/toggle_Available for Public'))

WebUI.click(findTestObject('ADMIN/Admin Permission/ARC-10194/a_Save'))

WebUI.verifyTextPresent('Admin_checkbx_ConsMer_No', false)

