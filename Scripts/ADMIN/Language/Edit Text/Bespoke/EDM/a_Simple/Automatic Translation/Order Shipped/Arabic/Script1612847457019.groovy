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

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/dd_icon EDM'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/dd_icon EDM'), 'Arabic', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Order Shipped/input_order-on-way'), 'value', 
    'طلبك في الطريق!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Order Shipped/input_lbl_hi'), 'value', 'مرحبا', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Order Shipped/textarea_Your order has been s'), 
    'value', 'وقد تم شحن طلبك!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Order Shipped/input_invoice-id'), 'value', 
    'هوية صوتية', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Order Shipped/input_lbl_delivery_address'), 
    'value', 'عنوان التسليم', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Order Shipped/input_btn_next'), 'value', 
    'عرض أوامر', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Order Shipped/textarea_This will be at your'), 
    'value', 'وهذا سيكون على عتبة داركم قريبا! إذا كان لديك أي أسئلة حول طلبك لا تتردد في الاتصال البائع أو ترك لنا رسالة بالبريد الالكتروني في', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Order Shipped/input_lbl_regard'), 'value', 
    'مع تحياتي', 0)

