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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), selectLanguage, false)

WebUI.delay(1)

WebUI.comment('Header - Guest')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Search'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Location'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_BeASeller'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_More'), '*')

WebUI.comment('Header - Logged In')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Seller'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Profile'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Dashboard'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Purchases'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_YourServices'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Settings'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_AddService'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Logout'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_Bookings'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_SubAccount'), '*')

WebUI.comment('Footer')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_AboutUs'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfieldTermsOfService'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_PrivacyPolicy'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_ReturnPolicy'), 
    '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_FAQ'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_ContactUs'), '*')

WebUI.sendKeys(findTestObject('ADMIN/Edit Text/Spacetime/Admin Pages/Marketplace Header Footer/textfield_AllRightsReserved'), 
    '*')

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/button_save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Homepage/toaster_success'), 0)

