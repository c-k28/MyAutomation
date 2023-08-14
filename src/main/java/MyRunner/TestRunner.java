package MyRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/kc/Ideaprojects/LearnCucumber/src/main/java/Features/tags.feature"
        ,glue={"stepDefinitions"},
        plugin = { "pretty", "html:target/Test-reports.html" },
        tags = "not @onlineordersite and not @searchsite"
        //dryRun = true
        //monochrome = true
)
public class TestRunner {

}
