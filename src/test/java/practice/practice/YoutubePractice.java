package practice.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
@Test
public class YoutubePractice {

	WebDriver driver;
	WebDriverWait wait;
	@BeforeMethod
	public void beforeMethod() {
	     driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod
	public void afterMethod() {
//	     driver.quit();
	}
	@Test
	public void enterDataInSearchTextField()
	{
	     driver.get("https://www.youtube.com/");
	     driver.findElement(By.xpath("//input[@id='search']")).sendKeys("aaj se teri galiya meri ho gae");
	     WebElement searchIcon = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
	     wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	     wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click(); 
	     driver.findElement(By.xpath("//yt-formatted-string[.='Aaj Se Teri - Lyrical | Padman | Akshay Kumar & Radhika Apte | Arijit Singh | Amit Trivedi']")).click();
	}
}
