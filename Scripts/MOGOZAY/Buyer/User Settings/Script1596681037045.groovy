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

WebUI.comment('Profile')

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Buyer/Buyer Settings/Sidemenu/usermenu'), 0)

WebUI.click(findTestObject('MOGOZAY/Buyer/Buyer Settings/Sidemenu/usermenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Buyer/Buyer Settings/Profile/textbox_displayName'), 0)

WebUI.setText(findTestObject('MOGOZAY/Buyer/Buyer Settings/Profile/textbox_displayName'), '01Buyer')

WebUI.setText(findTestObject('MOGOZAY/Buyer/Buyer Settings/Profile/textbox_fName'), 'Mark')

WebUI.setText(findTestObject('MOGOZAY/Buyer/Buyer Settings/Profile/textbox_lName'), 'Twain')

WebUI.setText(findTestObject('MOGOZAY/Buyer/Buyer Settings/Profile/textbox_phone'), '+63000023')

WebUI.click(findTestObject('MOGOZAY/Buyer/Buyer Settings/Profile/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Address')

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Buyer/Buyer Settings/Sidemenu/sidemenu_Addresses'), 0)

WebUI.click(findTestObject('MOGOZAY/Buyer/Buyer Settings/Sidemenu/sidemenu_Addresses'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Buyer/Buyer Settings/Address/btn_Create new address'), 0)

WebUI.click(findTestObject('MOGOZAY/Buyer/Buyer Settings/Address/btn_Create new address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Buyer/Buyer Settings/Address/textbox_recipientName'), 0)

WebUI.setText(findTestObject('MOGOZAY/Buyer/Buyer Settings/Address/textbox_recipientName'), 'Mark Twain')

WebUI.setText(findTestObject('MOGOZAY/Buyer/Buyer Settings/Address/textbox_address'), 'Pagoda Rd, Bago')

WebUI.selectOptionByLabel(findTestObject('MOGOZAY/Buyer/Buyer Settings/Address/dd_country'), 'Myanmar', false)

WebUI.selectOptionByLabel(findTestObject('MOGOZAY/Buyer/Buyer Settings/Address/dd_state'), 'Bago', false)

WebUI.setText(findTestObject('MOGOZAY/Buyer/Buyer Settings/Address/textbox_townshop'), 'Burma')

WebUI.setText(findTestObject('MOGOZAY/Buyer/Buyer Settings/Address/textbox_postalCode'), '11081')

WebUI.click(findTestObject('MOGOZAY/Buyer/Buyer Settings/Address/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MOGOZAY/Buyer/Buyer Settings/Address/Address_container'), 0)

WebUI.click(findTestObject('MOGOZAY/Buyer/Buyer Settings/Sidemenu/sidemenu_Logout'), FailureHandling.CONTINUE_ON_FAILURE)

