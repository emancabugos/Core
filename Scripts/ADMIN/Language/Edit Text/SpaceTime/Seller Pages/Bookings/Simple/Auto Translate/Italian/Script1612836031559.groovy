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

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_YourBookings'), 
    'value', 'Le tue prenotazioni', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_ServiceStartDate'), 
    'value', 'Data di inizio del servizio', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfiel_BuyerName'), 
    'value', 'Nome del compratore', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_ServiceStartDateFrom'), 
    'value', 'DATA DI AVVIO DEL SERVIZIO FILTRO DA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_ExportCSV'), 
    'value', 'Esporta CSV', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_cancelOrder'), 
    'value', 'Annulla Ordine', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_orderCancelled'), 
    'value', 'Ordine cancellato', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_BuyerInfo'), 
    'value', 'Informazioni sugli acquirenti', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_AdminFee'), 
    'value', 'tassa amministrativa', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_ServiceDetails'), 
    'value', 'Dettagli del servizio', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_Note'), 'value', 
    'Nota:', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_StatusChange'), 
    'value', 'STATO CAMBIATO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textarea_ItemOrderStatus'), 
    'value', 'Lo stato dell\'ordine per questo articolo è stato aggiornato.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_confirmCancel'), 
    'value', 'Conferma Annulla', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_bookWillCancel'), 
    'value', 'Lo slot di prenotazione verrà annullato', 0)

