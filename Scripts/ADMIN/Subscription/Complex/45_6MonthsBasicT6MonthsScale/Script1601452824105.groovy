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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/66_redirectionSubscription'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Subscription/dropdown_Plan'), '6 Months Billing (+) (2 Days)', false)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/a_buttonUpgradewithBanner/button_6monthsBasicUpgrade'), 'Selected')

WebUI.click(findTestObject('ADMIN/Subscription/a_buttonUpgradewithBanner/button_6monthsScaleUpgrade'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Payment for Subscription/button_Back'), 0)

WebUI.setText(findTestObject('ADMIN/Payment for Subscription/textfield_FirstName'), 'April')

WebUI.setText(findTestObject('ADMIN/Payment for Subscription/textfield_LastName'), 'Hernandez')

WebUI.setText(findTestObject('ADMIN/Payment for Subscription/textfield_BillingAddress'), 'Residencias de Manila')

WebUI.selectOptionByLabel(findTestObject('ADMIN/Payment for Subscription/dropdown_Country'), 'Philippines', false)

WebUI.setText(findTestObject('ADMIN/Payment for Subscription/textfield_State'), 'Pandacan')

WebUI.setText(findTestObject('ADMIN/Payment for Subscription/textfield_City'), 'Metro Manila')

WebUI.setText(findTestObject('ADMIN/Payment for Subscription/textfield_PostalCode'), '1011')

WebUI.setText(findTestObject('ADMIN/Payment for Subscription/textfield_Email'), 'arcqatester01@gmail.com')

WebUI.setText(findTestObject('ADMIN/Payment for Subscription/textfield_CardNumber'), '4242 4242 4242 4242')

WebUI.setText(findTestObject('ADMIN/Payment for Subscription/textfield_ExpiryCVC'), '1122123')

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Payment for Subscription/button_PayNow'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Subscription/dropdown_Plan'), 0)

