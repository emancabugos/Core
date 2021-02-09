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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Chinese (Simplified)', 
    false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_DASHBOARD_marketplace-name'), 
    'value', '仪表板', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_A quick overview of your sales and seller activity_item_details'), 
    'value', '快速了解您的销售和销售活动。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Orders Today_order-today'), 
    'value', '今天订单', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Revenue Today_revenue-today'), 
    'value', '今天收入', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_BEST SELLER_best-seller'), 
    'value', '畅销书', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Quantity left_quantity-left'), 
    'value', '剩余数量', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_TODAY_today'), 'value', 
    '今天', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_LAST 7 DAYS_last-7days'), 
    'value', '最近7天', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_LAST 30 DAYS_last-30days'), 
    'value', '最近30天', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Sales_total-sales'), 
    'value', '总销售额', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Orders_total-orders'), 
    'value', '总订单', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Visits_total-visits'), 
    'value', '访问总数', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Avr Order By Rev_avr-order-by-rev'), 
    'value', 'Rev的Avr订单', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Avr Items Sold Per Order_avr-item-sold-per-order'), 
    'value', '每次订购的Avr商品', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Sales_order-sales'), 
    'value', '销售', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Revenue_total-revenue'), 
    'value', '总收入', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Orders_total-orders1'), 
    'value', '总订单', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Best Product Sellers_best-product-sellers'), 
    'value', '最佳产品卖家', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Sales in_total-sales-in'), 
    'value', '总销售额', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Best Sellers_best-sellers'), 
    'value', '最畅销', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Item ID_item-id'), 
    'value', '物品ID', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Sales_total-sales1'), 
    'value', '总销售额', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Item Sold_item-sold'), 
    'value', '物品出售', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Top Viewed Items_top-viewed-item'), 
    'value', '热门浏览的项目', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Views per Item_total-views-per-item'), 
    'value', '每个项目的总浏览量', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Most Viewed_most-viewed'), 
    'value', '最受关注', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Views_total-views'), 
    'value', '总浏览', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Day_order-day'), 
    'value', '天', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Week_order-week'), 
    'value', '周', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Month_order-time'), 
    'value', '月', 0)

