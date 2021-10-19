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

WebUI.callTestCase(findTestCase('User/Login/Positive Case/Pastikan User dapat melakukan login'), [('email') : 'wawanfebrianto@yopmail.com'
        , ('password') : '132245678'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Ubah Password Voucher/Page_Pijar Belajar/button_Ubah Password'))

WebUI.setText(findTestObject('Ubah Password Voucher/Page_Pijar Belajar/input_Email_email'), 'wawanfebrianto@yopmail.com')

WebUI.click(findTestObject('Ubah Password Voucher/Page_Pijar Belajar/button_Lanjutkan'))

WebUI.delay(40)

WebUI.click(findTestObject('Ubah Password Voucher/Page_Pijar Belajar/button_Verifikasi'))

WebUI.setText(findTestObject('Ubah Password Voucher/Page_Pijar Belajar/input_Password_password'), '12345678')

WebUI.setText(findTestObject('Ubah Password Voucher/Page_Pijar Belajar/input_Konfirmasi Password_retypePassword'), '12345678')

WebUI.click(findTestObject('Ubah Password Voucher/Page_Pijar Belajar/button_Ubah Password_2'))

WebUI.click(findTestObject('Ubah Password Voucher/Page_Pijar Belajar/button_Ke Pengaturan Profil'))

