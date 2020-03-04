package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import helper.HookHelper;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/Registration.feature", glue = {"steps","helper"})
public class TestRunner{
}