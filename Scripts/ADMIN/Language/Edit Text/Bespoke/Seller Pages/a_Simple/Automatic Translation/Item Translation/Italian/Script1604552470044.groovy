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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Item Translation Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Italian', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_TRANSLATE ITEM_transalate-item'), 
    'value', 'TRADUZIONE DI ARTICOLO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_Add or edit translations for your item details_transalate-detail'), 
    'value', 'Aggiunta o modifica delle traduzioni per i dettagli dell\'elemento', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_Language_Language'), 
    'value', 'Lingua', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_CANCEL_btn_cancel'), 
    'value', 'ANNULLA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_SAVE_btn_save'), 
    'value', 'SALVARE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_ITEM NAME_Language'), 
    'value', 'NOME DELL\'ELEMENTO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_ITEM DESCRIPTION_Language'), 
    'value', 'DESCRIZIONE DELL\'ARTICOLO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_OPTION NAME_Language'), 
    'value', 'OPZIONE NOME', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_OPTION CHOICE_Language'), 
    'value', 'OPZIONE SCELTA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_You have not finished_not-finished'), 
    'value', 'Non hai finito', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_You are about to leave the page with out saving your progress Would you like to leave this page_about-leave'), 
    'value', 'Stai per uscire dalla pagina senza salvare i tuoi progressi. Ti piacerebbe lasciare questa pagina?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_CANCEL_later_btn'), 
    'value', 'Annulla', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Item Translation/input_CONTINUE_later_btn'), 
    'value', 'Continua', 0)

