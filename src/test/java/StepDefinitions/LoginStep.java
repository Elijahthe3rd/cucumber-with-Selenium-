package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    @Given("^user is on Login page$")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Step Def: user is on login page");
    }

    @When("user enters the userName1 and password1")
    public void user_enters_the_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Step Def: user enters credentials");

    }
    @When("user enters the userName2 and password2")
    public void user_enters_the_username_and_password2() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Step Def: user enters credentials");

    }
    @When("user enters the userName3 and password3")
    public void user_enters_the_username_and_password3() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Step Def: user enters credentials");

    }
    @And("clicks on the login button")
    public void clicks_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Step Def: user clicks the login button");
    }

    @Then("^user is redirected to Dashboard\\/Home Page$")
    public void user_is_redirected_to_dashboardhome_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In Step Def: user is navigated to home page");

    }

}
