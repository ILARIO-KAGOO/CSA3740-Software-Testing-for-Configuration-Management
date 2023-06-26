package hdd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;


public class App 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","D:\\Workspace (VS Code)\\Slot-D-Software Testing\\Selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
						
		driver.get("https://arms.sse.saveetha.com");
		WebElement username=driver.findElement(By.id("txtusername"));
		
		System.out.println(username);
	
		WebElement password=driver.findElement(By.id("txtpassword"));
		System.out.println(password);
		WebElement login=driver.findElement(By.name("btnlogin"));
		
		System.out.println(login);
		username.sendKeys("192125047");
		
		
		password.sendKeys("ilario2003");
		login.click();

	}
}