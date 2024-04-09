package LinksDemo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver","C:\\Users\\sivas\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		 System.out.println(driver.findElements(By.tagName("a")).size());
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {

			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}

		driver.quit();

	}

}
