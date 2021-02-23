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

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/dd_icon EDM'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/dd_icon EDM'), 'Hindi', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Offer from Seller/input_You have a new offer'), 
    'value', 'आपके पास एक नई पेशकश है', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Offer from Seller/input_Hi'), 'value', 'नमस्ते', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Offer from Seller/input_You have a new offer from_welcome'), 
    'value', 'आपके पास से एक नई पेशकश है', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Offer from Seller/input_Click here to view and respond to_view_respond'), 
    'value', 'देखने और जवाब देने के लिए यहां क्लिक करें', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Offer from Seller/input_offer_offer'), 'value', 
    'प्रस्ताव।', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Offer from Seller/input_Thank you_thankyou'), 
    'value', 'धन्यवाद!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Offer from Seller/input_Regards_regards'), 
    'value', 'सादर', 0)

