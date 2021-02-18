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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Japanese', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_(Source is editable)_members_only'), 
    'value', 'メンバーのみ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Sign in as Buyer_browse_btn'), 
    'value', 'バイヤーとしてログイン', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Sign in as Seller_browse_btn'), 
    'value', '売り手としてサインインする', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Interested in joining the marketplace_item_details'), 
    'value', '市場に参加することに興味がありますか？', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Click here to let us know_browse_btn'), 
    'value', '私たちに知らせるためにここをクリック！', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_ABOUT US_location_service'), 
    'value', '私たちに関しては', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/textarea_Pluaks oaksi oakosok Cidepoe'), 
    'value', 'オアシオコソクを吹き飛ばす。 Cidepoer urbistrio、nostestraes verenes ponsul vivideat、quam int pra verdii comnons erent。 Uderibus bon-supplius atquit、出版社、著者の方へ：「なか見！検索」で書籍を紹介しませんか？', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Learn More_btn_save'), 
    'value', 'もっと詳しく知る', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Buyer Sign in_location_service'), 
    'value', '買い手サインイン', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Seller Sign in_location_service'), 
    'value', '売り手サインイン', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Continue with Google_btn_save'), 
    'value', 'Googleを続ける', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Continue with Facebook_btn_save'), 
    'value', 'Facebookで続ける', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Continue with Google_btn_save1'), 
    'value', 'Googleを続ける', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Continue with Facebook_btn_save1'), 
    'value', 'Facebookで続ける', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Back_location_service'), 
    'value', 'バック', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Register your interest below_location_service'), 
    'value', 'あなたの興味を以下に登録してください！', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Your Name_location_service'), 
    'value', 'あなたの名前', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Your Email_location_service'), 
    'value', 'あなたのメールアドレス', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_I am interested in being a buyer_location_service'), 
    'value', '私は買い手であることに興味があります', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_I am interested in being a seller_location_service'), 
    'value', '私は売り手であることに興味があります', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Send_btn_save'), 
    'value', '送信', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Back_location_service 1'), 
    'value', 'バック', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/Private Login/input_Register_location_service'), 
    'value', '登録', 0)

