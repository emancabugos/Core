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

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 'French', false)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_ViewAll'), 'value', 
    '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_ChannelLoading'), 
    'value', '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_TotalPrice'), 'value', 
    '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_SpecialOffer'), 'value', 
    '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_CreateOffer'), 'value', 
    '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_PurchaseThisOffer'), 
    'value', '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_Decline'), 'value', 
    '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_AcceptedTheOffer'), 
    'value', '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_ViewDetails'), 'value', 
    '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_TypeMessage'), 'value', 
    '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_Send'), 'value', 
    '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_SentAnOffer'), 'value', 
    '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_ServiceRate'), 'value', 
    '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_OfferHasAccepted'), 
    'value', '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_OfferHasDeclined'), 
    'value', '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_SelectDateTime'), 
    'value', '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_PickAdditionalService'), 
    'value', '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_Optional'), 'value', 
    '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_Back'), 'value', 
    '关于我们', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Chat/textfield_SendNow'), 'value', 
    '关于我们', 0)

