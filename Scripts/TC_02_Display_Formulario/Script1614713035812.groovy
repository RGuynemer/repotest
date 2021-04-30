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
WebUI.setText(findTestObject('Page_MPRJ/input_Nome de Usurio__com_liferay_login_web_cc3aae'), 'rodrigo.otero')

'Inserir senha de usuário'
WebUI.setEncryptedText(findTestObject('Page_MPRJ/input_Senha__com_liferay_login_web_portlet__651809'), 'RmhJl8iq1/Didy1IMisWSg==')

'Submeter credenciais de acesso'
WebUI.click(findTestObject('Page_MPRJ/span_Entrar'))

'Acessar portlet Atualizar Conteúdo'
WebUI.click(findTestObject('Page_MPRJ/a_Formulrio Atualizar Contedo'))

'Verificar a presença do texto na página'
WebUI.verifyTextPresent('FORMULÁRIO ATUALIZAR CONTEÚDO', false)

'Verificar a presença do texto na página'
WebUI.verifyTextPresent('Solicitante', false)

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/span_Solicitante'), 
    0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/span_Solicitante'))

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/label_Nome'), 0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/label_Nome'))

'Verificar a presença do texto na página'
WebUI.verifyTextPresent('Nome', false)

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/input_Nome__br_mp_mprj_intranet_form_attpor_8901c2'), 
    0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/input_Nome__br_mp_mprj_intranet_form_attpor_8901c2'))

'Verificar a presença do texto na página'
WebUI.verifyTextPresent('Email', false)

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/label_Email'), 0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/label_Email'))

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/input_Email__br_mp_mprj_intranet_form_attpo_dffdce'), 
    0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/input_Email__br_mp_mprj_intranet_form_attpo_dffdce'))

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/label_rgo'), 0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/label_rgo'), FailureHandling.STOP_ON_FAILURE)

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Page_Formulrio Atualizar Contedo - MPRJ/input_rgo __br_mp_mprj_intranet_form_attpor_177bfa'), 
    0)

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Page_Formulrio Atualizar Contedo - MPRJ/input_rgo __br_mp_mprj_intranet_form_attpor_177bfa'), 
    0)

'Verificar a presença do texto na página'
WebUI.verifyTextPresent('Telefone', false)

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/label_Telefone'), 0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/label_Telefone'))

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Page_Formulrio Atualizar Contedo - MPRJ/input_Telefone __br_mp_mprj_intranet_form_a_054677'), 
    0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Page_Formulrio Atualizar Contedo - MPRJ/input_Telefone __br_mp_mprj_intranet_form_a_054677'))

'Verificar a presença do texto na página'
WebUI.verifyTextPresent('Solicitação', false)

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/span_Solicitao'), 0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/span_Solicitao'))

'Verificar a presença do texto na página'
WebUI.verifyTextPresent('Endereço da Página', false)

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/label_Endereo da PginaObrigatrio'), 
    0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/label_Endereo da PginaObrigatrio'))

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/svg_Endereo da Pgina_lexicon-icon lexicon-i_cf64d0'), 
    0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/svg_Endereo da Pgina_lexicon-icon lexicon-i_cf64d0'))

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Page_Formulrio Atualizar Contedo - MPRJ/input_Obrigatrio__br_mp_mprj_intranet_form__295508'), 
    0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Page_Formulrio Atualizar Contedo - MPRJ/input_Obrigatrio__br_mp_mprj_intranet_form__295508'))

'Verificar a presença do texto na página'
WebUI.verifyTextPresent('Descrição', false)

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/label_DescrioObrigatrio'), 
    0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/label_DescrioObrigatrio'))

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/svg_Descrio_lexicon-icon lexicon-icon-asterisk'), 
    0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/svg_Descrio_lexicon-icon lexicon-icon-asterisk'))

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Page_Formulrio Atualizar Contedo - MPRJ/textarea_Obrigatrio__br_mp_mprj_intranet_fo_168128'), 
    0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Page_Formulrio Atualizar Contedo - MPRJ/textarea_Obrigatrio__br_mp_mprj_intranet_fo_168128'))

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Page_Formulrio Atualizar Contedo - MPRJ/input_Obrigatrio_arquivo'), 0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Page_Formulrio Atualizar Contedo - MPRJ/input_Obrigatrio_arquivo'))

'Verificar a presença do texto na página'
WebUI.verifyTextPresent('Adicionar arquivo', false)

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/span_Adicionar arquivo'), 
    0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/span_Adicionar arquivo'))

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/div_Campo Obrigatrio_add-arquivo'), 
    0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Formulrio Atualizar Contedo - MPRJ/div_Campo Obrigatrio_add-arquivo'))

'Verificar a presença do elemento/objeto'
WebUI.verifyTextPresent('Enviar', false)

'Verificar a presença do texto na página'
WebUI.verifyElementPresent(findTestObject('Page_Formulrio Atualizar Contedo - MPRJ/span_Enviar'), 0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Page_Formulrio Atualizar Contedo - MPRJ/span_Enviar'))

'Verificar a presença do texto na página'
WebUI.verifyTextPresent('Limpar', false)

'Verificar a presença do elemento/objeto'
WebUI.verifyElementPresent(findTestObject('Page_Formulrio Atualizar Contedo - MPRJ/span_Limpar'), 0)

'Verificar a visibilidade do elemento/objeto'
WebUI.verifyElementVisible(findTestObject('Page_Formulrio Atualizar Contedo - MPRJ/span_Limpar'))

'Fechar o navegador'
WebUI.closeBrowser()

