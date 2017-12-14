import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.google.common.collect.Multimaps.Keys.KeysEntrySet
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
import org.openqa.selenium.Keys as Keys

String site_url = "https://qa-p2p-webclient.azurewebsites.net/"
String phone_number = "662511188"
String password = "1q234567"
String otp_password = "123456"

//open browser
WebUI.openBrowser(site_url)

//wait page load
WebUI.waitForPageLoad(3)

//maximize window
WebUI.maximizeWindow()

//title check
title = WebUI.getWindowTitle()
WebUI.verifyMatch(title, 'Перевод денег с карты на карту через интернет. Перевести средства между картами онлайн - Mosst.com', false)

//verify reg button
WebUI.verifyElementPresent(findTestObject('Explore/Login-Reg-Elements/log-reg_button'), 3)

//registr button click
WebUI.click(findTestObject('Explore/Login-Reg-Elements/log-reg_button'))

//click input phone
WebUI.click(findTestObject('Object Repository/Explore/Login-Reg-Elements/input_phone'))

//type phone
WebUI.setText(findTestObject('Object Repository/Explore/Login-Reg-Elements/input_phone'), phone_number)

//check phone number input
WebUI.waitForElementPresent(findTestObject('Explore/Login-Reg-Elements/img_green_done'), 3)

//chek NEXT button
WebUI.verifyElementPresent(findTestObject('Explore/Login-Reg-Elements/phone_next_button'), 3)

//NEXT button click
WebUI.click(findTestObject('Explore/Login-Reg-Elements/phone_next_button'))

//check forgot pass button
WebUI.verifyElementPresent(findTestObject('Object Repository/Explore/Recover_Pass_Elements/forgot_pass_button'), 3)

//click forgot pass button
WebUI.click(findTestObject('Object Repository/Explore/Recover_Pass_Elements/forgot_pass_button'))

//otp input click
WebUI.click(findTestObject('Object Repository/Explore/Recover_Pass_Elements/input_sms-password'))

//type otp
WebUI.setText(findTestObject('Object Repository/Explore/Recover_Pass_Elements/input_sms-password'), otp_password)

//check NEXT button
WebUI.verifyElementPresent(findTestObject('Object Repository/Explore/Recover_Pass_Elements/after_otp_next_button'), 3)

//NEXT button click
WebUI.click(findTestObject('Object Repository/Explore/Recover_Pass_Elements/after_otp_next_button'))

WebUI.waitForPageLoad(5)

//click input password1
WebUI.click(findTestObject('Object Repository/Explore/Recover_Pass_Elements/input_new-password'))

//type password1+2
WebUI.sendKeys(findTestObject('Object Repository/Explore/Recover_Pass_Elements/input_new-password'), password + Keys.chord(Keys.TAB) + password)

WebUI.waitForPageLoad(3)

//check NEXT button
WebUI.verifyElementPresent(findTestObject('Object Repository/Explore/Recover_Pass_Elements/after_set_newpass_next_button'), 3)

//click NEXT button
WebUI.click(findTestObject('Object Repository/Explore/Recover_Pass_Elements/after_set_newpass_next_button'))

//close browser
WebUI.closeBrowser();

