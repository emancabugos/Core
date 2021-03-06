import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Header/link_Sub-accounts'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Header/link_Sub-accounts'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/SubAccounts/a_Activity Log'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/SubAccounts/a_Activity Log'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Merchant Sub Account/Merchant Sub Account page/Activity Log Page/textlabel_Activity Log'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Sub Account/Pages/tab_Items'), FailureHandling.CONTINUE_ON_FAILURE)

def table = WebUI.getText(findTestObject('BESPOKE DEL 2/MERCHANT/Sub Account/Logs/Items/td_itemId'))

println(table)

KeywordLogger log = new KeywordLogger()

log.logInfo(table)

