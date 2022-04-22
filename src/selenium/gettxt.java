package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettxt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srini\\eclipse-workspace\\Sele\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("http://www.greenstechnologys.com");
		String name=driver.findElement(By.xpath("//a[text()='Master Program']")).getAttribute("value");
		
		System.out.println(name);
		
//		name.sendKeys("abcde");
//		WebElement password=driver.findElement(By.id("pass"));
//		password.sendKeys("123455");
//		WebElement login=driver.findElement(By.name("login"));
//		login.click();
//		
		
		

}}
