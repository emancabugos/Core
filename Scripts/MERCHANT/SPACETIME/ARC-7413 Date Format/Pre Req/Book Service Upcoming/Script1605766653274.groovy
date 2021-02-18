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
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Homepage/searchbox_location'), 0)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Homepage/searchbox_location'), 'Service Date Settings')

WebUI.sendKeys(findTestObject('SPACETIME/CONSUMER/Homepage/searchbox_location'), Keys.chord(Keys.ENTER))

WebUI.comment('Search Result')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Search Result Page/result_1st Service'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Search Result Page/result_1st Service'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Service Details')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_RequestToBook'), 0)

SimpleDateFormat sdf = new SimpleDateFormat('dd/MM/yyyy')

Calendar c = Calendar.getInstance()

c.setTime(new Date())

c.add(Calendar.DATE, 1)

String futuredate = sdf.format(c.getTime())

println(futuredate)

WebUI.setText(findTestObject('SPACETIME/CONSUMER/Item Details Page/datepicker_Date'), futuredate)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/textlabel_to'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Item Details Page/button_BuyNow'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Delivery')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Checkout Delivery/button_Select address'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Checkout Delivery/button_Select address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Checkout Delivery/btn_Next'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Review')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Review Details Page/buttonReview_Next'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Review Details Page/buttonReview_Next'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Payment')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 0)

WebUI.selectOptionByLabel(findTestObject('SPACETIME/CONSUMER/Payment Details Page/dropdown_Payment'), 'Custom Payment',
	false)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/button_PayNow'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Custom Payment')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Custom Payment/button_Accept'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Payment Details Page/Custom Payment/button_Accept'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Success Checkout')

WebUI.waitForElementVisible(findTestObject('SPACETIME/CONSUMER/Thank You Page/button_Homepage'), 0)

WebUI.click(findTestObject('SPACETIME/CONSUMER/Thank You Page/button_Homepage'), FailureHandling.CONTINUE_ON_FAILURE)

