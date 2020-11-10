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

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_USER SETTINGS_marketplace-name'), 
    'value', 'USER SETTINGS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_Configure your profile and your settings here_item_details'), 
    'value', 'Configure your profile and your settings here.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_PROFILE_tab-title'), 
    'value', 'PROFILE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_CHANGE_btn_upload'), 
    'value', 'CHANGE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_DISPLAY NAME_display-name'), 
    'value', 'DISPLAY NAME', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_FIRST NAME_first-name'), 
    'value', 'FIRST NAME', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_LAST NAME_last-name'), 
    'value', 'LAST NAME', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_NOTIFICATION EMAIL_notification-email'), 
    'value', 'NOTIFICATION EMAIL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_CONTACT NUMBER_contact-number'), 
    'value', 'CONTACT NUMBER', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_OPENID LOGIN_open-id-login'), 
    'value', 'OPENID LOGIN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_NEXT_btn_next'), 
    'value', 'NEXT', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_ADDRESS_tab-title'), 
    'value', 'ADDRESS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_NEW DELIVERY ADDRESS_new-delivery-address'), 
    'value', 'NEW DELIVERY ADDRESS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_ADDRESSEE FIRST NAME_addressee-first-name'), 
    'value', 'ADDRESSEE FIRST NAME', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_ADDRESSEE LAST NAME_addressee-last-name'), 
    'value', 'ADDRESSEE LAST NAME', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_ADDRESS_address'), 
    'value', 'ADDRESS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_COUNTRY_address-country'), 
    'value', 'COUNTRY', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_State_address-state'), 
    'value', 'STATE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_CITY_address-city'), 
    'value', 'CITY', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_POSTAL CODE_address-postalcode'), 
    'value', 'POSTAL CODE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_SELECT COUNTRY_select-country'), 
    'value', 'SELECT COUNTRY', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_Select City'), 
    'value', 'SELECT CITY', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_ADD ADDRESS_btn_add'), 
    'value', 'ADD ADDRESS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_SAVED ADDRESSES_address-saved'), 
    'value', 'SAVED ADDRESSES', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_SAVE_btn_next'), 
    'value', 'SAVE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_Are you sure want to delete_popup-title'), 
    'value', 'Are you sure want to delete?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_CANCEL_btn_cancel'), 
    'value', 'CANCEL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Onboarding_Settings/input_OK_btn_okay'), 
    'value', 'OK', 0)

