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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Portuguese', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Google_btn_next'), 
    'value', 'Continue com o Google', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Facebook_btn_next'), 
    'value', 'Continue com o Facebook', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Google_btn_save'), 
    'value', 'Continue com o Google', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Facebook_btn_save'), 
    'value', 'Continue com o Facebook', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Your EmailUsername_email_username'), 
    'value', 'Seu e-mail / nome de usuário', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Your Password_your_password'), 
    'value', 'Sua senha', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Create Account_btn_next'), 
    'value', 'Criar Conta em portugues-Brasil', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Sign In_btn_next'), 'value', 
    'Assinar em', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Forgot Password_forgot_password'), 
    'value', 'Esqueceu a senha?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Reconfirm Password_reconfirm_password'), 
    'value', 'Reconfirmar senha', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Notification Email_notif_email'), 
    'value', 'E-mail de notificação', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Already have an Account_already_have_account'), 
    'value', 'já tem uma conta?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Whats your email or username_what_email_username'), 
    'value', 'Qual é o seu email ou nome de usuário', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Reset Password_reset_password_btn'), 
    'value', 'Trocar a senha', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Sorry We were unable to find an account with that email  username_unable_find_account'), 
    'value', 'Desculpa! Não foi possível encontrar uma conta com esse e-mail / nome de usuário', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_A recovery email has been sent to the email address associated with this account_recovery_email'), 
    'value', 'Um e-mail de recuperação foi enviado para o endereço de e-mail associado a esta conta.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Back_back'), 'value', 
    'Costas', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Your New Password_your_new_password'), 
    'value', 'Sua nova senha', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Reconfirm New Password_reconfirm_password'), 
    'value', 'Confirme a nova senha', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_The passwords do not seem to match_password_not_match'), 
    'value', 'As senhas não parecem coincidir', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Change Password_your_new_password'), 
    'value', 'Mudar senha', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Old Password_reconfirm_password'), 
    'value', 'Senha Antiga', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_New password_password_not_match'), 
    'value', 'Nova senha', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Confirm new password_password_not_match'), 
    'value', 'Reconfirmar nova senha', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_The passwords do not seem to match_password_not_match'), 
    'value', 'As senhas não parecem coincidir', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Save_save_password_btn'), 
    'value', 'Salve ', 0)

