package assignmentScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mark");

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Zuckerburg");

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("confidential");

		Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));

		day.selectByValue("7");

		Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));

		month.selectByValue("4");

		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));

		year.selectByValue("2001");

		driver.findElement(By.xpath("//label[text()='Male']")).click();

		driver.close();
	}

}
