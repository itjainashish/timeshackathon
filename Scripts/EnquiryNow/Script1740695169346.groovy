import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://new-frontend-uat.timespro.com/executive-education/iim-calcutta-executive-programme-in-strategic-human-resource-management')
WebUI.click(findTestObject('Object Repository/EnquireNow/Page_Enroll In IIM Calcutta Strategic Human_d28155/span_LoginRegister'))
WebUI.click(findTestObject('Object Repository/EnquireNow/Page_Enroll In IIM Calcutta Strategic Human_d28155/button_FAQs_login-register-closeicon'))
WebUI.click(findTestObject('Object Repository/EnquireNow/Page_Enroll In IIM Calcutta Strategic Human_d28155/span_Enquire Now'))
WebUI.setText(findTestObject('Object Repository/EnquireNow/Page_Enroll In IIM Calcutta Strategic Human_d28155/input_Full Name_fullname_IIMC_EPSHRM_05'), 'tpro learn')
WebUI.setText(findTestObject('Object Repository/EnquireNow/Page_Enroll In IIM Calcutta Strategic Human_d28155/input_Zimbabwe_phoneNo_IIMC_EPSHRM_05'), '6945321000')
WebUI.setText(findTestObject('Object Repository/EnquireNow/Page_Enroll In IIM Calcutta Strategic Human_d28155/input_Email id_email_IIMC_EPSHRM_05'), 'ajuat1000@yopmail.com')
WebUI.setText(findTestObject('Object Repository/EnquireNow/Page_Enroll In IIM Calcutta Strategic Human_d28155/input_City_location_IIMC_EPSHRM_05'), 'mum')
WebUI.click(findTestObject('Object Repository/EnquireNow/Page_Enroll In IIM Calcutta Strategic Human_d28155/li_Mumbai, Maharashtra, India'))
WebUI.click(findTestObject('Object Repository/EnquireNow/Page_Enroll In IIM Calcutta Strategic Human_d28155/span_Submit'))
WebUI.setEncryptedText(findTestObject('Object Repository/EnquireNow/Page_Enroll In IIM Calcutta Strategic Human_d28155/input_Enter Password_password_welcome_login'), 'cvW8qx4B2o3F4VwP/kNsqA==')
WebUI.click(findTestObject('Object Repository/EnquireNow/Page_Enroll In IIM Calcutta Strategic Human_d28155/span_Continue'))
WebUI.click(findTestObject('Object Repository/EnquireNow/Page_Enroll In IIM Calcutta Strategic Human_d28155/div_TL'))
WebUI.click(findTestObject('Object Repository/EnquireNow/Page_Enroll In IIM Calcutta Strategic Human_d28155/span_Logout'))
WebUI.closeBrowser()