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

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 'Italian', false)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Google_btn_next'), 
    'value', 'Continua con Google', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Facebook_btn_next'), 
    'value', 'Continua con Facebook', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Google_btn_save'), 
    'value', 'Continua con Google', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Facebook_btn_save'), 
    'value', 'Continua con Facebook', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Your EmailUsername_email_username'), 
    'value', 'Il tuo indirizzo email / username', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Your Password_your_password'), 
    'value', 'La tua password', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Create Account_btn_next'), 
    'value', 'Creare un profilo', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Sign In_btn_next'), 'value', 
    'Registrati', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Forgot Password_forgot_password'), 
    'value', 'Ha dimenticato la password?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Reconfirm Password_reconfirm_password'), 
    'value', 'Riconferma la password', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Notification Email_notif_email'), 
    'value', 'E-mail di notifica', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Already have an Account_already_have_account'), 
    'value', 'Hai già un account?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Whats your email or username_what_email_username'), 
    'value', 'Qual è la tua email o nome utente?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Reset Password_reset_password_btn'), 
    'value', 'Resetta la password', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Sorry We were unable to find an account with that email  username_unable_find_account'), 
    'value', 'Scusate! Non siamo riusciti a trovare un account con tale email / nome utente', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_A recovery email has been sent to the email address associated with this account_recovery_email'), 
    'value', 'Un\'e-mail di recupero è stata inviata all\'indirizzo di posta elettronica associato a questo account.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Back_back'), 'value', 
    'Indietro', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Your New Password_your_new_password'), 
    'value', 'La tua nuova password', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Reconfirm New Password_reconfirm_password'), 
    'value', 'Riconferma nuova password', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_The passwords do not seem to match_password_not_match'), 
    'value', 'Le password non sembrano corrispondere', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Change Password_your_new_password'), 
    'value', 'Cambia la password', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Old Password_reconfirm_password'), 
    'value', 'vecchia password', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_New password_password_not_match'), 
    'value', 'Nuova password', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Confirm new password_password_not_match'), 
    'value', 'Conferma la nuova password', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_The passwords do not seem to match_password_not_match'), 
    'value', 'Le password non sembrano corrispondere', 0)

