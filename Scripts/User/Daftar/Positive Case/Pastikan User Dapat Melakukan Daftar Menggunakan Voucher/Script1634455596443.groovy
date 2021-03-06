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

WebUI.click(findTestObject('Register Voucher/button_Mulai Belajar'))

WebUI.click(findTestObject('Register Voucher/button_Gunakan Voucher'))

WebUI.setText(findTestObject('Register Voucher/input_Username_code'), 'PJRQA11')

WebUI.setText(findTestObject('Register Voucher/input_Password_password'), '132245678')

WebUI.click(findTestObject('Register Voucher/button_Masuk'))

WebUI.setText(findTestObject('Register Voucher/input_Nama Lengkap_fullname'), 'Wawan Febrianto 200')

WebUI.setText(findTestObject('Register Voucher/input_Email_email'), 'wawanfebrianto@yopmail.com')

WebUI.setText(findTestObject('Register Voucher/input_Nomor Telepon_phone'), '8997766212221')

WebUI.click(findTestObject('Register Voucher/input_Jenjang Pendidikan_categoryId'))

WebUI.click(findTestObject('Register Voucher/span_SMA - Kelas 12 IPA'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Register Voucher/button_Selesai'))

WebUI.delay(40)

WebUI.click(findTestObject('Register Voucher/button_Verifikasi'))

WebUI.delay(20)

