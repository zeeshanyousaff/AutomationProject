package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

    WebDriver driver;

    public homePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#nav-hamburger-menu")
    WebElement navMenu;


    @FindBy(xpath = ("//a[@class='hmenu-item'][normalize-space()='TV, Appliances, Electronics']"))
    WebElement TV_Appliances_Category;

    @FindBy(xpath = "//a[@class='hmenu-item'][normalize-space()='Televisions']")
    WebElement televisionCategory;


    //getter methods for the webelements of homePage
    public WebElement getHamburgerMenu()
    {
        return navMenu;
    }

    public WebElement getTVAppliancesCategory()
    {
        return TV_Appliances_Category;
    }

    public WebElement getTelevisionCategory()
    {
        return televisionCategory;
    }


}
