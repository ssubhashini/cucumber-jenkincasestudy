package stepdes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class register {
	ChromeDriver driver;

	@Given("perform the operation")
	public void perform_the_operation() throws InterruptedException {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Driver selenium\\chromedriver.exe");
	     driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		Thread.sleep(2000);
		
		
	}
	@Given("provide {word} and {word}")
	public void username(String fname,String lname)
	{
		driver.findElement(By.name("firstName")).sendKeys(fname);
		driver.findElement(By.name("lastName")).sendKeys(lname);
		
		
	}
	@Then("provide user {word} and {string}")
	public void userno(String mail,String number)
	{
		driver.findElement(By.name("phone")).sendKeys(number);
		driver.findElement(By.id("userName")).sendKeys(mail);
	}
	
	@Then("provide user {string} and {string}")
	public void address(String address1,String address2)
	{
		driver.findElement(By.name("address1")).sendKeys(address1);
		driver.findElement(By.name("address2")).sendKeys(address2);
		
	}
	
	@Then("provide user {word} {string} and {string}")
	public void citycode(String city,String state,String code)
	{
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("postalCode")).sendKeys(code);
	}

}
