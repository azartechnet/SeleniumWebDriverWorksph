import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWith {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
	            "webdriver.chrome.driver",
	            "D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe"
	        );

	        // Launch Chrome
	        WebDriver driver = new ChromeDriver();

	        // Load local HTML file
	        driver.get(
	            "file:///D:/FullStackNotesfinal/NotesDayWise/SeleniumWithJava/WebApp/startswith.html"
	        );

	        //Xpath using starts-with()
	        
	        driver.findElement(By.xpath("//input[starts-with(@id,'user_')]")).sendKeys("admin");
	        
	        driver.findElement(By.xpath("//input[starts-with(@id,'pass_')]")).sendKeys("admin123");
	        
	        driver.findElement(By.xpath("//input[starts-with(@id,'loginBtn')]")).click();
	        
	        Thread.sleep(3000);
	        
	        String output=driver.findElement(By.xpath("//p[@id='result']")).getText();
	        
	        System.out.println("Output::"+output);
	        
	        driver.quit();
	}

}
