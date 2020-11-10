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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Italian', false)

WebUI.delay(2)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_USER SETTINGS_marketplace-name'), 
    'value', 'IMPOSTAZIONI UTENTE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_Configure your profile and your settings here_item_details'), 
    'value', 'Configurare qui il tuo profilo e le tue impostazioni.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_PROFILE_tab-title'), 
    'value', 'PROFILO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_CHANGE_btn_upload'), 
    'value', 'MODIFICARE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_DISPLAY NAME_display-name'), 
    'value', 'NOME DA VISUALIZZARE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_FIRST NAME_first-name'), 
    'value', 'NOME DI BATTESIMO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_LAST NAME_last-name'), 
    'value', 'COGNOME', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_NOTIFICATION EMAIL_notification-email'), 
    'value', 'EMAIL DI NOTIFICA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_CONTACT NUMBER_contact-number'), 
    'value', 'NUMERO DI CONTATTO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_OPENID LOGIN_open-id-login'), 
    'value', 'LOGIN OPENID', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_NEXT_btn_next'), 
    'value', 'IL PROSSIMO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_ADDRESS_tab-title'), 
    'value', 'INDIRIZZO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_NEW DELIVERY ADDRESS_new-delivery-address'), 
    'value', 'NUOVO INDIRIZZO DI CONSEGNA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_ADDRESSEE FIRST NAME_addressee-first-name'), 
    'value', 'ADDRESSEE PRIMO NOME', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_ADDRESSEE LAST NAME_addressee-last-name'), 
    'value', 'NOME ultimo dell\'indirizzo ADDRESSEE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_ADDRESS_address'), 
    'value', 'INDIRIZZO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_COUNTRY_address-country'), 
    'value', 'NAZIONE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_State_address-state'), 
    'value', 'STATO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_CITY_address-city'), 
    'value', 'CITTÀ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_POSTAL CODE_address-postalcode'), 
    'value', 'CODICE POSTALE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_SELECT COUNTRY_select-country'), 
    'value', 'SELEZIONA IL PAESE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_Select City'), 
    'value', 'SELECT CITY', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_ADD ADDRESS_btn_add'), 
    'value', 'INDIRIZZO ADD', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_SAVED ADDRESSES_address-saved'), 
    'value', 'INDIRIZZI SALVATI', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_SAVE_btn_next'), 
    'value', 'SALVARE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_Are you sure want to delete_popup-title'), 
    'value', 'Sei sicuro di voler eliminare?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_CANCEL_btn_cancel'), 
    'value', 'ANNULLA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_OK_btn_okay'), 
    'value', 'ok', 0)

