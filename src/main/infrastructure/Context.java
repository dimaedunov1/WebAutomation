package infrastructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public abstract class Context {

    public static SafariDriver getSafariBrowser () {

        WebDriver driver = new SafariDriver();
        return (SafariDriver) driver;
    }


    public static ChromeDriver getChromeDriver () {

        WebDriver driver = new ChromeDriver();
        return (ChromeDriver) driver;
    }


    }
