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

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/dropdown_AdminConsumerGeneralIte'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/dropdown_AdminConsumerGeneralIte'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Email Notifications/Welcome Mail/dropdown_AdminConsumerGeneralIte'), 'General', 
    true)

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/General Parameters/Arcadier URL'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/General Parameters/Arcadier URL'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/General Parameters/Return URL'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Parameters/General Parameters/Currency Code'))

WebUI.delay(2)

