package selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserlaunch {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Browser Name as chrome or firefox or edge");
	String browser=sc.next();
	
	switch (browser) {
	case "chrome":
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srini\\eclipse-workspace\\Sele\\drivers\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		System.out.println("Enter the url");
		String url1=sc.next();
		driver1.get(url1);
		System.out.println(driver1.getTitle());
		break;
	case "firefox":
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srini\\eclipse-workspace\\Sele\\drivers\\geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		System.out.println("Enter the url");
		String url2=sc.next();
		driver2.get(url2);
		System.out.println(driver2.getTitle());
		break;
	case "edge":
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Srini\\eclipse-workspace\\Sele\\drivers\\msedgedriver.exe");
		WebDriver driver3=new EdgeDriver();
		System.out.println("Enter the url");
		String url3=sc.next();
		driver3.get(url3);
		System.out.println(driver3.getTitle());
		break;

	default:
		break;
	}
//	driver.get("https://www.facebook.com/");
//	System.out.println(driver.getTitle());
//	
//	driver.quit();
//	switch (browser) {
//	case chrome:
//		
//		break;
//
//	default:
//		break;
//	}
	
	
	
}
}
