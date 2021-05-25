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

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_UserSettings'), 
    'value', '用戶設置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Profile'), 
    'value', '簡介', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_AboutYou'), 
    'value', '關於你', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_DisplayName'), 
    'value', '您的顯示名稱', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Timezone'), 
    'value', '時區', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_OpenLoginID'), 
    'value', 'OpenID登錄', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SellerLocation'), 
    'value', '賣家位置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_TransactionFee'), 
    'value', '對於通過市場的每次交易中，會有一個賣家交易費：', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Address'), 
    'value', '地址', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SelectCountry'), 
    'value', '選擇國家', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_PaymentAcceptance'), 
    'value', '支付受理', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_PaymentMethod'), 
    'value', '付款方法', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SelectYourPaymentMethod'), 
    'value', '選擇您的首選付款方式。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_LinkAccount'), 
    'value', '鏈接帳戶', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Verified'), 
    'value', '驗證', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Compulsory'), 
    'value', '這種付款方式是強制性的。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_NoLinkAccount'), 
    'value', '沒有帳號還掛', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Optional'), 
    'value', '可選的', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_FormOptional'), 
    'value', '由於填寫此部分錶單是可選的，您可能希望跳過它。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SkipThisStep'), 
    'value', '跳過此步驟', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_DeliveryMethod'), 
    'value', '運輸方式', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_RemoveItem'), 
    'value', '除去項目', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_RemovePopup'), 
    'value', '你確定從列表中刪除這個項目嗎？ （這將一去不復返！）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Back'), 
    'value', '背部', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_AccountConfiguration'), 
    'value', '帳戶配置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_VerifiedByOmise'), 
    'value', '您在此處輸入的詳細信息將由Omise保存和驗證。您從銷售中賺取的錢將被直接授權到您的銀行賬戶', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Type'), 
    'value', '類型', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_TaxIdentificationNumber'), 
    'value', '稅號（可選）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Individual'), 
    'value', '個人', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Corporate'), 
    'value', '企業', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_BankBranchCode'), 
    'value', '銀行/分行代碼', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_BankAccountNumber'), 
    'value', '銀行帳號', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_BankAccountName'), 
    'value', '銀行賬戶名稱', 0)

