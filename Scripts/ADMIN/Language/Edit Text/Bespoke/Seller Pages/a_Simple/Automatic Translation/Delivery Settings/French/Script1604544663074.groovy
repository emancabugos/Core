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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Delivery Settings Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'French', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY SETTINGS_DELIVERY_SETTINGS'), 
    'value', 'RÉGLAGES DE LIVRAISON', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY SETTINGS_Add_delivery_or_pickup option'), 
    'value', 'Ajoutez des options de livraison et / ou de retrait pour vos acheteurs. Toutes les options de livraison doivent être définies par le poids ou le prix', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTIONS_DELIVERY_OPTIONS'), 
    'value', 'OPTIONS DE LIVRAISON', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Add Delivery Options_select_delivery_method'), 
    'value', 'Ajouter une option de livraison', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name'), 
    'value', 'prénom', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERS TO_DELIVERS_TO'), 
    'value', 'LIVRE À', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_PICK-UP OPTIONS_PICK-UP_OPTIONS'), 
    'value', 'OPTIONS DE PICK-UP', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Add Pick-up Options_Add_Pick-up_Options'), 
    'value', 'Ajouter une option de ramassage', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the full address where the buyer can pick up from_delivery_desc_used'), 
    'value', 'Définir l\'adresse complète où l\'acheteur peut aller chercher', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivers to_Delivers_to (1)'), 
    'value', 'Livre à', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Shipping rate by_Shipping_rate_by'), 
    'value', 'Taux d\'expédition par', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivering from_Delivering_from'), 
    'value', 'Livrer à partir de', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery rates(s)_Shipping_rate_by'), 
    'value', 'Taux d\'expédition par', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name1'), 
    'value', 'prénom', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Range_Range'), 
    'value', 'Intervalle', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Cost_Delivery_Cost'), 
    'value', 'Frais de port', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Okay_Range'), 
    'value', 'd\'accord', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Yes'), 'value', 
    'OUI', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_No'), 'value', 
    'NON', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_ADDEDIT DELIVERY OPTION_Add_edit_delivery_option'), 
    'value', 'Ajouter / modifier une option de livraison', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the locations available and the rates for the delivery option_Define_the_locations_available_and_the_rates_for_the_delivery_option'), 
    'value', 'Définir les emplacements disponibles et les tarifs pour l\'option de livraison', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Remove Item_popup-title'), 
    'value', 'RETIRER L\'OBJET', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/textarea_You sure about removing this item from your list (Itll be gone forever)'), 
    'value', 'Êtes-vous sûr de vouloir supprimer cet article de votre liste? (Ce sera parti pour toujours!)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/Remove Item Popup/input_Okay'), 
    'value', 'd\'accord', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/Remove Item Popup/input_Cancel'), 
    'value', 'Annuler', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_ADDEDIT DELIVERY OPTION_Add_edit_delivery_option'), 
    'value', 'Ajouter / modifier une option de livraison', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the locations available and the rates for the delivery option_Define_the_locations_available_and_the_rates_for_the_delivery_option'), 
    'value', 'Définir les emplacements disponibles et les tarifs pour l\'option de livraison', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTION SETTINGS_DELIVERY_OPTIONS_SETTINGS'), 
    'value', 'Paramètres d\'option de livraison', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTION NAME_DELIVERY_OPTION_NAME'), 
    'value', 'Nom de l\'option de livraison', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_delivers to3'), 
    'value', 'Livre à', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_MINIMUM LEAD TIME_Minimum_lead_time'), 
    'value', 'Délai d\'exécution minimum', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_WHERE ARE YOU DELIVERING FROM_Where_are_you_delivering_from'), 
    'value', 'D\'où livrez-vous', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Select if you would like to calculate shipping by total order weight or total order price_total_order_weight_or_total_order_price'), 
    'value', 'Sélectionnez si vous souhaitez calculer les frais de livraison en fonction du poids total de la commande ou du prix total de la commande.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Weight_Weight'), 
    'value', 'Poids', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Price_Price'), 
    'value', 'Prix', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Rate(s)_DelDelivery_Rates'), 
    'value', 'Taux de livraison', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name1'), 
    'value', 'prénom', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Range_Range'), 
    'value', 'Intervalle', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Cost_Delivery_Cost'), 
    'value', 'Frais de port', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Onwards_Onwards'), 
    'value', 'En avant', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Add Delivery Rate_Add_Delivery_Rate'), 
    'value', 'Ajouter le taux de livraison', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Rate Name (Buyers will not see this)_Delivery_Rate_Name'), 
    'value', 'Nom du tarif de livraison (les acheteurs ne verront pas cela)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_To_To'), 
    'value', 'À', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Cost_Delivery_Cost'), 
    'value', 'Frais de port', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Save_Save'), 
    'value', 'sauvegarder', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Cancel_Cancel'), 
    'value', 'Annuler', 0)

