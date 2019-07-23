package runclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/registration.feature",glue="stepdes",plugin="json:target\\Jsonreport.json")
public class runfile1 {

}
