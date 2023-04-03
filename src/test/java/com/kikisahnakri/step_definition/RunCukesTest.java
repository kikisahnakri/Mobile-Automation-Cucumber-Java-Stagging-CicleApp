package com.kikisahnakri.step_definition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


/*@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        dryRun = true,
        tags = "@Google",
        features = {"classpath:features"},
        glue = { "classpath:com/rizqifauzan/step_definition"},
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
)*/


/*@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("resources")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "io.cucumber.skeleton")
//public class RunCucumberTest {
//}*/

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        tags = "@CheckIns",
        plugin = {"pretty", "html:target/site/cucumber-pretty.html"},
        features = {"classpath:features"})

public class RunCukesTest {
}
