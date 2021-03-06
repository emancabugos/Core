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

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_ServiceName'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_ItemDescription'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_ServiceAddOn'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_ListingUpdated'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_ItemHasBeenSaved'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_DefaultLanguage'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_AddTranslation'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_AddOwnTranslation'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_DifferentLanguage'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_DoItLater'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_AddTranslation'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_EditTranslation'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_HaveNotFinished'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_LeavePage'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_Cancel'), '')

WebUI.setText(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_Continue'), '')

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_failed'), 0)

