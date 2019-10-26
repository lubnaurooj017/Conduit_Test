package MyRunner;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        features ="/Users/lubnaurooj/IdeaProjects/Conduit_ArtifactId/Features",
        glue = {"StepDefinition"},
        monochrome = true, // display console output in readable format
        //dryRun = true,
        strict = true,//check if any step is undefined in step definition file
        tags ={}
)
public class TestRunner {
}
