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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Chinese (Traditional)', 
    false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_USER SETTINGS_marketplace-name'), 
    'value', '用戶設置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Configure your profile your delivery methods and how you receive payments_item_details'), 
    'value', '配置您的個人資料，您的投放方式以及如何收到付款。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PROFILE_tab-title'), 
    'value', '簡介', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CHANGE_btn_upload'), 
    'value', '更改', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DISPLAY NAME_display-name'), 
    'value', '顯示名稱', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DESCRIPTION_description'), 
    'value', '描述', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_FIRST NAME_first-name'), 
    'value', '名字', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_LAST NAME_last-name'), 
    'value', '姓', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NOTIFICATION EMAIL_notification-email'), 
    'value', '通知電子郵件', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CONTACT NUMBER_contact-number'), 
    'value', '聯繫電話', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_OPENID LOGIN_open-id-login'), 
    'value', 'OPENID登錄', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SELLER LOCATION_seller_location'), 
    'value', '賣家位置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_For each transaction that is made through the marketplace there will be a seller transaction fee of'), 
    'value', '對於通過市場進行的每筆交易，賣方交易費用為：', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NEXT_btn_next'), 
    'value', '下一個', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESS_tab-title'), 
    'value', '地址', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_NEW DELIVERY ADDRESS_new-delivery-address'), 
    'value', '新發貨地址', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESSEE FIRST NAME_addressee-first-name'), 
    'value', '地址第一名', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESSEE LAST NAME_addressee-last-name'), 
    'value', '地址的姓氏', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADDRESS_address'), 
    'value', '地址', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SELECT COUNTRY_select-country'), 
    'value', '選擇國家', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_COUNTRY_address-country'), 
    'value', '國家', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_STATE_address-state'), 
    'value', '州', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CITY_address-city'), 
    'value', '市', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_POSTAL CODE_address-postalcode'), 
    'value', '郵政編碼', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ADD ADDRESS_btn_add'), 
    'value', '添加地址', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SAVED ADDRESSES_address-saved'), 
    'value', '保存地址', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Next_btn_next (1)'), 
    'value', '下一個', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PAYMENT ACCEPTANCE_tan-title'), 
    'value', '付款接受', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PAYMENT METHOD_payment_method'), 
    'value', '付款方法', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Select your preferred payment method_select_payment_method'), 
    'value', '選擇您的首選付款方式。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_LINK ACCOUNT_btn_link_account'), 
    'value', '鏈接帳號', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_VERIFIED_verified'), 
    'value', '驗證', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_This payment method is compulsory_this_method_compulsory'), 
    'value', '這種付款方式是強制性的。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_No account linked yet_no-account-linked'), 
    'value', '沒有帳戶關聯', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_next3'), 
    'value', '下一個', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY METHODS_tab-title1'), 
    'value', '交貨方式', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY OPTIONS_delivery-option'), 
    'value', '交貨方式', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY OPTIONS_delivery-txt2'), 
    'value', '定義每個選項使用什麼送貨服務和附加費。 （選擇至少一個送貨選項或取件位置）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Offer reduced shipping costs to buyers when they buy more than one item from you_delivery-txt2'), 
    'value', '當買家從您那裡購買多個產品時，可以減少運送費用。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_total delivery'), 
    'value', '總交貨=單項交貨（最高從A）個人\'與其他項目\'附加費（每個項目B）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_DELIVERY SERVICE_delivery-service'), 
    'value', '送貨服務', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SINGLE ITEM DELIVERY (A)_single-item-delivery'), 
    'value', '單項交付（一）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_WITH OTHER ITEM (B)_with-other-item'), 
    'value', '與其他項目（B）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_add1'), 
    'value', '加', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PICK-UP LOCATIONS_pick-up-option'), 
    'value', '取景位置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_Define the full address where the buyer can pick up from (You must have at least a delivery option or a pick-up location selected)'), 
    'value', '定義買家可以從中獲取的完整地址（您必須至少選擇一個送貨選項或接收位置。）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_PICK-UP LOCATION ADDRESS_pick-up-address'), 
    'value', '拾取位置地址', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_add1'), 
    'value', '加', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_SAVE_btn_save'), 
    'value', '保存', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Are you sure want to delete_popup-title'), 
    'value', '你確定要刪除嗎？', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CANCEL_btn_cancel'), 
    'value', '取消', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Okay_btn_okay'), 
    'value', '好的', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_REMOVE ITEM_popup-title'), 
    'value', '除去項目', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_concat(Are you sure about removing this item from your list (It  ll be gone forever))_popup-title'), 
    'value', '你確定從你的清單中刪除這個項目嗎？ （它會永遠消失！）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_CANCEL_btn_cancel2'), 
    'value', '取消', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Okay_btn_okay2'), 
    'value', '好的', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Custom Payment_popup-title'), 
    'value', '付款說明', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Back_tab-title'), 
    'value', '背部', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_ACCOUNT CONFIGURATION_tab-title'), 
    'value', '帳戶配置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/textarea_Your details entered here will be saved and verified by Omise Money you earn from your sales will be accredited to your bank account directly'), 
    'value', '您在此處輸入的詳細信息將由Omise保存和驗證。您從銷售中賺取的錢將被直接授權到您的銀行賬戶', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_TYPE_tab-title'), 
    'value', '類型', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Tax identification number (optional)_tab-title'), 
    'value', '稅號（可選）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Individual_tab-title'), 
    'value', '個人', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Corporate_tab-title'), 
    'value', '企業', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank  branch code_tab-title'), 
    'value', '銀行/分行代碼', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank account number_tab-title'), 
    'value', '銀行帳號', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Onboarding_Settings/input_Bank account name_tab-title'), 
    'value', '銀行賬戶名稱', 0)

