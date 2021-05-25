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

WebUI.verifyElementClickable(findTestObject('ADMIN/User Mgmt/Users List/User Fields Filtering/dd_Admin_dropdwn_Consum_Yes'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ADMIN/User Mgmt/Users List/User Fields Filtering/dd_Admin_dropdwn_Consum_Yes'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ADMIN/User Mgmt/Users List/User Fields Filtering/dd_Admin_dropdwn_Merch_Yes'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ADMIN/User Mgmt/Users List/User Fields Filtering/Admin_dropdwn_Consum_No'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ADMIN/User Mgmt/Users List/User Fields Filtering/dd_Admin_dropdwn_Merch_No'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ADMIN/User Mgmt/Users List/User Fields Filtering/dd_Admin_dropdwn_ConsMer_No'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('chkbx')

WebUI.verifyElementClickable(findTestObject('ADMIN/User Mgmt/Users List/User Fields Filtering/dd_Admin_checkbx_Consum_Yes'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ADMIN/User Mgmt/Users List/User Fields Filtering/dd_Admin_checkbx_Merch_Yes'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ADMIN/User Mgmt/Users List/User Fields Filtering/dd_Admin_checkbx_ConsMer_Yes'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ADMIN/User Mgmt/Users List/User Fields Filtering/dd_Admin_checkbx_Consum_No'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ADMIN/User Mgmt/Users List/User Fields Filtering/dd_Admin_checkbx_Merch_No'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ADMIN/User Mgmt/Users List/User Fields Filtering/dd_Admin_checkbx_ConsMer_No'), 
    FailureHandling.CONTINUE_ON_FAILURE)

