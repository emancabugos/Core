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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Seller Pages/Dashboard Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Portuguese', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_DASHBOARD_marketplace-name'), 
    'value', 'PAINEL DE CONTROLE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_A quick overview of your sales and seller activity_item_details'), 
    'value', 'Uma rápida visão geral de sua atividade de vendas e vendedor.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Orders Today_order-today'), 
    'value', 'Pedidos Hoje', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Revenue Today_revenue-today'), 
    'value', 'Receita Hoje', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_BEST SELLER_best-seller'), 
    'value', 'MAIS VENDIDOS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Quantity left_quantity-left'), 
    'value', 'Quantidade restante', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_TODAY_today'), 'value', 
    'HOJE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_LAST 7 DAYS_last-7days'), 
    'value', 'ÚLTIMOS 7 DIAS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_LAST 30 DAYS_last-30days'), 
    'value', 'ÚLTIMOS 30 DIAS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Sales_total-sales'), 
    'value', 'Vendas totais', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Orders_total-orders'), 
    'value', 'Total de pedidos', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Visits_total-visits'), 
    'value', 'Visitas totais', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Avr Order By Rev_avr-order-by-rev'), 
    'value', 'Avr pedido por receita', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Avr Items Sold Per Order_avr-item-sold-per-order'), 
    'value', 'Itens Avr Vendidos por Pedido', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Sales_order-sales'), 
    'value', 'Vendas', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Revenue_total-revenue'), 
    'value', 'Rendimento total', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Orders_total-orders1'), 
    'value', 'Total de pedidos', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Best Product Sellers_best-product-sellers'), 
    'value', 'Vendedores de melhores produtos', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Sales in_total-sales-in'), 
    'value', 'Vendas totais em', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Best Sellers_best-sellers'), 
    'value', 'Mais vendidos', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Item ID_item-id'), 
    'value', 'Identificação do item', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Sales_total-sales1'), 
    'value', 'Vendas totais', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Item Sold_item-sold'), 
    'value', 'Item Vendido', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Top Viewed Items_top-viewed-item'), 
    'value', 'Itens Vistos Top', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Views per Item_total-views-per-item'), 
    'value', 'Total de visualizações por item', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Most Viewed_most-viewed'), 
    'value', 'Mais visto', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Views_total-views'), 
    'value', 'Visualizações totais', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Day_order-day'), 
    'value', 'Dia', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Week_order-week'), 
    'value', 'Semana', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Month_order-time'), 
    'value', 'Mês', 0)

