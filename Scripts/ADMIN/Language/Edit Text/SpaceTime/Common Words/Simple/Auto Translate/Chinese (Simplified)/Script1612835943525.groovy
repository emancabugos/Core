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

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Spacetime/Language Menu/dd_English'), 'Chinese (Simplified)', 
    false)

WebUI.comment('Time')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Hour'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Day'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Week'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Month'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Night'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Custom'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Hours'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Days'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Weeks'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Months'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Nights'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Minutes'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_NoOf'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Time/textfield_Per'), '*', '', 
    0)

WebUI.comment('Toogle')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Toggle/texfield_Yes'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Toggle/textfield_No'), '*', '', 
    0)

WebUI.comment('Scheduling')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Monday'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Tuesday'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Wednesday'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Thursday'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Friday'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Saturday'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Sunday'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Date'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Time'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_To'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Availability'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_AvailableFrom'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_CheckIn'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Checkout'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Booked'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Blockout'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_DropYourImage'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Mon'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Tue'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Wed'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Thu'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Fri'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Sat'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_Sun'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_AllDay'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_January'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_February'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_March'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_April'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_May'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_June'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_July'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_August'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfiled_September'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_October'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_November'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Scheduling (Uploads Bookings)/textfield_December'), 
    '*', '', 0)

WebUI.comment('Order Status')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_OrderStatus'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_FullyPaid'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_Delivered'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_ReadyForPickup'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_Refunded'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_Pending'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_SKU'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Order Status/textfield_Acknowledged'), 
    '*', '', 0)

WebUI.comment('Profile Info')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Profile Info/textfield_FirstName'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Profile Info/textfield_LastName'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Profile Info/textfield_NotificationEmail'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Profile Info/textfield_ContactNumber'), 
    '*', '', 0)

WebUI.comment('Location')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Location/textfield_Address'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Location/textfield_Country'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Location/textfield_State'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Location/textfield_City'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Location/textfield_PostalCode'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Location/textfield_SavedAddresses'), 
    '*', '', 0)

WebUI.comment('Delivery Settings')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_Delivery'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_PickUp'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_DeliveryAddress'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_DeliveryPickUpMethod'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_SelectDeliveryPickupMethod'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_DeliveryOptions'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_SelectDeliveryPickupMethod'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_DeliveryService'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_SurchargePerService'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_PickUpLocation'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textarea_ProvideTheAddress'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Delivery Settings/textfield_PickUpLocations'), 
    '*', '', 0)

WebUI.comment('Search')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Search/textfield_From'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Search/textfield_To'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Search/textfield_AllDates'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Search/textfield_All'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Search/texfield_Search'), '*', 
    '', 0)

WebUI.comment('Booking Details')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_AddOns'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Rate'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Subtotal'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_ServiceSubTotal'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_AvailableDates'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Price'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_NoteToSeller'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Upcoming'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_OngoingPast'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_SearchByNameAndInvoiceID'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_InvoiceID'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_ViewOrder'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Message'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Timestamp'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_PaymentMethod'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_TransactionTotal'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_NewReview'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Email'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Booking Details/textfield_Contact'), 
    '*', '', 0)

WebUI.comment('Removing Item')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Removing Item/textfield_RemoveItem'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Removing Item/textfield_RemovingFromTheList'), 
    '*', '', 0)

WebUI.comment('Feedback & Ratings')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_LeaveAFeedbackFor'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_HowMuchRateThisItem'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_LeaveAFeeback'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_Submit'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_RatingSummary'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_PositiveFeedback'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_Excellent'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textlabel_Great'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_Good'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_Okay'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Feedback  Ratings/textfield_Unsatisfied'), 
    '*', '', 0)

WebUI.comment('Buttons')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Next'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Search'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_AddNew'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Apply'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_UploadNow'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_RequestToBook'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Add'), '*', '', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/tetfield_BuyNow'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Cancel'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Checkout'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Okay'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Reply'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Previous'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_LeftFeedback'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_Save'), '*', 
    '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Buttons/textfield_BackToList'), 
    '*', '', 0)

WebUI.comment('Error Messages')

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Error Messages/textfield_MerchantAccessDenied'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Error Messages/textfield_ActionNotAllowed'), 
    '*', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Spacetime/Common Words/Error Messages/textfield_NoEmailAllowed'), 
    '*', '', 0)

