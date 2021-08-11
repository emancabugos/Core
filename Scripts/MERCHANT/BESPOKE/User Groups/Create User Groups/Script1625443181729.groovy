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

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/headermenu_Subaccounts'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/headermenu_Subaccounts'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/menu_User Group'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/menu_User Group'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/button_Create new Group'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/button_Create new Group'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/a_Cancel'), 0)

WebUI.comment('usergroupAdd')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/textfield_Group Name'), 'usergrp Add')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/dropdown_search users'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/searchbar_Select Users'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/searchbar_Select Users'), '')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/checktextlabel_value1'))

WebUI.comment('usergrpEdit')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/textfield_Group Name'), 'usergrpEdit')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/dropdown_search users'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/searchbar_Select Users'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/searchbar_Select Users'), '')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/checktextlabel_value1'))

WebUI.comment('usergrpDelete')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/textfield_Group Name'), 'usergrpDelete')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/dropdown_search users'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/searchbar_Select Users'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/searchbar_Select Users'), '')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/checktextlabel_value1'))

WebUI.comment('usergprView')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/textfield_Group Name'), 'usergprView')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/dropdown_search users'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/searchbar_Select Users'), 
    0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/searchbar_Select Users'), '')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/User Groups/Create User Group/checktextlabel_value1'))

