import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Homepage/a_BE A SELLER'), 0)

if (WebUI.verifyElementPresent(findTestObject('Utilities/Cookies/button_Accept Cookies'), 3, FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    WebUI.click(findTestObject('Utilities/Cookies/button_Accept Cookies'), FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.verifyElementPresent(findTestObject('SPACETIME/CONSUMER/Homepage/a_BE A SELLER'), 0)
}

WebUI.click(findTestObject('SPACETIME/CONSUMER/Homepage/a_BE A SELLER'))

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/button_create-account'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/textbox_username'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/textbox_username'), varSellerUsername)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/textbox_password'), 'welcome8')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/textbox_reconfirm-password'), 'welcome8')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/textbox_notificationemail'), varEmail)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/button_create account'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Profile')

WebUI.verifyElementPresent(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/browse_img'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/browse_img'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/image_container'), varImage)

WebUI.waitForElementVisible(findTestObject('Utilities/Image Cropper/button_ok'), 0)

WebUI.click(findTestObject('Utilities/Image Cropper/button_ok'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Image Cropper/button_Save Photo'), 0)

WebUI.click(findTestObject('Utilities/Image Cropper/button_Save Photo'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/textbox_DisplayName'), varFname)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/textarea_Description'), varDescription)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/textbox_FirstName'), varFname)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/textbox_LastName'), varLname)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/textbox_PhoneNumber'), varContact)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/textbox_SellerLocation'), varSellerLocation)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Profile/button_Next profile'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Address')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Address/textbox_myaddress'), varAddress)

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/dropdown_country'), 
    varCountry, false)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Address/textbox_state'), varState)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Address/textbox_city'), varCity)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Address/textbox_postal-code'), varPostalCode)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Address/button_Add Address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Onboarding/Address/container_address'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Address/button_NEXT address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Payment')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Payment/Custom Payment/button_Link Account'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Payment/Custom Payment/button_Link Account'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Payment/Custom Payment/button_Okay'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Payment/Custom Payment/button_Okay'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Onboarding/Payment Acceptance/button_Next payment'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Payment Acceptance/button_Next payment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/button_SKIP THIS STEP'), 0)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/textbox_delivery_name'), 'Delivery 1')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/textbox_delivery_price'), '40.25')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/button_Add delivery'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/textbox_delivery_name'), 'Delivery 2')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/textbox_delivery_price'), '80.50')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/button_Add delivery'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/textbox_location_name'), 'Pickup 1')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/buttton_Add pickup'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/textbox_location_name'), 'Pickup 2')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/buttton_Add pickup'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Onboarding/Delivery Method/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/User Menu/img_usermenu'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/User Menu/img_usermenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/User Menu/a_Logout'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/User Menu/a_Logout'), FailureHandling.CONTINUE_ON_FAILURE)

