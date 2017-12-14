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
String receip_card_number = "4790701003448338"
String card_cvv = "149"
String card_number = "4149507024357228"
String valid_date = "0721"
String sum = "1.01"

//open browser
WebUI.openBrowser(site_url)

//wait page load
WebUI.waitForPageLoad(5)

//maximize window
WebUI.maximizeWindow()

//title check
title = WebUI.getWindowTitle()
WebUI.verifyMatch(title, 'Перевод денег с карты на карту через интернет. Перевести средства между картами онлайн - Mosst.com', false)

//c2c button click
WebUI.click(findTestObject('Explore/NR-Unsucces-Aval-Oschad/button-c2c'))

//verify text sender card step
String h1sendercard = WebUI.getText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/h1-allsteps-text'))
WebUI.verifyMatch(h1sendercard, 'Перевести деньги с карты на карту', false)
String h5sendercard = WebUI.getText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/sender'))
WebUI.verifyMatch(h5sendercard, 'Данные отправителя', false)
String h5underinputsendercard = WebUI.getText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/h5-sender-card-text'))
WebUI.verifyMatch(h5underinputsendercard, 'Введите номер банковской карты с которой хотите отправить деньги', false)

WebUI.waitForPageLoad(1)

//type card number
WebUI.focus(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'))
WebUI.doubleClick(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'))
WebUI.setText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'), card_number)

WebUI.waitForPageLoad(1)

//verify text sender valid date step
String h1validdate = WebUI.getText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/h1-allsteps-text'))
WebUI.verifyMatch(h1validdate, 'Перевести деньги с карты на карту', false)
String h5validdate = WebUI.getText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/sender'))
WebUI.verifyMatch(h5validdate, 'Данные отправителя', false)
String h5underinputsendervaliddate = WebUI.getText(findTestObject('Object Repository/Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/h5-valid-date-text'))
WebUI.verifyMatch(h5underinputsendervaliddate, 'Введите срок действия карты, с которой отправляете деньги', false)

WebUI.waitForPageLoad(1)

//type card valid date
WebUI.focus(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'))
WebUI.doubleClick(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'))
WebUI.setText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'), valid_date)

WebUI.waitForPageLoad(1)

//verify text sender cvv step
String h1cvv = WebUI.getText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/h1-allsteps-text'))
WebUI.verifyMatch(h1cvv, 'Перевести деньги с карты на карту', false)
String h5cvv = WebUI.getText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/sender'))
WebUI.verifyMatch(h5cvv, 'Данные отправителя', false)
String h5underinputsendercvvcard = WebUI.getText(findTestObject('Object Repository/Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/h5-CVV-text'))
WebUI.verifyMatch(h5underinputsendercvvcard, 'Введите CVV-код карты. Он находится на обратной стороне карты.', false)

WebUI.waitForPageLoad(1)

//type cvv
WebUI.focus(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'))
WebUI.doubleClick(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'))
WebUI.setText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'), card_cvv)

WebUI.waitForPageLoad(1)

//verify text sender phone step
String h1senderphone = WebUI.getText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/h1-allsteps-text'))
WebUI.verifyMatch(h1senderphone, 'Перевести деньги с карты на карту', false)
String h5senderphone = WebUI.getText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/sender'))
WebUI.verifyMatch(h5senderphone, 'Данные отправителя', false)
String h5underinputsenderphone = WebUI.getText(findTestObject('Object Repository/Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/h5-sender-phone-text'))
WebUI.verifyMatch(h5underinputsenderphone, 'Введите номер телефона отправителя. Возможно он понадобится для связи с Вами', false)

WebUI.waitForPageLoad(1)

//type phone
WebUI.focus(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'))
WebUI.doubleClick(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'))
WebUI.setText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'), phone_number)

WebUI.waitForPageLoad(1)

//verify text receip card number step
String h1receipcard = WebUI.getText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/h1-allsteps-text'))
WebUI.verifyMatch(h1receipcard, 'Перевести деньги с карты на карту', false)
String h5receipcard = WebUI.getText(findTestObject('Object Repository/Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/receip-card-input-text'))
WebUI.verifyMatch(h5receipcard, 'Данные получателя', false)
String h5underinputreceipcard = WebUI.getText(findTestObject('Object Repository/Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/h5-receip-card-text'))
WebUI.verifyMatch(h5underinputreceipcard, 'Введите номер карты, на которую хотите отправить деньги', false)

WebUI.waitForPageLoad(1)

//type receip_card_number
WebUI.focus(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'))
WebUI.doubleClick(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'))
WebUI.setText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'), receip_card_number)

WebUI.waitForPageLoad(1)

//verify text sum step
String h1sum = WebUI.getText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/h1-allsteps-text'))
WebUI.verifyMatch(h1sum, 'Перевести деньги с карты на карту', false)
String h5sum = WebUI.getText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/sender'))
WebUI.verifyMatch(h5sum, 'Данные отправителя', false)
String h5underinputsum = WebUI.getText(findTestObject('Object Repository/Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/h5-sum-text'))
WebUI.verifyMatch(h5underinputsum, 'Введите сумму перевода от 1 до 15 000 грн.', false)

WebUI.waitForPageLoad(1)

//type sum
WebUI.focus(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'))
WebUI.doubleClick(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'))
WebUI.setText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/input-all'), sum)
WebUI.click(findTestObject('Explore/NR-Unsucces-Aval-Oschad/mdi-arrow-next-after-sum'))

WebUI.waitForPageLoad(5)

//check button
WebUI.verifyElementPresent(findTestObject('Explore/NR-Unsucces-Aval-Oschad/button-do-per'), 3)
String button_text = WebUI.getText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/button-do-per'))
WebUI.verifyMatch(button_text, 'ВЫПОЛНИТЬ ПЕРЕВОД', false)

//click button
WebUI.click(findTestObject('Explore/NR-Unsucces-Aval-Oschad/button-do-per'))

//wait redirect to 3ds page
WebUI.waitForElementPresent(findTestObject('Explore/NR-Unsucces-Aval-Oschad/cancel-3d'), 15)

//click cancel button
WebUI.click(findTestObject('Explore/NR-Unsucces-Aval-Oschad/cancel-3d'))

//click alert window
WebUI.waitForAlert(1)
WebUI.acceptAlert()

//wait return to p2p page
WebUI.waitForPageLoad(15)

//verify alert
WebUI.verifyElementPresent(findTestObject('Explore/NR-Unsucces-Aval-Oschad/mdi-alert-triangle-popup'), 5)

//get popup text 
String popup_text = WebUI.getText(findTestObject('Explore/NR-Unsucces-Aval-Oschad/texts-c2c-ru/text-message-popup'))

//verify message text
WebUI.verifyMatch(popup_text, 'Перевод неуспешный.\n'
+'Причина: код подтверждения перевода введен неверно или отсутствует.\n'
+'\n'
+'Рекомендация:\n'
+'пожалуйста, повторите перевод, код подтверждения поступит на номер телефона, закрепленный за картой в банке.', false)

//click next popup button
WebUI.click(findTestObject('Explore/NR-Unsucces-Aval-Oschad/button-NEXT-popup'))

//browser close
WebUI.closeBrowser();