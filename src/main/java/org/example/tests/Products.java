package org.example.tests;

import io.appium.java_client.AppiumDriver;
import org.example.Utility;
import org.example.pages.PageCategoryElectronics;
import org.example.pages.PageHome;
import org.junit.Assert;

public class Products {
    public AppiumDriver driver;
    public Products(AppiumDriver driver) {
        this.driver = driver;
    }
    public void CustomerAddProducts() {
        Utility util = new Utility(driver);
        PageHome home = new PageHome(driver);
        PageCategoryElectronics pageCategoryElectronics = new PageCategoryElectronics(driver);

        util.WaitForSingleElementToBeDisplayed(home.buttonAcceptConditionBy);
        home.clickButtonAcceptCondition();

        util.WaitForSingleElementToBeDisplayed(home.getTextOurCategoriesBy);
        Assert.assertEquals("OUR CATEGORIES", home.getTextOurCategories());

        util.ScrollToVisibleHorizontally("Electronics");
        home.clickButtonElectronicCategory();

        util.ScrollToVisibleVertically("Burger");
        pageCategoryElectronics.clickButtonProductBurger();

        util.WaitForSingleElementToBeDisplayed(pageCategoryElectronics.getTextBurgerHeaderBy);
        Assert.assertEquals("Burger", pageCategoryElectronics.getTextBurgerHeader());

        util.ScrollToVisibleVertically("Size");
        pageCategoryElectronics.clickLinkTextBurgerSizeSelect();

        util.WaitForSingleElementToBeDisplayed(pageCategoryElectronics.radioButtonSizeLargeBy);
        pageCategoryElectronics.clickRadioButtonSizeLarge();

        util.WaitForSingleElementToBeDisplayed(pageCategoryElectronics.buttonSizeDoneBy);
        pageCategoryElectronics.clickButtonSizeDone();

        System.out.println("Done and dusted!");
    }
}
