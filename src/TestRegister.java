import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class TestRegister {

	@Test
	void test() throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		//Open to login
			driver.findElement(By.id("btn-make-appointment")).click();
		//login
			driver.findElement(By.id("txt-username")).sendKeys("John Doe");
			driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
			driver.findElement(By.id("btn-login")).click();
		//form Select
			Select option1 = new Select(driver.findElement(By.id("combo_facility")));
			option1.selectByVisibleText("Hongkong CURA Healthcare Center");
			driver.findElement(By.id("chk_hospotal_readmission")).click();
		//form Radio
	        WebElement radio1 = driver.findElement(By.id("radio_program_medicaid"));
	        radio1.click();
	        driver.findElement(By.id("txt_visit_date")).click();
	        driver.findElement(By.id("txt_visit_date")).sendKeys("18/01/2023");
	        driver.findElement(By.id("txt_comment")).click();
	        driver.findElement(By.id("txt_comment")).sendKeys("ฮัลโหลไอ้เจ้าตู่");
	        driver.findElement(By.id("btn-book-appointment")).click();
	        Thread.sleep(5000);
		driver.quit();

	}

}
