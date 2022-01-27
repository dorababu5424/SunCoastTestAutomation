package Utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DiverFactory {

        public static WebDriver driver;
        
        public void  Initilization(String browserType) {
            // Create driver
            if (browserType.equals("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browserType.equals("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else {

                System.out.println("***************No Driver Found **************");
            }
        }
        
         public void DriverKill(){
        driver.close();
        driver.quit();
          }
}
