import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example16 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
		
		//Launch Chrome
		
		WebDriver driver=new ChromeDriver();
		
		//open Html Pages
		
		driver.get("http://127.0.0.1:5500/webdriver15.html");
		
		driver.findElement(By.tagName("button")).click();
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println("Alert Message::"+alert.getText());
		
		alert.sendKeys("Mohamed");
		
		//alert.accept();
		
		alert.dismiss();
		
		String result=driver.findElement(By.id("result")).getText();
		
		System.out.println("Result is::"+result);
		
		driver.quit();

	

	}

}
