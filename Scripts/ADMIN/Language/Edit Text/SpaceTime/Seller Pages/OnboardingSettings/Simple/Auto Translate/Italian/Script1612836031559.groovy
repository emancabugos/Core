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

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_UserSettings'), 
    'value', 'IMPOSTAZIONI UTENTE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Profile'), 
    'value', 'PROFILO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_AboutYou'), 
    'value', 'A proposito di te', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_DisplayName'), 
    'value', 'Il tuo nome visualizzato', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Timezone'), 
    'value', 'Fuso orario', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_OpenLoginID'), 
    'value', 'il login OpenID', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SellerLocation'), 
    'value', 'Posizione del venditore', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_TransactionFee'), 
    'value', 'Per ogni transazione che viene fatta attraverso il mercato, ci sarà una tassa di transazione venditore:', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Address'), 
    'value', 'INDIRIZZO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SelectCountry'), 
    'value', 'SELEZIONA IL PAESE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_PaymentAcceptance'), 
    'value', 'Metodi di pagamento accettati', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_PaymentMethod'), 
    'value', 'Metodo di pagamento', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SelectYourPaymentMethod'), 
    'value', 'Seleziona il tuo metodo di pagamento preferito.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_LinkAccount'), 
    'value', 'conto link', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Verified'), 
    'value', 'verificata', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Compulsory'), 
    'value', 'Questo metodo di pagamento è obbligatorio.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_NoLinkAccount'), 
    'value', 'Nessun account collegati', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Optional'), 
    'value', 'OPZIONALE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_FormOptional'), 
    'value', 'Come riempire questa parte del modulo è facoltativa, si può desiderare di saltare.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SkipThisStep'), 
    'value', 'SCEGLI QUESTO PASSO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_DeliveryMethod'), 
    'value', 'metodo di consegna', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_RemoveItem'), 
    'value', 'RIMUOVI OGGETTO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_RemovePopup'), 
    'value', 'Sei sicuro di rimozione di questa voce dalla vostra lista? (Si sarà andato per sempre!)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Back'), 
    'value', 'Indietro', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_AccountConfiguration'), 
    'value', 'CONFIGURAZIONE DELL\'ACCOUNT', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_VerifiedByOmise'), 
    'value', 'I tuoi dati inseriti qui verranno salvati e verificati da Omise. I soldi che guadagni dalle tue vendite saranno accreditati direttamente sul tuo conto bancario', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Type'), 
    'value', 'GENERE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_TaxIdentificationNumber'), 
    'value', 'Numero di identificazione fiscale (facoltativo)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Individual'), 
    'value', 'Individuale', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Corporate'), 
    'value', 'aziendale', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_BankBranchCode'), 
    'value', 'Codice banca / filiale', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_BankAccountNumber'), 
    'value', 'numero di conto bancario', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_BankAccountName'), 
    'value', 'nome del conto bancario', 0)

