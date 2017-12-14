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
String otp_password = "123456"
String phone_number = "0954727555"
String password = "1q234567"

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
WebUI.click(findTestObject('Object Repository/Explore/PLogin-Reg-Elements/input_phone'))
//type phone
WebUI.setText(findTestObject('Object Repository/Explore/Login-Reg-Elements/input_phone'), phone_number)
//chek NEXT button
WebUI.verifyElementPresent(findTestObject('Explore/Login-Reg-Elements/phone_next_button'), 3)
//NEXT button click
WebUI.click(findTestObject('Explore/Login-Reg-Elements/phone_next_button'))
//OTP input click
WebUI.click(findTestObject('Explore/Page_Mosst.com_OTPset_pass/input_sms-password'))
//type OTP
WebUI.setText(findTestObject('Explore/Page_Mosst.com_OTPset_pass/input_sms-password'), otp_password)
//NEXT button click
WebUI.click(findTestObject('Object Repository/Explore/Page_Mosst.com_OTPset_pass/button_NEXT_otp'))
//click input password1
WebUI.click(findTestObject('Object Repository/Explore/Page_Mosst.com_OTPset_pass/input_new-password1'))
//type password1
WebUI.setText(findTestObject('Object Repository/Explore/Page_Mosst.com_OTPset_pass/input_new-password1'), password)
//click input password2
WebUI.click(findTestObject('Object Repository/Explore/Page_Mosst.com_OTPset_pass/input_repeat-password2'))
//type password2
WebUI.setText(findTestObject('Object Repository/Explore/Page_Mosst.com_OTPset_pass/input_repeat-password2'), password)
//NEXT button click
WebUI.click(findTestObject('Object Repository/Explore/Page_Mosst.com_OTPset_pass/button_set_pass_next'))
//wait 
WebUI.waitForElementPresent(findTestObject('Explore/Login-Reg-Elements/acc_button_after_aut_reg'), 5)
//verify succes registration
WebUI.verifyElementPresent(findTestObject('Explore/Login-Reg-Elements/acc_button_after_aut_reg'), 5)
//click logout button
WebUI.click(findTestObject('Explore/Login-Reg-Elements/acc_button_after_aut_reg'))
//logout
WebUI.click(findTestObject('Explore/Login-Reg-Elements/button_out'))
//close browser
WebUI.closeBrowser();