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

WebUI.scrollToElement(findTestObject('Try Out/Page_Pijar Belajar/h3_Latihan dan Simulasi Ujian'), 1)

WebUI.click(findTestObject('Try Out/Page_Pijar Belajar/div_Try Out Event'))

WebUI.click(findTestObject('Try Out/Page_Pijar Belajar/a_Try Out Saya'))

WebUI.click(findTestObject('Try Out/Page_Pijar Belajar/a_Try Out Terdekat'))

WebUI.scrollToElement(findTestObject('Try Out/Beli TO/Page_Pijar Belajar Tryout/p_Tryout 13'), 0)

WebUI.focus(findTestObject('Try Out/Beli TO/Page_Pijar Belajar Tryout/p_Tryout 13'))

WebUI.click(findTestObject('Try Out/Beli TO/New Folder/div_Tryout 13tr-13GratisLihat Detail1 Des 202114 Hari 01 jam 01 Menit'))

WebUI.click(findTestObject('Try Out/Beli TO/Page_Pijar Belajar Tryout/button_Daftar Sekarang'))

WebUI.setText(findTestObject('Try Out/Beli TO/Page_Pijar Belajar Tryout/input_Nama_name_student'), 'Abcde')

WebUI.setText(findTestObject('Try Out/Beli TO/Page_Pijar Belajar Tryout/input_Email_email'), 'Sintadewi@yopmail.com')

WebUI.setText(findTestObject('Try Out/Beli TO/Page_Pijar Belajar Tryout/input_Nomor Handphone_phone'), '897762511111')

WebUI.click(findTestObject('Try Out/Beli TO/Page_Pijar Belajar Tryout/p_Pria'))

WebUI.click(findTestObject('Try Out/Beli TO/Page_Pijar Belajar Tryout/p_Wanita'))

WebUI.setText(findTestObject('Try Out/Beli TO/Page_Pijar Belajar Tryout/input_Nomor Induk Siswa_nis'), '1234567890')

WebUI.click(findTestObject('Try Out/Beli TO/Page_Pijar Belajar Tryout/input_Kelas_kelas'))

WebUI.click(findTestObject('Try Out/Beli TO/Page_Pijar Belajar Tryout/span_SMA - Kelas 12 IPS'))

WebUI.click(findTestObject('Try Out/Beli TO/Page_Pijar Belajar Tryout/input_Provinsi_provinsi'))

WebUI.click(findTestObject('Try Out/Beli TO/Page_Pijar Belajar Tryout/span_MALUKU'))

WebUI.click(findTestObject('Try Out/Beli TO/Page_Pijar Belajar Tryout/input_Kota_kota'))

WebUI.click(findTestObject('Try Out/Beli TO/Page_Pijar Belajar Tryout/li_KAB. SERAM BAGIAN BARAT'))

WebUI.click(findTestObject('Try Out/Beli TO/New Folder/button_Daftar Sekarang'))

