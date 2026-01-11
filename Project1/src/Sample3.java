import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
			
			//Launch Chrome
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://127.0.0.1:5500/message.html");
			
			
			// Get message from input box
			String msg = driver.findElement(By.id("msg")).getAttribute("value");

			
			driver.findElement(By.id("loginBtn")).click();
			
			System.out.println("Message Show::"+msg);
			
			
			
			driver.quit();
	}

}
