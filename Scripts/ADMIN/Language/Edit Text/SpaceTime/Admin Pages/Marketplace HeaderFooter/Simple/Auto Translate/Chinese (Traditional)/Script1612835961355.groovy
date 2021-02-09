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

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Search'), 
    'value', '搜索...', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Location'), 
    'value', '地點', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_BeASeller'), 
    'value', '是賣家', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_More'), 
    'value', '更多', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_RegisterSignIn'), 
    'value', '註冊/登錄', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Seller'), 
    'value', '賣方', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Profile'), 
    'value', '簡介', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Dashboard'), 
    'value', '儀表板', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Purchases'), 
    'value', '購買', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_YourServices'), 
    'value', '您的服務', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Settings'), 
    'value', '設置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_AddService'), 
    'value', '添加服務', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Logout'), 
    'value', '登出', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Bookings'), 
    'value', '預訂', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_SubAccount'), 
    'value', '子帳戶', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_AboutUs'), 
    'value', '關於我們', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfieldTermsOfService'), 
    'value', '服務條款', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_PrivacyPolicy'), 
    'value', '隱私政策', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_ReturnPolicy'), 
    'value', '退貨政策', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_FAQ'), 
    'value', '常問問題', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_ContactUs'), 
    'value', '聯繫我們', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_AllRightsReserved'), 
    'value', '版權所有。 ©', 0)

