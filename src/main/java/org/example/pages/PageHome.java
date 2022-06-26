package org.example.pages;

import io.appium.java_client.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageHome {
    public AppiumDriver driver;
    public PageHome(AppiumDriver driver) {
        this.driver = driver;
    }

    public By buttonAcceptConditionBy = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAccept");
    public By getTextOurCategoriesBy = By.xpath("//*[@text='OUR CATEGORIES']");
    public By buttonElectronicCategoryBy = By.xpath("//*[@text='Electronics']");

    public void clickButtonAcceptCondition() {
        driver.findElement(buttonAcceptConditionBy).click();
    }
    public String getTextOurCategories() {
        return driver.findElement(getTextOurCategoriesBy).getText();
    }
    public void clickButtonElectronicCategory() {
        driver.findElement(buttonElectronicCategoryBy).click();
    }

}
