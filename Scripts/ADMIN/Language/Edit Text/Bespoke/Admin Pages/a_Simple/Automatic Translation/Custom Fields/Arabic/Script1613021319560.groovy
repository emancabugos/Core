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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Admin Pages/Custom Field Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)
WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Arabic', false)
WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Text field_NM1_text_field'), 
    'value', 'allCat_Text field_NM1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Text field_NM2_text_field'), 
    'value', 'allCat_Text field_NM2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Text editor_NM_text_field'), 
    'value', 'allCat_Text editor_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Hyperlink_NM_text_field'), 
    'value', 'allCat_Hyperlink_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Email_NM_text_field'), 
    'value', 'allCat_Email_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/input_allCat_Number_NM1_text_field'), 
    'value', 'allCat_Number_NM1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/input_allCat_Number_NM2_text_field'), 
    'value', 'allCat_Number_NM2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/input_allCat_Percentage_NM_text_field'), 
    'value', 'allCat_Percentage_NM', 0)

WebUI.comment('allCat_Check Box_NM1')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM1_text_field'), 
    'value', 'allCat_Check Box_NM1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM1CB1_dropdownoption1'), 
    'value', 'allCat_Check Box_NM1CB1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM1CB2_dropdownoption1'), 
    'value', 'allCat_Check Box_NM1CB2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM1CB3_dropdownoption1'), 
    'value', 'allCat_Check Box_NM1CB3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM1CB4_dropdownoption1'), 
    'value', 'allCat_Check Box_NM1CB4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM1CB5_dropdownoption1'), 
    'value', 'allCat_Check Box_NM1CB5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM1CB6_dropdownoption1'), 
    'value', 'allCat_Check Box_NM1CB6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM1CB7_dropdownoption1'), 
    'value', 'allCat_Check Box_NM1CB7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM1CB8_dropdownoption1'), 
    'value', 'allCat_Check Box_NM1CB8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM1CB9_dropdownoption1'), 
    'value', 'allCat_Check Box_NM1CB9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM1CB10_dropdownoption1'), 
    'value', 'allCat_Check Box_NM1CB10', 0)

WebUI.comment('allCat_Check Box_NM2')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM2_text_field'), 
    'value', 'allCat_Check Box_NM2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM2CB1_dropdownoption1'), 
    'value', 'allCat_Check Box_NM2CB1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM2CB2_dropdownoption1'), 
    'value', 'allCat_Check Box_NM2CB2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM2CB3_dropdownoption1'), 
    'value', 'allCat_Check Box_NM2CB3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM2CB4_dropdownoption1'), 
    'value', 'allCat_Check Box_NM2CB4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM2CB5_dropdownoption1'), 
    'value', 'allCat_Check Box_NM2CB5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM2CB6_dropdownoption1'), 
    'value', 'allCat_Check Box_NM2CB6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM2CB7_dropdownoption1'), 
    'value', 'allCat_Check Box_NM2CB7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM2CB8_dropdownoption1'), 
    'value', 'allCat_Check Box_NM2CB8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM2CB9_dropdownoption1'), 
    'value', 'allCat_Check Box_NM2CB9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Check Box_NM2CB10_dropdownoption1'), 
    'value', 'allCat_Check Box_NM2CB10', 0)

WebUI.comment('allCat_Drop Down_NM1')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM1_text_field'), 
    'value', 'allCat_Drop Down_NM1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_Select_dropdownoption1_allCat_Drop Down_NM1'), 
    'value', 'Select', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM1DD1_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM1DD1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM1DD2_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM1DD2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM1DD3_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM1DD3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM1DD4_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM1DD4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM1DD5_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM1DD5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM1DD6_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM1DD6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM1DD7_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM1DD7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM1DD8_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM1DD8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM1DD9_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM1DD9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM1DD10_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM1DD10', 0)

WebUI.comment('allCat_Drop Down_NM2')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM2_text_field'), 
    'value', 'allCat_Drop Down_NM2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_Select_dropdownoption1_allCat_Drop Down_NM2'), 
    'value', 'Select', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM2DD1_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM2DD1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM2DD2_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM2DD2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM2DD3_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM2DD3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM2DD4_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM2DD4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM2DD5_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM2DD5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM2DD6_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM2DD6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM2DD7_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM2DD7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM2DD8_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM2DD8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM2DD9_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM2DD9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Drop Down_NM2DD10_dropdownoption1'), 
    'value', 'allCat_Drop Down_NM2DD10', 0)

