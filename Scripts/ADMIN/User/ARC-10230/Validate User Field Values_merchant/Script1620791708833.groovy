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

txtfieldmrchyes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_textfield_Merch_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_textfield_Merch_Yes', txtfieldmrchyes, false)

txtfieldconsmrchyes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_textfield_ConsMer_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_textfield_ConsMer_YES', txtfieldconsmrchyes, false)

txtfieldmerchNO = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_textfield_Merch_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_textfield_Merch_No', txtfieldmerchNO, false)

txtfieldconsmerchNO = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/label_Admin_textfield_ConsMer_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('Admin_textfield_ConsMer_No', txtfieldconsmerchNO, false)

WebUI.comment('dropdown')

ddmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_dropdwn_Merch_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('dd_option1_Merch_Yes', ddmeryes, false)

ddconmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_dropdwn_ConsMer_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('dd_option1_ConsMer_Yes', ddconmeryes, false)

ddmerchno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_dd_option1_Merch_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('dd_option1_Merch_No', ddmerchno, false)

ddconmerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_dd_option1_ConsMer_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('dd_option1_ConsMer_No', ddconmerno, false)

WebUI.comment('chkbox')

ccmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_checkbx_Merch_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('cb_option1_Merch_Yes, cb_option3_Merch_Yes, cb_option5_Merch_Yes', ccmeryes, false)

ccconmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_checkbx_ConsMer_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('cb_option1_ConsMer_Yes, cb_option3_ConsMer_Yes, cb_option5_ConsMer_Yes', ccconmeryes, false)

ccmerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_checkbx_Merch_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('cb_option1_Merch_No, cb_option3_Merch_No, cb_option5_Merch_No', ccmerno, false)

ccconmerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_checkbx_ConsMer_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('cb_option1_ConsMer_No, cb_option3_ConsMer_No, cb_option5_ConsMer_No', ccconmerno, false)

WebUI.comment('pdf')

pdfmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_PDF_Merch_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('https://0511bpdiana.test.arcadier.io/pdf/pdf-166042-637563979788432332-vjpm58untitled-1.pdf', pdfmeryes, 
    false)

pdfconmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_PDF_ConsMer_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('https://0511bpdiana.test.arcadier.io/pdf/pdf-166042-637563979788432332-29oinjuntitled-1.pdf', pdfconmeryes, 
    false)

pdfmerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_PDF_Merch_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('https://0511bpdiana.test.arcadier.io/pdf/pdf-166042-637563979788432332-3d3snxuntitled-1.pdf', pdfmerno, 
    false)

pdfconmerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_PDF_ConsMer_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('https://0511bpdiana.test.arcadier.io/pdf/pdf-166042-637563979788432332-brpwizuntitled-1.pdf', pdfconmerno, 
    false)

WebUI.comment('date')

datemeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_Date_Merch_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('12/05/2021 14:34:00 PM', datemeryes, false)

dateconmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_Date_ConsMer_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('12/05/2021 14:34:00 PM', dateconmeryes, false)

datemerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_Date_Merch_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('12/05/2021 14:34:00 PM', datemerno, false)

dateconmerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_Date_ConsMer_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('12/05/2021 14:34:00 PM', dateconmerno, false)

WebUI.comment('image')

WebUI.verifyElementPresent(findTestObject('ADMIN/User Details/ARC-10230/img_Admin_Image_Merch_Yes'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/User Details/ARC-10230/Admin_Image_ConsMer_Yes'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_Image_Merch_No'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_Image_ConsMer_No'), 0)

WebUI.comment('Hyperlink')

hypemeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_Hyperlink_Merch_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('arcadier.com', hypemeryes, false)

hypeconsmeryes = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_Hyperlink_ConsMer_Yes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('arcadier.com', hypeconsmeryes, false)

hypemerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_Hyperlink_Merch_No (1)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('arcadier.com', hypemerno, false)

hypeconsmerno = WebUI.getText(findTestObject('ADMIN/User Details/ARC-10230/value_Admin_Hyperlink_ConsMer_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch('arcadier.com', hypeconsmerno, false)

