package br.com.pedepronto.credenciamento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.pedepronto.credenciamento.dsl.DSL;



public class CadastroConsultorPage {

	
private DSL dsl;
	
	public CadastroConsultorPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void  selecionaConsultor() {
		dsl.selecionaRadioButton("PrivateSwitchBase-input-102");
	}
	
	public void  clicaComboConsultor() {
		dsl.clicaNoCombo("consultant");
	}
	
	public void  selecionaOpcaoConsultor() {
		dsl.selecionaOpcaoCombo("consultants-list-option-2");
	}
	
	public void  clicaComboOrigemLead() {
		dsl.clicaNoCombo("leadOrigin");
	}
	
	public void  selecionaOpcaOrigemLead() {
		dsl.selecionaOpcaoCombo("consultants-list-option-4");
	}
	
	public void clicaEnviar() {
		dsl.clicaBotao("#consultant-form-info-submit-button > .MuiButton-label");
	}
	
}
