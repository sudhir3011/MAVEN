package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

	WebDriver driver;
	//Webelement
	
	  private By Dashboard = By.xpath("//*[@id='content']//*[@class='box']//*[@class='head']//h1[text()='Dashboard']");
	  private By WelcomeButton = By.xpath("//*[@id='wrapper']//*[@id='branding']//*[@id='welcome']");
	  private By LogoutButton = By.xpath("//*[@id='welcome-menu']//child::ul//li//a[text()='Logout']");
	
	//Constructor
	  public HomePage(WebDriver driver) {
		  this.driver=driver;
	  }
	  
	//Action
	  public void Verify1() {
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(Dashboard)));
	  }
	  
	  public void Logout1() {
		  driver.findElement(WelcomeButton).click();
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(LogoutButton)));
		  driver.findElement(LogoutButton).click();
	  }
}
