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

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/texfield_Dashboard'), 
    'value', 'TABLEAU DE BORD', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_SellerActivity'), 
    'value', 'Un aperçu rapide de vos ventes et de l\'activité de vendeur.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_OrdersToday'), 
    'value', 'commandes Aujourd\'hui', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_RevenueToday'), 
    'value', 'Revenue Today', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_BestSeller'), 
    'value', 'BEST-SELLER', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_QuantityLeft'), 
    'value', 'Quantité gauche', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Today'), 'value', 
    'AUJOURD\'HUI', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Last7Days'), 
    'value', 'LES 7 DERNIERS JOURS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Last30Days'), 
    'value', 'LES 30 DERNIERS JOURS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalSales'), 
    'value', 'Ventes totales', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalOrders'), 
    'value', 'total des commandes', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalVisits'), 
    'value', 'total des visites', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_AvrOrderByRev'), 
    'value', 'Ordre par rév.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_AvrItemsSoldPerOrder'), 
    'value', 'Articles vendus par commande Avr', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Sales'), 'value', 
    'Ventes', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalRevenue'), 
    'value', 'Revenu total', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalOrders_2'), 
    'value', 'total des commandes', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_BestProductSellers'), 
    'value', 'Meilleures ventes de produits', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalSalesIn'), 
    'value', 'Total des ventes en', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_BestSellers'), 
    'value', 'Meilleures ventes', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_ItemID'), 'value', 
    'ID de l\'article', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalSales_2'), 
    'value', 'Ventes totales', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_ItemSold'), 
    'value', 'Item Vendu', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TopViewedItems'), 
    'value', 'Top Articles consultés', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield__Total ViewsPerItem'), 
    'value', 'Nombre total de vues par article', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_MostViewed'), 
    'value', 'Le plus regardé', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalViews'), 
    'value', 'Vues totales', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Day'), 'value', 
    'journée', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Week'), 'value', 
    'Semaine', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Month'), 'value', 
    'Mois', 0)

