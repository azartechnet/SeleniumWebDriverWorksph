import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		
      System.setProperty("webdriver.chrome.driver","D:\\FullStackNotesfinal\\NotesDayWise\\SeleniumWithJava\\driver\\chromedriver.exe");
		
		//Launch Chrome
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(5000);
		
		WebElement search=driver.findElement(By.name("q"));
		
		search.sendKeys("Selenium WebDriver");
		
		Thread.sleep(2000);
		
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		System.out.println("Search Completed..."+driver.getTitle());
		
		
		driver.quit();
	}

}
