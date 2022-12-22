package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class homePage {

    WebDriver driver;

    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#nav-hamburger-menu")
    WebElement navMenu;

    @FindBy(xpath = ("//a[@class='hmenu-item'][normalize-space()='TV, Appliances, Electronics']"))
    WebElement TV_Appliances_Category;

    @FindBy(xpath = "//a[@class='hmenu-item'][normalize-space()='Televisions']")
    WebElement televisionCategory;

    //getter methods for the webelements of homePage
    public WebElement getHamburgerMenu() {
        Assert.assertTrue(navMenu.isDisplayed());
        return navMenu;
    }

    public WebElement getTVAppliancesCategory() {

        Assert.assertTrue(TV_Appliances_Category.isDisplayed());
        Assert.assertEquals(TV_Appliances_Category.getText(), "TV, Appliances, Electronics");
        return TV_Appliances_Category;
    }

    public PLP getTelevisionCategory() {
        Assert.assertTrue(televisionCategory.isDisplayed());
        Assert.assertEquals(televisionCategory.getText(), "Televisions");
        televisionCategory.click();
        return new PLP(driver);
    }

}
