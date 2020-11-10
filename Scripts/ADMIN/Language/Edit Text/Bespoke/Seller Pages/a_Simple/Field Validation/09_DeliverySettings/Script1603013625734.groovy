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

WebUI.comment('Clear all textfield')

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY SETTINGS_DELIVERY_SETTINGS'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_ADDEDIT DELIVERY OPTION_Add_edit_delivery_option'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTION NAME_DELIVERY_OPTION_NAME'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERS TO_DELIVERS_TO'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_PICK-UP OPTIONS_PICK-UP_OPTIONS'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the full address where the buyer can pick up from_delivery_desc_used'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivers to_Delivers_to (1)'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Shipping rate by_Shipping_rate_by'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Rate(s)_DelDelivery_Rates'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Range_Range'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Cost_Delivery_Cost'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Okay_Range'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Yes'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_No'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_ADDEDIT DELIVERY OPTION_Add_edit_delivery_option'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the locations available and the rates for the delivery option_Define_the_locations_available_and_the_rates_for_the_delivery_option'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTION SETTINGS_DELIVERY_OPTIONS_SETTINGS'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Remove Item_popup-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/textarea_You sure about removing this item from your list (Itll be gone forever)'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/Remove Item Popup/input_Okay'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/Remove Item Popup/input_Cancel'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_ADDEDIT DELIVERY OPTION_Add_edit_delivery_option'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_delivers to3'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_MINIMUM LEAD TIME_Minimum_lead_time'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_WHERE ARE YOU DELIVERING FROM_Where_are_you_delivering_from'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Select if you would like to calculate shipping by total order weight or total order price_total_order_weight_or_total_order_price'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name1'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Weight_Weight'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_RANGE_Range (1)'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Range_Range'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Price_Price'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery rates(s)_Shipping_rate_by'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY COST_Delivery_Cost (1)'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Onwards_Onwards'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Add Delivery Rate_Add_Delivery_Rate'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Rate Name (Buyers will not see this)_Delivery_Rate_Name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_To_To'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_delivery cost4'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Save_Save'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Cancel_btn_cancel'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

WebUI.comment('Verification highlight textfield')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY SETTINGS_DELIVERY_SETTINGS'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_ADDEDIT DELIVERY OPTION_Add_edit_delivery_option'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTION NAME_DELIVERY_OPTION_NAME'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERS TO_DELIVERS_TO'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_PICK-UP OPTIONS_PICK-UP_OPTIONS'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the full address where the buyer can pick up from_delivery_desc_used'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivers to_Delivers_to (1)'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Shipping rate by_Shipping_rate_by'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Rate(s)_DelDelivery_Rates'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Range_Range'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Cost_Delivery_Cost'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Okay_Range'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Yes'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_No'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_ADDEDIT DELIVERY OPTION_Add_edit_delivery_option'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the locations available and the rates for the delivery option_Define_the_locations_available_and_the_rates_for_the_delivery_option'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTION SETTINGS_DELIVERY_OPTIONS_SETTINGS'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Remove Item_popup-title'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/textarea_You sure about removing this item from your list (Itll be gone forever)'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/Remove Item Popup/input_Okay'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/Remove Item Popup/input_Cancel'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_ADDEDIT DELIVERY OPTION_Add_edit_delivery_option'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_delivers to3'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_MINIMUM LEAD TIME_Minimum_lead_time'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_WHERE ARE YOU DELIVERING FROM_Where_are_you_delivering_from'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Select if you would like to calculate shipping by total order weight or total order price_total_order_weight_or_total_order_price'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name1'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Weight_Weight'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_RANGE_Range (1)'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Range_Range'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Price_Price'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery rates(s)_Shipping_rate_by'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY COST_Delivery_Cost (1)'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Onwards_Onwards'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Add Delivery Rate_Add_Delivery_Rate'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Rate Name (Buyers will not see this)_Delivery_Rate_Name'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_To_To'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_delivery cost4'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Save_Save'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Cancel_btn_cancel'), 'class', 'form-control error-con', 0)

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), 'class', 'form-control error-con', 0)


