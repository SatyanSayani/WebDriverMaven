package gitHubPractice1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenGitHub1 {
	
	
	public static WebDriver cDriver1;
    
	@BeforeTest
	public void setUp() {	
				
			
		WebDriverManager.chromedriver().setup();
		cDriver1 = new ChromeDriver();

		//cDriver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				     
	}    
	
	@Test
	public void doLogin() {
		
		cDriver1.get("http://gmail.com");
		cDriver1.manage().window().maximize();
		WebElement w1 =cDriver1.findElement(By.id("identifierId"));
		w1.sendKeys("satyan.sayani@qaction.nz");
		String xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/span/span";
		WebElement w3 = cDriver1.findElement(By.xpath(xpath));
		w3.click();
		//w1.click();
		cDriver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String xpath2 = "//input[@name='password']";
		cDriver1.findElement(By.xpath(xpath2)).sendKeys("Nikhila123$");
		WebElement w2 = cDriver1.findElement(By.xpath("//div[@role='button'][@id='passwordNext']"));
	       w2.click();
					}
		@AfterTest			
		public void tearDown() {
			cDriver1.quit();
					
				    
		}

}
