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

'Abrir navegador'
WebUI.openBrowser('')

'Maximizar janela'
WebUI.maximizeWindow()

'Acessar tela de login'
WebUI.navigateToUrl('http://h-intranet01:8080/c/login')

'Inserir nome de usuário'
WebUI.setText(findTestObject('Object Repository/Page_MPRJ/input_Nome de Usurio__com_liferay_login_web_cc3aae'), 'rodrigo.otero')

'Inserir senha de usuário'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_MPRJ/input_Senha__com_liferay_login_web_portlet__651809'), 
    'RmhJl8iq1/Didy1IMisWSg==')

'Submeter credenciais de acesso'
WebUI.click(findTestObject('Object Repository/Page_MPRJ/span_Entrar'))

'Acessar portlet Atualizar Conteúdo'
WebUI.click(findTestObject('Object Repository/Page_MPRJ/a_Formulrio Atualizar Contedo'))

'Fechar navegador'
WebUI.closeBrowser()

