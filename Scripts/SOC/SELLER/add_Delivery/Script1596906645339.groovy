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

WebUI.click(findTestObject('SOC/Add Item/menu_Delivery'))

WebUI.comment('Add Delivery - Weight')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/button_Add Delivery Option'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/button_Add Delivery Option'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/icon_addedit'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textbox_delivery option name'), 
    'Delivery A')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/dd_coutnry'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/text_Select all'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/text_Select all'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textbox_minimumLeadTime'), 
    '1 - 7 days')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textbox_deliveryFrom'), 
    'Philippines')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Add Delivery Rate'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textlabel_Delivery Rate Name (Buye'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_name'), 
    'Rate 1')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_start'), 
    '1')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_end'), 
    '4')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_cost'), 
    '1.00')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/button_Save rate'))

WebUI.delay(3)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Add Delivery Rate'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textlabel_Delivery Rate Name (Buye'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_name'), 
    'Rate 2')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_start'), 
    '5')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_end'), 
    '9')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_cost'), 
    '1.50')

WebUI.delay(1)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/button_Save rate'))

WebUI.delay(1)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Save'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/button_Add Delivery Option'), 
    0)

WebUI.comment('Add Delivery - Price')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/button_Add Delivery Option'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/icon_addedit'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textbox_delivery option name'), 
    'Delivery B')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/dd_coutnry'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/text_Select all'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/text_Select all'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textbox_minimumLeadTime'), 
    '1 - 7 days')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/textbox_deliveryFrom'), 
    'Philippines')

WebUI.callTestCase(findTestCase('ADMIN/Features Control/Delivery 2.0/Delivery 2.0/Simple/click_PriceRadiobutton'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Add Delivery Rate'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textlabel_Delivery Rate Name (Buye'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_name'), 
    'Rate 1')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_start'), 
    '1')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_end'), 
    '100')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_cost'), 
    '1.00')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/button_Save rate'))

WebUI.delay(3)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Add Delivery Rate'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textlabel_Delivery Rate Name (Buye'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_name'), 
    'Rate 2')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_start'), 
    '101')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_end'), 
    '200')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_rate_cost'), 
    '1.50')

WebUI.delay(1)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/button_Save rate'))

WebUI.delay(1)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Save'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/button_Add Delivery Option'), 
    0)

WebUI.comment('Add Pickup')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/textbox_name'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/textbox_name'), 'Pickup 1')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/button_Add Pick-up Option'))

WebUI.delay(1)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/textbox_name'), 'Pickup 2')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/button_Add Pick-up Option'))

