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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Admin Pages/Categories Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Hindi', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 01_main-category1'), 
    'value', 'Category 01', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 02_main-category1'), 
    'value', 'Category 02', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 03_main-category1'), 
    'value', 'Category 03', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 04_main-category1'), 
    'value', 'Category 04', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 05_main-category1'), 
    'value', 'Category 05', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 06_main-category1'), 
    'value', 'Category 06', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 07_main-category1'), 
    'value', 'Category 07', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 08_main-category1'), 
    'value', 'Category 08', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 09_main-category1'), 
    'value', 'Category 09', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 10_main-category1'), 
    'value', 'Category 10', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 11_main-category1'), 
    'value', 'Category 11', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 12_main-category1'), 
    'value', 'Category 12', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 13_main-category1'), 
    'value', 'Category 13', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 14_main-category1'), 
    'value', 'Category 14', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 15_main-category1'), 
    'value', 'Category 15', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 16_main-category1'), 
    'value', 'Category 16', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 17_main-category1'), 
    'value', 'Category 17', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 18_main-category1'), 
    'value', 'Category 18', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 19_main-category1'), 
    'value', 'Category 19', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category 20_main-category1'), 
    'value', 'Category 20', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category EDITED_main-category1'), 
    'value', 'Category EDITED', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Categories/input_Category Name mAx 021_main-category1'), 
    'value', 'Category Name mAx 021!!@#$%^&!', 0)

WebUI.comment('CATEGORY 2')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 2.1_main-category1'), 
    'value', 'Category 2.1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 2.2_main-category1'), 
    'value', 'Category 2.2', 0)

WebUI.comment('CATEGORY 3')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 3.1_main-category1'), 
    'value', 'Category 3.1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 3.1.1_main-category1'), 
    'value', 'Category 3.1.1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 3.1.2_main-category1'), 
    'value', 'Category 3.1.2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 3.2_main-category1'), 
    'value', 'Category 3.2', 0)

WebUI.comment('CATEGORY 4')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.1_main-category1'), 
    'value', 'Category 4.1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.2_main-category1'), 
    'value', 'Category 4.2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.3_main-category1'), 
    'value', 'Category 4.3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.4_main-category1'), 
    'value', 'Category 4.4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.5_main-category1'), 
    'value', 'Category 4.5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.6_main-category1'), 
    'value', 'Category 4.6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.7_main-category1'), 
    'value', 'Category 4.7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.8_main-category1'), 
    'value', 'Category 4.8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.9_main-category1'), 
    'value', 'Category 4.9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.10_main-category1'), 
    'value', 'Category 4.10', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.11_main-category1'), 
    'value', 'Category 4.11', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.12_main-category1'), 
    'value', 'Category 4.12', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.13_main-category1'), 
    'value', 'Category 4.13', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.14_main-category1'), 
    'value', 'Category 4.14', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.15_main-category1'), 
    'value', 'Category 4.15', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.16_main-category1'), 
    'value', 'Category 4.16', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.17_main-category1'), 
    'value', 'Category 4.17', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.18_main-category1'), 
    'value', 'Category 4.18', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.19_main-category1'), 
    'value', 'Category 4.19', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 4.20_main-category1'), 
    'value', 'Category 4.20', 0)

WebUI.comment('CATEGORY 5')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1_main-category1'), 
    'value', 'Category 5.1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.1_main-category1'), 
    'value', 'Category 5.1.1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.2_main-category1'), 
    'value', 'Category 5.1.2', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.3_main-category1'), 
    'value', 'Category 5.1.3', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.4_main-category1'), 
    'value', 'Category 5.1.4', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.5_main-category1'), 
    'value', 'Category 5.1.5', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.6_main-category1'), 
    'value', 'Category 5.1.6', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.7_main-category1'), 
    'value', 'Category 5.1.7', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.8_main-category1'), 
    'value', 'Category 5.1.8', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.9_main-category1'), 
    'value', 'Category 5.1.9', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.10_main-category1'), 
    'value', 'Category 5.1.10', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.11_main-category1'), 
    'value', 'Category 5.1.11', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.12_main-category1'), 
    'value', 'Category 5.1.12', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.13_main-category1'), 
    'value', 'Category 5.1.13', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.14_main-category1'), 
    'value', 'Category 5.1.14', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.15_main-category1'), 
    'value', 'Category 5.1.15', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.16_main-category1'), 
    'value', 'Category 5.1.16', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.17_main-category1'), 
    'value', 'Category 5.1.17', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.18_main-category1'), 
    'value', 'Category 5.1.18', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.19_main-category1'), 
    'value', 'Category 5.1.19', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.1.20_main-category1'), 
    'value', 'Category 5.1.20', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 5.2_main-category1'), 
    'value', 'Category 5.2', 0)

WebUI.comment('CATEGORY 5')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 6.1_main-category1'), 
    'value', 'Category 6.1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 6.1.1_main-category1'), 
    'value', 'Category 6.1.1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 6.1.1.1_main-category1'), 
    'value', 'Category 6.1.1.1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 6.1.1.1.1_main-category1'), 
    'value', 'Category 6.1.1.1.1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 6.1.1.1.1.1_main-category1'), 
    'value', 'Category 6.1.1.1.1.1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 6.1.1.1.1.1.1_main-category1'), 
    'value', 'Category 6.1.1.1.1.1.1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 6.1.1.1.1.1.1.1_main-category1'), 
    'value', 'Category 6.1.1.1.1.1.1.1', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Category/input_Category 6.1.1.1.1.1.1.1.1_main-category1'), 
    'value', 'Category 6.1.1.1.1.1.1.1.1', 0)

