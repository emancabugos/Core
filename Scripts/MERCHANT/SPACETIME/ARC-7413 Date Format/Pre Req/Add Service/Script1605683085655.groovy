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

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Header/header_Add Service'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Header/header_Add Service'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Select Category')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/searchbar_category-name'), 'Category Name mAx 021!!@#$%^&!')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Category/maxcat'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Category/maxcat'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_service name'), 'Service Date Settings')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_description'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.selectOptionByLabel(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/dropdown_booking type'), 'Default', 
    false)

WebUI.comment('Service Duration')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/Default Duration/label_ day'), 
    0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/Default Duration/label_ day'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_price'), '10')

WebUI.comment('Unlimited Bookings')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/button_ Negotiation'))

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/button_Next basic details'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Schedule')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Schedule/button_Next schedule'), 0 /*if (varSchedule == '9AM - 5PM') {
        WebUI.setText(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/Operating Hours/mon_st'), '')
    } else if (varSchedule == '7AM - 10PM') {
        WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'))
    } else if (varSchedule == '2PM - 11AM') {
        WebUI.click(findTestObject('MERCHANT/SpaceTime/Service Creation/Schedule/247 toggle/span_onoffswitch-switch'))
    }*/ )

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Schedule/button_Next schedule'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Image')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/button_Browse'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/button_Browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/browse_img/img_upload container'), 'C:\\\\Katalon\\\\Core\\\\Images\\\\UN Items\\\\item1.jpg')

WebUI.delay(1)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/browse_img/button_ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/button_Next images'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/button_Next images'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Add Ons')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Add Ons/button_Next add ons'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Add Ons/button_Next add ons'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Location')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/textbox_address'), 0)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/textbox_address'), '29th Flr. Rufino Pacific Tower')

WebUI.selectOptionByLabel(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/dropdown_(SELECT COUNTRY)'), 'Philippines', 
    false)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/textbox_state'), 'NCR')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/textbox_city'), 'Makati')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/textbox_postalcode'), '1200')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Location/button_Next location'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Delivery/button_Upload now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('END')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Listing Page/button_Add listings'), 0)

