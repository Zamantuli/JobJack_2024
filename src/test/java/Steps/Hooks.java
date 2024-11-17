package Steps;

import Helpers.BrowserFactory;
import Pages.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Hooks {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.jobjack.co.za/");
    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
}
