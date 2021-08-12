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

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Homepage/a_REGISTER  SIGN IN'), 0)

if (WebUI.verifyElementPresent(findTestObject('FIND/SELLER/Login/btn_acceptCookies'), 2, FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('FIND/SELLER/Login/btn_acceptCookies'))
} else {
    WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.click(findTestObject('SPACETIME/CONSUMER/Homepage/a_REGISTER  SIGN IN'))

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/button_create-account'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/textbox_username'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/textbox_username'), varBuyerUsername)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/textbox_password'), 'welcome8')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/textbox_reconfirm-password'), 'welcome8')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/textbox_notificationemail'), varEmail)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Create Account/button_create account'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('Navigate to User Settings')

WebUI.click(findTestObject('Utilities/Bespoke Usermenu/icon_usermenu'))

WebUI.waitForElementVisible(findTestObject('Utilities/Bespoke Usermenu/linktext_Settings'), 0)

WebUI.click(findTestObject('Utilities/Bespoke Usermenu/linktext_Settings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Profile')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/button_CHANGE'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/button_CHANGE'))

WebUI.delay(1)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/image_container'), varImage)

WebUI.waitForElementVisible(findTestObject('Utilities/Image Cropper/button_ok'), 0)

WebUI.click(findTestObject('Utilities/Image Cropper/button_ok'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Image Cropper/button_Save Photo'), 0)

WebUI.click(findTestObject('Utilities/Image Cropper/button_Save Photo'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Profile/input_DISPLAY NAME_DisplayName'), varFname)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Profile/input_FIRST NAME_FirstName'), varFname)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Profile/input_LAST NAME_LastName'), varLname)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Profile/input_CONTACT NUMBER_PhoneNumber'), varContact)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/button_NEXT profile'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Address')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Address/input_ADDRESSEE FIRST NAME_first-name'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Address/input_ADDRESSEE FIRST NAME_first-name'), varAddFname)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Address/input_ADDRESSEE LAST NAME_last-name'), varAddLname)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Address/input_ADDRESS_myaddress'), varAddress)

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Address/dd_country'), varCountry, false)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Address/input_STATE_state'), varState)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Address/input_CITY_city'), varCity)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Address/input_POSTAL CODE_postal-code'), varPostalCode)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Address/input_POSTAL CODE_my-btn btn-black'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Address/address_cont'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Address/button_SAVE'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Onboarding/Address/button_SAVE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Utilities/CONSUMER/Consumer Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

