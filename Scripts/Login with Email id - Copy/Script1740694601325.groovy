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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// 1. Opens a new browser
WebUI.openBrowser('')

// 2. Maximise the window
WebUI.maximizeWindow()

// 3. Navigate to URL "https://new-frontend-uat.timespro.com/"
WebUI.navigateToUrl('https://new-frontend-uat.timespro.com/')

// 4. Clicks on the Login button
WebUI.click(findTestObject('AIHack/button_Login'))

// 5. Enters the email address "ajuat1000@yopmail.com"
WebUI.setText(findTestObject('AIHack/input_Email'), 'ajuat1000@yopmail.com')

// 6. Clicks the Continue button
WebUI.click(findTestObject('Object Repository/Page_Times Professional Learning/button_Continue'))

// 7. Enters password "cvW8qx4B2o3F4VwP/kNsqA=="
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Times Professional Learning/input_Password_password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

// 8. Click on continue button
WebUI.click(findTestObject('Object Repository/Page_Times Professional Learning/button_Continue'))

