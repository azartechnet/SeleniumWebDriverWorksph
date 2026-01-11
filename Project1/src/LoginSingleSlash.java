import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSingleSlash {

    public static void main(String[] args) throws Exception {

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

        // Username (Single Slash XPath)
        driver.findElement(By.xpath("/html/body/form/input[1]"))
              .sendKeys("admin");

        // Password (Single Slash XPath)
        driver.findElement(By.xpath("/html/body/form/input[2]"))
              .sendKeys("admin123");

        // Click Login button
        driver.findElement(By.xpath("/html/body/form/button")).click();

        Thread.sleep(2000);

        // Fetch output message
        String output = driver.findElement(By.xpath("/html/body/p")).getText();

        System.out.println("OutputMessage :: " + output);

        driver.quit();
    }
}
