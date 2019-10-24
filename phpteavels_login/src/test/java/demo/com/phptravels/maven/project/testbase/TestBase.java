package demo.com.phptravels.maven.project.testbase;


import demo.com.phptravels.maven.project.basepage.BasePage;
import demo.com.phptravels.maven.project.browserselector.BrowserSelector;
import demo.com.phptravels.maven.project.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    String browser = new LoadProperty().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        browserSelector.selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}