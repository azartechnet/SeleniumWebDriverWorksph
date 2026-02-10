import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
	
       System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
		
		//Launch Chrome
		
		WebDriver driver=new ChromeDriver();
		
		//open Html Pages
		
		driver.get("http://127.0.0.1:5500/webdriver1.html");
		
		//Locating using ByID
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("1234");
		
		driver.findElement(By.id("loginBtn")).click();
		
		//Get Heading text
		
		String headingText=driver.findElement(By.id("heading")).getText();
		
		System.out.println("Heading::"+headingText);
		
		driver.quit();

	}

}
