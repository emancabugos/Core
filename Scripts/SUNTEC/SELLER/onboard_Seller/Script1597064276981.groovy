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

WebUI.comment('Profile')

WebUI.waitForElementVisible(findTestObject('SOC/Add Item/button_AcceptCookies'), 0)

WebUI.click(findTestObject('SOC/Add Item/button_AcceptCookies'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementNotPresent(findTestObject('SOC/Add Item/button_AcceptCookies'), 0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/button_CHANGE'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/button_CHANGE'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/image_container'), 'C:\\Katalon\\BespokeAPI\\Images\\Category\\1.png')

WebUI.waitForElementVisible(findTestObject('Utilities/Image Cropper/button_ok'), 0)

WebUI.click(findTestObject('Utilities/Image Cropper/button_ok'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Image Cropper/button_Save Photo'), 0)

WebUI.click(findTestObject('Utilities/Image Cropper/button_Save Photo'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_DisplayName'), 'st_seller01')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_description'), 'First seller!')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_FirstName'), 'Calcifer')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_LastName'), 'Pendragon')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_PhoneNumber'), '0912345678')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/textbox_SellerLocation'), 
    'PH')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Profile Page/Profile/button_NEXT profile'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Address')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_first-name'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_first-name'), 'Calcifer')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_last-name'), 'Pendragon')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_myaddress'), 'Residencias de Manila')

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/dropdown_country'), 
    'Philippines', false)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_state'), 'Pandacan')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_city'), 'Metro Manila')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/textbox_postal-code'), '1011')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/button_add address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/cont_Address'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Address Page/Address/button_NEXT address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Payment - Custom Payment')

WebUI.waitForElementVisible(findTestObject('SUNTEC/Onboarding/button_LinkAccount'), 0)

WebUI.click(findTestObject('SUNTEC/Onboarding/button_LinkAccount'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Payment/Custom Payment/button_Okay'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Payment/Custom Payment/button_Okay'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Payment/button_save'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Onboarding/Payment/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Your Items/button_add item'), 0)

