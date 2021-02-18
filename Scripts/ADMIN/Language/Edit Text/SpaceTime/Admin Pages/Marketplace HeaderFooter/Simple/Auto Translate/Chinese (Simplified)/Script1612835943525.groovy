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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 'Chinese (Simplified)', 
    false)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Search'), 
    'value', '搜索...', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Location'), 
    'value', '地点', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_BeASeller'), 
    'value', '是卖家', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_More'), 
    'value', '更多', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_RegisterSignIn'), 
    'value', '注册/登录', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Seller'), 
    'value', '卖方', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Profile'), 
    'value', '简介', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Dashboard'), 
    'value', '仪表板', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Purchases'), 
    'value', '购买', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_YourServices'), 
    'value', '您的服务', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Settings'), 
    'value', '设置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_AddService'), 
    'value', '添加服务', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Logout'), 
    'value', '登出', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Bookings'), 
    'value', '预订', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_SubAccount'), 
    'value', '子帐户', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_AboutUs'), 
    'value', '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfieldTermsOfService'), 
    'value', '服务条款', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_PrivacyPolicy'), 
    'value', '隐私政策', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_ReturnPolicy'), 
    'value', '退货政策', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_FAQ'), 
    'value', '常问问题', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_ContactUs'), 
    'value', '联系我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_AllRightsReserved'), 
    'value', '版权所有。 ©', 0)

