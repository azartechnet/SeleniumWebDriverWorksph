import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example19 {

	//custom assertion method
			public static void assertTrue(boolean condition)
			{
				if(!condition)
				{
					throw new AssertionError("AssertionFailed..| Condition is FALSE");
				}
				System.out.println("Asseration True");
			}
			public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
				
				//Launch Chrome
				
				WebDriver driver=new ChromeDriver();
				
				//open Html Pages
				
				driver.get("http://127.0.0.1:5500/AssertionP2.html");
				
				//get heading text
				String actualText=driver.findElement(By.id("heading")).getText();
				
				
				assertTrue(actualText.contains("Selenium"));
				
				driver.quit();
}
}