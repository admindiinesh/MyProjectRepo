//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Login extends BaseClass{
	
	@Test
	public void loginTest()
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\\asus\\Desktop\\eclipse\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		System.out.println("Browser open");
		driver.get("http://newtours.demoaut.com");
		System.out.println("Navigated to site");
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).submit();
		System.out.println("Succesfully loged in");
		
		
	}

}
