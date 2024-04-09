package LinksDemo;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		List<String> linkshref = alllinks.parallelStream().map(link -> link.getAttribute("href"))
				.collect(Collectors.toList());
		linkshref.forEach(System.out::println);
		driver.quit();

	}

}
