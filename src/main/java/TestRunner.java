import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        tags = {"@Smoke"},
        features = "src/test/resources",
        glue = {"steps"},
        plugin = {"pretty", "html:target/htmlreports"}
)

public class TestRunner {
}
