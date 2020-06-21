/**
 * 
 */
package manjunathSirPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Administrator
 *
 */
public class Feb_16_a2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver2 = new ChromeDriver();
		
		driver2.manage().window().maximize();
		driver2.get("https://www.facebook.com/");
		driver2.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
 driver2.findElement(By.xpath("//input[@id='email']")).sendKeys("this is anand",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
 driver2.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
driver2.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));

		
	}

}
