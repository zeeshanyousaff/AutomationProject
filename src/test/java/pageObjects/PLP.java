package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

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

    @FindBy(xpath = " //div/img[@class='s-image']")
    List<WebElement> sortedProducts;

    //getter methods for the webelements of PLP page.
    public WebElement getsortByDropdown() {
        Assert.assertTrue(sortByDropdown.isDisplayed());
        return sortByDropdown;
    }

    public WebElement gethighToLowPrice() {
        Assert.assertTrue(highToLowPrice.isDisplayed());
        Assert.assertEquals(highToLowPrice.getText(), "Price: High to Low");
        return highToLowPrice;
    }

    public void getProduct(int productIndex) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(sortedProducts.get(productIndex)));
        Assert.assertNotNull(sortedProducts);
        sortedProducts.get(productIndex).click();
    }

}

