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

WebUI.verifyElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/inbox/input_Inbox_search-buyer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/inboxdiana/textfield_Searchbar'), 0)

WebUI.verifyElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/inboxdiana/textfield_Searchbar'))

String tosearch = WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/inboxdiana/textfield_Searchbar'), 'Chloe')

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/MERCHANT/inbox/Page_0613bpdiana/input_Inbox_btn-find'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/inbox/Page_0613bpdiana/div_Chloe27072020 0856diana test'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 1/MERCHANT/Chat Details Page/button_SEND'), 0)

WebUI.verifyElementVisible(findTestObject('BESPOKE DEL 1/MERCHANT/Chat Details Page/button_SEND'))

