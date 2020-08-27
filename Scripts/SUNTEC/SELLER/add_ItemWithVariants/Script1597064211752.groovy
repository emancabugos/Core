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

WebUI.waitForElementVisible(findTestObject('SOC/Add Item/button_AddItem'), 0)

WebUI.click(findTestObject('SOC/Add Item/button_AddItem'))


WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_listing-name'), 0)

WebUI.comment('Select Category ')

WebUI.click(findTestObject('SUNTEC/Add Item/checkbox_Category01'))

WebUI.delay(2)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_listing-name'), 'Item with Variants')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_item-description'), 'This Item Has Variants!')

WebUI.delay(2)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/icon_browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Utilities/Image Cropper/image_container'), 'C:\\Katalon\\BespokeAPI\\Images\\UN Items\\item2.jpg')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Image Cropper/div_crop'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Image Cropper/div_crop'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.comment('Price')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_price'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_price'), '100')

WebUI.comment('SKU')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_SKU'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_SKU'), 'SKU00002')

WebUI.delay(2)

WebUI.comment('Variants')

WebUI.waitForElementVisible(findTestObject('SUNTEC/Add Item/toggle_Button'), 0)

WebUI.click(findTestObject('SUNTEC/Add Item/toggle_Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Variant Options')

WebUI.waitForElementVisible(findTestObject('SUNTEC/Add Item/variants_Name1'), 0)

WebUI.click(findTestObject('SOC/Add Item/buttn_Delete'))

WebUI.setText(findTestObject('SUNTEC/Add Item/vartians_Opt1'), 'White,Black,')

WebUI.setText(findTestObject('SUNTEC/Add Item/variants_Name2'), 'Size')

WebUI.setText(findTestObject('SUNTEC/Add Item/vartians_Opt2'), 'Small,Medium,')

WebUI.setText(findTestObject('SOC/Add Item/textfield_Sur1'), '5')

WebUI.setText(findTestObject('SOC/Add Item/textfield_Sur2'), '5')

WebUI.setText(findTestObject('SUNTEC/Add Item/textfield_Stock1'), '10')

WebUI.setText(findTestObject('SUNTEC/Add Item/textfield_Stock2'), '10')

WebUI.setText(findTestObject('SUNTEC/Add Item/textfield_Stock3'), '10')

WebUI.setText(findTestObject('SUNTEC/Add Item/textfield_Stock4'), '10')

WebUI.delay(2)

WebUI.comment('Custom Fields')

WebUI.setText(findTestObject('SOC/Add Item/textfield_Mandatory'), 'Mandatory Item with Variants')

WebUI.delay(2)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/button_Upload Now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Item Translate/button_IllDoItLater'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Item Translate/button_IllDoItLater'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SOC/Add Item/button_AddItem'), 0)

