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

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 3/text_Tell us about your marketplace'), 
    0)

WebUI.click(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 3/btn_selectRetailGoods'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 3/input_Give Your Marketplace'), dateToday + 'BespokeTheme1')

WebUI.selectOptionByLabel(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 3/dd_currency'), 'Singapore Dollar', 
    false)

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 3/input_Your Marketplace Commission'), '0')

WebUI.click(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 3/button_NEXT Step 3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 4/text_Preview  pick out your marketplace theme'), 
    0)

WebUI.verifyElementPresent(findTestObject('ADMIN/New Admin Onboarding/Onboarding Step 4/text_Preview  pick out your marketplace theme'), 
    0)

