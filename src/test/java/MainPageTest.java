import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPageTest {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "/Users/sai/Repo/chromedriver");
    WebDriver webDriver = new ChromeDriver();
    webDriver.get("http://www.google.co.in");

    System.out.println(webDriver.getTitle());

    webDriver.quit();
  }
}
