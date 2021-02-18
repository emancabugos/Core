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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/EDM Navigation/dd_icon EDM'), 'Hindi', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_welcome-to'), 'value', 
    'आदेश की पुष्टि', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_hi'), 'value', 'नमस्ते', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_we-have-received-order'), 
    'value', 'हमें आपका ऑर्डर प्राप्त हुआ है!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/textarea_Thank you for placing'), 
    'value', 'हमारे साथ अपना आदेश देने के लिए धन्यवाद। आपका आदेश शीघ्र ही तैयार हो जाएगा! आपका आदेश आपके रास्ते पर है, या जब वह आपके संग्रह के लिए तैयार है, तो हम आपको सूचित करेंगे!', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_have-question'), 'value', 
    'यदि आपके कोई प्रश्न हैं, तो कृपया हमसे संपर्क करें', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_change-order'), 'value', 
    'यदि आप अपना आदेश बदलना चाहते हैं तो कृपया अपने विक्रेता से सीधे संपर्क करें और हमें बताएं।', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_invoice_id'), 'value', 
    'चालान आईडी', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_delivery_address'), 
    'value', 'डिलिवरी का पता', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_delivery_sub_total'), 
    'value', 'उप कुल', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_delivery_delivery_co'), 
    'value', 'पहुचाने की कीमत', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_delivery_bulkcost'), 
    'value', 'थोक मूल्य', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_delivery_total'), 
    'value', 'कुल', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_form-control'), 'value', 
    'देखें आदेश', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_msg2'), 'value', 
    'हमें आशा है कि आपसे शीघ्र ही पुनः भेंट होगी!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/EDMs/Received Order/input_lbl_regard'), 'value', 
    'सादर', 0)

