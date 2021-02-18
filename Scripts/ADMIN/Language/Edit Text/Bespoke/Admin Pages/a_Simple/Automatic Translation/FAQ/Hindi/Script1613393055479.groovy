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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ADMIN/Language/Edit Text/Bespoke/Admin Pages/FAQ'), [('varLanguage') : findTestData('ADMIN/Language/Language')], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 0)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Edit Text/Bespoke/Buyer Navigation/dd_language'), 'Hindi', false)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/FAQ'), 'value', 'FAQ', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I sign up_lbl_title'), 
    'value', 'How do I sign up?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_This marketplace uses Facebook or Google open ID for all your logins'), 
    'value', 'This marketplace uses Facebook or Google+ open ID for all your logins.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_You can reset your password through either your Google or Facebook account'), 
    'value', 'You can reset your password through either your Google or Facebook account.', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Yes You can choose not'), 
    'value', 'Yes. You can choose not to create an account at 0128DEL2 when making a purchase. However, you are highly recommended to do so as all your delivery details will be saved in your account. Any future purchases that you make will become much faster and simpler.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_An invoice ID is a number'), 
    'value', 'An invoice ID is a number generated for your reference after every successful checkout. A particular invoice ID may include multiple items that you have bought from multiple sellers in a single checkout.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_For every successful checkout'), 
    'value', 'For every successful checkout with an invoice ID, all the items that belong to a particular seller will be consolidated to a single order ID. Therefore, if you bought multiple items from a few sellers in a single checkout, you should receive a few order IDs.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Delivery options are a list of seller'), 
    'value', 'Delivery options are a list of seller defined delivery methods that you can receive the item by. Some of the delivery options will have added cost.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Pick-up options is a list of seller'), 
    'value', 'Pick-up options is a list of seller defined locations that you can pick-up your item from. These options will not have added cost.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_There are different order statuse'), 
    'value', 'There are different order statuses for different delivery types.For pick up, the order statuses are:1. Paid – after you have successfully made a payment, the marketplace will automatically create an invoice ID and order ID and tag each item order status as paid.2. Ready for pick-up – after the seller has picked and packed, he can change the item’s order status to “Ready for pick-up”. The marketplace will automatically send an email to inform you to pick-up his item at his selected pick-up location. 3. Completed – once you have picked-up his item, seller will set the item’s order status to “Completed”.4. Refunded – seller will set the item’s order status to “Refunded” when he has made a refund to you.For delivery, the order statuses are:1. Paid – after you have successfully make a payment, the marketplace will automatically create an invoice ID and order ID and tag each item order status as paid.2. Delivered – after the seller has shipped/couriered/delivered the item, he will set the item’s order status to “Delivered”. The marketplace will automatically send an email to inform you that your item is on its way.3. Refunded– seller will set the item’s order status to “Refunded” when he has made a refund to the buyer. There are different order statuses for different delivery types.For pick up, the order statuses are:1. Paid – after you have successfully made a payment, the marketplace will automatically create an invoice ID and order ID and tag each item order status as paid.2. Ready for pick-up – after the seller has picked and packed, he can change the item’s order status to “Ready for pick-up”. The marketplace will automatically send an email to inform you to pick-up his item at his selected pick-up location. 3. Completed – once you have picked-up his item, seller will set the item’s order status to “Completed”.4. Refunded – seller will set the item’s order status to “Refunded” when he has made a refund to you.For delivery, the order statuses are:1. Paid – after you have successfully make a payment, the marketplace will automatically create an invoice ID and order ID and tag each item order status as paid.2. Delivered – after the seller has shipped/couriered/delivered the item, he will set the item’s order status to “Delivered”. The marketplace will automatically send an email to inform you that your item is on its way.3. Refunded– seller will set the item’s order status to “Refunded” when he has made a refund to the buyer.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_You the buyer w'), 'value', 
    'You, the buyer, will not be charged any admin fees by 0128DEL2. However, you are responsible for all other related charges and taxes (including shipping and customs) related to the purchase including and not limited to charges invoiced by the seller, freight forwarders or by the tax authorities.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Simply hover the'), 'value', 
    'Simply hover the cursor over your profile to activate the drop down bar and click on “Purchases”. This opens up your Purchase History page where you can access details of orders that you have placed, including invoice ID, timestamp, item, qty, delivery method and order status.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Click the shopping'), 
    'value', 'Click the shopping cart on the top menu bar. After selecting the items that you want to checkout, fill in your delivery details which include your name, notification email, contact number and delivery address. If you are using an account, these details should already be prepopulated for you.  Next, review the order details once last time before clicking “Proceed to payment”. Check the payment details and click “Pay now”. A pop up box would appear so that you can fill in your credit card details. Once the payment is done, you will be redirected back to 0128DEL2’s site.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_0210BP1 does not store'), 
    'value', '0128DEL2 does not store nor handle any credit card details on our site. Our PCI level 1 compliant partners hold all your financial data securely; no one can access it, not even us!', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_0210BP1 uses Secure So'), 
    'value', '0128DEL2 uses Secure Socket Layer (SSL) technology which ensures that all connections on 0128DEL2’s server remain encrypted. This explains why the website address begins with “https” instead of “http”. Our website and app is secured using a RapidSSL Wildcard Certificate. This ensures all information you send using our app will be encrypted. Please click the “padlock” icon on the web browser for more details on the security certificate. 0128DEL2 also do not store any credit card details and payments are processed through Stripe. Our PCI level 1 compliant partners hold all your financial data securely; no one can access it, not even us!', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_All sales made on'), 
    'value', 'All sales made on 0128DEL2 are considered to be final and binding. Thus we do not accept any order cancellations once the order has been paid.Please contact the seller directly if you need to have your order cancelled. It is up to the seller’s discretion whether he/she will allow a cancellation and provide a full refund excluding any transaction fees that have already been incurred. In addition, do note that the admin fee collected by the 0128DEL2 is a fixed commission for facilitating a sale and thus will not be refunded.However, in rare cases where the actual item has significant discrepancies from the item description or is undelivered, please refer to our dispute policy below.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_If you did not receive an i'), 
    'value', 'If you did not receive an item, you need to make a report to the seller by contacting him/her directly. The seller should address your concern and provide updates on the delivery of the item and its tracking information. If you find that the seller’s response is unsatisfactory, 0128DEL2 will step in to mediate. You should always communicate through the admin so that you will be protected by our Terms of Service.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_If there are any significant dis'), 
    'value', 'If there are any significant discrepancies in the item, you should contact the seller directly. The seller will address your concern and offer a solution, such as offering a replacement or trading for another item. If both you and the seller have agreed on returning the item, you should take note of the following.You must return the item in the exact same condition in which it was received.It is your responsibility as the buyer to pay for the return cost of shipping.You, as the buyer, need to pay for any customs charges incurred on the returned item. If you are unsatisfactory with the resolution provided by the seller, you can request 0128DEL2 to mediate for you.As part of the mediation process, the admin will review the chat history, item description, photos of the item provided by both you and the seller, and any other information about the item that you and the seller have provided. You should always communicate through the admin so that you will be protected by our Terms of Service. ', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Simply click on BE A'), 
    'value', 'Simply click on the “BE A SELLER” tab on the top menu bar. 1. Sign up by using either your Facebook or Google+ account2. Fill up your profile details3. Add a delivery address (your item will be sent to this delivery address when you purchase an item from 0128DEL2 as a buyer)4. Link with your Stripe account (this is the account that you will receive your payments with)5. Add your delivery options and/or your preferred pick-up location 6. Click save Congratulations, you are now a seller on 0128DEL2 and can start uploading your first item. <', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Simply click on the BE A SELLER'), 
    'value', 'Simply click on “BE A SELLER” on the top menu and sign up from there! Once you have filled in all the mandatory fields, you will be able to start listing your items immediately!1. Upload the items that you want to sell. Set your price, category and choose the delivery methods/pick-up locations for this item2. Be informed immediately when someone has purchased your item3. Payment made by the buyer, minus the transaction clip to 0128DEL2, will be transferred to you immediately4. Fulfill your order and update your buyers on the latest status using our order management system5. Get useful business insights such as your sales history, best-selling item and other analytics to optimize your business', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_You can list an item by'), 
    'value', 'You can list an item by clicking on “BE A SELLER” on the top menu bar and signing up as a 0128DEL2 seller. Once you have successfully on-boarded as a seller, click on “upload” under the “Seller” drop down box.Provide us with all the relevant details such as the item category & sub-category, name, price, description, quantity, image and the delivery options. Once you are happy with your listing, click on “SAVE” and your listing will be published.So what are you waiting for? Start listing your first item on 0128DEL2 now! ', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_No unfortunately not'), 
    'value', 'No, unfortunately not. The current default currency on 0128DEL2 is SGD, and we do not accept any other currencies at this point in time. Do set up your Stripe account in Italy and configure the currency in Stripe as SGD. If not, you might incur additional charges arising from foreign exchange differences between SGD and the currency in your Stripe account.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_If you cant log in to your'), 
    'value', 'If you can’t log in to your seller dashboard, it might be because you have been banned by 0128DEL2. You can raise a case by contacting 0128DEL2 directly.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_1 On your seller menu click'), 
    'value', '1. On your seller menu, click on the “Your Items” tab to access all your items.2. Choose the item you want to edit, and click on the sign.3. You will be redirected to your specific listing’s details page.4. From there, you may edit any details you would like.5. Once you are happy with the new details, click on “Save” and your edits will be reflected.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Yes you can definitely do so'), 
    'value', 'Yes, you can definitely do so. If you add more than one delivery address during the sign up process, you have the choice of selecting your preferred address during the checkout process when you purchase an item from 0128DEL2 as a buyer.If you add more than one delivery options and/or your pick-up locations, your customer has the choice of selecting their preferred option when purchasing an item from you. You can always add more delivery options or pick-up locations by first navigating to your user settings through you profile’s drop down bar before clicking on the “Delivery methods” tab. Alternatively, you can add new options whenever you are uploading items onto 0128DEL2.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_If you receive any complaints'), 
    'value', 'If you receive any complaints from customers regarding a particular item or it is still not ready for sale at a point in time, you can temporarily remove it from the marketplace using the purchasable function. Once you switched the purchasable button to “NO”, your item will no longer be visible and searchable on your marketplace. In addition, buyers will not be able to check out the non-purchasable item.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_You are only able to add an ite'), 
    'value', 'You are only able to add an item under a particular category or sub-category if it has been created by us. If you can’t find the right category for your items, don’t worry! Simply drop 0128DEL2 an email, we will review your request and add in the category for you.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Click the Sales tab on t'), 
    'value', 'Click the “Sales” tab on the seller menu to access your sales page. Here, you are able to view the total quantity and revenue earned for each item that you have sold.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Click the Orders tab on'), 
    'value', 'Click the “Orders” tab on the seller menu to access your orders page. You are able to view the relevant details for each item order that you receive, including the Order ID, Invoice ID, Timestamp, Item, Quantity purchased. Click on any payment ID to dive into greater details.Anytime you have completed a certain action to fulfill the order, you can change the order status by clicking on the drop down bar. In the event that you are fulfilling multiple orders at the same time, you can also mass update the order statuses. Simply check the boxes of the relevant orders and click on the “Change Status” button.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_For pick up the order'), 
    'value', 'For pick up, the order statuses are:1. Paid – after the buyer has successfully made a payment, an invoice ID and order ID would automatically be created and each item order status would be tagged as paid.2. Ready for pick-up – after you have picked and packed, you can change the item’s order status to “Ready for pick-up”. The buyer will receive an email notification to remind him to pick-up his item at his selected pick-up location. 3. Completed – once the buyer has picked-up his item, you can set the item’s order status to “Completed”.4. Refunded – you can set the item’s order status to “Refunded” when you have made a refund to the buyer.For delivery, the order statuses are:1. Paid – after the buyer has successfully make a payment, an invoice ID and order ID would be automatically created, and each item order status would be tagged as paid.2. Delivered – after you have shipped/couriered/delivered the item, you can set the item’s order status to “Delivered”. The buyer will then receive an email notification that his item is on its way.3. Refunded– you can set the item order status to “Refunded” when you have made a refund to the buyer.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_There are no listing fees o'), 
    'value', 'There are no listing fees or subscription fees charged, so you can list as many item as your like. However, you will be charged a transaction fee for each transaction made. Drop 0128DEL2 an email to ask about the transaction fee.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Stripe will automatically'), 
    'value', 'Stripe will automatically credit any Payout/Payment directly to your Stripe account after every successful transaction.Stripe will transfer funds to your bank account based on the schedule listed in your dashboard. For example, “Daily — 7 day rolling basis” would mean that charges processed on 1st March would be grouped together and deposited in your account on 8th March, and “Weekly (Monday) — 2 business day rolling basis” would mean that charges processed before a given Thursday will be grouped together and deposited in your account on the following Monday.Your transfer schedule can be configured to simplify your accounting. We currently offer the option for funds to be transferred daily, weekly (on a custom day of the week), or monthly (on a custom day of the month).You can see all attempted transfers made by Stripe to your bank account on your dashboard.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_Stripe submits transfers every'), 
    'value', 'Stripe submits transfers every day, but most banks will only process the transfer on business days. This means that if Stripe sent you money on a holiday or a weekend, you will probably only receive the money in your bank account on the next day that your bank is open. For transfers sent on business days, you should receive the money by the next day.If the transfer was submitted on a business day and you don’t receive the money in your bank account within a couple of days, this probably means that the transfer has failed. Banks take 3-5 business days to inform Stripe about transfers that failed to go through, at which time Stripe will e-mail you about the issue and how to fix it.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_This policy is part of our Terms of Use'), 
    'value', 'This policy is part of our Terms of Use (insert link). By selling on 0128DEL2, you are agreeing to this policy and our Terms of Use. 0128DEL2 requires all sellers and users to abide by the laws of the jurisdictions in which you are operating and selling. If you are shipping items across international borders, we expect all members to follow the local laws of both the exporting and importing countries. Therefore, even if an item is illegal in one country but legal in another, it would still be strictly prohibited in 0128DEL2. 0128DEL2 does not allow any listing that through images or descriptions facilitate or promote illegal acts when applied under a specific context.0128DEL2 expects all users to only list items that are legal. All items must not present legal risks to our community, be inconsistent with 0128DEL2 values or harmful to our members.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/textarea_If any product does not adhere'), 
    'value', 'If any product does not adhere to the product policies in our terms of use, 0128DEL2 reserves the right to delete/ban it to maintain a comfortable environment for all users.', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I sign up_lbl_title'), 
    'value', 'How do I sign up?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I sign up as a seller_lbl_title'), 
    'value', 'How do I sign up?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_I forgot my password How do I reset it_lbl_title'), 
    'value', 'I forgot my password. How do I reset it?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Do you allow guest checkout_lbl_title'), 
    'value', 'Do you allow guest checkout?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What is an invoice ID_lbl_title'), 
    'value', 'What is an invoice ID?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What is an order ID_lbl_title'), 
    'value', 'What is an order ID?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What are Delivery options_lbl_title'), 
    'value', 'What are Delivery options?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What are Pick-up options_lbl_title'), 
    'value', 'What are Pick-up options?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What are the different order statuses and what do they meant_lbl_title'), 
    'value', 'What are the different order statuses and what do they meant?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Will I be charged any fees for making a purchase_lbl_title'), 
    'value', 'Will I be charged any fees for making a purchase?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I check my order statuses_lbl_title'), 
    'value', 'How do I check my order statuses?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I make a creditdebit card payment_lbl_title'), 
    'value', 'How do I make a credit/debit card payment?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Are the creditdebit card payments safe_lbl_title'), 
    'value', 'Are the credit/debit card payments safe?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I know that my online payment is secure_lbl_title'), 
    'value', 'How do I know that my online payment is secure?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Can I cancel my order and get a refund_lbl_title'), 
    'value', 'Can I cancel my order and get a refund?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_I did not receive my item what am I supposed to do_lbl_title'), 
    'value', 'I did not receive my item, what am I supposed to do?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_The item condition has significant discrepancies'), 
    'value', 'The item condition has significant discrepancies from what was stated in the item description. Am I able to get a refund?', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I sign up as a seller_lbl_title'), 
    'value', 'How do I sign up as a seller?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I sell something on 0210BP1_lbl_title'), 
    'value', 'How do I sell something on 0128DEL2?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I list an item_lbl_title'), 
    'value', 'How do I list an item?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Can I denote my items in another currency_lbl_title'), 
    'value', 'Can I denote my items in another currency?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Why cant I log in to my seller dashboard_lbl_title'), 
    'value', 'Why can’t I log in to my seller dashboard?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I edit my item information_lbl_title'), 
    'value', 'How do I edit my item information?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Can I add a few delivery'), 
    'value', 'Can I add a few delivery addresses, delivery options and pick-up locations?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What is the purchasable button for_lbl_title'), 
    'value', 'What is the purchasable button for?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Why cant I find the right category for my item_lbl_title'), 
    'value', 'Why can’t I find the right category for my item?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I keep track of my sales_lbl_title'), 
    'value', 'How do I keep track of my sales?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How can I keep track of orders that I receive_lbl_title'), 
    'value', 'How can I keep track of orders that I receive?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What do the different order statuses mean_lbl_title'), 
    'value', 'What do the different order statuses mean?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Are there any subscription fees or listing fees on 0210BP1_lbl_title'), 
    'value', 'Are there any subscription fees or listing fees on 0128DEL2?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_How do I receive my PayoutPayment_lbl_title'), 
    'value', 'How do I receive my Payout/Payment?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Stripe states that a transfer'), 
    'value', 'Stripe states that a transfer has been submitted, but I have not received the money in my bank account yet. What is going on?', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_What items are prohibited on 0210BP1_lbl_title'), 
    'value', 'What items are prohibited on 0128DEL2?', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Edit Text/Bespoke/Admin Pages/FAQ/input_Why is my product deletedbanned_lbl_title'), 
    'value', 'Why is my product deleted/banned?', 0)

