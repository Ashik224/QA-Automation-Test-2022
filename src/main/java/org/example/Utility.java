package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utility {
    public AppiumDriver driver;
    public Utility(AppiumDriver driver) {
        this.driver = driver;
    }
    public void WaitForSingleElementToBeDisplayed(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void ScrollToVisibleHorizontally(String textToSearch) {
        this.driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsHorizontalList().scrollIntoView(new UiSelector().text(\""+textToSearch+"\"))"));
    }

    public void ScrollToVisibleVertically(String textToSearch) {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).setAsVerticalList().scrollIntoView(new UiSelector().text(\""+textToSearch+"\"))"));
    }
}
