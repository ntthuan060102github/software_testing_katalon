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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.delay(3)

WebUI.navigateToUrl('https://www.firefly-iii.org/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Firefly III - A free and open source p_e563ca/a_Demo'))

WebUI.click(findTestObject('Object Repository/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Whats playing  Firefly III/a'))

WebUI.click(findTestObject('Page_Whats playing  Firefly III/a_New withdrawal'))

WebUI.setText(findTestObject('Page_Create new withdrawal  Transactions  Firefly III/input_Description_description'), description)

WebUI.setText(findTestObject('Page_Create new withdrawal  Transactions  Firefly III/input_Source account_source'), source)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Page_Create new withdrawal  Transactions  Firefly III/input_Source account_source'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Page_Create new withdrawal  Transactions  Firefly III/input_Destination account_destination'), 
    destination)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Page_Create new withdrawal  Transactions  Firefly III/input_Destination account_destination'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByLabel(findTestObject('Page_Create a new asset account  Accounts  _ced620/select_Euro ()British Pound ()Hungarian forint (Ft)US Dollar ()'), 
    currency, false)

WebUI.setText(findTestObject('Page_Create new withdrawal  Transactions  Firefly III/input_Date_date'))

WebUI.click(findTestObject('Page_Create new withdrawal  Transactions  Firefly III/button_Submit'))

WebUI.verifyTextPresent(expected_result, false)

WebUI.closeBrowser()

