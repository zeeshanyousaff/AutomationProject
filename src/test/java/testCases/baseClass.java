package testCases;

import com.amazon.Utilities.ReadConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class baseClass {
    public static WebDriver driver;

    ReadConfig rc=new ReadConfig();

    @BeforeClass
    public void initializeBrowser() {
        System.setProperty("chromedriver.web.driver", System.getProperty("user.dir") + "/Browsers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

   // @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
