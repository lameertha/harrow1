package harrow1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxTesting {
    public static void main(String[] args) {
        String baseUrl="https://www.harrow.gov.uk/";
        System.setProperty("webdriver.gecko.driver","Dirvers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.quit();
        String title=driver.getTitle();
        driver.navigate().to("https://www.harrow.gov.uk/");
        System.out.println("Main page"+title);
        driver.quit();

    }

}
