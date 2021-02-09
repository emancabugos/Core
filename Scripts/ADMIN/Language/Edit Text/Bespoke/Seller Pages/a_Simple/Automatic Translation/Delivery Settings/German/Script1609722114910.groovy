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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'German', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY SETTINGS_DELIVERY_SETTINGS'), 
    'value', 'LIEFEREINSTELLUNGEN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY SETTINGS_Add_delivery_or_pickup option'), 
    'value', 'Fügen Sie Liefer- und / oder Abholoptionen für Ihre Käufer hinzu. Alle Lieferoptionen müssen entweder nach Gewicht oder nach Preis definiert werden', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTIONS_DELIVERY_OPTIONS'), 
    'value', 'LIEFEROPTIONEN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Add Delivery Options_select_delivery_method'), 
    'value', 'Lieferoption hinzufügen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name'), 
    'value', 'Name', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERS TO_DELIVERS_TO'), 
    'value', 'LIEFERT AN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_PICK-UP OPTIONS_PICK-UP_OPTIONS'), 
    'value', 'ABHOLMÖGLICHKEITEN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Add Pick-up Options_Add_Pick-up_Options'), 
    'value', 'Abholoption hinzufügen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the full address where the buyer can pick up from_delivery_desc_used'), 
    'value', 'Geben Sie die vollständige Adresse an, bei der der Käufer abholen kann', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivers to_Delivers_to (1)'), 
    'value', 'Liefert zu', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Shipping rate by_Shipping_rate_by'), 
    'value', 'Versandkosten per', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivering from_Delivering_from'), 
    'value', 'Lieferung von', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery rates(s)_Shipping_rate_by'), 
    'value', 'Versandkosten per', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name1'), 
    'value', 'Name', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Range_Range'), 
    'value', 'Angebot', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Cost_Delivery_Cost'), 
    'value', 'Versandkosten', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Okay_Range'), 
    'value', 'okay', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Yes'), 'value', 
    'JA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_No'), 'value', 
    'NEIN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_ADDEDIT DELIVERY OPTION_Add_edit_delivery_option'), 
    'value', 'Lieferoption hinzufügen / bearbeiten', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the locations available and the rates for the delivery option_Define_the_locations_available_and_the_rates_for_the_delivery_option'), 
    'value', 'Definieren Sie die verfügbaren Standorte und die Tarife für die Zustelloption', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Remove Item_popup-title'), 
    'value', 'GEGENSTAND ENTFERNEN', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/textarea_You sure about removing this item from your list (Itll be gone forever)'), 
    'value', 'Sind Sie sicher, dass Sie diesen Artikel von Ihrer Liste entfernen möchten? (Es wird für immer weg sein!)', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/Remove Item Popup/input_Okay'), 
    'value', 'okay', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/Remove Item Popup/input_Cancel'), 
    'value', 'Stornieren', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_ADDEDIT DELIVERY OPTION_Add_edit_delivery_option'), 
    'value', 'Lieferoption hinzufügen / bearbeiten', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Define the locations available and the rates for the delivery option_Define_the_locations_available_and_the_rates_for_the_delivery_option'), 
    'value', 'Definieren Sie die verfügbaren Standorte und die Tarife für die Zustelloption', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTION SETTINGS_DELIVERY_OPTIONS_SETTINGS'), 
    'value', 'Einstellungen für Zustelloptionen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_DELIVERY OPTION NAME_DELIVERY_OPTION_NAME'), 
    'value', 'Name der Zustelloption', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_delivers to3'), 
    'value', 'Liefert zu', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_MINIMUM LEAD TIME_Minimum_lead_time'), 
    'value', 'Minimale Vorlaufzeit', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_WHERE ARE YOU DELIVERING FROM_Where_are_you_delivering_from'), 
    'value', 'Woher liefern Sie?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Select if you would like to calculate shipping by total order weight or total order price_total_order_weight_or_total_order_price'), 
    'value', 'Wählen Sie, ob Sie den Versand nach Gesamtauftragsgewicht oder Gesamtauftragspreis berechnen möchten.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Weight_Weight'), 
    'value', 'Gewicht', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Price_Price'), 
    'value', 'Preis', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Rate(s)_DelDelivery_Rates'), 
    'value', 'Lieferrate (n)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Name_Name1'), 
    'value', 'Name', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Range_Range'), 
    'value', 'Angebot', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Cost_Delivery_Cost'), 
    'value', 'Versandkosten', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Onwards_Onwards'), 
    'value', 'Weiter', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Add Delivery Rate_Add_Delivery_Rate'), 
    'value', 'Lieferrate hinzufügen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Rate Name (Buyers will not see this)_Delivery_Rate_Name'), 
    'value', 'Name der Lieferrate (Käufer sehen dies nicht)', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_To_To'), 
    'value', 'Zu', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Delivery Cost_Delivery_Cost'), 
    'value', 'Versandkosten', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Save_Save'), 
    'value', 'sparen', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Delivery Settings/input_Cancel_Cancel'), 
    'value', 'Stornieren', 0)

