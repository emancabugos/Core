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

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/texfield_Dashboard'), 
    'value', 'SCRIVANIA', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_SellerActivity'), 
    'value', 'Una rapida panoramica delle vostre vendite e attività di venditore.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_OrdersToday'), 
    'value', 'ordini oggi', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_RevenueToday'), 
    'value', 'entrate Oggi', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_BestSeller'), 
    'value', 'IL PIÙ VENDUTO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_QuantityLeft'), 
    'value', 'Quantità sinistra', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Today'), 'value', 
    'OGGI', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Last7Days'), 
    'value', 'Ultimi 7 giorni', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Last30Days'), 
    'value', 'Ultimi 30 giorni', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalSales'), 
    'value', 'Le vendite totali', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalOrders'), 
    'value', 'Gli ordini totali', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalVisits'), 
    'value', 'Visite totali', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_AvrOrderByRev'), 
    'value', 'Ordine Avr del Rev', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_AvrItemsSoldPerOrder'), 
    'value', 'I prodotti venduti avr per ordine', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Sales'), 'value', 
    'Vendite', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalRevenue'), 
    'value', 'Entrate totali', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalOrders_2'), 
    'value', 'Gli ordini totali', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_BestProductSellers'), 
    'value', 'I più venduti prodotti', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalSalesIn'), 
    'value', 'Vendite totali', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_BestSellers'), 
    'value', 'I più venduti', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_ItemID'), 'value', 
    'Numero identificativo dell\'oggetto', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalSales_2'), 
    'value', 'Le vendite totali', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_ItemSold'), 
    'value', 'Articolo venduto', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TopViewedItems'), 
    'value', 'Top visti', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield__Total ViewsPerItem'), 
    'value', 'In totale per articolo', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_MostViewed'), 
    'value', 'I più visti', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalViews'), 
    'value', 'Visualizzazioni totali', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Day'), 'value', 
    'Giorno', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Week'), 'value', 
    'Settimana', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Month'), 'value', 
    'Mese', 0)

