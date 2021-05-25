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

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Welcome Mail'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Start Selling'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_New Order'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Received Order'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Order Pickup'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Order Shipped'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Review Prompt'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Account Suspended'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Change of Payments'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Seller Invite'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Buyer Invite'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Message (From Seller)'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Message (From Buyer)'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Offer (From Seller)'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Offer (From Seller)'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Offer Declined (To Seller)'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Acknowledged'))

WebUI.verifyElementClickable(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/span_Reset Password'))

