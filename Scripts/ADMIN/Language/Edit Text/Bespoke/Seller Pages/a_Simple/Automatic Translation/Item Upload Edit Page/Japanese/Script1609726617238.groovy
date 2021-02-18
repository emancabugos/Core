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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Japanese', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_YOUR ITEMS_item_name'), 
    'value', 'あなたの項目', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Fill in your item details here_item_details'), 
    'value', 'ここにあなたの商品詳細を記入してください', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Category_category'), 
    'value', 'カテゴリー', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Select a Category_category'), 
    'value', 'カテゴリーを選ぶ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Name_item_name'), 
    'value', '項目名', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Price_price'), 
    'value', '価格', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SELECT ALL_category'), 
    'value', 'すべて選択', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SELECT NONE_category'), 
    'value', '選択しない', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Description_item_description'), 
    'value', 'アイテム説明', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ITEM COVER IMAGE_item_cover_image'), 
    'value', 'アイテムカバー画像', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ITEM COVER IMAGE_item_cover_details'), 
    'value', '最大5枚の画像は、1：1の比率で、2MBを超えないようにする必要があります（推奨600px X 600px）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_BROWSE_browse_btn'), 
    'value', 'ブラウズ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Quantity_quantity'), 
    'value', '量', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Unlimited Stock_unlimited_stock'), 
    'value', '無制限在庫', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_YES_yes-txt'), 
    'value', 'はい', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_NO_no-txt'), 
    'value', '番号', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Variants_variants'), 
    'value', 'バリアント', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Variant(s)_variant_s'), 
    'value', 'バリアント', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add up to 3 different available options for the item eg  Colour Size and Material_item_addUpto3Variants'), 
    'value', 'アイテムに使用可能な3つの異なるオプションを追加します（e、g）。色、サイズ、材質', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Change_variants-change'), 
    'value', '変化する', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Okay_variants-change'), 
    'value', 'はい', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Cancel_variants-change'), 
    'value', 'キャンセル', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add Variants_variants_btn'), 
    'value', 'バリアントの追加', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_VARIANTS OPTIONS_option_name'), 
    'value', 'バリアントオプション', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_VARIANTS CHOICES_option_choices'), 
    'value', 'バリエーションの選択', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_eg Colour_place_egcolour'), 
    'value', '例：Color', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_eg Red_place_option'), 
    'value', '例えば赤', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Color_place_colour'), 
    'value', '色', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Red_place_option'), 
    'value', '赤', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Image_tbl_lbe_img'), 
    'value', '画像', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Same Image_tbl_lbe_same_img'), 
    'value', '同じイメージ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Surcharge_tbl_lbe_surcharge'), 
    'value', '追加料金', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Total Price_tbl_lbe_price'), 
    'value', '合計金額', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Stock_tbl_lbe_stock'), 
    'value', '株式', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Unlimited_tbl_lbe_unlimited'), 
    'value', '無制限', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY OPTIONS_delivery_options'), 
    'value', '提供オプション', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY OPTIONS_delivery-txt2'), 
    'value', '配送サービスがどのように使用されたか、各オプションの追加料金を定義します。 （少なくとも1つの配送オプションまたはピックアップ場所を選択してください））', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Offer reduced shipping costs to buyers when they buy more than one item from you_delivery-txt2'), 
    'value', '購入者が複数のアイテムを購入したときの配送コストを削減します。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_total delivery'), 
    'value', '合計配達=単品配達（Aから最高）個の「他の品目と一緒に」追加料金（各項目ごとにB）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_DELIVERY SERVICE_delivery_service'), 
    'value', '配達サービス', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SINGLE ITEM DELIVERY (A)_delivery_surchrge'), 
    'value', '単一品目の配達（A）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SINGLE ITEM (A)_additional_item'), 
    'value', '単一項目（A）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_WITH OTHER ITEM (B)_additional_item'), 
    'value', '他の項目と一緒に（B）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_ADD NEW_btn_add_new'), 
    'value', '新しく追加する', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_PICK-UP LOCATION_location_service'), 
    'value', 'ピックアップの場所', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/textarea_Please provide the address where the item may be collected by the buyer(You must select at least one delivery option or pickup location)'), 
    'value', '購入者がピックアップできる完全な住所を定義します（少なくとも配送オプションまたはピックアップ場所が選択されている必要があります）。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_PICKUP LOCATION ADDRESS_location_address'), 
    'value', 'ピックアップの住所', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_add new 2'), 
    'value', '新しく追加する', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_SAVE_btn_save'), 
    'value', 'セーブ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Item Saved_popup-title'), 
    'value', 'アイテムが保存されました！', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_This item has been saved in_popup-title2'), 
    'value', 'このアイテムはに保存されました', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_The default language of the buyer pages is_popup-title2'), 
    'value', '購入者ページのデフォルト言語は', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_We recommend you at least add a translation in that language_popup-title2'), 
    'value', 'その言語の翻訳を追加することをおすすめします。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_concat(I  ll do it later)_btn_okay'), 
    'value', '私は後でやるよ！', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Add Translations_btn_okay'), 
    'value', '翻訳を追加する', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Add_Edit Item/input_Edit Translations_btn_okay'), 
    'value', '翻訳を編集する', 0)

