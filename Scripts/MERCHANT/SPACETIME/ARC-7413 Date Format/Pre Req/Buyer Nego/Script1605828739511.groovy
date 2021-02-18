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
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Homepage/searchbox_location'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Homepage/searchbox_location'), 'Service Date Settings')

WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Homepage/searchbox_location'), Keys.chord(Keys.ENTER))

WebUI.comment('Search Result')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Result Page/result_1st Service'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Search Result Page/result_1st Service'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Service Details')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_RequestToBook'), 0)

def date = new Date()

//change date format
def formattedDate = date.format('dd/MM/yyyy')

println(formattedDate)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'), formattedDate)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/textlabel_to'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_RequestToBook'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Chat Details')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textarea_chatMsg'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Chat Details Page/textarea_chatMsg'), 'Verify Date format')

WebUI.click(findTestObject('SPACETIME/CONSUMER/Chat Details Page/button_Send'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Chat Details Page/first_Chat'), 0)

