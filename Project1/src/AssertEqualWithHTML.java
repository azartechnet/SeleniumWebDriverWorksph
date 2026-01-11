import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertEqualWithHTML {

	
	public static void assertEquals(String actual,String expected)
	{
		if(!actual.equals(expected))
		{
			throw new AssertionError("Assertion Failed|Expected::"+expected+"|Actual:"+actual);
					
		}
		System.out.println("Assertions Passed");
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
	        String expectedText="Hello Selenium";
	        
	        //AssertEquals
	        
	        assertEquals(actualText,expectedText);
	        
	       // driver.quit();
	        
		

	}

}
