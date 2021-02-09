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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'English', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_DASHBOARD_marketplace-name'), 
    'value', 'DASHBOARD', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_A quick overview of your sales and seller activity_item_details'), 
    'value', 'A quick overview of your sales and seller activity.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Orders Today_order-today'), 
    'value', 'Orders Today', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Revenue Today_revenue-today'), 
    'value', 'Revenue Today', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_BEST SELLER_best-seller'), 
    'value', 'BEST SELLER', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Quantity left_quantity-left'), 
    'value', 'Quantity left', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_TODAY_today'), 'value', 
    'TODAY', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_LAST 7 DAYS_last-7days'), 
    'value', 'LAST 7 DAYS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_LAST 30 DAYS_last-30days'), 
    'value', 'LAST 30 DAYS', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Sales_total-sales'), 
    'value', 'Total Sales', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Orders_total-orders'), 
    'value', 'Total Orders', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Visits_total-visits'), 
    'value', 'Total Visits', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Avr Order By Rev_avr-order-by-rev'), 
    'value', 'Avr Order By Rev', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Avr Items Sold Per Order_avr-item-sold-per-order'), 
    'value', 'Avr Items Sold Per Order', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Sales_order-sales'), 
    'value', 'Sales', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Revenue_total-revenue'), 
    'value', 'Total Revenue', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Orders_total-orders1'), 
    'value', 'Total Orders', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Best Product Sellers_best-product-sellers'), 
    'value', 'Best Product Sellers', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Sales in_total-sales-in'), 
    'value', 'Total Sales in', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Best Sellers_best-sellers'), 
    'value', 'Best Sellers', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Item ID_item-id'), 
    'value', 'Item ID', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Sales_total-sales1'), 
    'value', 'Total Sales', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Item Sold_item-sold'), 
    'value', 'Item Sold', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Top Viewed Items_top-viewed-item'), 
    'value', 'Top Viewed Items', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Views per Item_total-views-per-item'), 
    'value', 'Total Views per Item', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Most Viewed_most-viewed'), 
    'value', 'Most Viewed', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Views_total-views'), 
    'value', 'Total Views', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Day_order-day'), 
    'value', 'Day', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Week_order-week'), 
    'value', 'Week', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Month_order-time'), 
    'value', 'Month', 0)

