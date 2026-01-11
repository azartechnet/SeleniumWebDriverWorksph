import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
	
       System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
		
		//Launch Chrome
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://127.0.0.1:5500/Example1.html");
		
		driver.findElement(By.id("uname")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password123");
		
		Thread.sleep(10000);
		
		driver.findElement(By.id("loginBtn")).click();
		
		System.out.println("Login Test");
		
		driver.quit();

	}

}
