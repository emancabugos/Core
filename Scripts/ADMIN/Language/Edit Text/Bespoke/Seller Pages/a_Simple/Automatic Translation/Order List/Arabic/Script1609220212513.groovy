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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Order History Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Arabic', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDERS_item_name'), 
    'value', 'أوامر', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_manage all'), 
    'value', 'إدارة جميع الطلبات التي تم وضعها معك. انقر على أي معرف دفع لعرض تفاصيل الطلب.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Search by Order ID_search-by'), 
    'value', 'البحث حسب معرف الطلب', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_EXPORT CSV_btn_upload'), 
    'value', 'تصدير CSV', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_CHANGE STATUS_btn_upload'), 
    'value', 'تغيير الوضع', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER NO_order-id-txt'), 
    'value', 'رقم الطلب', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_INVOICE NO_invoice-id-txt'), 
    'value', 'رقم الفاتورة', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_TIMESTAMP_timestamp-txt'), 
    'value', 'الطابع الزمني', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER TOTAL_item-txt'), 
    'value', 'الطلب الكلي', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_NO OF ITEM(S)_qty-txt'), 
    'value', 'رقم البند', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_PAYMENT TYPE_delivery-txt'), 
    'value', 'نوع الدفع', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER STATUS_order-status-txt'), 
    'value', 'حالة الطلب', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_REVIEW_review-txt'), 
    'value', 'إعادة النظر', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_PAYMENT STATUS_payment-type-txt'), 
    'value', 'حالة السداد', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_REFUNDED_payment-status-txt'), 
    'value', 'ردها', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Delivery_Delivery'), 
    'value', 'توصيل', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Pick-up_Delivery'), 
    'value', 'امسك', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_New Review_new-review'), 
    'value', 'مراجعة جديدة!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER STATUS CHANGE_order-status-txt'), 
    'value', 'أوردر ستاتوس تشانج', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_you will only'), 
    'value', 'اعتمادا على حالة الطلب وطريقة التسليم، لن تتمكن سوى من تغيير حالات طلب معينة في الوقت نفسه.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Your order(s) selected delivery type is_popup-title2'), 
    'value', 'نوع التسليم المحدد (الأوامر) المحدد هو:', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Your order(s) selected delivery type is_popup-title3'), 
    'value', 'ما سيكون وضع أوامر اخترتها يكون؟', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Change Status_btn_okay'), 
    'value', 'تغيير الوضع', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_EXPORT ORDER_popup-title'), 
    'value', 'طلب تصدير', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Timestamp_popup-title'), 
    'value', 'الطابع الزمني', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Export CSV_btn_okay'), 
    'value', 'تصدير CSV', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_STATUS CHANGED_popup-title'), 
    'value', 'تم تغيير الحالة', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/textarea_The order status for this item has been updated'), 
    'value', 'تم تحديث حالة الطلب لهذا العنصر.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Okay_btn_okay'), 
    'value', 'حسنا', 0)

