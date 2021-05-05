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
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.testdata.CSVData as CSVData

//WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login Non Private'), [:], FailureHandling.CONTINUE_ON_FAILURE)
//define seller guid object
//def id = WebUI.getAttribute(findTestObject('ADMIN/Transaction List/sellerguid'), 'value')
//get id
//println(id)
//save the id in global variable
//CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('default', 'name', id)
//WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/18_redirectionTransactionList'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/textbox_search'), 0)

WebUI.setText(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/textbox_search'), '1119TIM1610498609EISB')

WebUI.click(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/button_Search'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('ADMIN/Date Format Settings/ARC-9434/Pre Requisite/click_TransactionExportCSV'), [:], FailureHandling.CONTINUE_ON_FAILURE)

CSVData csvData = new CSVData('C:\\Users\\Diane\\Downloads\\Order.csv', true, CSVSeparator.COMMA)

def valuesellerid = csvData.getValue(1, 8)

println(sellerid[0])

WebUI.verifyMatch(GlobalVariable.cartURL, findTestData(null).getValue(1, 8), false)

