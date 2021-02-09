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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'German', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Google_btn_next'), 
    'value', 'Weiter mit Google', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Facebook_btn_next'), 
    'value', 'Weiter mit Facebook', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Google_btn_save'), 
    'value', 'Weiter mit Google', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Continue with Facebook_btn_save'), 
    'value', 'Weiter mit Facebook', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Your EmailUsername_email_username'), 
    'value', 'Ihre E-Mail / Benutzername', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Your Password_your_password'), 
    'value', 'Ihr Passwort', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Create Account_btn_next'), 
    'value', 'Benutzerkonto anlegen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Sign In_btn_next'), 'value', 
    'Anmelden', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Forgot Password_forgot_password'), 
    'value', 'Passwort vergessen?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Reconfirm Password_reconfirm_password'), 
    'value', 'Passwort bestätigen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Notification Email_notif_email'), 
    'value', 'Benachrichtigungs-E-Mail', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Already have an Account_already_have_account'), 
    'value', 'Hast du schon ein Konto?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Whats your email or username_what_email_username'), 
    'value', 'Was ist Ihre E-Mail oder Benutzername', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Reset Password_reset_password_btn'), 
    'value', 'Passwort zurücksetzen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Sorry We were unable to find an account with that email  username_unable_find_account'), 
    'value', 'Es tut uns leid! Wir konnten kein Konto mit dieser E-Mail / Benutzername finden', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_A recovery email has been sent to the email address associated with this account_recovery_email'), 
    'value', 'Eine E-Mail wurde an die E-Mail-Adresse gesendet, die mit diesem Konto verknüpft ist.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Back_back'), 'value', 
    'Zurück', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Your New Password_your_new_password'), 
    'value', 'Dein neues Passwort', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Reconfirm New Password_reconfirm_password'), 
    'value', 'Bestätige neues Passwort', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_The passwords do not seem to match_password_not_match'), 
    'value', 'Die Passwörter scheinen nicht zu entsprechen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Change Password_your_new_password'), 
    'value', 'Passwort ändern', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Old Password_reconfirm_password'), 
    'value', 'Altes Passwort', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_New password_password_not_match'), 
    'value', 'Neues Kennwort', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Confirm new password_password_not_match'), 
    'value', 'Neues Passwort bestätigen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_The passwords do not seem to match_password_not_match'), 
    'value', 'Die Passwörter scheinen nicht zu entsprechen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Login/input_Save_save_password_btn'), 
    'value', 'sparen', 0)

