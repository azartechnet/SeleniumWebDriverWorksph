import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Example12 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
		
		//Launch Chrome
		
		WebDriver driver=new ChromeDriver();
		
		//open Html Pages
		
		driver.get("http://127.0.0.1:5500/webdriver12.html");
		
		WebElement source=driver.findElement(By.id("source"));
		
		WebElement target=driver.findElement(By.id("target"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(source, target).perform();
		
		System.out.println("Drag and Drop successful...");
		
		driver.quit();
	}

}
