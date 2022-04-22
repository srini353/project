package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {
	
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srini\\eclipse-workspace\\Sele\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	WebElement table1 = driver.findElement(By.id("customers"));
	List<WebElement> tablerows = table1.findElements(By.tagName("tr"));	

	//get 1st 3 rows

		System.out.println("====first 3 Rows====");
		
		
		for(int i=1; i<4; i++){
		List<WebElement> row3 = table1.findElements(By.tagName("tr"));	
		WebElement eachrow = row3.get(i);
		String text7= eachrow.getText();	
		System.out.println(text7);
			
		}
//last 3 rows
	System.out.println("====last 3 Rows====");
		
		
		for(int i=tablerows.size()-3; i<tablerows.size(); i++){
		List<WebElement> last3rows = table1.findElements(By.tagName("tr"));	
		WebElement eachrow = last3rows.get(i);
		String text8= eachrow.getText();	
		System.out.println(text8);
		}
		
		//Alternative rows
		System.out.println("====Alternative Rows====");
		for(int i=0; i<tablerows.size(); i++){
			if(i%2==1) {
			List<WebElement> alternativerows = table1.findElements(By.tagName("tr"));	
			WebElement eachrow = alternativerows.get(i);
			String text9= eachrow.getText();	
			System.out.println(text9);
			}}
		System.out.println("====Middle Row====");
	//Middle Row
		List<WebElement> middlerows = table1.findElements(By.tagName("tr"));	
		WebElement eachrow = middlerows.get(tablerows.size()/2);
		String text10= eachrow.getText();	
		System.out.println(text10);

		
		//Middle row Middle data
		System.out.println("====Middle Row data====");
		List<WebElement> middlerow = table1.findElements(By.tagName("tr"));
		WebElement row = middlerow.get(tablerows.size()/2);
		List<WebElement> datas = row.findElements(By.tagName("td"));
		WebElement middata = datas.get(datas.size()/2);
		
		String text11= middata.getText();
		System.out.println(text11);

	}}

