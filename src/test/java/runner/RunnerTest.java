package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
<<<<<<< HEAD
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.RestUtils;
=======
import org.junit.runner.RunWith;
>>>>>>> 6f1e2e0bdaeb05f24b3f872334317247641d7459

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
<<<<<<< HEAD
        tags = "@filme",
=======
        tags = "@loginEmailInvalido or @loginSucesso",
>>>>>>> 6f1e2e0bdaeb05f24b3f872334317247641d7459
        glue = "steps",
        plugin = {"json:target/reports/cucumber-Reports.json", "pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
<<<<<<< HEAD
public class RunnerTest {
    @BeforeClass
    public static void beforeClass(){
        RestUtils.setBaseURI("http://localhost:8080");
    }
=======

public class RunnerTest {

>>>>>>> 6f1e2e0bdaeb05f24b3f872334317247641d7459
}
