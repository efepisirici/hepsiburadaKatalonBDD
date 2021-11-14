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
import com.sun.org.apache.xpath.internal.compiler.Keywords

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


Mobile.comment('Story point: return favorite ')

if (Mobile.verifyElementExist(findTestObject('Object Repository/Scenario 2/login/loginSuccess'), 10)== true)
	{
Mobile.tap(findTestObject('Object Repository/Scenario 2/login/loginSuccess'), 10)
		
	}

Mobile.tap(findTestObject('Object Repository/Scenario 2/imageCloseButton'), 10)

Mobile.tap(findTestObject('Object Repository/Scenario 2/favorites'), 10)

Mobile.tap(findTestObject('Object Repository/Scenario 2/myFav'), 10)

def second = Mobile.getText(findTestObject('Object Repository/Scenario 2/myFavPro'), 10)

assert CustomKeywords.'utils.getFav'()==second
