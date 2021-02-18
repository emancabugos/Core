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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Add_Edit Item Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Hindi', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_YOUR ITEMS_item_name'), 
    'value', 'आपके आइटम', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Fill in your item details here_item_details'), 
    'value', 'अपने आइटम विवरण यहां भरें', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Category_category'), 
    'value', 'वर्ग', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Select a Category_category'), 
    'value', 'एक वर्ग का चयन करें', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Name_item_name'), 
    'value', 'वस्तु का नाम', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Price_price'), 
    'value', 'मूल्य', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SELECT ALL_category'), 
    'value', 'सभी का चयन करे', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SELECT NONE_category'), 
    'value', 'किसी का चयन न करें', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Description_item_description'), 
    'value', 'वस्तु वर्णन', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ITEM COVER IMAGE_item_cover_image'), 
    'value', 'आइटम कवर छवि', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ITEM COVER IMAGE_item_cover_details'), 
    'value', 'अधिकतम 5 छवियाँ 1: 1 के अनुपात में होनी चाहिए और अब 2MB (अनुशंसित 600px x 600px)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_BROWSE_browse_btn'), 
    'value', 'ब्राउज़', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Quantity_quantity'), 
    'value', 'मात्रा', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Unlimited Stock_unlimited_stock'), 
    'value', 'असीमित स्टॉक', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_YES_yes-txt'), 
    'value', 'हाँ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_NO_no-txt'), 
    'value', 'नहीं', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Variants_variants'), 
    'value', 'वेरिएंट', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Variant(s)_variant_s'), 
    'value', 'संस्करण (रों)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add up to 3 different available options for the item eg  Colour Size and Material_item_addUpto3Variants'), 
    'value', 'आइटम, ई, जी के लिए 3 अलग-अलग उपलब्ध विकल्पों को जोड़ें। रंग, आकार, और सामग्री', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Change_variants-change'), 
    'value', 'परिवर्तन', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Okay_variants-change'), 
    'value', 'ठीक है', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Cancel_variants-change'), 
    'value', 'रद्द करना', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add Variants_variants_btn'), 
    'value', 'वेरिएंट जोड़ें', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_VARIANTS OPTIONS_option_name'), 
    'value', 'वैरिएंट विकल्प', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_VARIANTS CHOICES_option_choices'), 
    'value', 'वैरिएंट चॉइस', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_eg Colour_place_egcolour'), 
    'value', 'जैसे रंग', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_eg Red_place_option'), 
    'value', 'जैसे लाल', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Color_place_colour'), 
    'value', 'रंग', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Red_place_option'), 
    'value', 'लाल', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Image_tbl_lbe_img'), 
    'value', 'छवि', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Same Image_tbl_lbe_same_img'), 
    'value', 'एक ही छवि', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Surcharge_tbl_lbe_surcharge'), 
    'value', 'अधिभार', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Total Price_tbl_lbe_price'), 
    'value', 'कुल कीमत', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Stock_tbl_lbe_stock'), 
    'value', 'स्टॉक', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Unlimited_tbl_lbe_unlimited'), 
    'value', 'असीमित', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY OPTIONS_delivery_options'), 
    'value', 'वितरण विकल्प', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY OPTIONS_delivery-txt2'), 
    'value', 'निर्धारित करें कि किस वितरण सेवा का उपयोग किया जाता है और प्रत्येक विकल्प के लिए अधिभार (कम से कम एक डिलीवरी विकल्प या पिकअप स्थान चुनें)', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Offer reduced shipping costs to buyers when they buy more than one item from you_delivery-txt2'), 
    'value', 'प्रस्ताव खरीदारों के लिए शिपिंग लागत कम जब वे आप से एक से अधिक आइटम खरीदते हैं!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_total delivery'), 
    'value', 'कुल डिलीवरी = एकल आइटम वितरण (ए से उच्चतम) व्यक्ति \'अन्य मद के साथ\' अधिभार (प्रत्येक आइटम के लिए बी)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY SERVICE_delivery_service'), 
    'value', 'वितरण सेवा', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SINGLE ITEM DELIVERY (A)_delivery_surchrge'), 
    'value', 'एकल आइटम डिलीवरी (ए)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SINGLE ITEM (A)_additional_item'), 
    'value', 'एकमात्र आइटम (ए)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_WITH OTHER ITEM (B)_additional_item'), 
    'value', 'अन्य आइटम के साथ (बी)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ADD NEW_btn_add_new'), 
    'value', 'नया जोड़ें', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_PICK-UP LOCATION_location_service'), 
    'value', 'उठाने की जगह', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/textarea_Please provide the address where the item may be collected by the buyer(You must select at least one delivery option or pickup location)'), 
    'value', 'पूरा पता परिभाषित करें जहां खरीदार उठा सकता है (आपके पास कम से कम एक डिलीवरी विकल्प या पिक-अप स्थान चयनित होना चाहिए।)', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_PICKUP LOCATION ADDRESS_location_address'), 
    'value', 'पिकअप स्थान का पता लगाएं', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_add new 2'), 
    'value', 'नया जोड़ें', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SAVE_btn_save'), 
    'value', 'बचाना', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Saved_popup-title'), 
    'value', 'आइटम सहेजा गया!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_This item has been saved in_popup-title2'), 
    'value', 'इस मद में सहेजा गया है', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_The default language of the buyer pages is_popup-title2'), 
    'value', 'क्रेता पृष्ठों की डिफ़ॉल्ट भाषा है', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_We recommend you at least add a translation in that language_popup-title2'), 
    'value', 'हम आपको कम से कम उस भाषा में एक अनुवाद जोड़ने की सलाह देते हैं!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_concat(I  ll do it later)_btn_okay'), 
    'value', 'मैं इसे बाद में करूंगा!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add Translations_btn_okay'), 
    'value', 'अनुवाद जोड़ें', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Edit Translations_btn_okay'), 
    'value', 'अनुवाद संपादित करें', 0)

