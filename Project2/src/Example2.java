import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
		
		//Launch Chrome
		
		WebDriver driver=new ChromeDriver();
		
		//open Html Pages
		
		driver.get("http://127.0.0.1:5500/webdriver2.html");
		
       String t1=driver.findElement(By.className("title")).getText();
		
		System.out.println("Title::"+t1);
		
		driver.findElement(By.className("user")).sendKeys("admin");
		driver.findElement(By.className("pass")).sendKeys("1234");
		
		driver.findElement(By.className("submitBtn")).click();
		

		
		
		String m1=driver.findElement(By.className("message")).getText();
		System.out.println("Message is::"+m1);
		
		driver.quit();
		
		

	}

}
