import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownP {

	public static void main(String[] args) {
		
		 System.setProperty(
		            "webdriver.chrome.driver",
		            "D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe"
		        );

		        // Launch Chrome
		        WebDriver driver = new ChromeDriver();

		        // Load local HTML file
		        driver.get(
		            "file:///D:/FullStackNotesfinal/NotesDayWise/SeleniumWithJava/WebApp/webdriverdropdown.html"
		        );
		        
//		        Select s=new Select(driver.findElement(By.id("course")));
//		        s.selectByIndex(2);//React
//		        s.selectByVisibleText("Python");
//		        s.selectByValue("r");
//		        Select s=new Select(driver.findElement(By.id("skills")));
//		        s.selectByIndex(0);
//		        s.selectByIndex(2);
//		        s.deselectAll();
		        
		        driver.findElement(By.id("city")).click();
		        driver.findElement(By.xpath("//li[text()='Chennai']")).click();

	}

}
