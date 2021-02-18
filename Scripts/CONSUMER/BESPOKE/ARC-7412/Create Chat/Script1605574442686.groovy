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

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/ARC-7412/Page_0704bpdiana/img_Home'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/ARC-7412/Page_0613bpdiana/textfield_search'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/ARC-7412/Page_0613bpdiana/textfield_search'), 'Item 04')

WebUI.sendKeys(findTestObject('BESPOKE DEL 2/CONSUMER/ARC-7412/Page_0613bpdiana/textfield_search'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/ARC-7412/Page_0613bpdiana/img_search result'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/ARC-7412/Page_0613bpdiana/img_search result'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/ARC-7412/Page_0613bpdiana/a_Contact seller'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/ARC-7412/Page_0613bpdiana/a_Contact seller'))

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/CONSUMER/ARC-7412/Page_0613bpdiana/textarea_chatmsg'), 0)

WebUI.delay(5)

WebUI.setText(findTestObject('BESPOKE DEL 2/CONSUMER/ARC-7412/Page_0613bpdiana/textarea_chatmsg'), 'test')

WebUI.click(findTestObject('BESPOKE DEL 2/CONSUMER/ARC-7412/Page_0613bpdiana/button_SEND'))

