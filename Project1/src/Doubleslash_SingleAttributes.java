import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doubleslash_SingleAttributes {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty(
		            "webdriver.chrome.driver",
		            "D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe"
		        );

		        // Launch Chrome
		        WebDriver driver = new ChromeDriver();

		        // Load local HTML file
		        driver.get(
		            "file:///D:/FullStackNotesfinal/NotesDayWise/SeleniumWithJava/WebApp/loginsingleslash.html"
		        );
		        //Single Attributes 
		        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		        
		        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin1232");
		        
		        driver.findElement(By.xpath("//button[text()='Login']")).click();
		        
		        Thread.sleep(5000);
		        
		        String output=driver.findElement(By.xpath("//p[@id='result']")).getText();
		        
		        System.out.println("outputMessage::"+output);
		        
		        driver.quit();

	}

}
