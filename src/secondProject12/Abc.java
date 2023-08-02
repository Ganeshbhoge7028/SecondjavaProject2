package secondProject12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("123456");
        driver.findElement(By.name("pass")).sendKeys("asdfg");
        driver.findElement(By.name("login")).click();
	}

}
