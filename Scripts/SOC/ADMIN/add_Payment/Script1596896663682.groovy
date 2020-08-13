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

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/UI/06_iconViewMarketplace'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/28_redirectionSetupPayment'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Add a custom payment method'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Back'), 0)

WebUI.setText(findTestObject('ADMIN/Configure Payments/Custom Payment/input_payment-method-name'), 'Custom Payment')

WebUI.click(findTestObject('ADMIN/Configure Payments/Custom Payment/div_Browse'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/input_thumb'), 0)

WebUI.uploadFile(findTestObject('ADMIN/Configure Payments/Custom Payment/input_thumb'), 'C:\\Katalon\\BespokeAPI\\Images\\UN Items\\item1.jpg')

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/div_btn btn-success btn-ok'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/Custom Payment/div_btn btn-success btn-ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Save Photo'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Save Photo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('ADMIN/Configure Payments/Custom Payment/textarea_custom-gateway-descri'), 'This is Custom Payment')

WebUI.delay(1)

WebUI.setText(findTestObject('ADMIN/Configure Payments/Custom Payment/handshake'), 'https://cash.test.arcadier.io/payment/generatepaykey')

WebUI.delay(1)

WebUI.setText(findTestObject('ADMIN/Configure Payments/Custom Payment/input_redirect-endpoint-url'), 'https://cash.test.arcadier.io/cash/agreement')

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Add a custom payment method'), 0)

