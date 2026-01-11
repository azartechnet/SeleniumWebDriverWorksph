import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertTrueP1 {

	
	public static void assertTrue(boolean condition)
	{
		if(!condition)
		{
			throw new AssertionError("AssertionFailed|Condition is FALSE");
		}
		System.out.println("AssertTrue Passed");
	}
	
	public static void main(String[] args) {
		
		System.setProperty(
	            "webdriver.chrome.driver",
	            "D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe"
	        );

	        // Launch Chrome
	        WebDriver driver = new ChromeDriver();

	        // Load local HTML file
	        driver.get(
	            "file:///D:/FullStackNotesfinal/NotesDayWise/SeleniumWithJava/WebApp/Assertequals1.html"
	        );
	 
	        String actualText=driver.findElement(By.id("msg")).getText();
	        assertTrue(actualText.contains("Seenium"));
	}

}
