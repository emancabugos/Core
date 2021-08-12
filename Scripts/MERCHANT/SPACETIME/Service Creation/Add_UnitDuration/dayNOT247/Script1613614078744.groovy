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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Header/header_Add Service'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Header/header_Add Service'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.comment('Select Category')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/Category Commission/category100'), 
    0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Category List/Category Commission/category100'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_service name'), ('per Day NOT 24/7 D' + 
    ' ') + GlobalVariable.CustomMerchant)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_description'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.selectOptionByLabel(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/dropdown_booking type'), 'Default', 
    false)

WebUI.comment('Service Duration')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/Default Duration/label_ day'), 
    0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/Default Duration/label_ day'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_price'), '10')

WebUI.comment('Unlimited Bookings')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/toggle_unlimited bookings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_max bookings'), '2')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/button_ Negotiation'))

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/button_Next basic details'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Schedule')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'), 
    0 /*if (varSchedule == '9AM - 5PM') {
        WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/Operating Hours/mon_st'), '')
    } else if (varSchedule == '7AM - 10PM') {
        WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'))
    } else if (varSchedule == '2PM - 11AM') {
        WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'))
    }*/ )

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Schedule/button_Next schedule'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Image')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/button_Browse'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/button_Browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/browse_img/img_upload container'), 'C:\\\\Katalon\\\\Core\\\\Images\\\\UN Items\\\\item16.jpg')

WebUI.delay(1)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/browse_img/button_ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/button_Next images'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/button_Next images'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Add Ons')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Add Ons/textbox_add on name'), 0)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Add Ons/textbox_add on name'), 'Extra Service')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Add Ons/textbox_surcharge'), '20')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Add Ons/button_Add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Custom Fields')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Add Ons/button_Next add ons'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Location')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/textbox_address'), 0)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/textbox_address'), '6784 Ayala Avenue cor. V.A. Rufino Street')

WebUI.selectOptionByLabel(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/dropdown_(SELECT COUNTRY)'), 'Philippines', 
    false)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/textbox_state'), 'NCR')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/textbox_city'), 'Makati')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/textbox_postalcode'), '1226')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/button_Next location'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Delivery Method')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Delivery/textlabel_Delivery'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Delivery/delivery2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Delivery/button_Upload now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('END')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Listing Page/button_Add listings'), 0)

