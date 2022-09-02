package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String site) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		try {
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro -----" + e.getCause());
		}

	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro -----" + e.getCause());
		}
	}

	public void escrever(String texto, By elemento) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro -----" + e.getCause());
		}
	}

	public void esperar(int tempo) throws InterruptedException {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro -----" + e.getCause());
		}
	}

	public void fecharNavegador() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro -----" + e.getCause());
		}
	}

	public void validarTexto(String textoEsperado, By elemento) {
		try {
			String texto = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, texto);
		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro -----" + e.getCause());
		}
	} 

	public void screenShot(String nome) throws IOException {
		try {
			TakesScreenshot srcShot = ((TakesScreenshot) driver);
			File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File("./src/evidencias/" + nome + ".png");
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro -----" + e.getCause());
		}
	}
	
}
