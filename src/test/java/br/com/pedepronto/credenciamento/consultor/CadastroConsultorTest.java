package br.com.pedepronto.credenciamento.consultor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import br.com.pedepronto.credenciamento.pages.CadastroConsultorPage;
import br.com.pedepronto.credenciamento.util.DriverFactory;

public class CadastroConsultorTest {

			
		private CadastroConsultorPage CadastroConsultorPage;
		
		@BeforeAll
		public static void setUp() {
	
		}
		
		@Before
		public void iniciliza() {
			DriverFactory.getDriver();
			CadastroConsultorPage = new CadastroConsultorPage(DriverFactory.getDriver());
		}
		


		@After
		public void finaliaza() {
			DriverFactory.killDriver();
		}
		
		

		
		@Test
		public void Cadastro_Consultor_Formulario() throws InterruptedException {
		
			Thread.sleep(2000); 
			CadastroConsultorPage.selecionaConsultor();

			Thread.sleep(2000); 
			CadastroConsultorPage.clicaComboConsultor();
			CadastroConsultorPage.selecionaOpcaoConsultor();
			CadastroConsultorPage.clicaComboOrigemLead();
			CadastroConsultorPage.selecionaOpcaOrigemLead();
			CadastroConsultorPage.clicaEnviar();
		
		}
	}

