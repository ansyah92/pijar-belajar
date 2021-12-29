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

WebUI.callTestCase(findTestCase('User/Login/Positive Case/Pastikan User dapat melakukan login'), [('email') : 'sintadewi@yopmail.com'
        , ('password') : '12345678'], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Footer New/span_Try Out Event'), 1)

WebUI.verifyElementText(findTestObject('Footer New/span_Try Out Event'), 'Try Out Event')

WebUI.scrollToElement(findTestObject('Footer New/h3_Latihan dan Simulasi Ujian'), 0)

WebUI.verifyElementText(findTestObject('Footer New/h3_Latihan dan Simulasi Ujian'), 'Latihan dan Simulasi Ujian')

WebUI.scrollToElement(findTestObject('Footer New/h3_Promo Belajar Untukmu'), 0)

WebUI.verifyElementText(findTestObject('Footer New/h3_Promo Belajar Untukmu'), 'Promo Belajar Untukmu!')

WebUI.scrollToElement(findTestObject('Footer New/p_Segera tersedia di'), 0)

WebUI.verifyElementText(findTestObject('Footer New/p_Segera tersedia di'), 'Segera tersedia di')

WebUI.click(findTestObject('Footer New/a_Tentang Pijar Belajar'))

WebUI.verifyElementText(findTestObject('Footer New/h1_Pusat Bantuan'), 'Pusat Bantuan')

WebUI.verifyElementText(findTestObject('Footer New/h3_Tentang Kami'), 'Tentang Kami')

WebUI.click(findTestObject('Footer New/img_pijar_belajar_back_homepage'))

WebUI.click(findTestObject('Footer New/a_Hubungi Kami'))

WebUI.verifyElementText(findTestObject('Footer New/h2_Kontak Pijar Belajar'), 'Kontak Pijar Belajar')

WebUI.click(findTestObject('Footer New/img_pijar_belajar_back_homepage'))

WebUI.click(findTestObject('Footer New/a_FAQ'))

WebUI.click(findTestObject('Footer New/img_pijar_belajar_back_homepage'))

WebUI.click(findTestObject('Footer New/a_Syarat dan Ketentuan'))

WebUI.click(findTestObject('Footer New/img_pijar_belajar_back_homepage'))

WebUI.click(findTestObject('Footer New/a_Kebijakan Privasi'))

WebUI.click(findTestObject('Footer New/img_pijar_belajar_back_homepage'))

WebUI.click(findTestObject('Footer New/a_Tentang Pijar Belajar'))

WebUI.verifyElementText(findTestObject('Footer New/h1_Pusat Bantuan'), 'Pusat Bantuan')

WebUI.verifyElementText(findTestObject('Footer New/h3_Tentang Kami'), 'Tentang Kami')

WebUI.click(findTestObject('Footer New/Page_Pijar Belajar/a_FAQ_2'))

WebUI.click(findTestObject('Footer New/Page_Pijar Belajar/div_Apa itu Pijar Belajar'))

WebUI.click(findTestObject('Footer New/Page_Pijar Belajar/div_Siapa Yang Menggunakan Pijar Belajar'))

WebUI.click(findTestObject('Footer New/Page_Pijar Belajar/div_Mengapa harus menggunakan Pijar Belajar'))

WebUI.click(findTestObject('Footer New/Page_Pijar Belajar/div_Apa saja layanan dari Pijar Pijar Belajar'))

WebUI.click(findTestObject('Footer New/Page_Pijar Belajar/div_Kemana saya bisa menghubungi layanan pelanggan Pijar Belajar'))

WebUI.click(findTestObject('Footer New/Page_Pijar Belajar/a_Syarat dan Ketentuan_2'))

WebUI.click(findTestObject('Footer New/Page_Pijar Belajar/div_Nama Pengguna'))

WebUI.click(findTestObject('Footer New/Page_Pijar Belajar/div_Informasi Pribadi'))

WebUI.click(findTestObject('Footer New/Page_Pijar Belajar/div_Penggunaan dan Pernyataan Kepada Pihak KeTiga'))

WebUI.click(findTestObject('Footer New/Page_Pijar Belajar/div_Layanan Penggunaan Pijar Belajar'))

WebUI.click(findTestObject('Footer New/Page_Pijar Belajar/a_Kebijakan Privasi_2'))

WebUI.click(findTestObject('Footer New/Page_Pijar Belajar/div_Rahasia Pribadi'))

WebUI.click(findTestObject('Footer New/Page_Pijar Belajar/div_Pengumpulan dan Penggunaan Informasi'))

WebUI.click(findTestObject('Footer New/Page_Pijar Belajar/a_Hubungi Kami_2'))

