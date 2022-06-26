package org.example;

import io.appium.java_client.*;
import org.example.pages.PageCategoryElectronics;
import org.example.pages.PageHome;
import org.example.tests.Products;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class App 
{
    public static void main( String[] args ) throws MalformedURLException {
        //Desired Capabilities & drive init
        Initialization initialization = new Initialization();
        AppiumDriver driver = initialization.init();

        //Test class
        Products products = new Products(driver);
        products.CustomerAddProducts();
    }
}