WebUI.comment('other all cat')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Location_NM_text_field'), 
    'value', 'allCat_Location_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_Type the location name here_location'), 
    'value', 'Type the location name here', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_PDF File_NM_text_field'), 
    'value', 'allCat_PDF File_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Video_NM_text_field'), 
    'value', 'allCat_Video_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Date  Time_On_NM_text_field'), 
    'value', 'allCat_Date / Time_On_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_allCat_Date  Time_Off_NM_text_field'), 
    'value', 'allCat_Date / Time_Off_NM', 0)

WebUI.comment('SP Custom')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Text field_M1_text_field'), 
    'value', 'SP_Text field_M1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Text field_M2_text_field'), 
    'value', 'SP_Text field_M2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Text Editor_M_text_field'), 
    'value', 'SP_Text Editor_M', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Hyperlink_M_text_field'), 
    'value', 'SP_Hyperlink_M', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Email_M_text_field'), 
    'value', 'SP_Email_M', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Percentage_M_text_field'), 
    'value', 'SP_Percentage_M', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Number_M1_text_field'), 
    'value', 'SP_Number_M1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Number_M2_text_field'), 
    'value', 'SP_Number_M2', 0)

WebUI.comment('SP_Check Box_M1')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M1_text_field'), 
    'value', 'SP_Check Box_M1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M1CB1_dropdownoption1'), 
    'value', 'SP_Check Box_M1CB1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M1CB2_dropdownoption1'), 
    'value', 'SP_Check Box_M1CB2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M1CB3_dropdownoption1'), 
    'value', 'SP_Check Box_M1CB3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M1CB4_dropdownoption1'), 
    'value', 'SP_Check Box_M1CB4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M1CB5_dropdownoption1'), 
    'value', 'SP_Check Box_M1CB5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M1CB6_dropdownoption1'), 
    'value', 'SP_Check Box_M1CB6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M1CB7_dropdownoption1'), 
    'value', 'SP_Check Box_M1CB7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M1CB8_dropdownoption1'), 
    'value', 'SP_Check Box_M1CB8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M1CB9_dropdownoption1'), 
    'value', 'SP_Check Box_M1CB9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M1CB10_dropdownoption1'), 
    'value', 'SP_Check Box_M1CB10', 0)

WebUI.comment('SP_Check Box_M2')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M2_text_field'), 
    'value', 'SP_Check Box_M2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M2CB1_dropdownoption1'), 
    'value', 'SP_Check Box_M2CB1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M2CB2_dropdownoption1'), 
    'value', 'SP_Check Box_M2CB2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M2CB3_dropdownoption1'), 
    'value', 'SP_Check Box_M2CB3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M2CB4_dropdownoption1'), 
    'value', 'SP_Check Box_M2CB4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M2CB5_dropdownoption1'), 
    'value', 'SP_Check Box_M2CB5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M2CB6_dropdownoption1'), 
    'value', 'SP_Check Box_M2CB6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M2CB7_dropdownoption1'), 
    'value', 'SP_Check Box_M2CB7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M2CB8_dropdownoption1'), 
    'value', 'SP_Check Box_M2CB8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M2CB9_dropdownoption1'), 
    'value', 'SP_Check Box_M2CB9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Check Box_M2CB10_dropdownoption1'), 
    'value', 'SP_Check Box_M2CB10', 0)

WebUI.comment('SP_Drop Down_M1')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M1_text_field'), 
    'value', 'SP_Drop Down_M1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_Select_dropdownoption1_input_SP_Drop Down_M1_text_field'), 
    'value', 'Select', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M1DD1_dropdownoption1'), 
    'value', 'SP_Drop Down_M1DD1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M1DD2_dropdownoption1'), 
    'value', 'SP_Drop Down_M1DD2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M1DD3_dropdownoption1'), 
    'value', 'SP_Drop Down_M1DD3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M1DD4_dropdownoption1'), 
    'value', 'SP_Drop Down_M1DD4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M1DD5_dropdownoption1'), 
    'value', 'SP_Drop Down_M1DD5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M1DD6_dropdownoption1'), 
    'value', 'SP_Drop Down_M1DD6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M1DD7_dropdownoption1'), 
    'value', 'SP_Drop Down_M1DD7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M1DD8_dropdownoption1'), 
    'value', 'SP_Drop Down_M1DD8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M1DD9_dropdownoption1'), 
    'value', 'SP_Drop Down_M1DD9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M1DD10_dropdownoption1'), 
    'value', 'SP_Drop Down_M1DD10', 0)

