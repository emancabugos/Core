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

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Positive Feedback_item-feedbak'), 
    'value', 'Positive Feedback', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_ADD TO CART_1'), 
    'value', 'ADD TO CART', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Quantity_item-qty'), 
    'value', 'Quantity', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Only_item-one'), 
    'value', 'Only', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_left_item-left'), 
    'value', 'left!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Out of Stock_text-stock'), 
    'value', 'Out of Stock!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Description_text-description'), 
    'value', 'Description', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Show More_text-show-more'), 
    'value', 'Show More', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Show Less_text-show-less'), 
    'value', 'Show Less', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Choose a delivery method later_text-deliver-method'), 
    'value', 'Choose a delivery method later', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Delivery_text-delivery'), 
    'value', 'Delivery', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Pick-Up_text-pickup'), 
    'value', 'Pick-Up', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Contact Seller_btn_add_cart'), 
    'value', 'Contact seller', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_ADD TO CART_2'), 
    'value', 'ADD TO CART', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_THIS ITEM HAS BEEN ADDED_item-has-been-added'), 
    'value', 'THIS ITEM HAS BEEN ADDED!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_VIEW CART_btn_view_cart'), 
    'value', 'VIEW CART', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Reviews_reviews'), 
    'value', 'Reviews', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Rating Summary_rating-summary'), 
    'value', 'Rating Summary', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Positive Feedback_positive-feedback'), 
    'value', 'Positive Feedback', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Excellent_excellent'), 
    'value', 'Excellent!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Great_great'), 
    'value', 'Great!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Good_good'), 'value', 
    'Good.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Okay_ok'), 'value', 
    'Okay.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Unsatisfied_Unsatisfied'), 
    'value', 'Unsatisfied', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Reply from_reply-from'), 
    'value', 'Reply from', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Reply_btn_view_cart'), 
    'value', 'Reply', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_REPLY TO_reply'), 
    'value', 'REPLY TO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_Leave a comment_leave-comment'), 
    'value', 'Leave a comment...', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Item Details/input_SUBMIT_btn_submit'), 
    'value', 'SUBMIT', 0)

