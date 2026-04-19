import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example20 {
	//custom assertion method
			public static void assertNull(Object value)
			{
				if(value!=null)
				{
					throw new AssertionError("AssertionFailed | value is not null.."+value);
				}
				System.out.println("Asseration Passed Null");
			}
			public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
				
				//Launch Chrome
				
				WebDriver driver=new ChromeDriver();
				
				//open Html Pages
				
				driver.get("http://127.0.0.1:5500/AssertionP2.html");
				
				//Example variable
				
				String text=null;
				
				//assertion
				assertNull(text);
				
				driver.quit();
			}

}
