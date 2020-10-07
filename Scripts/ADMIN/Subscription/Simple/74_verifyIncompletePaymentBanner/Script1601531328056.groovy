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

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/13_redirectionUsers'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/15_redirectionItems'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/18_redirectionTransactionList'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/20_redirectionFailedTransaction'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/23_redirectionCategories'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/24_redirectionCustomFields'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/25_redirectionExternalLinks'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/26_redirectionCommission'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/27_redirectionCustomDomain'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/28_redirectionSetupPayment'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/29_redirectionFeatureToggle'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/30_redirectionLoginConfiguration'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/33_redirectionGeneral'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/34_redirectionTheme'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/35_redirectionHomapageLayout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/36_redirectionAboutUs'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/37_redirectionMarketplacePolicies'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/41_redirectionPrivateSettings'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/43_redirectionAdminPermission'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/44_redirectionAdminActivityLog'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/45_redirectionMerchantSubAccounts'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/47_clickEmailNotification'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/48_redirectionEmailTemplate'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/49_redirectionMailLogs'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/52_redirectionMarketplaceAnalytics'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/53_redirectionGoogleAnalytics'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/54_redirectionSEO'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/55_redirectionRobot'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/56_redirectionSitemap'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Subscription/banner_FreeTrial'))

WebUI.verifyElementText(findTestObject('ADMIN/Subscription/banner_FreeTrial'), 'Looks like you have a subscription invoice that requires some action to complete payment Click here to go to your subscription invoice list')

