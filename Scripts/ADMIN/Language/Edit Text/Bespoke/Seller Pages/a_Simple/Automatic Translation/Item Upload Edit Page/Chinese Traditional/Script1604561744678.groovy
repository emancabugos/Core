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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Chinese (Traditional)', 
    false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_YOUR ITEMS_item_name'), 
    'value', '您的項目', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Fill in your item details here_item_details'), 
    'value', '在這裡填寫您的項目詳細信息', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Category_category'), 
    'value', '類別', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Select a Category_category'), 
    'value', '選擇一個類別', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Name_item_name'), 
    'value', '項目名', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Price_price'), 
    'value', '價錢', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SELECT ALL_category'), 
    'value', '全選', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SELECT NONE_category'), 
    'value', '選擇無', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Description_item_description'), 
    'value', '商品描述', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ITEM COVER IMAGE_item_cover_image'), 
    'value', '項目圖像', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ITEM COVER IMAGE_item_cover_details'), 
    'value', '最多5張圖片的比例應為1：1，不超過2MB（推薦600px X 600px）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_BROWSE_browse_btn'), 
    'value', '瀏覽', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Quantity_quantity'), 
    'value', '數量', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Unlimited Stock_unlimited_stock'), 
    'value', '無限庫存', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_YES_yes-txt'), 
    'value', '是', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_NO_no-txt'), 
    'value', '沒有', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Variants_variants'), 
    'value', '變種', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Variant(s)_variant_s'), 
    'value', '變體（S）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add up to 3 different available options for the item eg  Colour Size and Material_item_addUpto3Variants'), 
    'value', '為項目添加最多3個不同的可用選項，例如。顏色，尺寸和材質', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Change_variants-change'), 
    'value', '更改', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Okay_variants-change'), 
    'value', '好的', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Cancel_variants-change'), 
    'value', '取消', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add Variants_variants_btn'), 
    'value', '添加變體', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_VARIANTS OPTIONS_option_name'), 
    'value', '變體選項', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_VARIANTS CHOICES_option_choices'), 
    'value', '變體選擇', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_eg Colour_place_egcolour'), 
    'value', '例如顏色', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_eg Red_place_option'), 
    'value', '例如紅色', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Color_place_colour'), 
    'value', '顏色', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Red_place_option'), 
    'value', '紅色', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Image_tbl_lbe_img'), 
    'value', '圖片', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Same Image_tbl_lbe_same_img'), 
    'value', '相同的圖像', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Surcharge_tbl_lbe_surcharge'), 
    'value', '附加費', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Total Price_tbl_lbe_price'), 
    'value', '總價', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Stock_tbl_lbe_stock'), 
    'value', '股票', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Unlimited_tbl_lbe_unlimited'), 
    'value', '無限', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY OPTIONS_delivery_options'), 
    'value', '交貨方式', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY OPTIONS_delivery-txt2'), 
    'value', '定義每個選項使用什麼送貨服務和附加費。 （選擇至少一個送貨選項或取貨地點））', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Offer reduced shipping costs to buyers when they buy more than one item from you_delivery-txt2'), 
    'value', '當買家從您那裡購買多個產品時，可以減少運送費用。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_total delivery'), 
    'value', '總交貨=單項交貨（最高從A）個人\'與其他項目\'附加費（每個項目B）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY SERVICE_delivery_service'), 
    'value', '送貨服務', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SINGLE ITEM DELIVERY (A)_delivery_surchrge'), 
    'value', '單項交付（一）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SINGLE ITEM (A)_additional_item'), 
    'value', '單項（A）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_WITH OTHER ITEM (B)_additional_item'), 
    'value', '與其他項目（B）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ADD NEW_btn_add_new'), 
    'value', '添新', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_PICK-UP LOCATION_location_service'), 
    'value', '接人的地方', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/textarea_Please provide the address where the item may be collected by the buyer(You must select at least one delivery option or pickup location)'), 
    'value', '定義買家可以從中獲取的完整地址（您必須至少選擇一個送貨選項或接收位置。）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_PICKUP LOCATION ADDRESS_location_address'), 
    'value', '扒貨位置地址', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_add new 2'), 
    'value', '添新', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SAVE_btn_save'), 
    'value', '保存', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Saved_popup-title'), 
    'value', '項目已保存！', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_This item has been saved in_popup-title2'), 
    'value', '此項目已保存', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_The default language of the buyer pages is_popup-title2'), 
    'value', '買方頁面的默認語言是', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_We recommend you at least add a translation in that language_popup-title2'), 
    'value', '我們建議您至少添加該語言的翻譯！', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_concat(I  ll do it later)_btn_okay'), 
    'value', '我會晚點做', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add Translations_btn_okay'), 
    'value', '添加翻譯', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Edit Translations_btn_okay'), 
    'value', '編輯翻譯', 0)

