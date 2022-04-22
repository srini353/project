package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class redbus {
public static void main(String[] args) {
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Srini\\eclipse-workspace\\Sele\\drivers\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement searchtxt = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	searchtxt.sendKeys("Chennai");
	WebElement empty = driver.findElement(By.xpath("//div[@class='o3j99 qarstb']"));
	empty.click();
	WebElement search = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
	search.click();
	System.out.println(driver.getTitle());
driver.quit();
	
}
}
