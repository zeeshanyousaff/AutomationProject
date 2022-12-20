package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PLP {
    WebDriver driver;

    public PLP(WebDriver driver)
    {
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
    public WebElement getsortByDropdown()
    {
        return sortByDropdown;
    }

    public WebElement gethighToLowPrice()
    {
        return highToLowPrice;
    }

    public List<WebElement> getSortedProducts()
    {
        return sortedProducts;
    }
}
