import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
		
		//Launch Chrome
		
		WebDriver driver=new ChromeDriver();
		
		//open Html Pages
		
		driver.get("http://127.0.0.1:5500/webdriver3.html");
		
		//Find All Paragraphs tags using tagName
		
		List<WebElement>p1=driver.findElements(By.tagName("p"));
		
		System.out.println("Total Paragraphs::"+p1.size());
		
		//Print all paragraphs text
		
		for(WebElement p:p1)
		{
			System.out.println(p.getText());
		}
		//Find button using tagName
		
		WebElement button=driver.findElement(By.tagName("button"));
		button.click();
		
		driver.quit();

	}

}
