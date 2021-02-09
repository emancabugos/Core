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

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Admin Pages/Private Login Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Portuguese', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_(Source is editable)_members_only'), 
    'value', 'Apenas membros', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Sign in as Buyer_browse_btn'), 
    'value', 'Faça o login como comprador', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Sign in as Seller_browse_btn'), 
    'value', 'Faça o login como Vendedor', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Interested in joining the marketplace_item_details'), 
    'value', 'Interessado em se juntar ao mercado?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Click here to let us know_browse_btn'), 
    'value', 'Clique aqui para nos avisar!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_ABOUT US_location_service'), 
    'value', 'Sobre nós', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/textarea_Pluaks oaksi oakosok Cidepoe'), 
    'value', 'Pluaks oaksi oakosok. Cidepoer urbistrio, nostestraes verenes ponsul vivideat, quam int pra verdii comnons erent. Uderibus bon-supplius atquit, publi nteatem nenhum eludeo ina, quo ium egiliis fuis', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Learn More_btn_save'), 
    'value', 'Saber mais', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Buyer Sign in_location_service'), 
    'value', 'Login do comprador', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Seller Sign in_location_service'), 
    'value', 'Login do vendedor', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Continue with Google_btn_save'), 
    'value', 'Continue com o Google', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Continue with Facebook_btn_save'), 
    'value', 'Continue com o Facebook', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Continue with Google_btn_save1'), 
    'value', 'Continue com o Google', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Continue with Facebook_btn_save1'), 
    'value', 'Continue com o Facebook', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Back_location_service'), 
    'value', 'Costas', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Register your interest below_location_service'), 
    'value', 'Registre seu interesse abaixo!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Your Name_location_service'), 
    'value', 'Seu nome', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Your Email_location_service'), 
    'value', 'Seu email', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_I am interested in being a buyer_location_service'), 
    'value', 'Estou interessado em ser um comprador', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_I am interested in being a seller_location_service'), 
    'value', 'Estou interessado em ser um vendedor', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Send_btn_save'), 
    'value', 'Enviar', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Back_location_service 1'), 
    'value', 'Costas', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Register_location_service'), 
    'value', 'registo', 0)

