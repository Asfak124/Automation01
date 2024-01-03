
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePageAutomation {

    public static void main(String[] args) {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google homepage
        driver.get("https://www.google.com");

        // Print the title of the page to the console
        System.out.println("Title of the page: " + driver.getTitle());

        // Close the browser window
        driver.quit();
    }
}
