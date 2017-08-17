import org.openqa.selenium.By;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class FindAFlight extends BaseClass{
	
	@Test
	public void findAFlightTest()
	{
		driver.findElement(By.name("fromPort")).sendKeys("London");
		System.out.println("From LONDON");
		driver.findElement(By.name("toPort")).sendKeys("New York");
		System.out.println("To New York");
		driver.findElement(By.name("findFlights")).click();
		System.out.println("Continue");
		
	}

}
