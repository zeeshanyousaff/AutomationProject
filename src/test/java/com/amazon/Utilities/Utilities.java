package com.amazon.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Utilities {
    WebDriver driver;

    public Utilities(WebDriver driver)
    {
        this.driver=driver;
    }

    public void selectBrandFilter(String label, String brandName)

    {

        WebElement brandlabel=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small'][normalize-space()='Brands']"));
        WebElement brand= driver.findElement(with(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Samsung']")).below(brandlabel));
        brand.click();
    }
}
