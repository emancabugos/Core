import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.junit.After as After
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.comment('D/M/YY')

Path projectDir = Paths.get(RunConfiguration.getProjectDir())

Path tmpDir = projectDir.resolve('tmp')

if (!(Files.exists(tmpDir))) {
    Files.createDirectory(tmpDir)
}

// Prepare File object
File PreviewDatetmp = tmpDir.resolve('PreviewDate.txt').toFile()

//def date = new Date()

//def formattedDate = date.format('d/M/yy')

//PreviewDatetmp.text = formattedDate

String finaldate = PreviewDatetmp.text.trim()

println(finaldate)

WebUI.waitForElementVisible(findTestObject('SPACETIME/ARC-7412/Purchase Details/button_View order'), 0)

WebUI.click(findTestObject('SPACETIME/ARC-7412/Purchase Details/button_View order'))

WebUI.waitForElementPresent(findTestObject('SPACETIME/ARC-7412/Purchase Details/textlabel_Timestamp'), 0)

TimestampngDetails = WebUI.getText(findTestObject('SPACETIME/ARC-7412/Purchase Details/textlabel_Timestamp'))

daysplit1 = TimestampngDetails.split(' ')

def unadate = daysplit1[0]

println(unadate)

def splittedDate = unadate

def timestampRemove = splittedDate.replace('Timestamp', '').trim()

println(timestampRemove)

WebUI.verifyMatch(timestampRemove, finaldate, false)

WebUI.comment('date of booking')

dateofbooking = WebUI.getText(findTestObject('SPACETIME/ARC-7412/Purchase Details/textlabel_Date'))

daysplit2 = dateofbooking.split(': ')

def unadate2 = daysplit2[1]

println(unadate2)

WebUI.verifyMatch(unadate2, (finaldate + ' - ') + finaldate, false)

WebUI.click(findTestObject('SPACETIME/ARC-7412/Purchase Details/a_Back to list'))

