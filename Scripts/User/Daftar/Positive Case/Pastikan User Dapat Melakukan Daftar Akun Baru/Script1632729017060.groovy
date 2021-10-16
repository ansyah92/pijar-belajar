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

WebUI.callTestCase(findTestCase('CustomKeyword/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CustomKeyword/Nevigate To Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Login/Login Email/Page_Pijar Belajar/button_Mulai Belajar'))

WebUI.click(findTestObject('Daftar/Daftar Email/a_Daftar'))

WebUI.setText(findTestObject('Daftar/Daftar Email/input_Email_email'), 'pusvitasari@yopmail.com')

WebUI.click(findTestObject('Daftar/Daftar Email/button_Lanjutkan'))

WebUI.delay(40)

WebUI.click(findTestObject('Daftar/Daftar Email/button_Verifikasi'))

WebUI.setText(findTestObject('Daftar/Daftar Email/Isi Profilmu/input_Nama Lengkap_fullname'), 'pusvitasari')

WebUI.setText(findTestObject('Daftar/Daftar Email/Isi Profilmu/input_Nomor Telepon_phone'), '897665443211')

WebUI.click(findTestObject('Daftar/Daftar Email/Isi Profilmu/input_Jenjang Pendidikan_categoryId'))

WebUI.click(findTestObject('Daftar/Daftar Email/Isi Profilmu/span_SMA - Kelas 12 IPA'))

WebUI.setText(findTestObject('Daftar/Daftar Email/Isi Profilmu/input_Password_password'), '12345678')

WebUI.click(findTestObject('Daftar/Daftar Email/button_Selesai'))

