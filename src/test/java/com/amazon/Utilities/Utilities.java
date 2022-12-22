package com.amazon.Utilities;

import org.openqa.selenium.*;
import org.testng.Assert;
import java.util.Iterator;
import java.util.Set;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Utilities {
    WebDriver driver;

    public Utilities(WebDriver driver) {
        this.driver = driver;
    }

    public void selectBrandFilter(String label, String brandName) {
        try {
            WebElement brandlabel = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small'][normalize-space()=" + "'" + label + "'" + "]"));
            WebElement brand = driver.findElement(with(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()=" + "'" + brandName + "'" + "]")).below(brandlabel));
            brand.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void scrollElementIntoView(WebElement el) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", el);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void scrollIntoViewAndClick(WebElement el) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", el);
            el.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void switchtoNewWindow() {
        try {
            //getting active window handles
            Set<String> s = driver.getWindowHandles();
            Iterator<String> I1 = s.iterator();
            while (I1.hasNext()) {
                String handle = I1.next();
                driver.switchTo().window(handle);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void VerifyPageTitle(String expected) {
        try {
            Assert.assertEquals(driver.getTitle(), expected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnElement(WebElement el) {
        try {
            el.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateURL(String s) {
        driver.get(s);
    }

    public void EnterValue(WebElement el, String s) {
        try {
            el.sendKeys(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //create verify the text method
    //create verify the visibility method
    //drop down value select
}
