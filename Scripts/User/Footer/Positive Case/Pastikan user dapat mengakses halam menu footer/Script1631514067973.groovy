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

WebUI.scrollToElement(findTestObject('Footer/p_Didukung oleh'), 1)

WebUI.click(findTestObject('Footer/a_Tentang Pijar Belajar'))

WebUI.click(findTestObject('Footer/a_FAQ'))

WebUI.click(findTestObject('Footer/div_Apa itu Pijar Belajar'))

WebUI.click(findTestObject('Footer/a_Syarat dan Ketentuan'))

WebUI.click(findTestObject('Footer/div_Informasi Pribadi'))

WebUI.click(findTestObject('Footer/a_Kebijakan Privasi'))

WebUI.click(findTestObject('Footer/div_Pengumpulan dan Penggunaan Informasi'))

WebUI.click(findTestObject('Footer/a_Hubungi Kami'))
