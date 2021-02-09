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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Chinese (Simplified)', 
    false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY SETTINGS_DELIVERY_SETTINGS'), 
    'value', '交货设置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY SETTINGS_Add_delivery_or_pickup option'), 
    'value', '为买家添加送货和/或提货选项。所有交付选项必须由重量或价格定义', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTIONS_DELIVERY_OPTIONS'), 
    'value', '交付选项', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Add Delivery Options_select_delivery_method'), 
    'value', '添加交付选项', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name'), 
    'value', '名称', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERS TO_DELIVERS_TO'), 
    'value', '交付给', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_PICK-UP OPTIONS_PICK-UP_OPTIONS'), 
    'value', '拾取选项', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Add Pick-up Options_Add_Pick-up_Options'), 
    'value', '添加提货选项', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the full address where the buyer can pick up from_delivery_desc_used'), 
    'value', '定义买家可以从中获取的完整地址', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivers to_Delivers_to (1)'), 
    'value', '交付给', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Shipping rate by_Shipping_rate_by'), 
    'value', '运费由', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivering from_Delivering_from'), 
    'value', '交付', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery rates(s)_Shipping_rate_by'), 
    'value', '运费由', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name1'), 
    'value', '名称', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Range_Range'), 
    'value', '范围', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Cost_Delivery_Cost'), 
    'value', '送货费用', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Okay_Range'), 
    'value', '好的', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Yes'), 'value', 
    '是', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_No'), 'value', 
    '没有', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_ADDEDIT DELIVERY OPTION_Add_edit_delivery_option'), 
    'value', '添加/编辑投放选项', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the locations available and the rates for the delivery option_Define_the_locations_available_and_the_rates_for_the_delivery_option'), 
    'value', '定义可用位置和交付选项的费率', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Remove Item_popup-title'), 
    'value', '除去项目', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/textarea_You sure about removing this item from your list (Itll be gone forever)'), 
    'value', '您确定要从列表中删除该项目吗？ （它将永远消失！）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/Remove Item Popup/input_Okay'), 
    'value', '好的', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/Remove Item Popup/input_Cancel'), 
    'value', '取消', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_ADDEDIT DELIVERY OPTION_Add_edit_delivery_option'), 
    'value', '添加/编辑投放选项', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the locations available and the rates for the delivery option_Define_the_locations_available_and_the_rates_for_the_delivery_option'), 
    'value', '定义可用位置和交付选项的费率', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTION SETTINGS_DELIVERY_OPTIONS_SETTINGS'), 
    'value', '交货选项设置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTION NAME_DELIVERY_OPTION_NAME'), 
    'value', '交货选项名称', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_delivers to3'), 
    'value', '交付给', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_MINIMUM LEAD TIME_Minimum_lead_time'), 
    'value', '最短交货时间', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_WHERE ARE YOU DELIVERING FROM_Where_are_you_delivering_from'), 
    'value', '你在哪里交付', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Select if you would like to calculate shipping by total order weight or total order price_total_order_weight_or_total_order_price'), 
    'value', '选择是否要按总订单总重量或总订单价格计算运费。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Weight_Weight'), 
    'value', '重量', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Price_Price'), 
    'value', '价钱', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Rate(s)_DelDelivery_Rates'), 
    'value', '交货率', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name1'), 
    'value', '名称', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Range_Range'), 
    'value', '范围', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Cost_Delivery_Cost'), 
    'value', '送货费用', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Onwards_Onwards'), 
    'value', '向前', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Add Delivery Rate_Add_Delivery_Rate'), 
    'value', '添加投放率', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Rate Name (Buyers will not see this)_Delivery_Rate_Name'), 
    'value', '交货率名称（买家不会看到这个）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_To_To'), 
    'value', '至', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Cost_Delivery_Cost'), 
    'value', '送货费用', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Save_Save'), 
    'value', '保存', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Cancel_Cancel'), 
    'value', '取消', 0)

