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

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/linkMenu_Language'), 0)

WebUI.click(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/linkMenu_Language'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/subMenu_EditText'), 0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/subMenu_EditText'), 0)

WebUI.click(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/subMenu_EditText'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/collapseButton_SellerPages'), 0)

WebUI.click(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/collapseButton_SellerPages'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/linktext_ItemTranslation'), 0)

WebUI.click(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/linktext_ItemTranslation'), FailureHandling.CONTINUE_ON_FAILURE)

