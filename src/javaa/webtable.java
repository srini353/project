package javaa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srini\\eclipse-workspace\\Sele\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	//get particular table
	List<WebElement> tables = driver.findElements(By.tagName("table"));
	int size=tables.size();
	//System.out.println(size);
	
//	WebElement table1 = tables.get(0);
//	String text=table1.getText();
//	System.out.println(text);
	//or
	WebElement table1 = driver.findElement(By.id("customers"));
	String text=table1.getText();
	//System.out.println(text);
	
//get all values row wise	
List<WebElement> tablerows = table1.findElements(By.tagName("tr"));	
WebElement r = tablerows.get(3);
String text2 = r.getText();
//System.out.println(text2);
/*	
for(int i=0; i<tablerows.size(); i++){	
WebElement eachrow = tablerows.get(i);
String text3 = eachrow.getText();
//System.out.println(text3);
}
//Heading
List<WebElement> tablehead = table1.findElements(By.tagName("th"));
for(int i=0; i<tablehead.size(); i++){	
WebElement eachHead = tablehead.get(i);
String text4 = eachHead.getText();
System.out.println(text4);
}

//Datas
System.out.println("========Get table Datas========");
List<WebElement> tabledata = table1.findElements(By.tagName("td"));

for(WebElement eachdata:tabledata) {
	System.out.println(eachdata.getText());
}
//only Heading row wise

System.out.println("=====only Heading row wise=====");
for(int i=0; i<tablerows.size(); i++) {
	WebElement eachrow = tablerows.get(i);
	List<WebElement> head = eachrow.findElements(By.tagName("th"));
	for(int j=0; j<head.size();j++) {
		WebElement eachHead = head.get(j);
		String text5 = eachHead.getText();
		System.out.println(text5);
	}}

	//only data row wise
	System.out.println("=====Datas row wise=====");
	for(int i=0; i<tablerows.size(); i++ ) {
		WebElement eachrows = tablerows.get(i);
		List<WebElement> datas = eachrows.findElements(By.tagName("td"));
		for (int j=0; j<datas.size(); j++) {
			WebElement eachdata = datas.get(j);
			String text6 = eachdata.getText();
			System.out.println(text6);
	}}
	
//get particular data
	System.out.println("=====particular data=====");
	for(int i=0; i<tablerows.size(); i++){
	WebElement eachrows = tablerows.get(i);
	List<WebElement> datas = eachrows.findElements(By.tagName("td"));
	for (int j=0; j<datas.size(); j++) {
		WebElement eachdata = datas.get(j);
		String text6 = eachdata.getText();
		if (text6.equals("Canada")) {
			System.out.println(text6);
			//get entire row
			System.out.println(eachrows.getText());
			//row no
			System.out.println("Row No"+i);
			//cell no
			System.out.println("cell No"+j);
		}}	}	
	//Last row
	System.out.println("=====Last Row=====");
	WebElement lastrow = tablerows.get(tablerows.size()-1);
	System.out.println(lastrow.getText());
	
	//last row datas
	
	List<WebElement> eachdatas = lastrow.findElements(By.tagName("td"));
	for(WebElement datas:eachdatas) {
		System.out.println(datas.getText());
	}*/
			
	//get 1st 3 rows
	System.out.println("====first 3 Rows====");
	
	
	for(int i=1; i<4; i++){
	List<WebElement> row3 = table1.findElements(By.tagName("tr"));	
	WebElement eachrow = row3.get(i);
	String text7= eachrow.getText();	
	System.out.println(text7);
		
	}

System.out.println("====last 3 Rows====");
	
	
	for(int i=tablerows.size()-1; i>=tablerows.size()-3; i--){
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
//Middle Row
	List<WebElement> middlerows = table1.findElements(By.tagName("tr"));	
	WebElement eachrow = middlerows.get(tablerows.size()/2);
	String text10= eachrow.getText();	
	System.out.println(text10);

	
	//Middle row Middle data
	List<WebElement> middlerow = table1.findElements(By.tagName("tr"));
	WebElement row = middlerow.get(tablerows.size()/2);
	List<WebElement> datas = row.findElements(By.tagName("td"));
	WebElement middata = datas.get(datas.size()/2);
	
	String text11= middata.getText();
	System.out.println(text11);

}}
	
	
	
	
	
	

