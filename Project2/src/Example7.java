import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
		
		//Launch Chrome
		
		WebDriver driver=new ChromeDriver();
		
		//open Html Pages
		
		driver.get("http://127.0.0.1:5500/webdriver7.html");
		
		//Locate using substring in ID
		
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("12345");
		
		driver.findElement(By.xpath("//button[contains(@id,'login')]")).click();
		
		driver.quit();
		
	}

}
