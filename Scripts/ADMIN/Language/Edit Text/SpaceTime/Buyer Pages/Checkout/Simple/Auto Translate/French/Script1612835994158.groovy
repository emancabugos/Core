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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 'French', false)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_Delivery'), 'value', 
    'Livraison', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_Review'), 'value', 
    'La revue', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_Pay'), 'value', 
    'Payer', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_AlreadyRegistered'), 
    'value', 'Déjà inscrit auprès de nous?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_SignInNow'), 
    'value', 'Connectez vous maintenant', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_FillUpInformation'), 
    'value', 'Remplissez vos informations personnelles', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_ServiceToDelivered'), 
    'value', 'Où souhaiteriez-vous que ce service soit livré?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_Selected'), 'value', 
    'Choisi', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_SelectAddress'), 
    'value', 'Sélectionnez l\'adresse', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_EnterNewAddress'), 
    'value', 'Entrez une nouvelle adresse', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_Change'), 'value', 
    'Changement', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_OrderSummary'), 
    'value', 'Récapitulatif de la commande', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_DeliveryCost'), 
    'value', 'Frais de port', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_Total'), 'value', 
    'Total', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_AmountPay'), 
    'value', 'Montant à payer', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_SelectAPaymentMethod'), 
    'value', 'Choisissez une méthode de paiement', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_ContinueWithTransaction'), 
    'value', 'En cliquant sur le bouton \'Pay Now\', vous serez redirigé vers la page Processor de paiement pour continuer votre transaction.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_PayNow'), 'value', 
    'Payez maintenant', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_ThankYouPurchase'), 
    'value', 'Merci pour votre achat!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_YourInvoice'), 
    'value', 'Votre identifiant de facture', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_ConfirmationEmail'), 
    'value', 'Vous recevrez un email de confirmation de commande sous peu. Si vous avez une demande, s\'il vous plaît', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_ContactUs'), 
    'value', 'Contactez nous', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_Homepage'), 'value', 
    'Page d\'accueil', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_PurchaseHistory'), 
    'value', 'Historique d\'achat', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_SignUpSaveAddress'), 
    'value', 'Inscrivez-vous maintenant pour enregistrer votre adresse pour la prochaine fois!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Checkout/textfield_SignUp'), 'value', 
    'S\'inscrire', 0)

