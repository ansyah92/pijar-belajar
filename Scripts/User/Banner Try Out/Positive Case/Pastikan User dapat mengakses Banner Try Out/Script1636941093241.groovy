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

WebUI.scrollToElement(findTestObject('Try Out/Page_Pijar Belajar/h3_Latihan dan Simulasi Ujian'), 0)

WebUI.click(findTestObject('Try Out/Page_Pijar Belajar/div_Try Out Event'))

WebUI.click(findTestObject('Try Out/Page_Pijar Belajar/a_Try Out Saya'))

WebUI.click(findTestObject('Try Out/Page_Pijar Belajar/a_Try Out Terdekat'))

WebUI.scrollToElement(findTestObject('Try Out/Page_Pijar Belajar Tryout/p_Tryout 15'), 0)

WebUI.click(findTestObject('Try Out/Page_Pijar Belajar Tryout/svg_next'))

WebUI.click(findTestObject('Try Out/Page_Pijar Belajar Tryout/svg_prev'))

