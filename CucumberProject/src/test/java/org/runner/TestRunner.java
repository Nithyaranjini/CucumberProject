package org.runner;
import org.stepdef.StepDefinitionClass;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions (features={"C:\\Users\\srini\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Folder\\FacebookLoginFeature"})
dryRun=true,
glue={"org.stepdef"},monochrome=true,
plugin={"Pretty","html:C:\\Users\\srini\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Folder\\FacebookLoginFeature"})

public class TestRunner {

}
