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

WebUI.waitForElementVisible(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_First Name_FirstName'), 0)

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_First Name_FirstName'), 'Admin')

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_Last Name_LastName'), '')

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_Your Notification Email_Email'), 'arcadierteam@gmail.com')

WebUI.selectOptionByLabel(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/dd_Countty of implementation'), 'Philippines', 
    false)

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_Your Address_Line1'), 'Rufino Pacific Tower')

WebUI.selectOptionByLabel(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/dd_Country'), 'Philippines', false)

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_State_State'), 'N/A')

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_City_City'), 'Makati')

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_Postal Code_PostCode'), '1200ABC')

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_Please do not enter any spaces'), '+631234567890')

WebUI.click(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/button_NEXT Step 2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_Last Name_LastName'), 
    'value', '', 0)

