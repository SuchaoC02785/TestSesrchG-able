import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
	
String dynamicId = 'g-able career'

String xpath = String.format('//form[@id="tsf"]//span[text()="%s"]', dynamicId)

TestObject to = new TestObject('objectName')

to.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.openBrowser('https://www.google.co.th')

WebUI.setText(findTestObject('Object Repository/Search G-able C/Page_Google/input__q'), 'g-able c')

//WebUI.click(findTestObject('Object Repository/Search G-able C/Page_Google/span_g-able career', [('inputVariable') : 'g-able career']))

if (WebUI.verifyElementPresent(to, 10)){
	WebUI.click(to);
}

WebUI.click(findTestObject('Object Repository/Search G-able C/Page_g-able career -  Google/h3_Careers  G-ABLE'))

WebUI.closeBrowser()


