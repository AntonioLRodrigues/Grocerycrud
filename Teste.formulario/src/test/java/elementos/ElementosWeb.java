package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	private By versao = By.cssSelector("#switch-version-select > option:nth-child(2)");
	private By addCustomer = By.cssSelector("#gcrud-search-form > div.header-tools > div.floatL.t5 > a");
	
	private By Name = By.id("field-customerName");
	private By lastName = By.id("field-contactLastName");	
	private By ContactFirstName = By.id("field-contactFirstName");
	private By Phone = By.id("field-phone");
	private By AddressLine1 = By.id("field-addressLine1");
	private By AddressLine2 = By.id("field-addressLine2");
	private By City = By.id("field-city");
	private By State = By.id("field-state");
	private By PostalCode = By.id("field-postalCode");
	private By Country = By.id("field-country");
   private By fromEmployeer = By.cssSelector("#field_salesRepEmployeeNumber_chosen > a > span");
	private By CreditLimit = By.id("field-creditLimit");
	private By Delected = By.id("field-deleted");
	private By btnSave = By.id("form-button-save");
	private By btnSaveAndGoBack = By.id("save-and-go-back-button");
	private By btnCancel = By.id("cancel-button");
	
	
	public By getVersao() {
		return versao;
	}
	public By getAddCustomer() {
		return addCustomer;
	}
	public By getName() {
		return Name;
	}
	public By getLastName() {
		return lastName;
	}
	public By getContactFirstName() {
		return ContactFirstName;
	}
	public By getPhone() {
		return Phone;
	}
	public By getAddressLine1() {
		return AddressLine1;
	}
	public By getAddressLine2() {
		return AddressLine2;
	}
	public By getCity() {
		return City;
	}
	public By getState() {
		return State;
	}
	public By getPostalCode() {
		return PostalCode;
	}
	public By getCountry() {
		return Country;
	}
	public By getFromEmployeer() {
		return fromEmployeer;
	}
	public By getCreditLimit() {
		return CreditLimit;
	}
	public By getDelected() {
		return Delected;
	}
	public By getBtnSave() {
		return btnSave;
	}
	public By getBtnSaveAndGoBack() {
		return btnSaveAndGoBack;
	}
	public By getBtnCancel() {
		return btnCancel;
	}
}
