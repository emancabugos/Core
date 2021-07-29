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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/textlink_Homepage'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/textlink_Onboard  Settings'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/textlink_Merchant Storefront'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/textlink_Search Result Page'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/textlink_Item Details'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/textlink_Cart'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/textlink_Checkout (Delivery Details)'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/textlink_Checkout (Order Review)'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/textlink_Checkout (Payment)'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/textlink_Checkout (Completed)'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/textlink_Purchase History'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/textlink_Purchase History Details'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/textlink_Inbox'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/textlink_Chat'))

