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

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/input_payment-method-name'), 0)

WebUI.setText(findTestObject('ADMIN/Configure Payments/Custom Payment/input_payment-method-name'), 'Handshake')

WebUI.setText(findTestObject('ADMIN/Configure Payments/Custom Payment/textarea_custom-gateway-descri'), 'Custom Payment')

WebUI.setText(findTestObject('ADMIN/Configure Payments/Custom Payment/handshake'), 'https://cash.test.arcadier.io/payment/generatepaykey')

WebUI.setText(findTestObject('ADMIN/Configure Payments/Custom Payment/input_redirect-endpoint-url'), 'https://cash.test.arcadier.io/cash/agreement')

WebUI.click(findTestObject('ADMIN/Configure Payments/Custom Payment/div_Browse'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('ADMIN/Configure Payments/Custom Payment/input_thumb'), 'C:\\\\Katalon\\\\Core\\\\Images\\\\LogoLayout\\\\logo1.jpg')

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/div_btn btn-success btn-ok'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/Custom Payment/div_btn btn-success btn-ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Save Photo'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Save Photo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Save'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/Custom Payment/a_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Configure Payments/Custom Payment/div_payment-status-color2'), 0)

WebUI.click(findTestObject('ADMIN/Configure Payments/toggle_mandatory stripe'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ADMIN/Getting Started/Step 3/button_im done here'), 0)

WebUI.click(findTestObject('ADMIN/Getting Started/Step 3/button_im done here'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

