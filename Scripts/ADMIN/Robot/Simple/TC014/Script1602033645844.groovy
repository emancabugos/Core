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

WebUI.waitForElementVisible(findTestObject('ADMIN/Robot.txt/textarea_robot'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Robot.txt/textarea_robot'), 0)

WebUI.setText(findTestObject('ADMIN/Page_0902space/textarea_robot'), '')

WebUI.setText(findTestObject('ADMIN/Page_0902space/textarea_robot'), 'ABC 123$%^&')

WebUI.click(findTestObject('ADMIN/Page_0902space/button_Save'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Robot.txt/Page_0902space/Page_0902space/div_Successfully save'), 0)

robotTC012 = WebUI.getText(findTestObject('ADMIN/Robot.txt/textarea_robot'))

WebUI.verifyMatch(robotTC012, 'ABC 123$%^&', false)

WebUI.waitForElementVisible(findTestObject('ADMIN/Robot.txt/textarea_robot'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Robot.txt/textarea_robot'), 0)

robot = WebUI.getText(findTestObject('ADMIN/Robot.txt/textarea_robot'))

WebUI.verifyEqual(robot, expected, FailureHandling.CONTINUE_ON_FAILURE)

