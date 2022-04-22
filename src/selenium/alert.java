package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srini\\eclipse-workspace\\Sele\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
//	//simple alert
	WebElement btnsimple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	btnsimple.click();
	//switch to alert
	Alert simple=driver.switchTo().alert();
	String text=simple.getText();
	System.out.println(text);
	simple.accept();
	
	//confirm alert
	WebElement btnconfirm = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	btnconfirm.click();
	
	WebElement confirmalert = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	confirmalert.click();
	
	//Switch to alert
	Alert confirm = driver.switchTo().alert();
	String text2=confirm.getText();
	System.out.println(text2);
	confirm.accept();
	
	//prompt alert
	WebElement btnprompt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	btnprompt.click();
	WebElement promptalert = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	promptalert.click();
	
	
	//switch to alert
	Alert prompt=driver.switchTo().alert();
	prompt.sendKeys("srinivasan");
	String text3=prompt.getText();
	System.out.println(text3);
	prompt.accept();

	





}
}
