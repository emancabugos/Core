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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.text.DecimalFormat as DecimalFormat
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('CONSUMER/BESPOKE/Purchase History List/Pre Requisite/checkout_multipleItem'), [:], FailureHandling.CONTINUE_ON_FAILURE)

invoiceid = WebUI.getText(findTestObject('BESPOKE DEL 2/CONSUMER/Thank you Page/textlabel_inoviceID'))

WebUI.waitForElementVisible(findTestObject('Utilities/Bespoke Usermenu/icon_usermenu'), 0)

WebUI.click(findTestObject('Utilities/Bespoke Usermenu/icon_usermenu'))

WebUI.waitForElementVisible(findTestObject('Utilities/Bespoke Usermenu/linktext_Purchases'), 0)

WebUI.click(findTestObject('Utilities/Bespoke Usermenu/linktext_Purchases'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/icon_PurchaseHistory'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/textfield_Search'), invoiceid)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/button_Search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/linktext_invoiceID'), 0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/textlabelvalue_Date'), 0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/textlabelvalue_Time'), 0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/textlabel_Quantity'), 0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/textlabel_OrderTotal'), 0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/textlabel_PaymentMethod'), 0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/textlabel_PaymentStatus'), 0)

WebUI.verifyElementText(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/linktext_invoiceID'), invoiceid)

WebUI.verifyElementNotPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/linktext_invoiceID2'), 0)

WebUI.verifyElementNotPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/textlabelvalue_Date2'), 0)

WebUI.verifyElementNotPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/textlabelvalue_Time2'), 0)

WebUI.verifyElementNotPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/textlabel_Quantity2'), 0)

WebUI.verifyElementNotPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/textlabel_OrderTotal2'), 0)

WebUI.verifyElementNotPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/textlabel_PaymentMethod2'), 0)

WebUI.verifyElementNotPresent(findTestObject('BESPOKE DEL 2/CONSUMER/Purchase History List/textlabel_PaymentStatus2'), 0)

