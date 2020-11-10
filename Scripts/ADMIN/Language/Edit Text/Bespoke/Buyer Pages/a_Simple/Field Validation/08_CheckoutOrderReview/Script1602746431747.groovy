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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Buyer Pages/Checkout Review Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Clear all textfield')

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Payment/input_DELIVERY_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Payment/input_PAY_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_PAY_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Delivery Address_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_DeliveryPick-up_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Order Summary_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Surcharge_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Sub Total_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Minimum Lead Time_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Delivery Costs_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Select Delivery Method_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Total_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_QTY_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_No available delivery method please check the item(s) detail page or contact merchant_tab-title'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Back_btn_selected'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Proceed To Payment_btn_selected'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

WebUI.comment('Verification highlight textfield')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_DELIVERY_tab-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_REVIEW_tab-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_PAY_tab-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Delivery Address_tab-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_DeliveryPick-up_tab-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Order Summary_tab-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Surcharge_tab-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Sub Total_tab-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Minimum Lead Time_tab-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Delivery Costs_tab-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Select Delivery Method_tab-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Total_tab-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_QTY_tab-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_No available delivery method please check the item(s) detail page or contact merchant_tab-title'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Back_btn_selected'), 
    'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Checkout Review/input_Proceed To Payment_btn_selected'), 
    'class', 'form-control error-con', 0)

