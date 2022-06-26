package org.example;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Initialization {
    public AppiumDriver init() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName","emulator-5556");
        caps.setCapability("udid","emulator-5556");
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","11");

        caps.setCapability("appPackage","com.nopstation.nopcommerce.nopstationcart");
        caps.setCapability("appActivity","com.bs.ecommerce.main.SplashScreenActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        return new AppiumDriver(url, caps);
    }
}
