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

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Header/header_Your Services'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Header/header_Your Services'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Listing Page/icon_edit'), 0)

WebUI.verifyElementVisibleInViewport(findTestObject('SPACETIME/MERCHANT/Listing Page/icon_edit'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Listing Page/icon_edit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_service name'), 0)

WebUI.scrollToElement(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/button_Next basic details'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/button_Next basic details'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'), 
    0 /*if (varSchedule == '9AM - 5PM') {
        WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/Operating Hours/mon_st'), '')
    } else if (varSchedule == '7AM - 10PM') {
        WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'))
    } else if (varSchedule == '2PM - 11AM') {
        WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'))
    }*/ )

WebUI.mouseOver(findTestObject('SPACETIME/MERCHANT/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextNotPresent('You need permission to perform this action', false)

