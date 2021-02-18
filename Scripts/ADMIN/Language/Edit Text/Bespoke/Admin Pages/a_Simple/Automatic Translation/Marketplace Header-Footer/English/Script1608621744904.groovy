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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.comment('Header - Guest')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Search_search'), 
    'value', 'Search...', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_BE A SELLER_be_seller'), 
    'value', 'BE A SELLER', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_MORE_more'), 'value', 
    'More', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_VIEW CART_btn_next'), 
    'value', 'VIEW CART', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_REGISTER  SIGN IN_register_signin'), 
    'value', 'REGISTER / SIGN IN', 0)

WebUI.comment('Header - Logged in')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_SELLER_sell'), 
    'value', 'SELLER', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Dashboard_Dashboard'), 
    'value', 'Dashboard', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Your Items_Your Items'), 
    'value', 'Your Items', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Upload_Upload'), 
    'value', 'Add Item', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Orders_Orders'), 
    'value', 'Orders', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Sales_Sales'), 
    'value', 'Sales', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Browse_Browse'), 
    'value', 'Browse', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_PROFILE_profile'), 
    'value', 'PROFILE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Purchases_Purchases'), 
    'value', 'Purchases', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Settings_Settings'), 
    'value', 'Settings', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Logout_Logout'), 
    'value', 'Logout', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Sub-accounts_Sub-accounts'), 
    'value', 'Sub-accounts', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_delivery'), 'value', 
    'Delivery', 0)

WebUI.comment('Mobile Header')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_SELLER_sell1'), 
    'value', 'SELLER', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Dashboard_Dashboard1'), 
    'value', 'Dashboard', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Your Items_Your Items1'), 
    'value', 'Your Items', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Upload_Upload1'), 
    'value', 'Upload', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Orders_Orders1'), 
    'value', 'Orders', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Sales_Sales1'), 
    'value', 'Sales', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_PROFILE_profile1'), 
    'value', 'PROFILE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Purchases_Purchases1'), 
    'value', 'Purchases', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Settings_Settings1'), 
    'value', 'Settings', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Logout_Logout1'), 
    'value', 'Logout', 0)

WebUI.comment('Footer')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_ABOUT US_ABOUT US'), 
    'value', 'ABOUT US', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_SERVICE TERMS_SERVICE TERMS'), 
    'value', 'TERMS OF SERVICE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_PRIVACY_PRIVACY'), 
    'value', 'PRIVACY POLICY', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_RETURNS_RETURNS'), 
    'value', 'RETURN POLICY', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_FAQ_FAQ'), 'value', 
    'FAQ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_CONTACT_CONTACT'), 
    'value', 'CONTACT US', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_All rights reserved _foot_copyright'), 
    'value', 'All rights reserved. ©', 0)

