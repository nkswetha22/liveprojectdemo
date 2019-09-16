package com.stepdefinition;



import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.objectrepository.AddCustomerPage;
import com.objectrepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddCustomerSteps extends FunctionalLibrary {
	
	//static WebDriver driver;
	
	/*@Given("User should be in the telecom home page")
	public void user_should_be_in_the_telecom_home_page() {
		System.setProperty("webdriver.ie.driver","C:\\Users\\pc\\eclipse-workspace\\swetha\\cucumber\\Driver\\IEDriverServer.exe");
	     driver = new InternetExplorerDriver();
		driver.get("http://demo.guru99.com/telecom/");
	}*/
	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {	
		HomePage page=new HomePage();
		
		button(page.getAddCustomerButton());
		
	}
	@When("user enters all the fields with valid data")
	public void user_enters_all_the_fields_with_valid_data() {	
		AddCustomerPage page=new AddCustomerPage();
		
		button(page.getDoneButton());
		type(page.getFirstName(), "karthi");
		type(page.getLastName(), "rajan");
		type(page.getMail(), "rajan@gmail.com");
		type(page.getAddress(), "madurai");
		type(page.getPhno(), "123456778");
		
		
		/*driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys("karthi");
		driver.findElement(By.id("lname")).sendKeys("rajan");
		driver.findElement(By.id("email")).sendKeys("karthi@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("tanjore");
		driver.findElement(By.id("telephoneno")).sendKeys("123456788");*/
	}
	
	@When("user enters all the field  with valid data")
	public void user_enters_all_the_field_with_valid_data(DataTable cusDetails) {
		
		List<String> datas = cusDetails.asList(String.class);
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get(0));
		driver.findElement(By.id("lname")).sendKeys(datas.get(1));
		driver.findElement(By.id("email")).sendKeys(datas.get(2));
		driver.findElement(By.name("addr")).sendKeys(datas.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get(4));
	  
	}
	
	@When("user enters all the fieldsss  with valid data")
	public void user_enters_all_the_fieldsss_with_valid_data(DataTable cusDetails) {
		
		List<Map<String, String>> datas = cusDetails.asMaps(String.class,String.class);
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(datas.get(2).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(datas.get(1).get("lname"));
		driver.findElement(By.id("email")).sendKeys(datas.get(3).get("mail"));
		driver.findElement(By.name("addr")).sendKeys(datas.get(0).get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(datas.get(2).get("phno"));
	  
	}
	
	@When("user enters all the fieldsss  with valid data{string},{string},{string},{string},{string}")
	public void user_enters_all_the_fieldsss_with_valid_data(String fname, String lname, String mailid, String address, String phone) {
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(mailid);
		driver.findElement(By.name("addr")).sendKeys(address);
		driver.findElement(By.id("telephoneno")).sendKeys(phone);
		
	 
	}
	


	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		AddCustomerPage page=new AddCustomerPage();
		
		button(page.getSubmitButton());
		
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	}

	@Then("user should be displayed customer id is generated")
	public void user_should_be_displayed_customer_id_is_generated() {
		
		WebElement customerId = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
		
		Assert.assertTrue(customerId.isDisplayed());
	
	}

}
