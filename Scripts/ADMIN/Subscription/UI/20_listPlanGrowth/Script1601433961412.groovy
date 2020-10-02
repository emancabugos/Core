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

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/growth_UnlimitedUsersListings'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/growth_2500Transactions'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/growth_NoTransactionFees'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/growth_NoArcadierBranding'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/growth_CustomDomainNames'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/growth_CustomJavaScript'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/growth_CustomisableHomepage'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/growth_PluginMarketplaceAccess'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/growth_PrivatePlugins'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/growth_GoogleAnalytics'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/growth_EmailDigitalSupport'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/growth_AcessAPIs'))