WebUI.comment('SP_Drop Down_M2')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M2_text_field'), 
    'value', 'SP_Drop Down_M2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_Select_dropdownoption1_input_SP_Drop Down_M1_text_field'), 
    'value', 'Select', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M2DD1_dropdownoption1'), 
    'value', 'SP_Drop Down_M2DD1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M2DD2_dropdownoption1'), 
    'value', 'SP_Drop Down_M2DD2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M2DD3_dropdownoption1'), 
    'value', 'SP_Drop Down_M2DD3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M2DD4_dropdownoption1'), 
    'value', 'SP_Drop Down_M2DD4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M2DD5_dropdownoption1'), 
    'value', 'SP_Drop Down_M2DD5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M2DD6_dropdownoption1'), 
    'value', 'SP_Drop Down_M2DD6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M2DD7_dropdownoption1'), 
    'value', 'SP_Drop Down_M2DD7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M2DD8_dropdownoption1'), 
    'value', 'SP_Drop Down_M2DD8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M2DD9_dropdownoption1'), 
    'value', 'SP_Drop Down_M2DD9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Drop Down_M2DD10_dropdownoption1'), 
    'value', 'SP_Drop Down_M2DD10', 0)

WebUI.comment('other SP')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Location_M_text_field'), 
    'value', 'SP_Location_M', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/allCat/input_Type the location name here_location'), 
    'value', 'Type the location name here', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Date  Time_Off_M1_text_field'), 
    'value', 'SP_Date / Time_Off_M1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Date  Time_On_M2_text_field'), 
    'value', 'SP_Date / Time_On_M2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_PDF_M_text_field'), 
    'value', 'SP_PDF_M', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCustom/input_SP_Video_M_text_field'), 
    'value', 'SP_Video_M', 0)

WebUI.comment('SPC Custom')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Text field_NM2_text_field - Copy'), 
    'value', 'SPC_Text field_NM1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Text field_NM2_text_field'), 
    'value', 'SPC_Text field_NM2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Text editor_NM_text_field'), 
    'value', 'SPC_Text editor_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Hyperlink_NM_text_field'), 
    'value', 'SPC_Hyperlink_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Email_NM_text_field'), 
    'value', 'SPC_Email_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Number_NM1_text_field'), 
    'value', 'SPC_Number_NM1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Number_NM2_text_field'), 
    'value', 'SPC_Number_NM2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Percentage_NM_text_field'), 
    'value', 'SPC_Percentage_NM', 0)

WebUI.comment('SPC_Check Box_M1')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M1_text_field'), 
    'value', 'SPC_Check Box_M1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M1CB1_dropdownoption1'), 
    'value', 'SPC_Check Box_M1CB1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M1CB2_dropdownoption1'), 
    'value', 'SPC_Check Box_M1CB2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M1CB3_dropdownoption1'), 
    'value', 'SPC_Check Box_M1CB3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M1CB4_dropdownoption1'), 
    'value', 'SPC_Check Box_M1CB4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M1CB5_dropdownoption1'), 
    'value', 'SPC_Check Box_M1CB5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M1CB6_dropdownoption1'), 
    'value', 'SPC_Check Box_M1CB6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M1CB7_dropdownoption1'), 
    'value', 'SPC_Check Box_M1CB7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M1CB8_dropdownoption1'), 
    'value', 'SPC_Check Box_M1CB8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M1CB9_dropdownoption1'), 
    'value', 'SPC_Check Box_M1CB9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M1CB10_dropdownoption1'), 
    'value', 'SPC_Check Box_M1CB10', 0)

WebUI.comment('SPC_Check Box_M2')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M2_text_field'), 
    'value', 'SPC_Check Box_M2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M2CB1_dropdownoption1'), 
    'value', 'SPC_Check Box_M2CB1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M2CB2_dropdownoption1'), 
    'value', 'SPC_Check Box_M2CB2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M2CB3_dropdownoption1'), 
    'value', 'SPC_Check Box_M2CB3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M2CB4_dropdownoption1'), 
    'value', 'SPC_Check Box_M2CB4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M2CB5_dropdownoption1'), 
    'value', 'SPC_Check Box_M2CB5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M2CB6_dropdownoption1'), 
    'value', 'SPC_Check Box_M2CB6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M2CB7_dropdownoption1'), 
    'value', 'SPC_Check Box_M2CB7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M2CB8_dropdownoption1'), 
    'value', 'SPC_Check Box_M2CB8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M2CB9_dropdownoption1'), 
    'value', 'SPC_Check Box_M2CB9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Check Box_M2CB10_dropdownoption1'), 
    'value', 'SPC_Check Box_M2CB10', 0)

