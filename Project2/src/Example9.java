import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example9 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
		
		//Launch Chrome
		
		WebDriver driver=new ChromeDriver();
		
		//open Html Pages
		
		driver.get("http://127.0.0.1:5500/webdriver9.html");
		
		//using multiple attributes with AND
		
		driver.findElement(By.xpath("//input[@type='text' and @name='user']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@type='password' and @name='pass']")).sendKeys("admin@123");
		
		driver.findElement(By.xpath("//button[@type='submit' and @class='btn']")).click();
		
		driver.quit();

	}

}
