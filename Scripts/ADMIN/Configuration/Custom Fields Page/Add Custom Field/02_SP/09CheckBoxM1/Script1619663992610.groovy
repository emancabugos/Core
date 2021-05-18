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

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), 0)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Choose Field Type')

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Checkbox', false)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/button_addoption'), 0)

for (int r = 0; r <= 7; r++) {
    WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/button_addoption'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.comment('Add Option')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_opt1'), varCustomFieldName + 'CB1')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_opt2'), varCustomFieldName + 'CB2')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option3'), varCustomFieldName + 'CB3')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option4'), varCustomFieldName + 'CB4')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option5'), varCustomFieldName + 'CB5')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option6'), varCustomFieldName + 'CB6')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option7'), varCustomFieldName + 'CB7')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option8'), varCustomFieldName + 'CB8')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option9'), varCustomFieldName + 'CB9')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Checkbox/textfield_option10'), varCustomFieldName + 'CB10')

WebUI.comment('Field Name')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Default/textfield_fieldname'), 'SP_Check Box_M1')

WebUI.comment('Mandatory/NonMandatory')

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/togglebutton_mandatory'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Assign Category')

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Default/button_SelectCategories'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/searchbox_Category'), 
    0)

WebUI.comment('Category Assignment')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/searchbox_Category'), 'Category 01', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/a_Categories/checkbox_1'))

WebUI.click(findTestObject('ADMIN/Custom Item Fields List Page/a_SelectCategories/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Custom Item Fields Page/a_Default/button_Save1'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields List Page/button_Add Field'), 0)

