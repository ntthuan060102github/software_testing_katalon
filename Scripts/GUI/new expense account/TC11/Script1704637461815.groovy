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

WebUI.navigateToUrl('https://demo.firefly-iii.org/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/login/button_login'))

WebUI.click(findTestObject('Object Repository/sidebar/button_sidebar'))

WebUI.click(findTestObject('sidebar/button_new_expense_account'))

WebUI.uploadFile(findTestObject('create_new_expense_account/input_attachment'), 'C:\\Users\\Thuan\\Desktop\\Workspace\\software_testing_katalon\\Data Sources\\attachment_file_gt2mb.pdf')

WebUI.verifyElementAttributeValue(findTestObject('create_new_expense_account/input_attachment'), 'value', 'C:\\fakepath\\attachment_file_gt2mb.pdf', 
    0)

WebUI.closeBrowser()
