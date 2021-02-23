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

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_Delivery'), 'value', 
    'Lieferung', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_Review'), 'value', 
    'Überprüfung', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_Pay'), 'value', 
    'Zahlen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_AlreadyRegistered'), 
    'value', 'Schon bei uns registriert?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_SignInNow'), 
    'value', 'Schreib dich jetzt ein', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_FillUpInformation'), 
    'value', 'Füllen Sie Ihre persönlichen Daten aus', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_ServiceToDelivered'), 
    'value', 'Wohin möchten Sie diesen Service zu liefern?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_Selected'), 'value', 
    'Ausgewählt', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_SelectAddress'), 
    'value', 'Adresse auswählen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_EnterNewAddress'), 
    'value', 'Geben Sie eine neue Adresse ein', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_Change'), 'value', 
    'Veränderung', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_OrderSummary'), 
    'value', 'Bestellübersicht', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_DeliveryCost'), 
    'value', 'Versandkosten', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_Total'), 'value', 
    'Gesamt', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_AmountPay'), 
    'value', 'Zu zahlender Betrag', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_SelectAPaymentMethod'), 
    'value', 'Wählen Sie eine Zahlungsmethode aus', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_ContinueWithTransaction'), 
    'value', 'Wenn Sie auf die Schaltfläche ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_PayNow'), 'value', 
    'Zahl jetzt', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_ThankYouPurchase'), 
    'value', 'Danke für Ihren Einkauf!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_YourInvoice'), 
    'value', 'Ihre Rechnungs-ID', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_ConfirmationEmail'), 
    'value', 'Sie erhalten in Kürze eine Bestellbestätigung per E-Mail. Wenn Sie irgendeine Anfrage haben, bitte', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_ContactUs'), 
    'value', 'Kontaktiere uns', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_Homepage'), 'value', 
    'Startseite', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_PurchaseHistory'), 
    'value', 'Kaufhistorie', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_SignUpSaveAddress'), 
    'value', 'Melden Sie sich jetzt an, um Ihre Adresse für das nächste Mal zu speichern!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_SignUp'), 'value', 
    'Anmelden', 0)

