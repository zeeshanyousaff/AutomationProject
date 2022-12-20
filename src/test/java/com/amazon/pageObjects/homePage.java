package com.amazon.pageObjects;

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





    public void clickHamburgerMenu()
    {
        navMenu.click();
    }

    public void ClickTVAppliancesCategory()
    {
        TV_Appliances_Category.click();
    }





}
