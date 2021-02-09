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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Order History Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'French', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDERS_item_name'), 
    'value', 'ORDRES', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_manage all'), 
    'value', 'Gérer toutes vos commandes qui ont été placées avec vous. Cliquez sur n\'importe quel identifiant de paiement pour voir les détails de la commande.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Search by Order ID_search-by'), 
    'value', 'Recherche par ID de commande', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_EXPORT CSV_btn_upload'), 
    'value', 'EXPORTER CSV', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_CHANGE STATUS_btn_upload'), 
    'value', 'CHANGEMENT DE STATUT', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER NO_order-id-txt'), 
    'value', 'COMMANDE NO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_INVOICE NO_invoice-id-txt'), 
    'value', 'NO FACTURE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_TIMESTAMP_timestamp-txt'), 
    'value', 'Horodatage', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER TOTAL_item-txt'), 
    'value', 'TOTAL DE LA COMMANDE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_NO OF ITEM(S)_qty-txt'), 
    'value', 'AUCUN ARTICLE (S)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_PAYMENT TYPE_delivery-txt'), 
    'value', 'TYPE DE PAIEMENT', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER STATUS_order-status-txt'), 
    'value', 'STATUT DE LA COMMANDE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_REVIEW_review-txt'), 
    'value', 'LA REVUE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_PAYMENT STATUS_payment-type-txt'), 
    'value', 'STATUT DE PAIEMENT', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_REFUNDED_payment-status-txt'), 
    'value', 'Remboursé', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Delivery_Delivery'), 
    'value', 'Livraison', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Pick-up_Delivery'), 
    'value', 'Ramasser', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_New Review_new-review'), 
    'value', 'Nouvelle révision!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_ORDER STATUS CHANGE_order-status-txt'), 
    'value', 'CHANGEMENT DE STATUT DE COMMANDE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_you will only'), 
    'value', 'En fonction de l\'état de votre commande et de votre méthode de livraison, vous ne pourrez modifier que certains états de commande en même temps.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Your order(s) selected delivery type is_popup-title2'), 
    'value', 'Le type de livraison sélectionné (s) de votre commande est:', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Your order(s) selected delivery type is_popup-title3'), 
    'value', 'Quel sera le statut de vos commandes sélectionnées?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Change Status_btn_okay'), 
    'value', 'Modifier l\'état', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_EXPORT ORDER_popup-title'), 
    'value', 'ORDRE D\'EXPORTATION', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Timestamp_popup-title'), 
    'value', 'Horodatage', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Export CSV_btn_okay'), 
    'value', 'Exporter CSV', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_STATUS CHANGED_popup-title'), 
    'value', 'ÉTAT CHANGÉ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/textarea_The order status for this item has been updated'), 
    'value', 'Le statut de la commande pour cet élément a été mis à jour.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Order History/input_Okay_btn_okay'), 
    'value', 'd\'accord', 0)

