import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static testeTOTVS.core.DriverFactory.quitNavegador;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\testeTOTVS\\feature\\",
        glue = {"testeTOTVS.steps"},
        tags = {"@QATOTVS", "not @no"},
        //plugin = {"pretty", "html:target/report-html"},
        dryRun = false,
        strict = false,
        monochrome = true)

public class ExecucaoTestesQA {

    @BeforeClass
    public static void tearUp() {
    }

    @AfterClass
    public static void finalizar() {
        quitNavegador();
    }

}
