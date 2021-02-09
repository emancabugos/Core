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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Order Details Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Japanese', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_ORDER ID_order-id-txt'), 
    'value', '注文ID', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_INVOICE ID_invoice-id-txt'), 
    'value', '請求書ID', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_TIMESTAMP_timestamp-txt'), 
    'value', 'タイムスタンプ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_TRANSACTION ID_transaction-id'), 
    'value', 'トランザクションID', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_BUYER INFO_buyer-info-txt'), 
    'value', 'バイヤー情報', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_DELIVERY ADDRESS_delivery-address-txt'), 
    'value', '配送先住所', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_EMAIL_email-txt'), 
    'value', 'Eメール', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_CONTACT_contact-txt'), 
    'value', '接触', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_TRANSACTION TOTAL_transaction-total'), 
    'value', 'トランザクション合計', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Subtotal_subtotal-txt'), 
    'value', '小計', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Delivery_delivery-txt'), 
    'value', '配達', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Admin fee_admin-fee'), 
    'value', '管理費', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_ITEM_item-txt'), 
    'value', '項目', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_PRICE_price-txt'), 
    'value', '価格', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_QTY_qty-txt'), 
    'value', '数量', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_DELIVERY_buyer-info-txt'), 
    'value', '配達', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_ORDER STATUS_order-status-txt'), 
    'value', '注文の状況', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Payment Status_pay-txt'), 
    'value', '支払い状況', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Payment Method_pay-info-txt'), 
    'value', '支払方法', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_REVIEW_review-txt'), 
    'value', 'レビュー', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_New Review_review-txt'), 
    'value', '新しいレビュー！', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Seller Name_Seller'), 
    'value', '販売者名', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_DeliveryPick-up_Delivery'), 
    'value', '配達/ピックアップ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Pick-up_Pick-up'), 
    'value', '拾う', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Delivery From_bulk-delivery-discount'), 
    'value', 'からの配達', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Minimum lead time_bulk-delivery-discount'), 
    'value', '最小リードタイム', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_BACK TO LIST_btn_back'), 
    'value', 'リストに戻る', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_STATUS CHANGED_popup-title'), 
    'value', '状態が変更されました', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/textarea_The order status for this item has been updated'), 
    'value', 'このアイテムの注文状況が更新されました。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order Details/input_Okay_btn_okay'), 
    'value', 'はい', 0)

