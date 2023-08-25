package OpenGooglePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pwaha\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.co.in");

    }
}
