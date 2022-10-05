package br.com.pedepronto.credenciamento.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

	private static WebDriver driver;

	
	private DriverFactory() {
	}

		
	public static WebDriver getDriver() {

		if (driver == null) {

			
			System.setProperty("webdriver.chrome.driver",
					"../br.com.pedepronto.credenciamento/src/test/resources/drivers/chromedriver/chromedriver");
			
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(true);
			driver = new ChromeDriver(options);
			
			driver.get("https://credenciamento.staging.pedepronto.com.br/cadastro-comercial-de-estabelecimento");
			
			
			

		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
