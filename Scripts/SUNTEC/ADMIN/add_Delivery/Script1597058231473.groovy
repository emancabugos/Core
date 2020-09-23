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

WebUI.comment('Add Delivery Weight')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin New Sidebar/submenu_FeatureToogle'), 0)

WebUI.click(findTestObject('ADMIN/Admin New Sidebar/submenu_FeatureToogle'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Features Control/Delivery 2.0/Delivery 2.0 List Page/Complex/TC020'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/textfield_DeliveryOptionName'), 'Delivery 01')

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/dropdownselect_Country'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option/linktext_Select all'), 0)

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/linktext_Select all'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option/button_deleteCountry'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Admin Delivery Option/selected_Country'))

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/dropdownselect_Country'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option/linktext_Select all'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Admin Delivery Option/button_deleteCountry'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Admin Delivery Option/selected_Country'))

WebUI.scrollToElement(findTestObject('ADMIN/Admin Delivery Option/textfield_MinimumLeadTime'), 0)

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/textfield_MinimumLeadTime'), '3-5 days')

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/textfield_WhereAreYouDelivering'), 'MAKATI')

WebUI.scrollToElement(findTestObject('ADMIN/Admin Delivery Option/textlabel_radioSelection'), 0)

WebUI.comment('Range 1')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    'Range 01')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '0')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '20.75')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '15.25')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.comment('Range 2')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    'Range 02')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '20.76')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '40')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '30.25')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('ADMIN/Admin Delivery Option/button_bottomSave'), 0)

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/button_bottomSave'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option List/button_Add Delivery Option'), 0)

WebUI.comment('Add Delivery Price')

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option List/button_Add Delivery Option'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('ADMIN/Admin Delivery Option List/button_Add Delivery Option'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Admin Delivery Option/textlabel_DeliveryOptionName'))

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/textfield_DeliveryOptionName'), 'Delivery 02')

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/dropdownselect_Country'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option/linktext_Select all'), 0)

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/linktext_Select all'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option/button_deleteCountry'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Admin Delivery Option/selected_Country'))

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/dropdownselect_Country'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option/linktext_Select all'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Admin Delivery Option/button_deleteCountry'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ADMIN/Admin Delivery Option/selected_Country'))

WebUI.scrollToElement(findTestObject('ADMIN/Admin Delivery Option/textfield_MinimumLeadTime'), 0)

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/textfield_MinimumLeadTime'), '3-5 days')

WebUI.setText(findTestObject('ADMIN/Admin Delivery Option/textfield_WhereAreYouDelivering'), 'MAKATI')

WebUI.scrollToElement(findTestObject('ADMIN/Admin Delivery Option/textlabel_radioSelection'), 0)

WebUI.callTestCase(findTestCase('ADMIN/Features Control/Delivery 2.0/Delivery 2.0/Simple/click_PriceRadiobutton'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.comment('Range 1')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    'Range 01')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '0')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '1000')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '20.25')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.scrollToElement(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'), 
    0)

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryOption/button_AddDeliveryRate'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    0)

WebUI.comment('Range 2')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryRateName'), 
    'Range 02')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeFrom'), '1001')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/numericUpDown_RangeTo'), '2000')

WebUI.setText(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/textfield_DeliveryCost'), '40.25')

WebUI.click(findTestObject('ADMIN/Installed Packages/Delivery Package/z_AddDeliveryRate/button_Save'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('ADMIN/Admin Delivery Option/button_bottomSave'), 0)

WebUI.click(findTestObject('ADMIN/Admin Delivery Option/button_bottomSave'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Admin Delivery Option List/button_Add Delivery Option'), 0)

