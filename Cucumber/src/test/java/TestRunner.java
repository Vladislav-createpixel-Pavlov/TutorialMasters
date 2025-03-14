import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        //glue = "src/test/java",
        tags = "@message",
        plugin = {
        "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm",
        "progress",
        "summary"
                 }
       // plugin = {"pretty","html:Score.html"}
        //name = "Успешные тест"
        //snippets = CucumberOptions.SnippetType.CAMELCASE
//        name = "^Успешное|Успешная.*"
)
public class TestRunner
{
}
