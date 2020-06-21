package manjunathSirPractice;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Feb_16_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.get("https://www.google.com/");
		driver3.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver3.findElement(By.xpath("//a[text()='Gmail']")).click();
		
	}

}
