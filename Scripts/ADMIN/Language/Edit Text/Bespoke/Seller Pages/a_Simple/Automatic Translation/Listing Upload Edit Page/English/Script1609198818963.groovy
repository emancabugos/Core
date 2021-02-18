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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 'English', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_YourServices'), 
    'value', 'Your services', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_BasicDetails'), 
    'value', 'Basic details', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Schedule'), 
    'value', 'Schedule', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Images'), 
    'value', 'Images', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Additional'), 
    'value', 'Additional', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Location'), 
    'value', 'Location', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Delivery'), 
    'value', 'Delivery', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_BasicDetails01'), 
    'value', 'Basic Details', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Category'), 
    'value', 'Category', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SelectAll'), 
    'value', 'Select all', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SelectNone'), 
    'value', 'Select none', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceName'), 
    'value', 'Service name', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ItemDescription'), 
    'value', 'Item description', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SellYourMarketplace'), 
    'value', 'How would you like to sell your service?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_InstantBuyOrNegotiation'), 
    'value', 'You may allow buyers to instantly book and purchase your service (Instant buy) OR allow buyers to chat with you and reach an agreed price first (Negotiation). You may also choose to have both options.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_InstantBuy'), 
    'value', 'Instant buy', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Negotiation'), 
    'value', 'Negotiation', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_OvernightBookingService'), 
    'value', 'Is this an overnight booking service?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Operate247'), 
    'value', 'Do you operate 24/7?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceDuration'), 
    'value', 'Service duration', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SpecifyDuration'), 
    'value', 'Specify your service duration', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AllowUnlimitedBookings'), 
    'value', 'Allow unlimited bookings?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_MaximumBookingPerSession'), 
    'value', 'Maximum bookings per session', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SCHEDULE_2'), 
    'value', 'Schedule', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_OperatingHours'), 
    'value', 'Operating hours', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckSpecifyDates'), 
    'value', 'Check the days and specify the times you will be available.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckinCheckout'), 
    'value', 'Check-in / Check-out Timing', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_EnterYourTime'), 
    'value', 'Enter the time your customers will be able to check-in and check-out.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckInTime'), 
    'value', 'Check-in time', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_CheckoutTime'), 
    'value', 'Check-out time', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AvailabilityCalendar'), 
    'value', 'Availability calendar', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_SetDateRange'), 
    'value', 'Set a date/time range that you want to make unavailable. ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_BlockThisDate'), 
    'value', 'Block this date/time', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Images'), 
    'value', 'Images', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceImage'), 
    'value', 'Service image', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Maximum15Image'), 
    'value', 'Maximum 15 images', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ImageRatio'), 
    'value', 'Images must be in a ratio of 3:2 (Recommended 720px X 480px) and no larger than 2MB.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Browse'), 
    'value', 'Browse', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AdditionalService'), 
    'value', 'Additional Services / Details', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_AddOnName'), 
    'value', 'Add-on name', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Surcharge'), 
    'value', 'Surcharge', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_LocationDetails'), 
    'value', 'Location / details', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_ServiceLocation'), 
    'value', 'Your service location', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_EnterLocation'), 
    'value', 'Please state the location of your service.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Note'), 
    'value', 'Note', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_DeliveryMethodsOrPickUpLocation'), 
    'value', 'If this listing does not require delivery methods or pick-up locations, you can finish the upload by clicking the “Add Now” button. Otherwise click “Next” to set-up your delivery method and/or pickup location.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Or'), 
    'value', 'Or', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Seller Pages/Listing UploadEdit Page/textfield_Delivery01'), 
    'value', 'Delivery', 0)

