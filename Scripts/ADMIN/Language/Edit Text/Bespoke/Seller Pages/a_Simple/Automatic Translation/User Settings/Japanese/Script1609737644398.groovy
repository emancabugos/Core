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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Japanese', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_USER SETTINGS_marketplace-name'), 
    'value', 'ユーザー設定', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Configure your profile your delivery methods and how you receive payments_item_details'), 
    'value', 'あなたのプロフィール、配送方法、お支払い方法を設定してください。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PROFILE_tab-title'), 
    'value', 'プロフィール', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CHANGE_btn_upload'), 
    'value', '変化する', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DISPLAY NAME_display-name'), 
    'value', '表示名', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DESCRIPTION_description'), 
    'value', '説明', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_FIRST NAME_first-name'), 
    'value', 'ファーストネーム', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_LAST NAME_last-name'), 
    'value', '苗字', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NOTIFICATION EMAIL_notification-email'), 
    'value', '通知メール', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CONTACT NUMBER_contact-number'), 
    'value', 'お問い合わせ番号', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_OPENID LOGIN_open-id-login'), 
    'value', 'OPENIDログイン', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SELLER LOCATION_seller_location'), 
    'value', '売り手の場所', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_For each transaction that is made through the marketplace there will be a seller transaction fee of'), 
    'value', 'マーケットプレイスを通じて行われる各取引には、以下の売り手取引手数料があります：', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NEXT_btn_next'), 
    'value', '次', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESS_tab-title'), 
    'value', '住所', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NEW DELIVERY ADDRESS_new-delivery-address'), 
    'value', '新しい配送先住所', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESSEE FIRST NAME_addressee-first-name'), 
    'value', 'アドレッサリー・ファースト・ネーム', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESSEE LAST NAME_addressee-last-name'), 
    'value', '住所の最後の名前', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESS_address'), 
    'value', '住所', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SELECT COUNTRY_select-country'), 
    'value', '国を選択', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_COUNTRY_address-country'), 
    'value', '国', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_STATE_address-state'), 
    'value', '状態', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CITY_address-city'), 
    'value', 'シティ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_POSTAL CODE_address-postalcode'), 
    'value', '郵便番号', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADD ADDRESS_btn_add'), 
    'value', 'アドレスを追加', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SAVED ADDRESSES_address-saved'), 
    'value', '保存されたアドレス', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Next_btn_next (1)'), 
    'value', '次', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PAYMENT ACCEPTANCE_tan-title'), 
    'value', '支払いの受け入れ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PAYMENT METHOD_payment_method'), 
    'value', '支払方法', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Select your preferred payment method_select_payment_method'), 
    'value', 'ご希望のお支払い方法を選択してください。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_LINK ACCOUNT_btn_link_account'), 
    'value', 'アカウントをリンク', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_VERIFIED_verified'), 
    'value', '検証済み', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_This payment method is compulsory_this_method_compulsory'), 
    'value', 'この支払い方法は必須です。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_No account linked yet_no-account-linked'), 
    'value', 'アカウントはまだリンクされていません', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_next3'), 
    'value', '次', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY METHODS_tab-title1'), 
    'value', '配達方法', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY OPTIONS_delivery-option'), 
    'value', '提供オプション', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY OPTIONS_delivery-txt2'), 
    'value', '配送サービスがどのように使用されたか、各オプションの追加料金を定義します。 （少なくとも1つの配送オプションまたはピックアップ場所を選択してください）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Offer reduced shipping costs to buyers when they buy more than one item from you_delivery-txt2'), 
    'value', '購入者が複数のアイテムを購入したときの配送コストを削減します。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_total delivery'), 
    'value', '合計配達=単品配達（Aから最高）個の「他の品目と一緒に」追加料金（各項目ごとにB）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY SERVICE_delivery-service'), 
    'value', '配達サービス', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SINGLE ITEM DELIVERY (A)_single-item-delivery'), 
    'value', '単一品目の配達（A）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_WITH OTHER ITEM (B)_with-other-item'), 
    'value', '他の項目と一緒に（B）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_add1'), 
    'value', '追加', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PICK-UP LOCATIONS_pick-up-option'), 
    'value', 'ピックアップの場所', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_Define the full address where the buyer can pick up from (You must have at least a delivery option or a pick-up location selected)'), 
    'value', '購入者がピックアップできる完全な住所を定義します（少なくとも配送オプションまたはピックアップ場所が選択されている必要があります）。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PICK-UP LOCATION ADDRESS_pick-up-address'), 
    'value', 'ピックアップの住所', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_add1'), 
    'value', '追加', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SAVE_btn_save'), 
    'value', 'セーブ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Are you sure want to delete_popup-title'), 
    'value', '削除してもよろしいですか？', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CANCEL_btn_cancel'), 
    'value', 'キャンセル', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Okay_btn_okay'), 
    'value', 'はい', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_REMOVE ITEM_popup-title'), 
    'value', 'アイテムを削除する', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_concat(Are you sure about removing this item from your list (It  ll be gone forever))_popup-title'), 
    'value', 'この商品をあなたのリストから削除してもよろしいですか？ （それは永遠に消えるだろう！）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CANCEL_btn_cancel2'), 
    'value', 'キャンセル', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Okay_btn_okay2'), 
    'value', 'はい', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Custom Payment_popup-title'), 
    'value', 'This payment method requires offline settlement with the marketplace adminstrator.Please check with them for more details.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Back_tab-title'), 
    'value', 'バック', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ACCOUNT CONFIGURATION_tab-title'), 
    'value', 'アカウント構成', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_Your details entered here will be saved and verified by Omise Money you earn from your sales will be accredited to your bank account directly'), 
    'value', 'ここに入力された詳細はOmiseによって保存され、確認されます。あなたのセールスから得たマネーはあなたの銀行口座に直接認可されます', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_TYPE_tab-title'), 
    'value', 'タイプ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Tax identification number (optional)_tab-title'), 
    'value', '納税識別番号（オプション）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Individual_tab-title'), 
    'value', '個人', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Corporate_tab-title'), 
    'value', 'コーポレート', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank  branch code_tab-title'), 
    'value', '銀行/支店コード', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank account number_tab-title'), 
    'value', '銀行の口座番号', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank account name_tab-title'), 
    'value', '銀行口座名', 0)

