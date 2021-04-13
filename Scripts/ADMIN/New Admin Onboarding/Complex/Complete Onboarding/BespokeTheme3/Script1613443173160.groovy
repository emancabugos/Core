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
import java.text.SimpleDateFormat as SimpleDateFormat

def date = new Date()

def sdf = new SimpleDateFormat('MMdd')

String dateToday = sdf.format(date)

WebUI.comment('Step 1')

WebUI.waitForElementVisible(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 1/text_Tell us a little about yourself'), 
    0)

WebUI.selectOptionByIndex(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 1/dd_Wich statement'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 1/dd_Which industry'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 1/dd_What type of marketplace'), '2', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 1/dd_How did you hear'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 1/button_NEXT Step 1'))

WebUI.comment('Step 2')

WebUI.waitForElementVisible(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/text_Add your basic contact details'), 
    0)

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_First Name_FirstName'), dateToday + 'BespokeTheme3')

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_Last Name_LastName'), 'Admin')

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_Your Notification Email_Email'), 'arcadierteam@gmail.com')

WebUI.selectOptionByLabel(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/dd_Countty of implementation'), 'Italy', 
    false)

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_Your Address_Line1'), 'Strada Statale 130')

WebUI.selectOptionByLabel(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/dd_Country'), 'Italy', false)

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_State_State'), 'Biella')

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_City_City'), 'Dorzano')

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_Postal Code_PostCode'), '13881')

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/input_Please do not enter any spaces'), '+631234567890')

WebUI.click(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 2/button_NEXT Step 2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Step 3')

WebUI.waitForElementVisible(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 3/text_Tell us about your marketplace'), 
    0)

WebUI.click(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 3/btn_selectRetailGoods'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 3/input_Give Your Marketplace'), dateToday + 'BespokeTheme3')

WebUI.selectOptionByLabel(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 3/dd_currency'), 'US Dollar', false)

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 3/input_Your Marketplace Commission'), '0')

WebUI.click(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 3/button_NEXT Step 3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Step 4')

WebUI.waitForElementVisible(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 4/text_Preview  pick out your marketplace theme'), 
    0)

WebUI.click(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 4/btn_selectRetailTheme3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 4/cb_Terms'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 4/btn_NEXT Step 4'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Step 4')

WebUI.waitForElementVisible(findTestObject('ADMIN/New Admin Onboarding/Success Page/text_Your Marketplace is ready'), 30)

WebUI.waitForElementVisible(findTestObject('ADMIN/New Admin Onboarding/Success Page/btn_Take me to my Admin Portal'), 0)

WebUI.click(findTestObject('ADMIN/New Admin Onboarding/Success Page/btn_Take me to my Admin Portal'), FailureHandling.CONTINUE_ON_FAILURE)

