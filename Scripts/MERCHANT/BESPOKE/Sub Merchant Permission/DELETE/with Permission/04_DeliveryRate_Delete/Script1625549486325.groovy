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

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Seller Menu/menu_Delivery'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Seller Menu/menu_Delivery'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/button_Add Delivery Option'), 
    0)

WebUI.verifyElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/button_Add Delivery Option'))

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Settings/button_Add Delivery Option'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Add Delivery Rate'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/button_Add Delivery Rate'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_start'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_start'), 
    '1')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/textbox_range_end'), 
    '10')

WebUI.delay(1)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/button_Save rate'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('BESPOKE DEL 2/MERCHANT/Delivery Settings/Add Edit Delivery Option/Add Delivery Rate/button_Delete'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextNotPresent('You need permission to perform this action', false)

