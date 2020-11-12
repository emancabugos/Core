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

//WebUI.click(findTestObject('SPACETIME/ARC-7412/Homepage_searchbar/textfield_datesearch'))
//WebUI.waitForElementVisible(findTestObject('SPACETIME/ARC-7412/Homepage_searchbar/button_Apply'), 0)
//WebUI.click(findTestObject('SPACETIME/ARC-7412/Homepage_searchbar/button_Apply'))
dateToCheck = WebUI.getAttribute(findTestObject('SPACETIME/ARC-7412/Homepage_searchbar/textfield_datesearch'), 'value')

WebUI.comment('Verify Value - D/M/YY')

WebUI.comment('Day without leading zero (5)')

WebUI.comment('Month without leading zero (8)')

WebUI.comment('Two digit year (30)')

WebUI.comment('Split ung dalawang dates')

def daysplit1 = dateToCheck.split(' - ')

def firstdate = daysplit1[0]

def seconddate = daysplit1[1]

println(firstdate)

println(seconddate)

WebUI.comment('Split firstdate values')

def firstdate1 = firstdate.split('/')

def day = firstdate1[0]

def month = firstdate1[1]

def year = firstdate1[2]

println(day)

println(month)

println(year)

Double doubleday = Double.parseDouble(day)

println(doubleday)

def doubletrouble = doubleday.intValue()

WebUI.comment('Split seconddate values')

def seconddate1 = seconddate.split('/')

def day2 = seconddate1[0]

def month2 = seconddate1[1]

def year2 = seconddate1[2]

println(day2)

println(month2)

println(year2)

WebUI.comment('Check format for DAY')

//if (doubletrouble <= 9) {
    //WebUI.verifyMatch(doubletrouble, '[0-9]{1}', true, FailureHandling.STOP_ON_FAILURE)
//} else if ((doubletrouble >= 10) && doubleday >= 31) {
   // WebUI.verifyMatch(doubletrouble, '[10-31]{2}', true, FailureHandling.STOP_ON_FAILURE)
//}


if ((doubletrouble >= 10 && doubletrouble <= 31)) {
	WebUI.verifyMatch(day, '[0-9]{2}', true, FailureHandling.STOP_ON_FAILURE)
} else if (doubletrouble >= 1 && doubletrouble <= 9) {
WebUI.verifyMatch(day, '[0-9]{1}', true, FailureHandling.STOP_ON_FAILURE)}
	else 
	println('diana')


