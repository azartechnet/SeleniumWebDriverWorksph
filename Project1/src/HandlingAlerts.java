import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty(
		            "webdriver.chrome.driver",
		            "D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe"
		        );

		        // Launch Chrome
		        WebDriver driver = new ChromeDriver();

		        // Load local HTML file
		        driver.get(
		            "file:///D:/FullStackNotesfinal/NotesDayWise/SeleniumWithJava/WebApp/handlingAlters.html"
		        );
		        driver.findElement(By.tagName("button")).click();
//		        Thread.sleep(2000);
//		        driver.switchTo().alert().accept();
//		        driver.switchTo().alert().dismiss();
		        Alert a=driver.switchTo().alert();
		        a.sendKeys("azar");
		        Thread.sleep(2000);
		        System.out.println(a.getText());
		        a.accept();
//		        driver.quit();

	}

}
