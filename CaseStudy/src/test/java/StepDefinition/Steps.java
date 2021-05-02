package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	WebDriver driver;
	@Given("I should be on the Screen with signup")
	public void i_should_be_on_the_screen_with_signup() {
	    // Write code here that turns the phrase above into concrete actions
		 WebDriverManager.chromedriver().setup();
		 //This is to open new instance of browser
		 driver = new ChromeDriver();
		 //This is basically to open the application
		 driver.get("http://elearningm1.upskills.in/");
		 //if i want to maximize the screen
		 driver.manage().window().maximize();
		 //if i want to wait for sometime
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@When("I click on Signup button")
	public void i_click_on_signup_button()  {
		driver.findElement(By.linkText("Sign up!")).click();
			}
	@When("I Enter First name as {string}")
	public void i_enter_first_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
			 driver.findElement(By.id("registration_firstname")).sendKeys("ady9");
			 }
	@When("I Enter Last name as {string}")
	public void i_enter_lirst_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
			 driver.findElement(By.id("registration_lastname")).sendKeys("ady9");
			 }
	@When("I Enter e-mail as {string}")
	public void i_enter_e_mail_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("registration_email")).sendKeys("ady9@ady9.com");
	}
	@When("I Enter Username as {string}")
	public void i_enter_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys("ady9");
	}
	@When("I Enter Pass as {string}")
	public void i_enter_pass_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass1")).sendKeys("abcd");
	}
	@When("I Enter Confirm Pass as {string}")
	public void i_enter_confirm_pass_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass2")).sendKeys("abcd");
	}
	@When("I click on Register button")
	public void i_click_on_register_button()  {
		driver.findElement(By.id("registration_submit")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	//@Then("I should see the message as {string}")
	//public void i_should_see_message_as(String string) {
	//String name = driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-12']")).getText();   
	//String Actualdata = "Dear ady8 ady8,\r\n"
	//		+ "\r\n"
	//		+ "Your personal settings have been registered.\r\n"
	//		+ "An e-mail has been sent to remind you of your login and password.\r\n"
	//		+ "You can now select, in the list, the course you want access to.";
	//Assert.assertEquals(name, Actualdata);
	
//}
	
	@When("I click on the picture button")
	public void i_click_on_the_picture_button() {
	    driver.findElement(By.xpath("(//img[@class='img-circle'])[1]")).click();
	}
	
	@When("I click on the inbox button")
	public void i_click_on_the_inbox_button() {
	   driver.findElement(By.xpath("//a[@title='Inbox']")).click();
	}
	
	@When("I click on the compose button")
	public void i_click_on_the_compose_button() {
		driver.findElement(By.xpath("//img[@alt='Compose message']")).click();
	    
	}
	
	@When("I click on sendto as {string}")
	public void i_click_on_sendto_as(String string) throws InterruptedException {
		WebElement textbox= driver.findElement(By.cssSelector("input.select2-search__field"));
		textbox.sendKeys("nidhi1@nidhi1.com");
		Thread.sleep(5000);
		textbox.sendKeys(Keys.ENTER);
	}
	
	@When("I enter the subject as {string}")
	public void i_enter_the_subject_as(String string)  {
		WebElement textbox= driver.findElement(By.id("compose_message_title"));
		textbox.sendKeys("Hi");
		
	}

	@When("I click on the Send Message button")
	public void i_click_on_the_send_message_button() {
		driver.findElement(By.id("compose_message_compose")).click();
	}
	@Then("I should see the acknowledgement window as {string}")
	public void i_should_see_the_acknowledgement_window_as(String string) {
		String name = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		    String Actualdata = "The message has been sent to Nidhi1 Nidhi1 (ndhingra1)";
		    Assert.assertEquals(name,Actualdata);
		    System.out.println("The message has been sent to Nidhi1 Nidhi1 (ndhingra1)");	
		    driver.close();
	
	}
	


	
}
	
