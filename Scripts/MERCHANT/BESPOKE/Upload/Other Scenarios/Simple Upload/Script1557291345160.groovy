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

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Header/link_Upload'), 0)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Merchant Header/link_Upload'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Category')

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textlabel_Category(s)'), 0)

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/searchbar_category-name'), 'Category Name mAx 021!!@#$%^&!')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Category/maxcat'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Item Name')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_listing-name'), 'Item Date Settings')

WebUI.comment('Price')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_price'), '10')

WebUI.comment('SKU')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_SKU'), 'SKUDATEFORMAT')

WebUI.comment('Item Description')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_item-description'), 'ITEM DATE FORMAT SETTINGS VERIFICATION')

WebUI.comment('Image')

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/icon_browse'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/image_container'), 'C:\\\\Katalon\\\\Core\\\\Images\\\\UN Items\\\\item1.jpg')

WebUI.click(findTestObject('SPACETIME/MERCHANT/Service Creation/Images/browse_img/button_ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('Variants & Quantity')

WebUI.setText(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/textbox_qty'), '100')

WebUI.comment('Custom Fields')

WebUI.delay(1)

WebUI.click(findTestObject('BESPOKE DEL 2/MERCHANT/Add Item Page/Add Item/btn_SAVE'))

WebUI.waitForElementVisible(findTestObject('BESPOKE DEL 2/MERCHANT/Item List/btn_Add Item'), 0)

