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

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textlabel_Category(s)'), 0)

WebUI.comment('Listing Name')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_listing-name'), ('Item_12' + ' ') + 
    GlobalVariable.CustomMerchant)

WebUI.comment('Categories')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Category/Category Commission/category1'), 
    0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Category/Category Commission/category1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Price')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_price'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_price'), '640.5')

WebUI.comment('SKU')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_SKU'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_SKU'), 'SKU0012')

WebUI.comment('Item Cover Image')

WebUI.delay(2)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/icon_browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Utilities/Image Cropper/image_container'), 'C:\\\\Katalon\\\\Core\\\\Images\\\\UN Items\\\\item12.jpg')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Image Cropper/div_crop'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Image Cropper/div_crop'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.comment('Quantity')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_qty'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_qty'), '10')

WebUI.comment('Item Description')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_item-description'), 'Description12')

WebUI.comment('Custom Fields')

WebUI.delay(2)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Custom Fields/Allcat/weight'), '.25')

WebUI.comment('Save')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/button_Upload Now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Item List/btn_Add Item'), 0)

WebUI.verifyElementPresent(findTestObject('BESPOKE DEL 2/MERCHANT/Item List/btn_Add Item'), 0)

