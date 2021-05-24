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

txtfieldmrchyes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_textfield_Merch_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_textfield_Merch_Yes', txtfieldmrchyes, false)

txtfieldconsmrchyes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_textfield_ConsMer_YES'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_textfield_ConsMer_YES', txtfieldconsmrchyes, false)

txtfieldmerchNO = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_textfield_Merch_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_textfield_Merch_No', txtfieldmerchNO, false)

txtfieldconsmerchNO = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_textfield_ConsMer_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_textfield_ConsMer_No', txtfieldconsmerchNO, false)

WebUI.comment('dropdown')

ddmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_dropdwn_Merch_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_dropdwn_Merch_Yes', ddmeryes, false)

ddconmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_dropdwn_ConsMer_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_dropdwn_ConsMer_Yes', ddconmeryes, false)

ddmerchno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_dropdwn_Merch_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_dropdwn_Merch_No', ddmerchno, false)

ddconmerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_dropdwn_ConsMer_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_dropdwn_ConsMer_No', ddconmerno, false)

WebUI.comment('chkbox')

ccmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_checkbx_Merch_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_dropdwn_Merch_Yes', ccmeryes, false)

ccconmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_checkbx_ConsMer_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_dropdwn_ConsMer_Yes', ccconmeryes, false)

ccmerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_checkbx_Merch_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_checkbx_Merch_No', ccmerno, false)

ccconmerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_checkbx_ConsMer_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_checkbx_ConsMer_No', ccconmerno, false)

WebUI.comment('pdf')

pdfmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_PDF_Merch_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_PDF_Merch_Yes', pdfmeryes, false)

pdfconmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_PDF_ConsMer_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_PDF_ConsMer_Yes', pdfconmeryes, false)

pdfmerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_PDF_Merch_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_PDF_Merch_No', pdfmerno, false)

pdfconmerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_PDF_ConsMer_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_PDF_ConsMer_No', pdfconmerno, false)

WebUI.comment('date')

datemeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_Date_Merch_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_Date_Merch_Yes', datemeryes, false)

dateconmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_Date_ConsMer_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_Date_ConsMer_Yes', dateconmeryes, false)

datemerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_Date_Merch_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_Date_Merch_No', datemerno, false)

dateconmerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_Date_ConsMer_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_Date_ConsMer_No', dateconmerno, false)

WebUI.comment('image')

datemeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_Image_Merch_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_Image_Merch_Yes', datemeryes, false)

dateconmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_Image_ConsMer_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_Image_ConsMer_Yes', dateconmeryes, false)

datemerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_Image_Merch_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_Image_Merch_No', datemerno, false)

dateconmerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_Image_ConsMer_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_Image_ConsMer_No', dateconmerno, false)

WebUI.comment('Hyperlink')

hypemeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_Hyperlink_Merch_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_Hyperlink_Merch_Yes', hypemeryes, false)

hypeconsmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_Hyperlink_ConsMer_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_Hyperlink_ConsMer_Yes', hypeconsmeryes, false)

hypemerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_Hyperlink_Merch_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_Hyperlink_Merch_No', hypemerno, false)

hypeconsmerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_Hyperlink_ConsMer_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_Hyperlink_ConsMer_No', hypeconsmerno, false)

