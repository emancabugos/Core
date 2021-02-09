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

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/SpaceTime/Seller Pages/Listing Upload Edit Page/navigateTo_Listing'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 'Chinese (Traditional)', 
    false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_YourServices'), 
    'value', '您的服務', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_BasicDetails'), 
    'value', '基本細節', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Schedule'), 
    'value', '時間表', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Images'), 
    'value', '圖片', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Additional'), 
    'value', '額外', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Location'), 
    'value', '位置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Delivery'), 
    'value', '交貨', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_BasicDetails01'), 
    'value', '基本細節', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Category'), 
    'value', '類別', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SelectAll'), 
    'value', '全選', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SelectNone'), 
    'value', '選擇無', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceName'), 
    'value', '服務名稱', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ItemDescription'), 
    'value', '商品描述', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SellYourMarketplace'), 
    'value', '您想如何出售您的服務？', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_InstantBuyOrNegotiation'), 
    'value', '選擇是否要在未經預先批准的情況下啟用您的服務，或者如果您希望與買方討論。 （您可以選擇為服務提供兩種選擇。）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_InstantBuy'), 
    'value', '即時購買', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Negotiation'), 
    'value', '談判', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_OvernightBookingService'), 
    'value', '這是一個隔夜預訂服務嗎？', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Operate247'), 
    'value', '你每天24小時運作嗎？', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceDuration'), 
    'value', '服務期限', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SpecifyDuration'), 
    'value', '指定您的服務期限', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AllowUnlimitedBookings'), 
    'value', '允許無限預訂？', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_MaximumBookingPerSession'), 
    'value', '每個會話的最大預訂', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SCHEDULE_2'), 
    'value', '時間表', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_OperatingHours'), 
    'value', '營業時間', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckSpecifyDates'), 
    'value', '檢查日期並指定您將可用的時間。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckinCheckout'), 
    'value', '入住/退房時間', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_EnterYourTime'), 
    'value', '輸入您的客戶可以辦理入住和退房手續的時間。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckInTime'), 
    'value', '登記時間', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckoutTime'), 
    'value', '退房時間', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AvailabilityCalendar'), 
    'value', '可用性日曆', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SetDateRange'), 
    'value', '設置您希望無法使用的日期/時間範圍。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_BlockThisDate'), 
    'value', '阻止此日期/時間', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Images'), 
    'value', '圖片', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceImage'), 
    'value', '服務形象', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Maximum15Image'), 
    'value', '最多15張圖片', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ImageRatio'), 
    'value', '圖像的比例必須為3：2且不大於2MB（推薦720px x 480像素）', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Browse'), 
    'value', '瀏覽', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AdditionalService'), 
    'value', '附加服務/細節', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AddOnName'), 
    'value', '附加名稱', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Surcharge'), 
    'value', '附加費', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_LocationDetails'), 
    'value', '位置/細節', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceLocation'), 
    'value', '您的服務位置', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_EnterLocation'), 
    'value', '請指定您的服務在哪裡的位置。您可以使用通訊錄中的位置，或輸入您自己的位置。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Note'), 
    'value', '注意', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_DeliveryMethodsOrPickUpLocation'), 
    'value', '如果此列表不需要傳送方式或接收位置，可以點擊“立即上傳”按鈕完成上傳。否則單擊“下一步”設置您的送貨方式和/或取件位置。', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Or'), 
    'value', '要么', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Delivery01'), 
    'value', '交貨', 0)

