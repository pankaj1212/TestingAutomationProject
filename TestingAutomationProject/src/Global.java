import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Global {

	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/panka/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.officedepot.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		
		
		
		
		
	}
}
