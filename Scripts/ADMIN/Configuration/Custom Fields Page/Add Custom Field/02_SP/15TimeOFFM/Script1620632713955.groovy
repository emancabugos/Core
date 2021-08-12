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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Custom Item Fields Page/a_Default/dropdown_fieldtype'), 'Date / Time picker', 
    false)

WebUI.comment('Field Name')

WebUI.setText(findTestObject('ADMIN/Custom Item Fields Page/a_Default/textfield_fieldname'), 'allCat_Date / Time_Off_NM')

WebUI.comment('Mandatory/NonMandatory')

WebUI.waitForElementVisible(findTestObject('ADMIN/Custom Item Fields Page/a_Default/togglebutton_mandatory'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Default Value')

WebUI.click(findTestObject('ADMIN/Custom Field Default Value/datetime_inputDEFAULT VALUE_datepicker'), FailureHandling.CONTINUE_ON_FAILURE)

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

