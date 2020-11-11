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

WebUI.openBrowser('')

WebUI.navigateToUrl('bootstrap.arcadier.com/hivebox_new/date-format.html')

WebUI.maximizeWindow()

'Day: Day without leading zero (5) , Month: Month without leading zero (8), Year: Two digit year (30)'
WebUI.click(findTestObject('ADMIN/Date Format Settings/button_DD'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Date Format Settings/textlabel_PickADateType'), 0)

WebUI.click(findTestObject('ADMIN/Date Format Settings/dropdown_SelectFormat'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Date Format Settings/dropdown_SelectFormat'), 'Day with ordinal (5th)', 
    false)

WebUI.click(findTestObject('ADMIN/Date Format Settings/button_Apply'))

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Date Format Settings/button_MM'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Date Format Settings/textlabel_PickADateType'), 0)

WebUI.click(findTestObject('ADMIN/Date Format Settings/dropdown_SelectFormat'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Date Format Settings/dropdown_SelectFormat'), 'Two digit year (30)', false)

WebUI.click(findTestObject('ADMIN/Date Format Settings/button_Apply'))

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Date Format Settings/button_YYYY'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Date Format Settings/textlabel_PickADateType'), 0)

WebUI.click(findTestObject('ADMIN/Date Format Settings/dropdown_SelectFormat'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Date Format Settings/dropdown_SelectFormat'), 'Month with leading zero (08)', 
    false)

WebUI.click(findTestObject('ADMIN/Date Format Settings/button_Apply'))

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Date Format Settings/button_DD'), 'value', 'DO', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Date Format Settings/button_MM'), 'value', 'YY', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Date Format Settings/button_YYYY'), 'value', 'MM', 0)

def date = new Date()

def formattedDate = date.format('d/yy/MM')

println(formattedDate)

def datevalues = formattedDate.split('/')

def day = datevalues[0]

def year = datevalues[1]

def month = datevalues[2]

def converted_date

switch (true) {
    case day.charAt(0) == 1:
        converted_date = (((((day + 'st') + '/') + year) + '/') + month)

        println(converted_date)

        break
    case day.charAt(0) == 2:
        converted_date = (((((day + 'nd') + '/') + year) + '/') + month)

        println(converted_date)

        break
    case day.charAt(0) == 3:
        converted_date = (((((day + 'rd') + '/') + year) + '/') + month)

        println(converted_date)

        break
    default:
        converted_date = (((((day + 'th') + '/') + year) + '/') + month)

        println(converted_date)}

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Date Format Settings/textfield_Preview'), 'value', converted_date, 
    0)

WebUI.click(findTestObject('ADMIN/Date Format Settings/button_Save'))
