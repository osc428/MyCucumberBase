package com.eurotech.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/eurotech/step_definitions",
        dryRun = false,
        tags = "@demo1"
        // tags = "@ddf"
        // tags = "@wip"
        // tags = "@Navigate"
        // tags = "@Login"
        // tags = "@Teacher and @Eurotech"
        // tags = "@Teacher"
        // tags = "@Teacher and not @Eurotech"
        // tags = "@Login and not @Teacher"
        // tags = "@Student or @Teacher"
        // tags = "@pract1"
        // tags = "@Rerun"
        // tags = "@accountList"
        // Before version 4 and--> {"@Smoke and @Wip"}
        // Before version 5 or --> @Smoke, @Wip
        // Before version 5 and not --> {"@Smoke, @~Wip"}

)
public class CukesRunner {
}
