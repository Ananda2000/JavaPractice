package manjunathSirPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import JDBC.threads;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Feb_29_1 {

	public static void main(String [] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver1.findElement(By.xpath("(//button)[2]")).click();
	}
}
