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

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Layout/button_Save'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Layout/button_Save2'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Layout/Slider1/pencil1_Add New Slider'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Layout/Slider1/pencil1_Browse Image'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Layout/Slider1/pencil1_input_video_url'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Layout/Category/category_icon position-arrow-down'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Layout/Category/category_icon position-arrow-up'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Layout/Category/textlabel_Collapsable Categories'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Layout/Category/toggle_category'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Layout/Category/toggle_collapse'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Layout/Listing/listing_icon position-arrow-down'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Layout/Listing/listing_icon position-arrow-up'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Layout/Listing/textlabel_Number of listings shown'))

WebUI.verifyElementNotClickable(findTestObject('ADMIN/Layout/sidemenu_Layout'))

