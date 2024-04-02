package testRunner;


import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.DriverFactory;

@CucumberOptions(
        features = {"C:\\Users\\mertm\\IdeaProjects\\cucumberProject\\src\\test\\java\\features"},
        glue = {"stepDefinitions","utils"},
        tags = "@Search",
        plugin = {
                "summary","pretty","html:Reports/CucumberReport/Reports.html"
        }
)
public class Runner extends AbstractTestNGCucumberTests {
    static AppiumDriver driver = DriverFactory.getDriver();
}