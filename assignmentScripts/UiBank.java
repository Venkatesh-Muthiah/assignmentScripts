package assignmentScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://uibank.uipath.com/register-account");

		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Bruce");

		Select title = new Select(driver.findElement(By.xpath("//select[@id='title']")));
		title.selectByValue("mr");

		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("K");

		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Lee");

		Select sex = new Select(driver.findElement(By.xpath("//select[@id='sex']")));
		sex.selectByValue("male");

		Select empStatus = new Select(driver.findElement(By.xpath("//select[@id='employmentStatus']")));
		empStatus.selectByVisibleText("Full-time");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("BruceLee");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@outlook.com");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");

		driver.close();

	}

}
