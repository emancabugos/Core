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

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Add Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Category')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textlabel_Category(s)'), 0)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textlabel_Select all'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textlabel_Select all'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Name')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_listing-name'), 'Item Name')

WebUI.comment('Price')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_price'), '10')

WebUI.comment('Description')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_item-description'), '"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."')

WebUI.comment('Image')

WebUI.delay(2)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/icon_browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Utilities/Image Cropper/image_container'), 'C:\\\\Katalon\\\\Core\\\\Images\\\\UN Items\\\\item1.jpg')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Image Cropper/div_crop'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Image Cropper/div_crop'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.comment('QTY')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_qty'), '10')

WebUI.comment('Custom Field')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/weight'), '.25')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/text1'), 'Text1')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/text2'), 'Text2')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/p'), 'TextEDITOR')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/hyperlink1'), 'arcadier.com')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/email1'), 'arcadierteam@gmail.com')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/percentage1'), '69.9')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/number1'), '66')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/number2'), '99')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb1.1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb1.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb1.10'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb2.1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb2.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb2.10'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/dd1'), 'SP_Drop Down_M1DD5', 
    false)

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/dd2'), 'SP_Drop Down_M2DD5', 
    false)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/location1'), 'Makati City')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/time1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/time2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/video1'), '<iframe width="640" height="480" src="https://www.youtube.com/embed/GsbOwc_hWcM" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>')

WebUI.uploadFile(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/pdf1'), 'C:\\Katalon\\Core\\Images\\PDF\\1mb.pdf')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb3.1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb3.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb3.10'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb4.1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb4.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb4.10'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/dd3'), 'SPC_Drop Down_M1DD6', 
    false)

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/dd4'), 'SPC_Drop Down_M2DD6', 
    false)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb5.1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb5.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb5.10'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb6.1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb6.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/cb6.10'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/dd5'), 'SPG_Drop Down_M1DD7', 
    false)

WebUI.selectOptionByLabel(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/dd6'), 'SPG_Drop Down_M2DD7', 
    false)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/button_Upload Now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textlabel_Category(s)'), 0)

