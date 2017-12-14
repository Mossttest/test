import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

String site_url = "https://qa-p2p-webclient.azurewebsites.net/"
String card_number = "4149507024357228"
String otp_password = "123456"

//open browser
WebUI.openBrowser(site_url)

//wait page load
WebUI.waitForPageLoad(3)

//maximize Window
WebUI.maximizeWindow()

//title check
title = WebUI.getWindowTitle()
WebUI.verifyMatch(title, 'Перевод денег с карты на карту через интернет. Перевести средства между картами онлайн - Mosst.com', false)

//receive click
WebUI.click(findTestObject('Object Repository/Explore/Receive_money/receive_button'))

WebUI.focus(findTestObject('Object Repository/Explore/Receive_money/input-receive-number'))
WebUI.click(findTestObject('Object Repository/Explore/Receive_money/input-receive-number'))
WebUI.setText(findTestObject('Object Repository/Explore/Receive_money/input-receive-number'), '150086080')

//check ok
WebUI.verifyElementPresent(findTestObject('Object Repository/Explore/Receive_money/mdi-check-ok'), 3)

//next button click
WebUI.click(findTestObject('Object Repository/Explore/Receive_money/mdi-arrow-next-receive-number'))

//otp input click
WebUI.click(findTestObject('Object Repository/Explore/Receive_money/input-smscode'))

//type otp
WebUI.setText(findTestObject('Object Repository/Explore/Receive_money/input-smscode'), otp_password)

//otp next button
WebUI.click(findTestObject('Object Repository/Explore/Receive_money/mdi-arrow-next-smscode'))

//card number input click
WebUI.click(findTestObject('Object Repository/Explore/Receive_money/input-card-number'))

//type card number
WebUI.setText(findTestObject('Object Repository/Explore/Receive_money/input-card-number'), card_number)

//card number next button click
WebUI.click(findTestObject('Object Repository/Explore/Receive_money/mdi-arrow-next-card-number'))

//wait succes
WebUI.waitForElementPresent(findTestObject('Object Repository/Explore/Receive_money/img-succes'), 10)

//verify succes
WebUI.verifyElementPresent(findTestObject('Object Repository/Explore/Receive_money/img-succes'), 3)


//close browser
WebUI.closeBrowser();


