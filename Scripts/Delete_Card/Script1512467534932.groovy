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
String phone_number = "662511188"
String password = "1q234567"

//open browser
WebUI.openBrowser(site_url)

//wait page load
WebUI.waitForPageLoad(5)

//maximize window
WebUI.maximizeWindow()

//title check
title = WebUI.getWindowTitle()
WebUI.verifyMatch(title, 'Перевод денег с карты на карту через интернет. Перевести средства между картами онлайн - Mosst.com', false)

//verify login button
WebUI.verifyElementPresent(findTestObject('Explore/Login-Reg-Elements/log-reg_button'), 5)

//click login button
WebUI.click(findTestObject('Explore/Login-Reg-Elements/log-reg_button'))

//check logo
WebUI.waitForElementPresent(findTestObject('Explore/Login-Reg-Elements/img_avatar'), 5)

//click input phone
WebUI.click(findTestObject('Object Repository/Explore/Login-Reg-Elements/input_phone'))

//type phone number
WebUI.setText(findTestObject('Object Repository/Explore/Login-Reg-Elements/input_phone'), phone_number)

//check phone number input
WebUI.waitForElementPresent(findTestObject('Explore/Login-Reg-Elements/img_green_done'), 5)

//NEXT button click
WebUI.click(findTestObject('Explore/Login-Reg-Elements/phone_next_button'))

//verify password input
WebUI.verifyElementPresent(findTestObject('Object Repository/Explore/Login-Reg-Elements/input_password'), 5)

//click input password
WebUI.click(findTestObject('Object Repository/Explore/Login-Reg-Elements/input_password'))

//type password
WebUI.setText(findTestObject('Object Repository/Explore/Login-Reg-Elements/input_password'), password)

//verify NEXT button
WebUI.verifyElementPresent(findTestObject('Explore/Login-Reg-Elements/login_button'), 5)

//click NEXT button
WebUI.click(findTestObject('Explore/Login-Reg-Elements/login_button'))

//wait
WebUI.waitForPageLoad(3)

//card button click
WebUI.click(findTestObject('Object Repository/Explore/Add_Cards/span_card_button'))

//find card
WebUI.focus(findTestObject('Object Repository/Explore/Delete_Card/dd_TestAddCard'))

//drop click
WebUI.click(findTestObject('Object Repository/Explore/Delete_Card/span_dropdown-menu__button mdi'))

//del click
WebUI.click(findTestObject('Object Repository/Explore/Delete_Card/drop_list'))

//check popup
popup = WebUI.getText(findTestObject('Object Repository/Explore/Delete_Card/popup_del_card'))
WebUI.verifyMatch(popup, 'Вы действительно желаете удалить карту?', false)

//del button click
WebUI.click(findTestObject('Object Repository/Explore/Delete_Card/button_del_card'))

//close browser
WebUI.closeBrowser();


