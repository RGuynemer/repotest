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

'Abrir navegador'
WebUI.openBrowser('')

'Maximizar janela'
WebUI.maximizeWindow()

'Acessar tela de login'
WebUI.navigateToUrl('http://h-intranet01:8080/web/guest/home?p_p_id=com_liferay_login_web_portlet_LoginPortlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&saveLastPath=false&_com_liferay_login_web_portlet_LoginPortlet_mvcRenderCommandName=%2Flogin%2Flogin')

'Inserir nome de usuário'
WebUI.setText(findTestObject('Object Repository/Page_MPRJ/input_Nome de Usurio__com_liferay_login_web_cc3aae'), 'rodrigo.otero')

'Inserir senha de usuário'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_MPRJ/input_Senha__com_liferay_login_web_portlet__651809'), 
    'RmhJl8iq1/Didy1IMisWSg==')

'Submeter credenciais de acesso'
WebUI.click(findTestObject('Object Repository/Page_MPRJ/span_Entrar'))

'Acessar portlet Atualizar Conteúdo'
WebUI.click(findTestObject('Object Repository/Page_MPRJ/a_Formulrio Atualizar Contedo'))

'Preencher campo'
WebUI.setText(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/input_rgo __br_mp_mprj_intranet_form_attpor_177bfa'), 
    'Teste @ GPPV')

'Preencher campo'
WebUI.setText(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/input_Telefone __br_mp_mprj_intranet_form_a_054677'), 
    '(21) 9990-07662')

'Preencher campo'
WebUI.setText(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/input_Obrigatrio__br_mp_mprj_intranet_form__295508'), 
    'https://www.mprj.mp.br')

'Preencher campo'
WebUI.setText(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/textarea_Obrigatrio__br_mp_mprj_intranet_fo_168128'), 
    'Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação \n\n"\'!@#$%¨&*()_+-=\'" \n(Teste Char Especiais)\n\nFim teste texto.')

'Realizar upload de arquivo'
WebUI.uploadFile(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/input_Obrigatrio_arquivo'), 'C:\\Users\\rodrigo.otero\\Pictures\\cards faltantes  01.PNG')

'Acionar função'
WebUI.click(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/span_Limpar'))

'Preencher campo'
WebUI.setText(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/input_rgo __br_mp_mprj_intranet_form_attpor_177bfa'), 
    'Teste GPPV ')

'Preencher campo'
WebUI.setText(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/input_Telefone __br_mp_mprj_intranet_form_a_054677'), 
    '(21) 9990-07662')

'Preencher campo'
WebUI.setText(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/input_Obrigatrio__br_mp_mprj_intranet_form__295508'), 
    'https://www.mprj.mp.br')

'Preencher campo'
WebUI.setText(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/textarea_Obrigatrio__br_mp_mprj_intranet_fo_168128'), 
    'Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação Teste texto solicitação \n\n"\'!@#$%¨&*()_+-=\'" \n(Teste Char Especiais)\n\nFim teste texto.')

WebUI.click(findTestObject('Page_Formulrio Atualizar Contedo - MPRJ/span_Adicionar arquivo'))

'Realizar upload de arquivo'
WebUI.uploadFile(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/input_Obrigatrio_arquivo'), 'C:\\Users\\rodrigo.otero\\Desktop\\PORTLETS\\Portlet Reunioes\\Anexos\\sample-pdf-download-20-mb.PDF')

'Submeter solicitação'
WebUI.rightClick(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/span_Enviar'))

'Validação de envio com sucesso'
WebUI.verifyTextPresent('Protocolo:', false)

