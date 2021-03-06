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

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/dd_icon EDM'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/dd_icon EDM'), 'Arabic', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Reset Password/input_lbl_pass_request'), 
    'value', 'إعادة تعيين طلب كلمة المرور', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Reset Password/input_lbl_receive_request'), 
    'value', 'لقد تلقينا طلبا لإعادة تعيين كلمة المرور ل', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Reset Password/input_lbl_reset_password'), 
    'value', 'الرجاء إعادة تعيين كلمة المرور بالنقر هنا', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Reset Password/textarea_If you did not reques'), 
    'value', 'إذا لم تطلب تغيير كلمة المرور، فيرجى الاتصال فورا بمسؤول السوق.', 0)

