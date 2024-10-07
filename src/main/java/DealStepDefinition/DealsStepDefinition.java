 package DealStepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DealsStepDefinition {

	WebDriver driver;

	@Given("user is already on login page")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\2162910\\OneDrive - Cognizant\\Desktop\\Automation\\Programs\\Automation\\Drivers\\msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(options);
		driver.get("https://freecrm.com/");

	}

	@When("title of the page is Free CRM")
	public void title_of_the_page_is_free_crm() {
		String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("#1 Free CRM Software Power Up your Entire Business Free Forever", title);	
	   
	}
	
	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//span[contains(.,'Log In')]")).click();
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		List<List<String>>data = credentials.cells();
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));	
	}
	
	@Then("^user clicks on login$")
	public void user_clicks_on_login() {
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}
	
	@And("^user is on homepage$")
	public void user_is_on_homepage() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM",title);
	}
	
	@Then("^user moves to deals page$")
	public void user_moves_to_deals_page() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Deals']"))).build().perform();
	}
	
	@Then("^click on create button$")
	public void click_on_create_button() {
		driver.findElement(By.xpath("//button[text()='Create']")).click();
	}
	
	@Then("^user enter deal details$")
	public void user_enter_deal_details(DataTable data) {
		List<List<String>> dealdata = data.cells();
		driver.findElement(By.xpath("//input[@autocomplete='new-password' and @name='title']")).sendKeys(dealdata.get(0).get(0));
		driver.findElement(By.xpath("//div[@name='company']")).sendKeys(dealdata.get(0).get(1));
		driver.findElement(By.xpath("//div[@name='products']")).sendKeys(dealdata.get(0).get(2));
	}
	
	@Then("^click on save button$")
	public void click_on_save_button() {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	
	@And("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
}
