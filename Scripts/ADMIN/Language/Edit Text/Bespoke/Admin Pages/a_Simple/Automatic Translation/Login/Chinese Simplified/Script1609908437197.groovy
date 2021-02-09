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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Admin Pages/Login Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Chinese (Simplified)', 
    false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Google_btn_next'), 
    'value', '继续使用Google', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Facebook_btn_next'), 
    'value', '继续使用Facebook', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Google_btn_save'), 
    'value', '继续使用Google', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Facebook_btn_save'), 
    'value', '继续使用Facebook', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Your EmailUsername_email_username'), 
    'value', '您的电子邮件/用户名', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Your Password_your_password'), 
    'value', '你的密码', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Create Account_btn_next'), 
    'value', '创建帐号', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Sign In_btn_next'), 'value', 
    '签到', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Forgot Password_forgot_password'), 
    'value', '忘记密码？', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Reconfirm Password_reconfirm_password'), 
    'value', '重新确认密码', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Notification Email_notif_email'), 
    'value', '通知电子邮件', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Already have an Account_already_have_account'), 
    'value', '已经有帐户？', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Whats your email or username_what_email_username'), 
    'value', '你的电子邮件或用户名是什么？', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Reset Password_reset_password_btn'), 
    'value', '重设密码', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Sorry We were unable to find an account with that email  username_unable_find_account'), 
    'value', '抱歉!我们无法找到该电子邮件/用户名的帐号', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_A recovery email has been sent to the email address associated with this account_recovery_email'), 
    'value', '恢复电子邮件已发送到与此帐户相关联的电子邮件地址。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Back_back'), 'value', 
    '背部', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Your New Password_your_new_password'), 
    'value', '您的新密码', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Reconfirm New Password_reconfirm_password'), 
    'value', '确认新密码', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_The passwords do not seem to match_password_not_match'), 
    'value', '密码似乎不匹配', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Change Password_your_new_password'), 
    'value', '更改密码', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Old Password_reconfirm_password'), 
    'value', '旧密码', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_New password_password_not_match'), 
    'value', '新密码', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Confirm new password_password_not_match'), 
    'value', '重新确认新密码', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_The passwords do not seem to match_password_not_match'), 
    'value', '密码似乎不匹配', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Save_save_password_btn'), 
    'value', '保存', 0)

