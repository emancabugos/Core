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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Admin Pages/Header_Footer Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'German', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Search_search'), 
    'value', 'Suche...', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_BE A SELLER_be_seller'), 
    'value', 'BIN EIN VERKÄUFER', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_MORE_more'), 'value', 
    'Mehr', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_VIEW CART_btn_next'), 
    'value', 'WARENKORB ANZEIGEN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_REGISTER  SIGN IN_register_signin'), 
    'value', 'REGISTRIEREN / ANMELDEN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_SELLER_sell'), 
    'value', 'VERKÄUFER', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_PROFILE_profile'), 
    'value', 'PROFIL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Dashboard_Dashboard'), 
    'value', 'Instrumententafel', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Purchases_Purchases'), 
    'value', 'Kaufe', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Your Items_Your Items'), 
    'value', 'Ihre Gegenstände', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Settings_Settings'), 
    'value', 'Einstellungen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Add Item_Upload'), 
    'value', 'Artikel hinzufügen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Logout_Logout'), 
    'value', 'Ausloggen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Orders_Orders'), 
    'value', 'Aufträge', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Sub-accounts_Sub-accounts'), 
    'value', 'Unterkonten', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Sales_Sales'), 
    'value', 'Der Umsatz', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_delivery'), 'value', 
    'Lieferung', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Browse_Browse'), 
    'value', 'Durchsuchen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_SELLER_sell1'), 
    'value', 'VERKÄUFER', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_PROFILE_profile1'), 
    'value', 'PROFIL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Dashboard_Dashboard1'), 
    'value', 'Instrumententafel', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Purchases_Purchases1'), 
    'value', 'Kaufe', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Your Items_Your Items1'), 
    'value', 'Ihre Gegenstände', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Settings_Settings1'), 
    'value', 'Einstellungen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Upload_Upload1'), 
    'value', 'Hochladen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Logout_Logout1'), 
    'value', 'Ausloggen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Orders_Orders1'), 
    'value', 'Aufträge', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Sales_Sales1'), 
    'value', 'Der Umsatz', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_ABOUT US_ABOUT US'), 
    'value', 'ÜBER UNS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_SERVICE TERMS_SERVICE TERMS'), 
    'value', 'NUTZUNGSBEDINGUNGEN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_PRIVACY_PRIVACY'), 
    'value', 'DATENSCHUTZ-BESTIMMUNGEN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_RETURNS_RETURNS'), 
    'value', 'RÜCKNAHMEGARANTIE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_FAQ_FAQ'), 'value', 
    'FAQ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_CONTACT_CONTACT'), 
    'value', 'KONTAKTIERE UNS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_All rights reserved _foot_copyright'), 
    'value', 'Alle Rechte vorbehalten. ©', 0)

