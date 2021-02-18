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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Japanese', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Google_btn_next'), 
    'value', 'Googleを続ける', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Facebook_btn_next'), 
    'value', 'Facebookで続ける', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Google_btn_save'), 
    'value', 'Googleを続ける', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Facebook_btn_save'), 
    'value', 'Facebookで続ける', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Your EmailUsername_email_username'), 
    'value', 'あなたのメールアドレス/ユーザー名', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Your Password_your_password'), 
    'value', 'あなたのパスワード', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Create Account_btn_next'), 
    'value', 'アカウントを作成する', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Sign In_btn_next'), 'value', 
    'サインイン', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Forgot Password_forgot_password'), 
    'value', 'パスワードをお忘れですか？', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Reconfirm Password_reconfirm_password'), 
    'value', 'パスワードを再確認する', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Notification Email_notif_email'), 
    'value', '通知メール', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Already have an Account_already_have_account'), 
    'value', 'すでにアカウントをお持ちですか？', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Whats your email or username_what_email_username'), 
    'value', 'あなたのメールアドレスまたはユーザー名は何ですか？', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Reset Password_reset_password_btn'), 
    'value', 'パスワードを再設定する', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Sorry We were unable to find an account with that email  username_unable_find_account'), 
    'value', 'ごめんなさい！そのメール/ユーザー名でアカウントを見つけることができませんでした', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_A recovery email has been sent to the email address associated with this account_recovery_email'), 
    'value', 'このアカウントに関連付けられたメールアドレスに予備のメールが送信されました。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Back_back'), 'value', 
    'バック', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Your New Password_your_new_password'), 
    'value', 'あなたの新しいパスワード', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Reconfirm New Password_reconfirm_password'), 
    'value', '新しいパスワードを確認', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_The passwords do not seem to match_password_not_match'), 
    'value', 'パスワードが一致していないようです', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Change Password_your_new_password'), 
    'value', 'パスワードを変更する', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Old Password_reconfirm_password'), 
    'value', '以前のパスワード', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_New password_password_not_match'), 
    'value', '新しいパスワード', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Confirm new password_password_not_match'), 
    'value', '新しいパスワードを再確認する', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_The passwords do not seem to match_password_not_match'), 
    'value', 'パスワードが一致していないようです', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Save_save_password_btn'), 
    'value', 'セーブ', 0)

