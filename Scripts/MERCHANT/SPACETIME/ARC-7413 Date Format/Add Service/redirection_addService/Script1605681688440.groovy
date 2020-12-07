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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.By as By

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Header/header_Add Service'), 0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Header/header_Add Service'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Select Category')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/searchbar_category-name'), 'Category Name mAx 021!!@#$%^&!')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Category/maxcat'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Category/maxcat'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_service name'), 'Service Date Settings')

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_description'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.')

WebUI.selectOptionByLabel(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/dropdown_booking type'), 'Default', 
    false)

WebUI.comment('Service Duration')

WebUI.waitForElementVisible(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/Default Duration/label_ day'), 
    0)

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/Default Duration/label_ day'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/textbox_price'), '10')

WebUI.comment('Unlimited Bookings')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/button_ Negotiation'))

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Basic Details/button_Next basic details'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Schedule')

SimpleDateFormat sdf = new SimpleDateFormat('dd/MM/yyyy')

Calendar c = Calendar.getInstance()

c.setTime(new Date())

c.add(Calendar.DATE, 2)

String futuredate = sdf.format(c.getTime())

println(futuredate)

WebUI.executeJavaScript(('$("#en_date").val("' + futuredate) + '")', [])

WebUI.executeJavaScript(('$("#st_date").val("' + futuredate) + '")', [])

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Schedule/button_Block this datetime'), FailureHandling.CONTINUE_ON_FAILURE)

