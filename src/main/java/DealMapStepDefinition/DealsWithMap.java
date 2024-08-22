package DealMapStepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsWithMap {
	WebDriver driver;

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\2162910\\OneDrive - Cognizant\\Desktop\\Automation\\Programs\\Automation\\Drivers\\msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(options);
		driver.get("https://freecrm.com/");
	}

	@When("^title of the page is Free CRM$")
	public void title_of_the_page_is_Free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM Software Power Up your Entire Business Free Forever", title);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//span[contains(.,'Log In')]")).click();
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		Map<String, String> data = credentials.asMap(String.class, String.class);
		driver.findElement(By.name("email")).sendKeys(data.get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
	}

	@Then("^user click on login$")
	public void user_click_on_login() {
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

	@And("^user is on homepage$")
	public void user_is_on_homepage() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("^user moves to deals page$")
	public void user_moves_to_deals_page() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Deals']"))).build().perform();
	}

	@Then("^lick_on_create_button$")
	public void click_on_create_button() {
		driver.findElement(By.xpath("//button[text()='Create']")).click();
	}

	@Then("^user enters deal details$")
	public void Then_user_enters_deal_details(DataTable data) {
		
		for(List<Map<String, String>> dealdata = data.asMaps(String.class, String.class))
		{
			driver.findElement(By.id("//input[@autocomplete='new-password' and @name='title']")).sendKeys(dealdata.get("title"));
			driver.findElement(By.xpath("//div[@name='company']")).sendKeys(dealdata.get("company"));
			driver.findElement(By.xpath("//div[@name='products']")).sendKeys(dealdata.get("products"));
			
			driver.findElement(By.xpath("//button[text()='Save']")).click();
			
			//move to new deals page
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//span[text()='Deals']"))).click();
		}
		}

	@And("^close the browser$")
	public void close_the_browser() {
		driver.quit();

	}

}
