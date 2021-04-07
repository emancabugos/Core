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

WebUI.waitForElementVisible(findTestObject('ADMIN/New Admin Onboarding/Admin Register Page/btn_Create your account'), 0)

WebUI.click(findTestObject('ADMIN/New Admin Onboarding/Admin Register Page/btn_Create your account'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/New Admin Onboarding/Custom Register Form/input_Your Email  Username'), 
    0)

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Custom Register Form/input_Your Email  Username'), dateToday + 
    'BespokeTheme2')

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Custom Register Form/input_Your Password'), 'welcome8')

WebUI.setText(findTestObject('ADMIN/New Admin Onboarding/Custom Register Form/input_Reconfirm Password'), 'welcome8')

WebUI.click(findTestObject('ADMIN/New Admin Onboarding/Custom Register Form/btn_Sign Up'), FailureHandling.CONTINUE_ON_FAILURE)

