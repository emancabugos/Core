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

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Hindi', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_USER SETTINGS_marketplace-name'), 
    'value', 'उपयोगकर्ता सेटिंग', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Configure your profile your delivery methods and how you receive payments_item_details'), 
    'value', 'अपनी प्रोफ़ाइल, अपने वितरण विधियों और आप भुगतान प्राप्त करने के तरीके को कॉन्फ़िगर करें।', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PROFILE_tab-title'), 
    'value', 'शख्सियत', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CHANGE_btn_upload'), 
    'value', 'परिवर्तन', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DISPLAY NAME_display-name'), 
    'value', 'प्रदर्शित होने वाला नाम', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DESCRIPTION_description'), 
    'value', 'विवरण', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_FIRST NAME_first-name'), 
    'value', 'पहला नाम', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_LAST NAME_last-name'), 
    'value', 'अंतिम नाम', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NOTIFICATION EMAIL_notification-email'), 
    'value', 'सूचना ईमेल', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CONTACT NUMBER_contact-number'), 
    'value', 'संपर्क संख्या', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_OPENID LOGIN_open-id-login'), 
    'value', 'OPENID लॉगिन', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SELLER LOCATION_seller_location'), 
    'value', 'विक्रेता स्थान', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_For each transaction that is made through the marketplace there will be a seller transaction fee of'), 
    'value', 'प्रत्येक लेनदेन के लिए जो बाज़ार के माध्यम से किया जाता है, वहाँ एक विक्रेता लेनदेन शुल्क होगा:', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NEXT_btn_next'), 
    'value', 'आगामी', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESS_tab-title'), 
    'value', 'ADDRESS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NEW DELIVERY ADDRESS_new-delivery-address'), 
    'value', 'नया डिलीवरी पता', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESSEE FIRST NAME_addressee-first-name'), 
    'value', 'पहले नाम दें ADSRESSEE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESSEE LAST NAME_addressee-last-name'), 
    'value', 'एड्रेसिज अंतिम नाम', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESS_address'), 
    'value', 'ADDRESS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SELECT COUNTRY_select-country'), 
    'value', 'देश चुनिए', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_COUNTRY_address-country'), 
    'value', 'देश', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_STATE_address-state'), 
    'value', 'राज्य', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CITY_address-city'), 
    'value', 'शहर', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_POSTAL CODE_address-postalcode'), 
    'value', 'डाक कोड', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADD ADDRESS_btn_add'), 
    'value', 'पता जोड़ें', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SAVED ADDRESSES_address-saved'), 
    'value', 'सहेजे गए पते', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Next_btn_next (1)'), 
    'value', 'आगामी', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PAYMENT ACCEPTANCE_tan-title'), 
    'value', 'भुगतान स्वीकृति', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PAYMENT METHOD_payment_method'), 
    'value', 'भुगतान का तरीका', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Select your preferred payment method_select_payment_method'), 
    'value', 'अपनी पसंदीदा भुगतान विधि का चयन करें', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_LINK ACCOUNT_btn_link_account'), 
    'value', 'खाते लिंक करें', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_VERIFIED_verified'), 
    'value', 'सत्यापित', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_This payment method is compulsory_this_method_compulsory'), 
    'value', 'यह भुगतान विधि अनिवार्य है।', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_No account linked yet_no-account-linked'), 
    'value', 'अभी तक कोई खाता लिंक नहीं है', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_next3'), 
    'value', 'आगामी', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY METHODS_tab-title1'), 
    'value', 'वितरण विधियाँ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY OPTIONS_delivery-option'), 
    'value', 'वितरण विकल्प', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY OPTIONS_delivery-txt2'), 
    'value', 'निर्धारित करें कि किस वितरण सेवा का उपयोग किया जाता है और प्रत्येक विकल्प के लिए अधिभार (कम से कम एक डिलीवरी विकल्प या पिकअप स्थान चुनें)', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Offer reduced shipping costs to buyers when they buy more than one item from you_delivery-txt2'), 
    'value', 'प्रस्ताव खरीदारों के लिए शिपिंग लागत कम जब वे आप से एक से अधिक आइटम खरीदते हैं!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_total delivery'), 
    'value', 'कुल डिलीवरी = एकल आइटम वितरण (ए से उच्चतम) व्यक्ति \'अन्य मद के साथ\' अधिभार (प्रत्येक आइटम के लिए बी)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY SERVICE_delivery-service'), 
    'value', 'वितरण सेवा', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SINGLE ITEM DELIVERY (A)_single-item-delivery'), 
    'value', 'एकल आइटम डिलीवरी (ए)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_WITH OTHER ITEM (B)_with-other-item'), 
    'value', 'अन्य आइटम के साथ (बी)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_add1'), 
    'value', 'जोड़ें', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PICK-UP LOCATIONS_pick-up-option'), 
    'value', 'पिक-अप स्थानों', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_Define the full address where the buyer can pick up from (You must have at least a delivery option or a pick-up location selected)'), 
    'value', 'पूरा पता परिभाषित करें जहां खरीदार उठा सकता है (आपके पास कम से कम एक डिलीवरी विकल्प या पिक-अप स्थान चयनित होना चाहिए।)', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PICK-UP LOCATION ADDRESS_pick-up-address'), 
    'value', 'चेक-अप स्थान का पता लगाएं', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_add1'), 
    'value', 'जोड़ें', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SAVE_btn_save'), 
    'value', 'बचाना', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Are you sure want to delete_popup-title'), 
    'value', 'क्या आप वाकई हटाना चाहते हैं?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CANCEL_btn_cancel'), 
    'value', 'रद्द करना', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Okay_btn_okay'), 
    'value', 'ठीक है', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_REMOVE ITEM_popup-title'), 
    'value', 'वस्तु निकालो', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_concat(Are you sure about removing this item from your list (It  ll be gone forever))_popup-title'), 
    'value', 'क्या आप इस सूची को अपनी सूची से निकालने के बारे में सुनिश्चित हैं? (यह हमेशा के लिए चलेगा!)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CANCEL_btn_cancel2'), 
    'value', 'रद्द करना', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Okay_btn_okay2'), 
    'value', 'ठीक है', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Custom Payment_popup-title'), 
    'value', 'This payment method requires offline settlement with the marketplace adminstrator.Please check with them for more details.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Back_tab-title'), 
    'value', 'वापस', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ACCOUNT CONFIGURATION_tab-title'), 
    'value', 'खाता कॉन्फ़िगरेशन', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_Your details entered here will be saved and verified by Omise Money you earn from your sales will be accredited to your bank account directly'), 
    'value', 'आपके विवरण यहां दर्ज किए गए हैं और Omise द्वारा सत्यापित किया जाएगा। आपकी बिक्री से कमाई जाने वाली धनराशि सीधे आपके बैंक खाते में मान्यता प्राप्त होगी', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_TYPE_tab-title'), 
    'value', 'प्रकार', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Tax identification number (optional)_tab-title'), 
    'value', 'कर पहचान संख्या (वैकल्पिक)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Individual_tab-title'), 
    'value', 'व्यक्ति', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Corporate_tab-title'), 
    'value', 'कॉर्पोरेट', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank  branch code_tab-title'), 
    'value', 'बैंक / शाखा कोड', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank account number_tab-title'), 
    'value', 'बैंक खाता संख्या', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank account name_tab-title'), 
    'value', 'बैंक खाता नाम', 0)

