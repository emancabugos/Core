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
    'value', 'Chercher...', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_BE A SELLER_be_seller'), 
    'value', 'ÊTRE UN VENDEUR', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_MORE_more'), 'value', 
    'Plus', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_VIEW CART_btn_next'), 
    'value', 'VOIR LE PANIER', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_REGISTER  SIGN IN_register_signin'), 
    'value', 'INSCRIVEZ-VOUS / INSCRIVEZ-VOUS', 0)

WebUI.comment('Header - Logged in')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_SELLER_sell'), 
    'value', 'VENDEUR', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Dashboard_Dashboard'), 
    'value', 'Tableau de bord', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Your Items_Your Items'), 
    'value', 'Vos articles', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Upload_Upload'), 
    'value', 'Ajouter un item', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Orders_Orders'), 
    'value', 'Ordres', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Sales_Sales'), 
    'value', 'Ventes', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Browse_Browse'), 
    'value', 'Feuilleter', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_PROFILE_profile'), 
    'value', 'PROFIL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Purchases_Purchases'), 
    'value', 'Achats', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Settings_Settings'), 
    'value', 'Paramètres', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Logout_Logout'), 
    'value', 'Connectez - Out', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Sub-accounts_Sub-accounts'), 
    'value', 'Sous-comptes', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_delivery'), 'value', 
    'Livraison', 0)

WebUI.comment('Mobile Header')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_SELLER_sell1'), 
    'value', 'VENDEUR', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Dashboard_Dashboard1'), 
    'value', 'Tableau de bord', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Your Items_Your Items1'), 
    'value', 'Vos articles', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Upload_Upload1'), 
    'value', 'Télécharger', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Orders_Orders1'), 
    'value', 'Ordres', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Sales_Sales1'), 
    'value', 'Ventes', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_PROFILE_profile1'), 
    'value', 'PROFIL', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Purchases_Purchases1'), 
    'value', 'Achats', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Settings_Settings1'), 
    'value', 'Paramètres', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_Logout_Logout1'), 
    'value', 'Connectez - Out', 0)

WebUI.comment('Footer')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_ABOUT US_ABOUT US'), 
    'value', 'À PROPOS DE NOUS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_SERVICE TERMS_SERVICE TERMS'), 
    'value', 'CONDITIONS D\'UTILISATION', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_PRIVACY_PRIVACY'), 
    'value', 'POLITIQUE DE CONFIDENTIALITÉ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_RETURNS_RETURNS'), 
    'value', 'POLITIQUE DE RETOUR', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_FAQ_FAQ'), 'value', 
    'FAQ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_CONTACT_CONTACT'), 
    'value', 'CONTACTEZ NOUS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Header_Footer/input_All rights reserved _foot_copyright'), 
    'value', 'Tous les droits sont réservés. ©', 0)

