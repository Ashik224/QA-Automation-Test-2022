package org.example.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageCategoryElectronics {
    public AppiumDriver driver;

    public PageCategoryElectronics(AppiumDriver driver) {
        this.driver = driver;
    }

    public By buttonProductBurgerBy = By.xpath("//*[@text='Burger']");
    public By getTextBurgerHeaderBy = By.id("com.nopstation.nopcommerce.nopstationcart:id/tvProductName");
    public By linkTextSelectBy = By.id("com.nopstation.nopcommerce.nopstationcart:id/tvSelectedAttr");
    public By radioButtonSizeLargeBy = By.xpath("//*[@text(),'Large']");
    public By buttonSizeDoneBy =  By.xpath("//*[@text(),'Done']");

    public void clickButtonProductBurger() {
        driver.findElement(buttonProductBurgerBy).click();
    }
    public String getTextBurgerHeader() {
        return driver.findElement(getTextBurgerHeaderBy).getText();
    }
    public void clickLinkTextBurgerSizeSelect() {
        List<WebElement> linkTextSelect = driver.findElements(linkTextSelectBy);
        linkTextSelect.get(1).click();
    }
    public void clickRadioButtonSizeLarge() {
        driver.findElement(radioButtonSizeLargeBy).click();
    }
    public void clickButtonSizeDone() {
        driver.findElement(buttonSizeDoneBy).click();
    }



}
