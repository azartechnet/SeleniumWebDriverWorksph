import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example13 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
		
		//Launch Chrome
		
		WebDriver driver=new ChromeDriver();
		
		//open Html Pages
		
		driver.get("http://127.0.0.1:5500/webdriver13.html");
		
		//click button to open alert
		
		driver.findElement(By.tagName("button")).click();
		
		//switch to alert
		
		Alert alert=driver.switchTo().alert();
		
		//print alert text
		
		System.out.println("Alert Message::"+alert.getText());
		
		alert.accept();
		
		driver.quit();
		

	}

}
