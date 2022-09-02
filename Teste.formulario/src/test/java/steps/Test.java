package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Test {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	
	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) throws InterruptedException {
	   metodos.abrirNavegador(site);
	   metodos.esperar(3000);
	   metodos.clicar(el.getVersao());
	   metodos.clicar(el.getAddCustomer());
	    
	}

	@When("eu preencher os campos obrigatorios")
	public void eu_preencher_os_campos_obrigatorios() {
		metodos.escrever("Antonio", el.getName());
		metodos.escrever("Rodrigues", el.getLastName());
		metodos.escrever("E2E Treinamentos", el.getContactFirstName());
		metodos.escrever("(11)9959-9599", el.getPhone());
		metodos.escrever("teste", el.getAddressLine1());
		metodos.escrever("teste", el.getAddressLine2());
		metodos.escrever("Cananeia", el.getCity());
		metodos.escrever("Sao Paulo", el.getState());
		metodos.escrever("11990-000", el.getPostalCode());
		metodos.escrever("Brasil", el.getCountry());
		metodos.clicar(el.getFromEmployeer());
		metodos.escrever("1000", el.getCreditLimit());
		metodos.escrever("teste", el.getDelected());
		   
	}

	@Then("valido se o formulario foi enviado")
	public void valido_se_o_formulario_foi_enviado() throws InterruptedException, IOException {
	    metodos.esperar(3000);
	    metodos.screenShot("Formulario Preenchido");
	    metodos.clicar(el.getBtnSave());
	    metodos.fecharNavegador();
	}
}
