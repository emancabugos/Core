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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 'Italian', false)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Search'), 
    'value', 'Ricerca...', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Location'), 
    'value', 'Posizione', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_BeASeller'), 
    'value', 'Essere un venditore', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_More'), 
    'value', 'Di Più', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_RegisterSignIn'), 
    'value', 'REGISTRARE / SEGNARE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Seller'), 
    'value', 'VENDITORE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Profile'), 
    'value', 'PROFILO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Dashboard'), 
    'value', 'Cruscotto', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Purchases'), 
    'value', 'acquisti', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_YourServices'), 
    'value', 'I tuoi servizi', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Settings'), 
    'value', 'impostazioni', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_AddService'), 
    'value', 'Aggiungi servizio', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Logout'), 
    'value', 'Logout', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Bookings'), 
    'value', 'Prenotazioni', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_SubAccount'), 
    'value', 'Sub-account', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_AboutUs'), 
    'value', 'RIGUARDO A NOI', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfieldTermsOfService'), 
    'value', 'TERMINI DI SERVIZIO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_PrivacyPolicy'), 
    'value', 'POLITICA SULLA RISERVATEZZA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_ReturnPolicy'), 
    'value', 'POLITICA DI RITORNO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_FAQ'), 
    'value', 'FAQ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_ContactUs'), 
    'value', 'CONTATTACI', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_AllRightsReserved'), 
    'value', 'Tutti i diritti riservati. ©', 0)

