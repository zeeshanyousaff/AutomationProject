package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PLP {
    WebDriver driver;

    public PLP(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@id='a-autoid-0-announce']")
    WebElement sortByDropdown;

    @FindBy(css = ("#s-result-sort-select_2"))
    WebElement highToLowPrice;

    @FindBy(css = "span[class='a-size-base-plus a-color-base a-text-normal']")
    List<WebElement> sortedProducts;

    //getter methods for the webelements of PLP page.
    public WebElement getsortByDropdown() {
        return sortByDropdown;
    }

    public WebElement gethighToLowPrice() {
        return highToLowPrice;
    }

    public void getProduct(WebDriver driver,int productIndex) {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.visibilityOf(sortedProducts.get(productIndex)));
        System.out.println(sortedProducts.size());
        sortedProducts.get(productIndex).click();
    }

}

