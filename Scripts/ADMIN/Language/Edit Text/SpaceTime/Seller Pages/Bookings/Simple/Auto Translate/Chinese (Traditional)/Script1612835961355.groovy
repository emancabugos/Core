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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 'Chinese (Traditional)', 
    false)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_YourBookings'), 
    'value', '你的預訂', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_ServiceStartDate'), 
    'value', '服務開始日期', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfiel_BuyerName'), 
    'value', '買家名稱', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_ServiceStartDateFrom'), 
    'value', '過濾器服務開始日期', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_ExportCSV'), 
    'value', '導出CSV', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_cancelOrder'), 
    'value', '取消訂單', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_orderCancelled'), 
    'value', '訂單已取消', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_BuyerInfo'), 
    'value', '買家信息', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_AdminFee'), 
    'value', '管理費', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_ServiceDetails'), 
    'value', '服務細節', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_Note'), 'value', 
    '注意：', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_StatusChange'), 
    'value', '狀態已更改', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textarea_ItemOrderStatus'), 
    'value', '此項目的訂單狀態已更新。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_confirmCancel'), 
    'value', '確認取消', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Bookings/textfield_bookWillCancel'), 
    'value', '預訂時段將被取消', 0)

