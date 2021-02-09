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

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Merchant Storefront/texfiled_Visitors'), 
    'value', 'Visiteurs', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Merchant Storefront/textfield_AvgRating'), 
    'value', 'Evaluation moyenne', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Merchant Storefront/textfield_SuccessfulOrders'), 
    'value', 'Commandes réussies', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Merchant Storefront/textfield_MemberSince'), 
    'value', 'Membre depuis', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Merchant Storefront/textfield_ItemForSale'), 
    'value', 'ARTICLES À VENDRE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Merchant Storefront/textfield_ItemReviews'), 
    'value', 'NOTES DE L\'ARTICLE', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Merchant Storefront/textfield_SortBy'), 
    'value', 'Trier par', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Merchant Storefront/textfield_LowestPrice'), 
    'value', 'Prix ​​le plus bas', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Merchant Storefront/textfield_HighestPrice'), 
    'value', 'Le prix le plus élevé', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Merchant Storefront/textfield_SearchStore'), 
    'value', 'Recherche magasin', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Buyer Pages/Merchant Storefront/textfield_ReplyFrom'), 
    'value', 'Réponse de', 0)

