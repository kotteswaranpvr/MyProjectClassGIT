package daily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class OpenBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\kotte\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();

	}

}
