import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
		
		//Launch Chrome
		
		WebDriver driver=new ChromeDriver();
		
		//open URL4
		
		driver.get("http://www.google.com");
		
		//print title
		
		System.out.println("Page Title::"+driver.getTitle());
		
		//close browser
		
		driver.quit();
	}

}
