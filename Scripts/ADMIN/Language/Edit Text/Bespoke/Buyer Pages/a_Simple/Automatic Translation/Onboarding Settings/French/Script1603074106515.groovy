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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'French', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_USER SETTINGS_marketplace-name'), 
    'value', 'PARAMÈTRES UTILISATEUR', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_Configure your profile and your settings here_item_details'), 
    'value', 'Configurez votre profil et vos paramètres ici.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_PROFILE_tab-title'), 
    'value', 'PROFIL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_CHANGE_btn_upload'), 
    'value', 'CHANGEMENT', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_DISPLAY NAME_display-name'), 
    'value', 'AFFICHER UN NOM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_FIRST NAME_first-name'), 
    'value', 'PRÉNOM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_LAST NAME_last-name'), 
    'value', 'NOM DE FAMILLE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_NOTIFICATION EMAIL_notification-email'), 
    'value', 'NOTIFICATION EMAIL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_CONTACT NUMBER_contact-number'), 
    'value', 'NUMÉRO DE CONTACT', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_OPENID LOGIN_open-id-login'), 
    'value', 'LOGEN LOGEN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_NEXT_btn_next'), 
    'value', 'PROCHAIN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_ADDRESS_tab-title'), 
    'value', 'ADRESSE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_NEW DELIVERY ADDRESS_new-delivery-address'), 
    'value', 'NOUVELLE ADRESSE DE LIVRAISON', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_ADDRESSEE FIRST NAME_addressee-first-name'), 
    'value', 'ADRESSE PREMIER NOM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_ADDRESSEE LAST NAME_addressee-last-name'), 
    'value', 'ADRESSE DERNIÈRE NOM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_ADDRESS_address'), 
    'value', 'ADRESSE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_COUNTRY_address-country'), 
    'value', 'PAYS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_State_address-state'), 
    'value', 'ETAT', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_CITY_address-city'), 
    'value', 'VILLE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_POSTAL CODE_address-postalcode'), 
    'value', 'CODE POSTAL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_SELECT COUNTRY_select-country'), 
    'value', 'SÉLECTIONNER LE PAYS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_Select City'), 
    'value', 'SELECT CITY', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_ADD ADDRESS_btn_add'), 
    'value', 'AJOUTEZ L\'ADRESSE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_SAVED ADDRESSES_address-saved'), 
    'value', 'ADRESSES SAUVE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_SAVE_btn_next'), 
    'value', 'ENREGISTRER', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_Are you sure want to delete_popup-title'), 
    'value', 'Êtes-vous sûr de vouloir supprimer?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_CANCEL_btn_cancel'), 
    'value', 'ANNULER', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_OK_btn_okay'), 
    'value', 'D\'accord', 0)

