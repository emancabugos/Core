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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 'English', false)

WebUI.delay(1)

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/texfield_Dashboard'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_SellerActivity'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_OrdersToday'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_RevenueToday'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_BestSeller'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_QuantityLeft'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Today'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Last7Days'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Last30Days'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalSales'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalOrders'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalVisits'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_AvrOrderByRev'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_AvrItemsSoldPerOrder'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Sales'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalRevenue'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalOrders_2'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_BestProductSellers'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalSalesIn'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_BestSellers'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_ItemID'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalSales_2'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_ItemSold'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TopViewedItems'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield__Total ViewsPerItem'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_MostViewed'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_TotalViews'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Day'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Week'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Dashboard/textfield_Month'), '')

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

