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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Onboarding_Settings Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Clear all textfield')

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_USER SETTINGS_marketplace-name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Configure your profile your delivery methods and how you receive payments_item_details'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PROFILE_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CHANGE_btn_upload'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DISPLAY NAME_display-name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DESCRIPTION_description'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_FIRST NAME_first-name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_LAST NAME_last-name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NOTIFICATION EMAIL_notification-email'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CONTACT NUMBER_contact-number'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_OPENID LOGIN_open-id-login'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SELLER LOCATION_seller_location'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_For each transaction that is made through the marketplace there will be a seller transaction fee of'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESS_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NEW DELIVERY ADDRESS_new-delivery-address'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESSEE FIRST NAME_addressee-first-name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESSEE LAST NAME_addressee-last-name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESS_address'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SELECT COUNTRY_select-country'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_COUNTRY_address-country'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_STATE_address-state'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CITY_address-city'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADD ADDRESS_btn_add'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SAVED ADDRESSES_address-saved'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Next_btn_next (1)'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PAYMENT ACCEPTANCE_tan-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PAYMENT METHOD_payment_method'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Select your preferred payment method_select_payment_method'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_LINK ACCOUNT_btn_link_account'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_VERIFIED_verified'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_This payment method is compulsory_this_method_compulsory'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_No account linked yet_no-account-linked'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_next3'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY METHODS_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY OPTIONS_delivery-txt2'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY SERVICE_delivery-service'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Offer reduced shipping costs to buyers when they buy more than one item from you_delivery-txt2'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_total delivery'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY SERVICE_delivery-service'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SINGLE ITEM DELIVERY (A)_single-item-delivery'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_WITH OTHER ITEM (B)_with-other-item'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_add1'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PICK-UP LOCATION ADDRESS_pick-up-address'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_add1'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SAVE_btn_save'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Are you sure want to delete_popup-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CANCEL_btn_cancel2'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Okay_btn_okay2'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_REMOVE ITEM_popup-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Are you sure want to delete_popup-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CANCEL_btn_cancel2'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Okay_btn_okay2'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Custom Payment_popup-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Back_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ACCOUNT CONFIGURATION_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_Your details entered here will be saved and verified by Omise Money you earn from your sales will be accredited to your bank account directly'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_TYPE_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Tax identification number (optional)_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Corporate_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank  branch code_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank account name_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank account number_tab-title'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

WebUI.comment('Verification highlight textfield')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_USER SETTINGS_marketplace-name'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Configure your profile your delivery methods and how you receive payments_item_details'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PROFILE_tab-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CHANGE_btn_upload'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DISPLAY NAME_display-name'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DESCRIPTION_description'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_FIRST NAME_first-name'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_LAST NAME_last-name'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NOTIFICATION EMAIL_notification-email'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CONTACT NUMBER_contact-number'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_OPENID LOGIN_open-id-login'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SELLER LOCATION_seller_location'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_For each transaction that is made through the marketplace there will be a seller transaction fee of'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESS_tab-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NEW DELIVERY ADDRESS_new-delivery-address'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESSEE FIRST NAME_addressee-first-name'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESSEE LAST NAME_addressee-last-name'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESS_address'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SELECT COUNTRY_select-country'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_COUNTRY_address-country'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_STATE_address-state'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CITY_address-city'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADD ADDRESS_btn_add'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SAVED ADDRESSES_address-saved'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Next_btn_next (1)'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PAYMENT ACCEPTANCE_tan-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PAYMENT METHOD_payment_method'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Select your preferred payment method_select_payment_method'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_LINK ACCOUNT_btn_link_account'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_VERIFIED_verified'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_This payment method is compulsory_this_method_compulsory'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_No account linked yet_no-account-linked'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_next3'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY METHODS_tab-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY OPTIONS_delivery-txt2'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY SERVICE_delivery-service'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Offer reduced shipping costs to buyers when they buy more than one item from you_delivery-txt2'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_total delivery'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY SERVICE_delivery-service'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SINGLE ITEM DELIVERY (A)_single-item-delivery'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_WITH OTHER ITEM (B)_with-other-item'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_add1'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PICK-UP LOCATION ADDRESS_pick-up-address'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_add1'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SAVE_btn_save'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Are you sure want to delete_popup-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CANCEL_btn_cancel2'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Okay_btn_okay2'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_REMOVE ITEM_popup-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Are you sure want to delete_popup-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CANCEL_btn_cancel2'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Okay_btn_okay2'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Custom Payment_popup-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Back_tab-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ACCOUNT CONFIGURATION_tab-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_Your details entered here will be saved and verified by Omise Money you earn from your sales will be accredited to your bank account directly'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_TYPE_tab-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Tax identification number (optional)_tab-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Corporate_tab-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank  branch code_tab-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank account name_tab-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank account number_tab-title'), 'class', 'form-control error-con', 0)

