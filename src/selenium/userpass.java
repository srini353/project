package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class userpass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srini\\eclipse-workspace\\Sele\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
//facebook
/*
		driver.get("https://www.facebook.com");
		WebElement name=driver.findElement(By.id("email"));
		name.sendKeys("abcde");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("123455");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
*/
		
		
//redbus
/*
 		driver.get("https://www.redbus.in");
		WebElement from=driver.findElement(By.xpath("//input[@data-message='Please enter a source city']"));
		from.sendKeys("chennai");
		
		WebElement empty1=driver.findElement(By.xpath("//li[@data-no='1']"));
		empty1.click();
		
		WebElement to=driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']"));
		to.sendKeys("bangalore");
		
		WebElement empty2=driver.findElement(By.xpath("//li[@data-no='1']"));
		empty2.click();
		
		WebElement date=driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']"));
		date.click();
		
		WebElement datemove=driver.findElement(By.xpath("//td[@class='current day']"));
		datemove.click();
		
		WebElement search=driver.findElement(By.xpath("//button[@class='fl button']"));
		search.click();
*/
		
//google
	/*	driver.get("https://www.google.com/");
		WebElement searchtxt = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchtxt.sendKeys("Chennai");
		WebElement empty = driver.findElement(By.xpath("//div[@class='o3j99 qarstb']"));
		empty.click();
		WebElement search = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
		search.click();
*/
		
//icici
/*		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement userid0=driver.findElement(By.xpath("//input[@title='Login using User ID and password']"));
		userid0.click();
		WebElement userid=driver.findElement(By.xpath("//input[@name='AuthenticationFG.USER_PRINCIPAL']"));
		userid.sendKeys("abcde");
		WebElement userpass=driver.findElement(By.xpath("//input[@name='AuthenticationFG.ACCESS_CODE']"));
		userpass.sendKeys("123455");
		WebElement Login=driver.findElement(By.xpath("//input[@name='Action.VALIDATE_CREDENTIALS']"));
		Login.click();
*/	
//HDFC
/*		driver.get("https://netbanking.hdfcbank.com");
		WebElement usrid=driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		usrid.sendKeys("abcde");
		WebElement userlogin=driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		userlogin.click();
*/		
//swiggy
/*		driver.get("https://www.swiggy.com/	");
		WebElement loc=driver.findElement(By.xpath("//input[@placeholder='Enter your delivery location']"));
		loc.sendKeys("chennai");
		WebElement locselect=driver.findElement(By.xpath("//span[text()='Chennai, Tamil Nadu, India']"));
		locselect.click();
		WebElement search=driver.findElement(By.xpath("//span[text()='FIND FOOD']"));
		search.click();
*/	
		
//snapdeal
	/*	
		driver.get("https://www.snapdeal.com/login");
		WebElement mobid=driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
		mobid.sendKeys("9876543210");
		WebElement userlogin=driver.findElement(By.xpath("//button[@id='checkUser']"));
		userlogin.click();
		*/
		
//instagram
	/*	driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		WebElement instaid=driver.findElement(By.xpath("//input[@name='username']"));
		instaid.sendKeys("9876543210");
		WebElement instapwd=driver.findElement(By.xpath("//input[@name='password']"));
		instapwd.sendKeys("123456");
		WebElement instalogin=driver.findElement(By.xpath("//div[text()='Log In']"));
		instalogin.click();
		*/
//demo
	/*	
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement fname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fname.sendKeys("srini");
		WebElement lname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lname.sendKeys("vasan");
		WebElement addrs=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		addrs.sendKeys("abcdef");
		WebElement mail=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		mail.sendKeys("abcde@gmail.com");
		WebElement phone=driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phone.sendKeys("9876543210");
		WebElement gender=driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();
		WebElement hobby=driver.findElement(By.id("checkbox1"));
		hobby.click();
		
		//cannot enter the values
		WebElement lang=driver.findElement(By.id("msdd"));
		lang.sendKeys("tamil");
		WebElement pwd=driver.findElement(By.xpath("//input[@id='firstpassword']"));
		pwd.sendKeys("12345");
		WebElement pwd2=driver.findElement(By.xpath("//input[@id='secondpassword']"));
		pwd2.sendKeys("12345");
		WebElement submit=driver.findElement(By.id("submitbtn"));
		submit.click();
		
	*/	
		
		
//adactin
	/*	driver.get("http://adactinhotelapp.com/");
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("9876543210");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("123456");
		WebElement login=driver.findElement(By.id("login"));
		login.click();
		*/
		
}}
