

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}
public static WebDriver driver;
@BeforeSuite 
public void setup() {
	 driver=new FirefoxDriver();
}
@Test
public void Login() throws InterruptedException {
	/*driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	driver.findElement(By.id("identifierId")).sendKeys("pranavraj.s260@gmail.com");
	//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9739577700P");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys("9739577700P");
	driver.findElement(By.xpath("//span[contains(text(),'Next')]"));*/
	
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("trainee");
	driver.findElement(By.name("pwd")).sendKeys("trainee");
	driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();
	
}
@AfterSuite 
public void tearDown() {
	driver.quit();
}
}
