import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
		
		//Launch Chrome
		
		WebDriver driver=new ChromeDriver();
		
		//open Html Pages
		
		driver.get("http://127.0.0.1:5500/webdriver6.html");
		
		//Locate by attributes using css selector
		
		driver.findElement(By.cssSelector("input[name='user']")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("admin@123");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.quit();

	}

}
