package tests.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(features = "src/test/resources/features/", glue ="com.github.agatagolonka.sklepoponseleniumgrid.drivers.drivers.stepdefinitions")
public class CucumberRunner extends AbstractTestNGCucumberTests {


}
