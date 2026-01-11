import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragDropP {

	public static void main(String[] args) {
		 System.setProperty(
		            "webdriver.chrome.driver",
		            "D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe"
		        );

		        // Launch Chrome
		        WebDriver driver = new ChromeDriver();

		        // Load local HTML file
		        driver.get(
		            "file:///D:/FullStackNotesfinal/NotesDayWise/SeleniumWithJava/WebApp/dragdrop.html"
		        );
		        WebElement source=driver.findElement(By.id("source"));
		        WebElement target=driver.findElement(By.id("target"));
		        Actions act=new Actions(driver);
		        act.clickAndHold(source).moveToElement(target).release().perform();
//		        act.dragAndDrop(source, target).perform();
//		        driver.quit();

	}

}
