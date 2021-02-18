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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Delivery Settings Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Arabic', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY SETTINGS_DELIVERY_SETTINGS'), 
    'value', 'إعدادات التسليم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY SETTINGS_Add_delivery_or_pickup option'), 
    'value', 'أضف خيارات التسليم و / أو البيك اب للمشترين. يجب تحديد جميع خيارات التسليم إما بالوزن أو السعر', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTIONS_DELIVERY_OPTIONS'), 
    'value', 'خيارات التسليم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Add Delivery Options_select_delivery_method'), 
    'value', 'إضافة خيار التسليم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name'), 
    'value', 'اسم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERS TO_DELIVERS_TO'), 
    'value', 'يسلم الى', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_PICK-UP OPTIONS_PICK-UP_OPTIONS'), 
    'value', 'اختيارات المتابعة', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Add Pick-up Options_Add_Pick-up_Options'), 
    'value', 'إضافة خيار البيك اب', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the full address where the buyer can pick up from_delivery_desc_used'), 
    'value', 'تحديد العنوان الكامل حيث يمكن للمشتري التقاط من', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivers to_Delivers_to (1)'), 
    'value', 'يسلم الى', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Shipping rate by_Shipping_rate_by'), 
    'value', 'معدل الشحن بواسطة', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivering from_Delivering_from'), 
    'value', 'تسليم من', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery rates(s)_Shipping_rate_by'), 
    'value', 'معدل الشحن بواسطة', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name1'), 
    'value', 'اسم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Range_Range'), 
    'value', 'نطاق', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Cost_Delivery_Cost'), 
    'value', 'تكلفة التوصيل', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Okay_Range'), 
    'value', 'حسنا', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Yes'), 'value', 
    'نعم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_No'), 'value', 
    'لا', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_ADDEDIT DELIVERY OPTION_Add_edit_delivery_option'), 
    'value', 'إضافة / تحرير خيار التسليم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the locations available and the rates for the delivery option_Define_the_locations_available_and_the_rates_for_the_delivery_option'), 
    'value', 'حدد المواقع المتاحة وأسعار خيار التسليم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Remove Item_popup-title'), 
    'value', 'إزالة بند', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/textarea_You sure about removing this item from your list (Itll be gone forever)'), 
    'value', 'هل أنت متأكد من إزالة هذا العنصر من قائمتك؟ (ستزول إلى الأبد!)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/Remove Item Popup/input_Okay'), 
    'value', 'حسنا', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/Remove Item Popup/input_Cancel'), 
    'value', 'إلغاء', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_ADDEDIT DELIVERY OPTION_Add_edit_delivery_option'), 
    'value', 'إضافة / تحرير خيار التسليم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the locations available and the rates for the delivery option_Define_the_locations_available_and_the_rates_for_the_delivery_option'), 
    'value', 'حدد المواقع المتاحة وأسعار خيار التسليم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTION SETTINGS_DELIVERY_OPTIONS_SETTINGS'), 
    'value', 'إعدادات خيار التسليم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTION NAME_DELIVERY_OPTION_NAME'), 
    'value', 'اسم خيار التسليم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_delivers to3'), 
    'value', 'يسلم الى', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_MINIMUM LEAD TIME_Minimum_lead_time'), 
    'value', 'المهلة الدنيا', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_WHERE ARE YOU DELIVERING FROM_Where_are_you_delivering_from'), 
    'value', 'من اين تاتي من', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Select if you would like to calculate shipping by total order weight or total order price_total_order_weight_or_total_order_price'), 
    'value', 'حدد ما إذا كنت ترغب في حساب الشحن حسب إجمالي وزن الطلب أو إجمالي سعر الطلب.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Weight_Weight'), 
    'value', 'وزن', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Price_Price'), 
    'value', 'السعر', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Rate(s)_DelDelivery_Rates'), 
    'value', 'معدل التسليم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name1'), 
    'value', 'اسم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Range_Range'), 
    'value', 'نطاق', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Cost_Delivery_Cost'), 
    'value', 'تكلفة التوصيل', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Onwards_Onwards'), 
    'value', 'فصاعدا', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Add Delivery Rate_Add_Delivery_Rate'), 
    'value', 'إضافة معدل التسليم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Rate Name (Buyers will not see this)_Delivery_Rate_Name'), 
    'value', 'اسم معدل التسليم (لن يرى المشترون هذا)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_To_To'), 
    'value', 'إلى', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Cost_Delivery_Cost'), 
    'value', 'تكلفة التوصيل', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Save_Save'), 
    'value', 'حفظ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Cancel_Cancel'), 
    'value', 'إلغاء', 0)

