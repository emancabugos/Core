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
import org.junit.After as After
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.testobject.ConditionType as ConditionType

// create directory to locate a temporary file
Path projectDir = Paths.get(RunConfiguration.getProjectDir())

Path tmpDir = projectDir.resolve('tmp')

if (!(Files.exists(tmpDir))) {
	Files.createDirectory(tmpDir)
}

// Prepare File object
File PreviewDatetmp = tmpDir.resolve('PreviewDate.txt').toFile()



'Day: Day without leading zero (5), Month: Month without leading zero (8), Year: Full Numeric Year (1930)'
WebUI.click(findTestObject('ADMIN/Date Format Settings/button_DD'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Date Format Settings/textlabel_PickADateType'), 0)

WebUI.click(findTestObject('ADMIN/Date Format Settings/dropdown_SelectFormat'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Date Format Settings/dropdown_SelectFormat'), 'Day with leading zero (05)', 
    false)

WebUI.click(findTestObject('ADMIN/Date Format Settings/button_Apply'))

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Date Format Settings/button_MM'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Date Format Settings/textlabel_PickADateType'), 0)

WebUI.click(findTestObject('ADMIN/Date Format Settings/dropdown_SelectFormat'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Date Format Settings/dropdown_SelectFormat'), 'Month without leading zero (8)', 
    false)

WebUI.click(findTestObject('ADMIN/Date Format Settings/button_Apply'))

WebUI.delay(1)

WebUI.click(findTestObject('ADMIN/Date Format Settings/button_YYYY'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Date Format Settings/textlabel_PickADateType'), 0)

WebUI.click(findTestObject('ADMIN/Date Format Settings/dropdown_SelectFormat'))

WebUI.selectOptionByLabel(findTestObject('ADMIN/Date Format Settings/dropdown_SelectFormat'), 'Full numeric year (1930)', 
    false)

WebUI.click(findTestObject('ADMIN/Date Format Settings/button_Apply'))

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Date Format Settings/button_DD'), 'value', 'DD', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Date Format Settings/button_MM'), 'value', 'M', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Date Format Settings/button_YYYY'), 'value', 'YYYY', 0)

def date = new Date()

def formattedDate = date.format('dd/M/yyyy')

println(formattedDate)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Date Format Settings/textfield_Preview'), 'value', formattedDate, 
    0)

WebUI.click(findTestObject('ADMIN/Date Format Settings/button_Save'))

