package Steps;

import io.cucumber.java.en.Given;

public class StepsDefinition extends Hooks {

    @Given("I open the JobJack website")
    public void i_open_the_job_jack_website(){
        landingPage.openBrowser();
    }
}