WebUI.comment('SPC_Drop Down_M1')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M1_text_field'), 
    'value', 'SPC_Drop Down_M1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_Select_dropdownoption1_input_SPC_Drop Down_M1_text_field'), 
    'value', 'Select', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M1DD1_dropdownoption1'), 
    'value', 'SPC_Drop Down_M1DD1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M1DD2_dropdownoption1'), 
    'value', 'SPC_Drop Down_M1DD2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M1DD3_dropdownoption1'), 
    'value', 'SPC_Drop Down_M1DD3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M1DD4_dropdownoption1'), 
    'value', 'SPC_Drop Down_M1DD4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M1DD5_dropdownoption1'), 
    'value', 'SPC_Drop Down_M1DD5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M1DD6_dropdownoption1'), 
    'value', 'SPC_Drop Down_M1DD6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M1DD7_dropdownoption1'), 
    'value', 'SPC_Drop Down_M1DD7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M1DD8_dropdownoption1'), 
    'value', 'SPC_Drop Down_M1DD8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M1DD9_dropdownoption1'), 
    'value', 'SPC_Drop Down_M1DD9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M1DD10_dropdownoption1'), 
    'value', 'SPC_Drop Down_M1DD10', 0)

WebUI.comment('SPC_Drop Down_M2')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M2_text_field'), 
    'value', 'SPC_Drop Down_M2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_Select_dropdownoption1_input_SPC_Drop Down_M2_text_field'), 
    'value', 'Select', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M2DD1_dropdownoption1'), 
    'value', 'SPC_Drop Down_M2DD1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M2DD2_dropdownoption1'), 
    'value', 'SPC_Drop Down_M2DD2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M2DD3_dropdownoption1'), 
    'value', 'SPC_Drop Down_M2DD3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M2DD4_dropdownoption1'), 
    'value', 'SPC_Drop Down_M2DD4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M2DD5_dropdownoption1'), 
    'value', 'SPC_Drop Down_M2DD5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M2DD6_dropdownoption1'), 
    'value', 'SPC_Drop Down_M2DD6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M2DD7_dropdownoption1'), 
    'value', 'SPC_Drop Down_M2DD7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M2DD8_dropdownoption1'), 
    'value', 'SPC_Drop Down_M2DD8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M2DD9_dropdownoption1'), 
    'value', 'SPC_Drop Down_M2DD9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Drop Down_M2DD10_dropdownoption1'), 
    'value', 'SPC_Drop Down_M2DD10', 0)

WebUI.comment('other SP')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Location_NM_text_field'), 
    'value', 'SPC_Location_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_Type the location name here_location'), 
    'value', 'Type the location name here', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_PDF File_NM_text_field'), 
    'value', 'SPC_PDF File_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Video_NM_text_field'), 
    'value', 'SPC_Video_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Date  Time_On_NM_text_field'), 
    'value', 'SPC_Date / Time_On_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPCCustom/input_SPC_Date  Time_Off_NM_text_field'), 
    'value', 'SPC_Date / Time_Off_NM', 0)

WebUI.comment('SPG Custom')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Text field_NM1_text_field'), 
    'value', 'SPG_Text field_NM1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Text field_NM2_text_field'), 
    'value', 'SPG_Text field_NM2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Text editor_NM_text_field'), 
    'value', 'SPG_Text editor_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Hyperlink_NM_text_field'), 
    'value', 'SPG_Hyperlink_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Email_NM_text_field'), 
    'value', 'SPG_Email_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Number_NM1_text_field'), 
    'value', 'SPG_Number_NM1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Number_NM2_text_field'), 
    'value', 'SPG_Number_NM2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Percentage_NM_text_field'), 
    'value', 'SPG_Percentage_NM', 0)

WebUI.comment('SPG_Check Box_M1')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M1_text_field'), 
    'value', 'SPG_Check Box_M1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M1CB1_dropdownoption1'), 
    'value', 'SPG_Check Box_M1CB1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M1CB2_dropdownoption1'), 
    'value', 'SPG_Check Box_M1CB2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M1CB3_dropdownoption1'), 
    'value', 'SPG_Check Box_M1CB3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M1CB4_dropdownoption1'), 
    'value', 'SPG_Check Box_M1CB4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M1CB5_dropdownoption1'), 
    'value', 'SPG_Check Box_M1CB5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M1CB6_dropdownoption1'), 
    'value', 'SPG_Check Box_M1CB6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M1CB7_dropdownoption1'), 
    'value', 'SPG_Check Box_M1CB7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M1CB8_dropdownoption1'), 
    'value', 'SPG_Check Box_M1CB8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M1CB9_dropdownoption1'), 
    'value', 'SPG_Check Box_M1CB9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M1CB10_dropdownoption1'), 
    'value', 'SPG_Check Box_M1CB10', 0)

