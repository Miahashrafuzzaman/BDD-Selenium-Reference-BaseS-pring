package com.shiftedtech.heatclinic;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by ShiftTeacher on 7/15/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = { "@smoke" },         /* smoke test only */
        //tags = { "@smoke,@debug" }, /* debug or smoke test */
        //tags = { "@smoke","@debug" },  /* debug and smoke test */
        monochrome = true,
        features = "src/test/resources/features/",
        glue = {"com.shiftedtech.heatclinic.steps"},
        //dryRun = true,
        plugin={
                "pretty:target/cucumber-test-report/cucumber-pretty.txt",
                "html:target/cucumber-test-report",
                "json:target/cucumber-test-report/cucumber-report.json",
                "junit:target/cucumber-test-report/test-report.xml",
                "json:target/test-report.json"
        }
)
public class HeatclinicBDDRunner {
}
