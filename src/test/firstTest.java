import infrastructure.Context;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class firstTest
{
private WebDriver driver;

@BeforeClass
    public void firstTestSetup(){

    driver = Context.getChromeDriver();
}

@Test
(priority = 0)
    public void firstTestStepsPartOne(){
    driver.manage().window().maximize();

    driver.navigate().to("http://www.investing.com");
}

}
