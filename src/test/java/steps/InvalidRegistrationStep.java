package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.HookHelper;
import org.apache.bcel.generic.NEW;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class InvalidRegistrationStep {
    private WebDriver webDriver;
    private HomePage home;
    private HookHelper hookHelper;

    HomePage homePage = new HomePage(HookHelper.getWebDriver());

    @Given("^The user is in Falabella's home page$")
    public void theUserIsInFalabellaSHomePage() {
    }

    @And("^Goes to the registration page$")
    public void goesToTheRegistrationPage() {

        homePage.searchRegister();
    }

    @When("^The user fills all fields excepting 'celular'$")
    public void theUserFillsAllFieldsExceptingCelular() {
        homePage.insertData();
    }

    @And("^Tries to save its data$")
    public void triesToSaveItsData() {
    }

    @Then("^Web page displays error message to the user$")
    public void webPageDisplaysErrorMessageToTheUser() {
    }
}
