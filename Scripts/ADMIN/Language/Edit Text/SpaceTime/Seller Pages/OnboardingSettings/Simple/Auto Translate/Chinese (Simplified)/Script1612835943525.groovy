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

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_UserSettings'), 
    'value', '用户设置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Profile'), 
    'value', '简介', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_AboutYou'), 
    'value', '关于你', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_DisplayName'), 
    'value', '您的显示名称', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Timezone'), 
    'value', '时区', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_OpenLoginID'), 
    'value', 'OpenID登录', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SellerLocation'), 
    'value', '卖家位置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_TransactionFee'), 
    'value', '对于通过市场的每次交易中，会有一个卖家交易费：', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Address'), 
    'value', '地址', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SelectCountry'), 
    'value', '选择国家', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_PaymentAcceptance'), 
    'value', '支付受理', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_PaymentMethod'), 
    'value', '付款方法', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SelectYourPaymentMethod'), 
    'value', '选择您的首选付款方式。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_LinkAccount'), 
    'value', '链接帐户', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Verified'), 
    'value', '验证', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Compulsory'), 
    'value', '这种付款方式是强制性的。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_NoLinkAccount'), 
    'value', '没有帐号还挂', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Optional'), 
    'value', '可选的', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_FormOptional'), 
    'value', '填写这部分表单是可选的，您可能希望跳过它。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SkipThisStep'), 
    'value', '跳过此步骤', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_DeliveryMethod'), 
    'value', '运输方式', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_RemoveItem'), 
    'value', '除去项目', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_RemovePopup'), 
    'value', '你确定从列表中删除这个项目吗？ （这将一去不复返！）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Back'), 
    'value', '背部', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_AccountConfiguration'), 
    'value', '帐户配置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_VerifiedByOmise'), 
    'value', '您在此处输入的详细信息将由Omise保存和验证。您从销售中赚取的钱将被直接授权到您的银行账户', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Type'), 
    'value', '类型', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_TaxIdentificationNumber'), 
    'value', '税号（可选）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Individual'), 
    'value', '个人', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Corporate'), 
    'value', '企业', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_BankBranchCode'), 
    'value', '银行/分行代码', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_BankAccountNumber'), 
    'value', '银行帐号', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_BankAccountName'), 
    'value', '银行账户名称', 0)

