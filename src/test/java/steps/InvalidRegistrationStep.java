package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.HookHelper;
import org.apache.bcel.generic.NEW;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.RegistrationPage;

public class InvalidRegistrationStep {
    private WebDriver webDriver;
    private HomePage home;
    private HookHelper hookHelper;
    private String cellphoneEmptyMessage;

    HomePage homePage = new HomePage(HookHelper.getWebDriver());
    RegistrationPage registrationPage = new RegistrationPage(HookHelper.getWebDriver());

    @Given("^The user is in Falabella's home page$")
    public void theUserIsInFalabellaSHomePage() {
    }

    @And("^Goes to the registration page$")
    public void goesToTheRegistrationPage() {

        registrationPage.searchRegister();
    }

    @When("^The user fills all fields excepting 'celular'$")
    public void theUserFillsAllFieldsExceptingCelular() {
        registrationPage.insertData();
    }

    @And("^Tries to save its data$")
    public void triesToSaveItsData() {
        registrationPage.saveButtonClick();
    }

    @Then("^Web page displays error message to the user$")
    public void webPageDisplaysErrorMessageToTheUser() {
        cellphoneEmptyMessage = registrationPage.registCellphoneNotFound();
        Assert.assertEquals("Error: Cellphone field is empty", cellphoneEmptyMessage, "true");
    }
}
