package pageObjects;

import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class homePage {
    WebDriver driver;

    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    By navMenu = By.cssSelector("#nav-hamburger-menu");
    By TV_Appliances_Category = By.xpath("//div[text()='TV, Appliances, Electronics']/parent::a");
    By televisionCategory = By.xpath("//a[text()='Televisions']");


    public WebElement getHamburgerMenu() {
        Assert.assertTrue(driver.findElement(navMenu).isDisplayed());
        return driver.findElement(navMenu);
    }

    public WebElement getTVAppliancesCategory() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(TV_Appliances_Category)));

        Assert.assertTrue(driver.findElement(TV_Appliances_Category).isDisplayed());
        Assert.assertEquals(driver.findElement(TV_Appliances_Category).getText(), "TV, Appliances, Electronics");
        return driver.findElement(TV_Appliances_Category);
    }

    public PLP getTelevisionCategory() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(televisionCategory)));

        Assert.assertTrue(driver.findElement(televisionCategory).isDisplayed());
        Assert.assertEquals(driver.findElement(televisionCategory).getText(), "Televisions");
        driver.findElement(televisionCategory).click();
        return new PLP(driver);
    }


}
