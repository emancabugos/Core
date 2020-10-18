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

WebUI.comment('Clear all textfield')

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_DASHBOARD_marketplace-name'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_A quick overview of your sales and seller activity_item_details'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Orders Today_order-today'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Revenue Today_revenue-today'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_BEST SELLER_best-seller'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Quantity left_quantity-left'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_TODAY_today'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_LAST 7 DAYS_last-7days'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_LAST 30 DAYS_last-30days'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Sales_total-sales'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Orders_total-orders1'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Visits_total-visits'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Avr Order By Rev_avr-order-by-rev'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Avr Items Sold Per Order_avr-item-sold-per-order'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Sales_order-sales'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Revenue_total-revenue'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Orders_total-orders1'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Sales_total-sales1'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Best Sellers_best-sellers'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Item ID_item-id'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Sales_total-sales'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Item Sold_item-sold'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Views per Item_total-views-per-item'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Views_total-views'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Day_order-day'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Week_order-week'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Month_order-time'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

WebUI.comment('Verification highlight textfield')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_DASHBOARD_marketplace-name'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_A quick overview of your sales and seller activity_item_details'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Orders Today_order-today'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Revenue Today_revenue-today'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_BEST SELLER_best-seller'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Quantity left_quantity-left'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_TODAY_today'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_LAST 7 DAYS_last-7days'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_LAST 30 DAYS_last-30days'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Sales_total-sales'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Orders_total-orders1'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Visits_total-visits'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Avr Order By Rev_avr-order-by-rev'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Avr Items Sold Per Order_avr-item-sold-per-order'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Sales_order-sales'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Revenue_total-revenue'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Orders_total-orders1'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Sales_total-sales1'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Best Sellers_best-sellers'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Item ID_item-id'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Sales_total-sales'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Item Sold_item-sold'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Views per Item_total-views-per-item'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Total Views_total-views'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Day_order-day'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Week_order-week'), 'class', 'form-control error-con', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Seller Pages/Dashboard/input_Month_order-time'), 'class', 'form-control error-con', 0)
