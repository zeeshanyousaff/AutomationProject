package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class PLP {
    WebDriver driver;

    public PLP(WebDriver driver) {
        this.driver = driver;
    }

    By sortByDropdown = By.xpath("//span[@id='a-autoid-0-announce']");
    By highToLowPrice = By.cssSelector("#s-result-sort-select_2");
    By sortedProducts = By.xpath("//div/img[@class='s-image']");

    public WebElement getsortByDropdown() {
        Assert.assertTrue(driver.findElement(sortByDropdown).isDisplayed());
        return driver.findElement(sortByDropdown);
    }

    public WebElement gethighToLowPrice() {
        Assert.assertTrue(driver.findElement(highToLowPrice).isDisplayed());
        Assert.assertEquals(driver.findElement(highToLowPrice).getText(), "Price: High to Low");
        return driver.findElement(highToLowPrice);
    }

    public void getProduct(int productIndex) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(sortedProducts).get(productIndex)));

        if (!driver.findElements(sortedProducts).isEmpty()) {
            driver.findElements(sortedProducts).get(productIndex).click();
        } else {
            Assert.assertTrue(false, "The product list is empty");
        }
    }

}

