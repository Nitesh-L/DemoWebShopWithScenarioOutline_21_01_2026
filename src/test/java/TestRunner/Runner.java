package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFile/Demo.feature",
        glue = "StepDefinations",
        monochrome = true
)
public class Runner extends AbstractTestNGCucumberTests {
}
