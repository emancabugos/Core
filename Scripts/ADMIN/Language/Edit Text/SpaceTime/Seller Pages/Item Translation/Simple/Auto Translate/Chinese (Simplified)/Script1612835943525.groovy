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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 'Chinese (Simplified)', 
    false)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_ServiceName'), 
    'value', 'Service Name', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_ItemDescription'), 
    'value', 'Item Description', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_ServiceAddOn'), 
    'value', 'Service Add-on', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_ListingUpdated'), 
    'value', 'Listing updated!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_ItemHasBeenSaved'), 
    'value', 'This item has been saved in', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_DefaultLanguage'), 
    'value', 'The default language of the buyer pages is', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_AddTranslation'), 
    'value', 'We recommend you to add a translation in that language!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_AddOwnTranslation'), 
    'value', 'Google translation have not been added yet. You may add your own translation below.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_DifferentLanguage'), 
    'value', 'It has also been translated in different language(s)! You may check / edit them below!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_DoItLater'), 
    'value', 'I’ll do it later', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_AddTranslation'), 
    'value', 'Add Translations', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_EditTranslation'), 
    'value', 'Edit Translations', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_HaveNotFinished'), 
    'value', 'You have not finished', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_LeavePage'), 
    'value', 'You are about to leave the page with out saving your progress. Would you like to leave this page?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_Cancel'), 
    'value', 'Cancel', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Item Translation/textfield_Continue'), 
    'value', 'Continue', 0)

