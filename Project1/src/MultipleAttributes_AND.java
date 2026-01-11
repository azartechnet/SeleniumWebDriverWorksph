import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleAttributes_AND {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
	            "webdriver.chrome.driver",
	            "D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe"
	        );

	        // Launch Chrome
	        WebDriver driver = new ChromeDriver();

	        // Load local HTML file
	        driver.get(
	            "file:///D:/FullStackNotesfinal/NotesDayWise/SeleniumWithJava/WebApp/multipleattributes.html"
	        );
	        //Multiple Attributes
	        
	        driver.findElement(By.xpath("//input[@id='user' and @name='username']")).sendKeys("admin");
	        
	        //OR Condition
//	        driver.findElement(By.xpath("//input[@id='user' OR @name='username']")).sendKeys("admin");
	        
	        driver.findElement(By.xpath("//input[@id='pass' and @name='password']")).sendKeys("admin123");
	        
	        driver.findElement(By.xpath("//input[@id='loginBtn' and @name='login']")).click();
	        
	        Thread.sleep(2000);
	        
	        String output=driver.findElement(By.xpath("//p[@id='result']")).getText();
	        
	        System.out.println("Output::"+output);
	        
	        driver.quit();
	}

}
