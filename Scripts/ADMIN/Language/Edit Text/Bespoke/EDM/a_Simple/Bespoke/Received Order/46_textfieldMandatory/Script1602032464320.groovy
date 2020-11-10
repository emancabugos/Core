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

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_change-order'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_form-control'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_have-question'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_delivery_address'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_delivery_bulkcost'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_delivery_delivery_co'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_delivery_sub_total'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_delivery_total'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_hi'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_invoice_id'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_msg2'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_regard'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_we-have-received-order'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_welcome-to'))

WebUI.clearText(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/textarea_Thank you for placing'))

WebUI.click(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/_Notif message/input_Page_btn btn-blue'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/_Notif message/Toaster message'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/_Notif message/Toaster message'), 0)

