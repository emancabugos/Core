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

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 'English', false)

WebUI.delay(1)

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Inbox/textfield_Inbox'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Inbox/textfield_SearchByService'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Inbox/textfield_Buying'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Inbox/textfield_Selling'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Inbox/textfield_Accepted'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Inbox/textfield_PreApproved'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Inbox/textfield_Enquiry'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Inbox/textfield_Declined'), '')

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

