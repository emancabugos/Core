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

if (WebUI.verifyElementPresent(findTestObject('Utilities/Cookies/button_Accept Cookies'), 2, FailureHandling.OPTIONAL) == 
true) {
    WebUI.click(findTestObject('Utilities/Cookies/button_Accept Cookies'), FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.verifyElementPresent(findTestObject('SPACETIME/CONSUMER/Homepage/a_BE A SELLER'), 0)
}

WebUI.waitForElementVisible(findTestObject('Mogozay/Seller/Onboarding/register page/textbox_username'), 0)

WebUI.setText(findTestObject('Mogozay/Seller/Onboarding/register page/textbox_username'), 'Test1')

WebUI.setText(findTestObject('Mogozay/Seller/Onboarding/register page/textbox_password'), 'welcome8')

WebUI.setText(findTestObject('Mogozay/Seller/Onboarding/register page/textbox_reconfirm password'), 'welcome8')

WebUI.setText(findTestObject('Mogozay/Seller/Onboarding/register page/textbox_email'), 'arcadierteam@gmail.com')

WebUI.click(findTestObject('Mogozay/Seller/Onboarding/register page/button_create'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Profile')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/button_CHANGE'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/button_CHANGE'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/image_container'), 'C:\\\\Katalon\\Core\\\\Images\\\\SellerPhoto\\\\1.png')

WebUI.waitForElementVisible(findTestObject('Utilities/Image Cropper/button_ok'), 0)

WebUI.click(findTestObject('Utilities/Image Cropper/button_ok'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Image Cropper/button_Save Photo'), 0)

WebUI.click(findTestObject('Utilities/Image Cropper/button_Save Photo'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_DisplayName'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_DisplayName'), 'Seller1')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_description'), 'I am the first seller.')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_FirstName'), 'Seller1')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_LastName'), 'Seller Lastname')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_PhoneNumber'), '+631234567980')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_SellerLocation'), 
    'Makati City')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/button_NEXT profile'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Address')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_first-name'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_first-name'), 'Seller1')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_last-name'), 'Seller Lastname')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_myaddress'), 'Rufino Pacific Tower Bldg.')

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/dropdown_country'), 
    'Philippines', false)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_state'), 'NCR')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_city'), 'Makati')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_postal-code'), '1200')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/button_add address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/cont_Address'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/button_NEXT address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Payment')

WebUI.waitForElementVisible(findTestObject('Mogozay/Seller/Onboarding/Payment/button_link Stripe'), 0)

WebUI.click(findTestObject('Mogozay/Seller/Onboarding/Payment/button_link Stripe'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Mogozay/Seller/Onboarding/Payment/skip_stripe'), 0)

WebUI.click(findTestObject('Mogozay/Seller/Onboarding/Payment/skip_stripe'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Mogozay/Seller/Onboarding/Payment/button_link COD'), 0)

WebUI.click(findTestObject('Mogozay/Seller/Onboarding/Payment/button_link COD'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Mogozay/Seller/Onboarding/Payment/button_okay COD'), 0)

WebUI.click(findTestObject('Mogozay/Seller/Onboarding/Payment/button_okay COD'), FailureHandling.CONTINUE_ON_FAILURE)

