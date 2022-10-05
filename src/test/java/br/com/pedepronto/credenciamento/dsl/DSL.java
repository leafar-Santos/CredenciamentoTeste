package br.com.pedepronto.credenciamento.dsl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {

	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	public void escreveByName(String nomeElemento, String texto) {
		driver.findElement(By.name(nomeElemento)).sendKeys(texto);
	}

	// Métodos que clicam em radio button
	public void selecionaRadioButton(String nomeElemento) {
		driver.findElement(By.className(nomeElemento)).click();
	}

	// Método que clica no comboBox
	public void clicaNoCombo(String nomeElemento) {
		driver.findElement(By.name(nomeElemento)).click();
	}

	// Seleciona opção do combo
	public void selecionaOpcaoCombo(String nomeElemento) {
		driver.findElement(By.id(nomeElemento)).click();
	}

	
	public void clicaBotao(String nomeElemento) {
		driver.findElement(By.cssSelector(nomeElemento)).click();
	}
}
