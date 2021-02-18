import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.junit.After as After
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.comment('D/M/YY')

Path projectDir = Paths.get(RunConfiguration.getProjectDir())

Path tmpDir = projectDir.resolve('tmp')

if (!(Files.exists(tmpDir))) {
    Files.createDirectory(tmpDir)
}

// Prepare File object
File PreviewDatetmp = tmpDir.resolve('PreviewDate.txt').toFile()

//def date = new Date()
//def formattedDate = date.format('d/M/yy')
//PreviewDatetmp.text = formattedDate
String finaldate = PreviewDatetmp.text.trim()

println(finaldate)

finaldate

WebUI.click(findTestObject('SPACETIME/ARC-7412/Item Details/Page_0613stdiana/img'))

WebUI.click(findTestObject('SPACETIME/ARC-7412/Purchase List/displayname'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/ARC-7412/Purchase List/Page_0613stdiana/linktext_Purchases'), 0)

WebUI.click(findTestObject('SPACETIME/ARC-7412/Purchase List/Page_0613stdiana/linktext_Purchases'))

WebUI.waitForElementVisible(findTestObject('SPACETIME/ARC-7412/Purchase List/Page_0613stdiana/tab_Upcoming'), 0)

timestamp = WebUI.getText(findTestObject('SPACETIME/ARC-7412/Purchase List/Page_0613stdiana/div_Date 151120 to 151120'))

datesplit = timestamp.split(' ')
def inisplitnatimestamp = datesplit[1]
println(inisplitnatimestamp)
def inisplitnatimestamp2 = datesplit[3]
println(inisplitnatimestamp2)
upup = inisplitnatimestamp.split('/')
def upcomingd = upup[0]
def upcoming1m = upup[1]
def upcoming2y = upup[2]
println(upcomingd)


switch(true) {
	case upcomingd.contains('st'):
	upcomingd = upcomingd.replace('st','');
	int upcomingdi =  Integer.parseInt(upcomingd);
	println(upcomingdi)
	upcomingdless1 =  (upcomingdi - 1);
	println(upcomingdless1)
	break;
	
	case upcomingd.contains('nd'):
	upcomingd = upcomingd.replace('nd','');
	int upcomingdi =  Integer.parseInt(upcomingd);
	println(upcomingdi)
	upcomingdless1 =  (upcomingdi -1);
	println(upcomingdless1)
	break;
	
	case upcomingd.contains('rd'):
    upcomingd = upcomingd.replace('rd','');
	int upcomingdi =  Integer.parseInt(upcomingd);
	println(upcomingdi)
	upcomingdless1 =  (upcomingdi -1);
	println(upcomingdless1)
	
	break;
	default:
	upcomingd = upcomingd.replace('th','');
	int upcomingdi =  Integer.parseInt(upcomingd);
	println(upcomingdi)
	upcomingdless1 =  (upcomingdi - 1);
	println(upcomingdless1)
}

finaldateup = ((((upcomingdless1 + '/') + upcoming1m) + '/') + upcoming2y)

println(upcoming1m)
println(upcoming2y)

//2nd date
println(inisplitnatimestamp2)
upup2nd = inisplitnatimestamp2.split('/')
def upcomingd2nd = upup2nd[0]
def upcoming1m2nd = upup2nd[1]
def upcoming2y2nd = upup2nd[2]
int upcomingdint2nd = Integer.parseInt(upcomingd2nd)
upcoming1dcompute2nd = (upcomingdint2nd - 1)
println(upcoming1dcompute2nd)
println(upcoming1m2nd)
println(upcoming2y2nd)



finaldateup2nd = ((((upcoming1dcompute2nd + '/') + upcoming1m2nd) + '/') + upcoming2y2nd)
WebUI.verifyMatch(finaldateup, finaldate, false)
WebUI.verifyMatch(finaldateup2nd, finaldate, false)


WebUI.comment('Ongoing/Past')

WebUI.click(findTestObject('SPACETIME/ARC-7412/Purchase List/a_Ongoingpast'), FailureHandling.CONTINUE_ON_FAILURE)

ongoingtimestamp = WebUI.getText(findTestObject('SPACETIME/ARC-7412/Purchase List/Page_0613stdiana/div_Date 16th1020 to 16th1020'))

datespliton = ongoingtimestamp.split(' ')

def ongoingnapinasplit = datespliton[1]

println(ongoingnapinasplit)

def ongoingnapinasplit2 = datespliton[3]

println(ongoingnapinasplit2)

WebUI.verifyMatch(ongoingnapinasplit, finaldate, false)

WebUI.verifyMatch(ongoingnapinasplit2, finaldate, false)

