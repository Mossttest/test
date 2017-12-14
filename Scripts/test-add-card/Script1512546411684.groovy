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
import com.thoughtworks.selenium.webdriven.commands.Click as Click
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//open browser
WebUI.openBrowser('https://qa-p2p-webclient.azurewebsites.net/')

//wait page load
WebUI.waitForPageLoad(5)

//maximize window
WebUI.maximizeWindow()

//verify login button
WebUI.verifyElementPresent(findTestObject('Explore/Login-Reg-Elements/log-reg_button'), 5)

//click login button
WebUI.click(findTestObject('Explore/Login-Reg-Elements/log-reg_button'))

//check logo
WebUI.waitForElementPresent(findTestObject('Explore/Login-Reg-Elements/img_avatar'), 5)

//click input phone
WebUI.click(findTestObject('Object Repository/Explore/Login-Reg-Elements/input_phone'))

//type phone number
WebUI.setText(findTestObject('Object Repository/Explore/Login-Reg-Elements/input_phone'), '0662511188')

//check phone number input
WebUI.waitForElementPresent(findTestObject('Explore/Login-Reg-Elements/img_green_done'), 5)

//NEXT button click
WebUI.click(findTestObject('Explore/Login-Reg-Elements/phone_next_button'))

//verify password input
WebUI.verifyElementPresent(findTestObject('Object Repository/Explore/Login-Reg-Elements/input_password'), 5)

//click input password
WebUI.click(findTestObject('Object Repository/Explore/Login-Reg-Elements/input_password'))

//type password
WebUI.setText(findTestObject('Object Repository/Explore/Login-Reg-Elements/input_password'), '1q234567')

//verify NEXT button
WebUI.verifyElementPresent(findTestObject('Explore/Login-Reg-Elements/login_button'), 5)

//click NEXT button
WebUI.click(findTestObject('Explore/Login-Reg-Elements/login_button'))

//wait
WebUI.waitForPageLoad(3)

//card button click
WebUI.click(findTestObject('Object Repository/Explore/Add_Cards/span_card_button'))

//add card
WebUI.click(findTestObject('Object Repository/Explore/Add_Cards/plus_add_card'))

//check head
WebUI.waitForElementPresent(findTestObject('Object Repository/Explore/Add_Cards/head_add_card'), 5)
WebUI.verifyElementPresent(findTestObject('Object Repository/Explore/Add_Cards/head_add_card'), 5)

WebUI.focus(findTestObject('Object Repository/Explore/test-test/input-1-name-card'))
WebUI.doubleClick(findTestObject('Object Repository/Explore/test-test/input-1-name-card'))
WebUI.setText(findTestObject('Object Repository/Explore/test-test/input-1-name-card'), 'TestAddCard')

WebUI.focus(findTestObject('Object Repository/Explore/test-test/input-2-card-number'))
WebUI.doubleClick(findTestObject('Object Repository/Explore/test-test/input-2-card-number'))
WebUI.setText(findTestObject('Object Repository/Explore/test-test/input-2-card-number'), '4111111111111111')

WebUI.waitForPageLoad(3)

WebUI.focus(findTestObject('Object Repository/Explore/test-test/input-3-valid-date'))
WebUI.doubleClick(findTestObject('Object Repository/Explore/test-test/input-3-valid-date'))
WebUI.setText(findTestObject('Object Repository/Explore/test-test/input-3-valid-date'), '1225')

//check add card button
WebUI.verifyElementPresent(findTestObject('Object Repository/Explore/Add_Cards/add_card_button'), 3)

//click add card button
WebUI.click(findTestObject('Object Repository/Explore/Add_Cards/add_card_button'))

//check succes add
WebUI.verifyElementPresent(findTestObject('Object Repository/Explore/Add_Cards/h2_succesfull_add_card'), 3)

//browser close
WebUI.closeBrowser();

