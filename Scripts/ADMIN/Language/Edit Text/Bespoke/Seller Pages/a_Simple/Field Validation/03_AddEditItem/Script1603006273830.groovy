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

WebUI.comment('Clear all textfield')

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SELECT NONE_category'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SELECT ALL_category'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Description_item_description'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ITEM COVER IMAGE_item_cover_image'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_BROWSE_browse_btn'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Quantity_quantity'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Unlimited Stock_unlimited_stock'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_YES_yes-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_NO_no-txt'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Variant(s)_variant_s'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add up to 3 different available options for the item eg  Colour Size and Material_item_addUpto3Variants'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Okay_variants-change'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Cancel_variants-change'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add Variants_variants_btn'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_VARIANTS OPTIONS_option_name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_eg Colour_place_egcolour'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_eg Red_place_option'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Image_tbl_lbe_img'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Same Image_tbl_lbe_same_img'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Surcharge_tbl_lbe_surcharge'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Total Price_tbl_lbe_price'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Stock_tbl_lbe_stock'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Unlimited Stock_unlimited_stock'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY OPTIONS_delivery_options'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/textarea_Please provide the address where the item may be collected by the buyer(You must select at least one delivery option or pickup location)'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Offer reduced shipping costs to buyers when they buy more than one item from you_delivery-txt2'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_total delivery'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY SERVICE_delivery_service'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SINGLE ITEM DELIVERY (A)_delivery_surchrge'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SINGLE ITEM (A)_additional_item'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_WITH OTHER ITEM (B)_additional_item'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ADD NEW_btn_add_new'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_PICK-UP LOCATION_location_service'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_add new 2'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SAVE_btn_save'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Saved_popup-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_This item has been saved in_popup-title2'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_The default language of the buyer pages is_popup-title2'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_We recommend you at least add a translation in that language_popup-title2'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_concat(I  ll do it later)_btn_okay'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add Translations_btn_okay'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Edit Translations_btn_okay'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_YOUR ITEMS_item_name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Category_category'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Select a Category_category'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Name_item_name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Price_price'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SELECT ALL_category'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

WebUI.comment('Verification highlight textfield')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SELECT NONE_category'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SELECT ALL_category'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Description_item_description'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ITEM COVER IMAGE_item_cover_image'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_BROWSE_browse_btn'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Quantity_quantity'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Unlimited Stock_unlimited_stock'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_YES_yes-txt'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_NO_no-txt'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Variant(s)_variant_s'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add up to 3 different available options for the item eg  Colour Size and Material_item_addUpto3Variants'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Okay_variants-change'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Cancel_variants-change'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add Variants_variants_btn'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_VARIANTS OPTIONS_option_name'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_eg Colour_place_egcolour'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_eg Red_place_option'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Image_tbl_lbe_img'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Same Image_tbl_lbe_same_img'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Surcharge_tbl_lbe_surcharge'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Total Price_tbl_lbe_price'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Stock_tbl_lbe_stock'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Unlimited Stock_unlimited_stock'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY OPTIONS_delivery_options'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/textarea_Please provide the address where the item may be collected by the buyer(You must select at least one delivery option or pickup location)'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Offer reduced shipping costs to buyers when they buy more than one item from you_delivery-txt2'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_total delivery'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY SERVICE_delivery_service'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SINGLE ITEM DELIVERY (A)_delivery_surchrge'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SINGLE ITEM (A)_additional_item'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_WITH OTHER ITEM (B)_additional_item'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ADD NEW_btn_add_new'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_PICK-UP LOCATION_location_service'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_add new 2'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SAVE_btn_save'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Saved_popup-title'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_This item has been saved in_popup-title2'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_The default language of the buyer pages is_popup-title2'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_We recommend you at least add a translation in that language_popup-title2'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_concat(I  ll do it later)_btn_okay'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add Translations_btn_okay'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Edit Translations_btn_okay'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_YOUR ITEMS_item_name'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Category_category'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Select a Category_category'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Name_item_name'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Price_price'),
	'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SELECT ALL_category'),
	'class', 'form-control error-con', 0)



