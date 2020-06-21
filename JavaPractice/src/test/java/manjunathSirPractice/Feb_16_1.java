// write a java program to navigate to flipkart.com handle electroincs menu using action class..

package manjunathSirPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Feb_16_1 {
	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.flipkart.com/");
		
		driver1.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver1.findElement(By.xpath("//button[text()='✕']")).click();
		

		WebElement aa=driver1.findElement(By.xpath("//span[text()='Electronics']"));
		Actions aa1 = new Actions(driver1);
		
		aa1.moveToElement(aa).click().build().perform();
		
		
		
		
		}

}
