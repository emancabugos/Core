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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Buyer Pages/Search Result Navigation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Chinese (Simplified)', 
    false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_ALL CATEGORIES_all-categories'), 
    'value', '所有类别', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_SEARCH_search'), 
    'value', '搜索', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_All of (category)_search-allof'), 
    'value', '所有的', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_Search result for_search-result'), 
    'value', '搜索结果', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_Items found_item-found'), 
    'value', '找到的物品', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_FILTERS_filter-txt'), 
    'value', '滤波器', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_PRICE RANGE_price-range'), 
    'value', '价格范围', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_RESET_btn_reset'), 
    'value', '重启', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_APPLY_btn_apply'), 
    'value', '应用', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_Relevance_relevance'), 
    'value', '关联', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_Item-Oldest_item-oldest'), 
    'value', '项目 - 最老', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_Item-Newest_item-newest'), 
    'value', '项目 - 最新', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_Price-Lowest_price-lowest'), 
    'value', '价格最低', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_Price-Highest_price-highest'), 
    'value', '价格最高', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_Name-Ascending_name-ascending'), 
    'value', '名称升序', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_Name-Descending_name-decending'), 
    'value', '名称 - 降序', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_RATING-HIGHEST_rating_highest'), 
    'value', '评级 - 最高', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_RATING-LOWEST_rating_highest'), 
    'value', '评分 - 最低', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/input_Sorry_search-no-result-title'), 
    'value', '抱歉!', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Pages/Search Result Page/textarea_Seems like no matches were found Alternatively check out what others are looking at below'), 
    'value', '似乎没有找到匹配。或者，查看下面其他人正在查看的内容！', 0)

