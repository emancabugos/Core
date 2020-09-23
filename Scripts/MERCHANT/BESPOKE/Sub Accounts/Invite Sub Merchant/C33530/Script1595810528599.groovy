import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Header/link_Sub-accounts'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Header/link_Sub-accounts'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/SubAccounts/a_Invite Sub-Account'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/SubAccounts/a_Invite Sub-Account'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/SubAccounts/button_Send_PopUp_Invite'), 0)

WebUI.delay(1)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/SubAccounts/textfield_Invite Sub-Account Users_invite_mail'), 'invalid,arcadier.tester2@gmail.com')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/SubAccounts/button_Send_PopUp_Invite'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Merchant Sub Account/Invite Popup/toaster_ErrorOne of the emails are'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('MERCHANT/Merchant Sub Account/Invite Popup/toaster_ErrorOne of the emails are'), 
    0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/SubAccounts/Btn_ClosePopUp_'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/SubAccounts/Btn_ClosePopUp_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

