import com.amazon.Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class testClass {

    public static void main(String args[])

    {
        System.setProperty("chromedriver.web.driver","/Users/zeeshan/ClipboardAssessment/Browsers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/b?node=1389396031");
        driver.navigate().refresh();

        //driver.findElement(By.cssSelector("#nav-hamburger-menu")).click();

        Utilities ul=new Utilities(driver);
        ul.selectBrandFilter("Brands","Samsung");



//selector tv, appliances,
        // //a[@class='hmenu-item'][normalize-space()='TV, Appliances, Electronics']

        //a[@class='hmenu-item'][normalize-space()='Televisions']



      //  ul.hmenu.hmenu-visible li a
    }
//samsung filter
//




}
