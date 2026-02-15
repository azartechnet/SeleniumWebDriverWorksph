import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");

		// Launch Chrome

		WebDriver driver = new ChromeDriver();

		// open Html Pages

		driver.get("http://127.0.0.1:5500/webdriver4.html");
		
		//Get h1 text
		
		String h1text=driver.findElement(By.tagName("h1")).getText();
		
		System.out.println("H1 text::"+h1text);
		
		//get all input fields
		
		List<WebElement>inputs=driver.findElements(By.tagName("input"));
		inputs.get(0).sendKeys("admin");
		inputs.get(1).sendKeys("12345");
		
		//click button
	
		driver.findElement(By.tagName("button")).click();
		
		//get paragraph text
		
		String pText=driver.findElement(By.tagName("p")).getText();
		
		System.out.println("Paragraphs::"+pText);
		
		driver.quit();

	}

}
