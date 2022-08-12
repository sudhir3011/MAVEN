package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage02 {
	WebDriver driver;
	//Webelements

	@FindBy(xpath="//*[@id='content']//*[@class='box']//*[@class='head']//h1[text()='Dashboard']")
	private WebElement Dashboard;
	
	@FindBy(xpath="//*[@id='wrapper']//*[@id='branding']//*[@id='welcome']")
	private WebElement WelcomeButton;
	
	@FindBy(xpath="//*[@id='welcome-menu']//child::ul//li//a[text()='Logout']")
	private WebElement LogoutButton;

	
	
	public HomePage02(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Verify1() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOf(Dashboard));
	}
	
	public void Profile1() {
		String wb=WelcomeButton.getText();
		System.out.println(wb);
		  WelcomeButton.click();
	  }
	
	public void Logout1() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOf(LogoutButton));
		  LogoutButton.click();
	}
	
}
