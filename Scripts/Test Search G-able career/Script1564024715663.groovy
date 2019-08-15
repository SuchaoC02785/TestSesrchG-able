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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.google.co.th/?gws_rd=ssl')

WebUI.setText(findTestObject('Object Repository/Search G-able career/Page_Google/input__q'), 'g-able career')

WebUI.sendKeys(findTestObject('Object Repository/Search G-able career/Page_Google/input__q'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Search G-able career/Page_g-able career -  Google/Careers G-ABLE'))

WebUI.verifyTextPresent('Jobs', true)

WebUI.delay(1)

WebUI.click(findTestObject('Search G-able career/Page_G-Able Career (Homepage) - G-Able Careers/View Jobs'))

WebUI.closeWindowIndex(0)

not_run: WebUI.closeBrowser()

