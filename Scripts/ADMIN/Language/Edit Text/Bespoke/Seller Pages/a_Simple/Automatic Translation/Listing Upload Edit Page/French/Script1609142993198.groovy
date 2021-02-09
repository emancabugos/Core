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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/SpaceTime/Seller Pages/Listing Upload Edit Page/navigateTo_Listing'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 'French', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_YourServices'), 
    'value', 'Vos services', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_BasicDetails'), 
    'value', 'Détails de base', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Schedule'), 
    'value', 'Programme', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Images'), 
    'value', 'Images', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Additional'), 
    'value', 'Supplémentaire', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Location'), 
    'value', 'Emplacement', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Delivery'), 
    'value', 'Livraison', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_BasicDetails01'), 
    'value', 'Détails de base', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Category'), 
    'value', 'Catégorie', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SelectAll'), 
    'value', 'Tout sélectionner', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SelectNone'), 
    'value', 'Ne rien sélectionner', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceName'), 
    'value', 'Nom du service', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ItemDescription'), 
    'value', 'Description de l\'article', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SellYourMarketplace'), 
    'value', 'Comment souhaitez-vous vendre votre service?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_InstantBuyOrNegotiation'), 
    'value', 'Sélectionnez si vous souhaitez que votre service soit acheté sans pré-approbation ou si vous souhaitez discuter avec le premier acheteur. (Vous pouvez choisir d\'avoir les deux options pour le service.)', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_InstantBuy'), 
    'value', 'Achat instantané', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Negotiation'), 
    'value', 'Négociation', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_OvernightBookingService'), 
    'value', 'Est-ce un service de réservation de nuit?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Operate247'), 
    'value', 'Optez-vous 24 heures sur 24, 7 jours sur 7?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceDuration'), 
    'value', 'Durée du service', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SpecifyDuration'), 
    'value', 'Spécifiez la durée de votre service', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AllowUnlimitedBookings'), 
    'value', 'Autoriser des réservations illimitées?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_MaximumBookingPerSession'), 
    'value', 'Maximum de réservations par session', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SCHEDULE_2'), 
    'value', 'Programme', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_OperatingHours'), 
    'value', 'Heures de fonctionnement', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckSpecifyDates'), 
    'value', 'Vérifiez les jours et spécifiez les heures que vous serez disponibles.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckinCheckout'), 
    'value', 'Horaire d\'arrivée / départ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_EnterYourTime'), 
    'value', 'Entrez le moment où vos clients pourront effectuer un check-in et un check-out.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckInTime'), 
    'value', 'Heure d\'arrivée', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckoutTime'), 
    'value', 'Heure de départ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AvailabilityCalendar'), 
    'value', 'Calendrier de disponibilité', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SetDateRange'), 
    'value', 'Définissez une plage de date / heure que vous voulez rendre indisponible.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_BlockThisDate'), 
    'value', 'Bloquer cette date / heure', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Images'), 
    'value', 'Images', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceImage'), 
    'value', 'Image de service', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Maximum15Image'), 
    'value', 'Maximum 15 images', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ImageRatio'), 
    'value', 'Les images doivent être dans un ratio de 3: 2 et pas plus de 2 Mo (recommandé 720px x 480px)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Browse'), 
    'value', 'Feuilleter', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AdditionalService'), 
    'value', 'Services / détails supplémentaires', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AddOnName'), 
    'value', 'Nom du complément', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Surcharge'), 
    'value', 'Surtaxe', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_LocationDetails'), 
    'value', 'Emplacement / détails', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceLocation'), 
    'value', 'L\'emplacement de votre service', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_EnterLocation'), 
    'value', 'Veuillez indiquer l\'endroit où votre service aura lieu. Vous pouvez utiliser l\'emplacement à partir de votre carnet d\'adresses, ou entrez un lieu à votre place.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Note'), 
    'value', 'Remarque', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_DeliveryMethodsOrPickUpLocation'), 
    'value', 'Si cette liste ne nécessite pas de méthodes de livraison ou d\'emplacements de ramassage, vous pouvez terminer le téléchargement en cliquant sur le bouton "Charger maintenant". Sinon, cliquez sur "Suivant" pour configurer votre méthode de livraison et / ou votre emplacement de ramassage.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Or'), 
    'value', 'Ou', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Delivery01'), 
    'value', 'Livraison', 0)

