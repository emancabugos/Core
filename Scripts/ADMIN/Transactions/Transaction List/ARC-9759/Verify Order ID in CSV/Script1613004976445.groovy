import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testdata.reader.CSVSeparator as CSVSeparator
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
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.testdata.CSVData as CSVData
import internal.GlobalVariable as GlobalVariable
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.IOException as IOException
import java.util.Date as Date
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.lang.String as String

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Admin New Sidebar/Simple/18_redirectionTransactionList'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/textbox_search'), 0)

WebUI.setText(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/textbox_search'), '1119TIM1610498609EISB')

WebUI.click(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/button_Search'))

WebUI.delay(2)

String orderid = WebUI.getText(findTestObject('ADMIN/Transaction List and Details/Transaction List Page/value_OrderID'))

println(orderid)

WebUI.callTestCase(findTestCase('ADMIN/Date Format Settings/ARC-9434/Pre Requisite/click_TransactionExportCSV'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

//CSVData csvData = new CSVData('C:\\Users\\Diane\\Downloads\\Item Details.xlsx')
//def valueorderid = csvData.getValue(2,2)
//temp1=csvData.getValue('Order ID', 2)
//println(temp1)
//println(valueorderid)
FileInputStream file = new FileInputStream(new File('C:\\Users\\Diane\\Downloads\\Item Details.xlsx'))

XSSFWorkbook workbook = new XSSFWorkbook(file)

XSSFSheet sheet = workbook.getSheetAt(0)

'Read data from excel'
String valueorderid = sheet.getRow(1).getCell(2).getStringCellValue()

println(valueorderid)

WebUI.verifyMatch('orderid', 'valueorderid', false)

