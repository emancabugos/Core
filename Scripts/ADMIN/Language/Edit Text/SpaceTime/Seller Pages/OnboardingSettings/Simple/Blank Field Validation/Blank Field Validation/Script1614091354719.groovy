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

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_UserSettings'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Profile'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_AboutYou'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_DisplayName'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Timezone'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_OpenLoginID'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SellerLocation'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_TransactionFee'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Address'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SelectCountry'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_PaymentAcceptance'), 
    '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_PaymentMethod'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SelectYourPaymentMethod'), 
    '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_LinkAccount'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Verified'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Compulsory'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_NoLinkAccount'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Optional'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_FormOptional'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_SkipThisStep'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_DeliveryMethod'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_RemoveItem'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_RemovePopup'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Back'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_AccountConfiguration'), 
    '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_VerifiedByOmise'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Type'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_TaxIdentificationNumber'), 
    '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Individual'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_Corporate'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_BankBranchCode'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_BankAccountNumber'), 
    '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Onboarding  Settings/textfield_BankAccountName'), '')

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

