import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example18 {
	//custom assertion method
		public static void assertNotEquals(String actual,String expected)
		{
			if(actual.equals(expected))
			{
				throw new AssertionError("AssertionFailed.."+expected+"Actual::"+actual);
			}
			System.out.println("Asseration Passed");
		}
		public static void main(String[] args) {
			
	System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
			
			//Launch Chrome
			
			WebDriver driver=new ChromeDriver();
			
			//open Html Pages
			
			driver.get("http://127.0.0.1:5500/AssertionP2.html");
			
			//get heading text
			String actualText=driver.findElement(By.id("heading")).getText();
			String expectedText="Welcome to Selenium";
			
			//Asseration
			assertNotEquals(actualText, expectedText);
			
			driver.quit();

}
}
