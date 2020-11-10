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

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_MY CART_my-cart'), 'value', 
    'MY CART', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_It seems like your cart is empty_my-cart-empty-msg'), 
    'value', 'It seems like your cart is empty', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Start searching and adding_my-cart-start-search-add'), 
    'value', 'Start searching and adding!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_CONTINUE SHOPPING_btn_add_cart'), 
    'value', 'CONTINUE SHOPPING', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_CHECKOUT_btn_add_cart'), 
    'value', 'CHECKOUT', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Select Delivery Option_delivery-option-text'), 
    'value', 'Select Delivery Option:', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Choose one_delivery-start-text'), 
    'value', 'Choose one.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Delivery_delivery-text'), 
    'value', 'Delivery', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Pick-up_pickup-text'), 
    'value', 'Pick-up', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_CHANGE_btn_add_cart'), 
    'value', 'CHANGE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Sold Out_cart-sub-total'), 
    'value', 'Sold Out', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_QTY_cart-qty'), 'value', 
    'QTY', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Sub Total_cart-sub-total'), 
    'value', 'Sub Total', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Delivery Costs_cart-delivery-costs'), 
    'value', 'Delivery Costs', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Bulk Delivery Discount_cart-bulk-delivery-discount'), 
    'value', 'Bulk Delivery Discount', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_TOTAL_cart-total'), 'value', 
    'TOTAL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_REMOVE ITEM_popup-title'), 
    'value', 'REMOVE ITEM', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/textarea_You sure about removing this item from your list (Itll be gone forever)'), 
    'value', 'You sure about removing this item from your list? (It\'ll be gone forever!)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_CANCEL_btn_apply'), 'value', 
    'CANCEL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_OKAY_btn_apply'), 'value', 
    'OKAY', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_DELIVERY METHOD_popup-title'), 
    'value', 'DELIVERY METHOD', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Choose a delivery method later_popup-title2 (1)'), 
    'value', 'Choose a delivery method later', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Delivery_popup-title3'), 
    'value', 'Delivery', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Pick-up_popup-title4'), 
    'value', 'Pick-up', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_Apply_btn_apply 2'), 'value', 
    'Apply', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_the following'), 'value', 
    'THE FOLLOWING ITEMS CAN\'T BE CHECKED OUT YET!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/textarea_Please select a delivery method for each item before checkout If this problem still persists the item may be no longer available ('), 
    'value', 'Please select a delivery method for each item before checkout! If this problem still persists the item may be no longer available! :(', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Cart/input_OKAY_btn_apply - Copy'), 
    'value', 'OKAY', 0)

