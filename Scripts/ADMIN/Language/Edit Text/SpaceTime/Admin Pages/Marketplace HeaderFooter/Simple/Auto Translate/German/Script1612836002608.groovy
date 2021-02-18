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

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 'German', false)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Search'), 
    'value', 'Suche...', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Location'), 
    'value', 'Ort', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_BeASeller'), 
    'value', 'BIN EIN VERKÄUFER', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_More'), 
    'value', 'Mehr', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_RegisterSignIn'), 
    'value', 'REGISTER / SIGN IN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Seller'), 
    'value', 'VERKÄUFER', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Profile'), 
    'value', 'PROFIL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Dashboard'), 
    'value', 'Instrumententafel', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Purchases'), 
    'value', 'Kaufe', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_YourServices'), 
    'value', 'Ihre Dienstleistungen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Settings'), 
    'value', 'Einstellungen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_AddService'), 
    'value', 'Service hinzufügen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Logout'), 
    'value', 'Ausloggen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Bookings'), 
    'value', 'Buchungen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_SubAccount'), 
    'value', 'Unterkonten', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_AboutUs'), 
    'value', 'ÜBER UNS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfieldTermsOfService'), 
    'value', 'NUTZUNGSBEDINGUNGEN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_PrivacyPolicy'), 
    'value', 'DATENSCHUTZ-BESTIMMUNGEN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_ReturnPolicy'), 
    'value', 'RÜCKNAHMEGARANTIE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_FAQ'), 
    'value', 'FAQ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_ContactUs'), 
    'value', 'KONTAKTIERE UNS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_AllRightsReserved'), 
    'value', 'Alle Rechte vorbehalten. ©', 0)

