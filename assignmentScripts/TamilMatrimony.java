package assignmentScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.tamilmatrimony.in/");

		Select profile = new Select(driver.findElement(By.xpath("//select[@id='REGISTERED_BY']")));
		profile.selectByVisibleText("Myself");

		driver.findElement(By.xpath("//input[@name='NAME']")).sendKeys("Hilton");

		driver.findElement(By.xpath("//input[@id='gendermale']")).click();

		Select day = new Select(driver.findElement(By.xpath("//select[@id='DOBDAY']")));
		day.selectByVisibleText("24");

		Select month = new Select(driver.findElement(By.xpath("//select[@id='DOBMONTH']")));
		month.selectByVisibleText("June");

		Select year = new Select(driver.findElement(By.xpath("//select[@id='DOBYEAR']")));
		year.selectByVisibleText("1994");

		Select religion = new Select(driver.findElement(By.xpath("//select[@id='RELIGION']")));
		religion.selectByVisibleText("No Religious Belief");

		Select motherTongue = new Select(driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']")));
		motherTongue.selectByVisibleText("Tamil");

		Select country = new Select(driver.findElement(By.xpath("//select[@id='COUNTRY']")));
		country.selectByVisibleText("India");

		Select countryCode = new Select(driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']")));
		countryCode.selectByVisibleText("+91");

		driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9876543210");

		driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("xyz@gmail.com");

		driver.close();

	}

}
