import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertNotEqual {
	public static void assertNotEquals(String actual,String notExpected)
	{
		if(actual.equals(notExpected))
		{
			throw new AssertionError("Assertion Failed|Value should not be::"+notExpected);
					
		}
		System.out.println("AssertionsNotEqual passed");
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
	        
	        //Get the text from HTML
	        
	        String actualText=driver.findElement(By.id("msg")).getText();
	       
	        
	        //AssertEquals
	        
	        assertNotEquals(actualText,"Welcome");
	        
	       // driver.quit();
	        
		

	}

}