WebUI.comment('SPG_Check Box_M2')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M2_text_field'), 
    'value', 'SPG_Check Box_M2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M2CB1_dropdownoption1'), 
    'value', 'SPG_Check Box_M2CB1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M2CB2_dropdownoption1'), 
    'value', 'SPG_Check Box_M2CB2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M2CB3_dropdownoption1'), 
    'value', 'SPG_Check Box_M2CB3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M2CB4_dropdownoption1'), 
    'value', 'SPG_Check Box_M2CB4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M2CB5_dropdownoption1'), 
    'value', 'SPG_Check Box_M2CB5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M2CB6_dropdownoption1'), 
    'value', 'SPG_Check Box_M2CB6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M2CB7_dropdownoption1'), 
    'value', 'SPG_Check Box_M2CB7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M2CB8_dropdownoption1'), 
    'value', 'SPG_Check Box_M2CB8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M2CB9_dropdownoption1'), 
    'value', 'SPG_Check Box_M2CB9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Check Box_M2CB10_dropdownoption1'), 
    'value', 'SPG_Check Box_M2CB10', 0)

WebUI.comment('SPG_Drop Down_M1')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M1_text_field'), 
    'value', 'SPG_Drop Down_M1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_Select_dropdownoption1_input_SPG_Drop Down_M1_text_field'), 
    'value', 'Select', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M1DD1_dropdownoption1'), 
    'value', 'SPG_Drop Down_M1DD1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M1DD2_dropdownoption1'), 
    'value', 'SPG_Drop Down_M1DD2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M1DD3_dropdownoption1'), 
    'value', 'SPG_Drop Down_M1DD3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M1DD4_dropdownoption1'), 
    'value', 'SPG_Drop Down_M1DD4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M1DD5_dropdownoption1'), 
    'value', 'SPG_Drop Down_M1DD5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M1DD6_dropdownoption1'), 
    'value', 'SPG_Drop Down_M1DD6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M1DD7_dropdownoption1'), 
    'value', 'SPG_Drop Down_M1DD7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M1DD8_dropdownoption1'), 
    'value', 'SPG_Drop Down_M1DD8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M1DD9_dropdownoption1'), 
    'value', 'SPG_Drop Down_M1DD9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M1DD10_dropdownoption1'), 
    'value', 'SPG_Drop Down_M1DD10', 0)

WebUI.comment('SPG_Drop Down_M2')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M2_text_field'), 
    'value', 'SPG_Drop Down_M2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_Select_dropdownoption1_input_SPG_Drop Down_M2_text_field'), 
    'value', 'Select', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M2DD1_dropdownoption1'), 
    'value', 'SPG_Drop Down_M2DD1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M2DD2_dropdownoption1'), 
    'value', 'SPG_Drop Down_M2DD2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M2DD3_dropdownoption1'), 
    'value', 'SPG_Drop Down_M2DD3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M2DD4_dropdownoption1'), 
    'value', 'SPG_Drop Down_M2DD4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M2DD5_dropdownoption1'), 
    'value', 'SPG_Drop Down_M2DD5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M2DD6_dropdownoption1'), 
    'value', 'SPG_Drop Down_M2DD6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M2DD7_dropdownoption1'), 
    'value', 'SPG_Drop Down_M2DD7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M2DD8_dropdownoption1'), 
    'value', 'SPG_Drop Down_M2DD8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M2DD9_dropdownoption1'), 
    'value', 'SPG_Drop Down_M2DD9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Drop Down_M2DD10_dropdownoption1'), 
    'value', 'SPG_Drop Down_M2DD10', 0)

WebUI.comment('other SP')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Location_NM_text_field'), 
    'value', 'SPG_Location_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_Type the location name here_location'), 
    'value', 'Type the location name here', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_PDF File_NM_text_field'), 
    'value', 'SPG_PDF File_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Video_NM_text_field'), 
    'value', 'SPG_Video_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Date  Time_On_NM_text_field'), 
    'value', 'SPG_Date / Time_On_NM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Custom Fields/SPGCustom/input_SPG_Date  Time_Off_NM_text_field'), 
    'value', 'SPG_Date / Time_Off_NM', 0)

