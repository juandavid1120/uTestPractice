package co.com.choucair.stepdefinition.practiceform;

import co.com.choucair.exceptions.practiceform.ValidationTextDoNotMatch;
import co.com.choucair.stepdefinition.Setup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;


import static co.com.choucair.userinterfaces.practiceform.PracticeForm.VALIDATION_EMAIL_QUESTION;
import static co.com.choucair.util.data.factory.CreateUserDataFactory.getDataUser;
import static co.com.choucair.questions.practiceform.PracticeForm.practiceForm;
import static co.com.choucair.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.choucair.tasks.practiceform.BrowseToPracticeForm.browseToPracticeForm;
import static co.com.choucair.tasks.practiceform.FillAboutYourselfForm.fillAboutYourselfForm;
import static co.com.choucair.tasks.practiceform.FillYourAddressForm.fillYourAddressForm;
import static co.com.choucair.tasks.practiceform.FillYourDivicesFom.fillYuorDivices;
import static co.com.choucair.tasks.practiceform.FillTheLastStepForm.fillTheLastStepForm;
import static co.com.choucair.tasks.practiceform.SearchUser.searchUserPracticeForm;

/*import static co.com.sofka.userinterfaces.practiceform.PracticeForm.NAME_CANDIDATE_VALIDATION;*/
import static co.com.choucair.exceptions.practiceform.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static org.hamcrest.CoreMatchers.equalTo;

public class PracticeFormStepDefinition extends Setup {

    private static final String ACTOR_NAME = "Student";
    private DataTable dataToValidate;
    private List <String> dataUser;
    private List<WebElement> allRows;
    private String resultValidationUser;
    private String emailUser;


    @Given("the user is on landing page of uTest")
    public void theStudentIsOnLandingPageOfToolsQA() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
    }

    @When("him browse to registration form")
    public void himBrowseToRegistrationForm() {
        theActorInTheSpotlight().attemptsTo(
                browseToPracticeForm()
        );
    }

    @When("filled out the Tell us about yourself section on the form with the data provided")
    public void filledOutTheTellUsAboutYourselfSectionOnTheFormWithTheDataProvided(io.cucumber.datatable.DataTable dataTable) {
        dataToValidate = dataTable;
        dataUser = getDataUser();
        emailUser= dataUser.get(2);


        theActorInTheSpotlight().attemptsTo(
                fillAboutYourselfForm()
                        .usingFirstName(dataUser.get(0))
                        .usingLastName(dataUser.get(1))
                        .usingEmail(dataUser.get(2))
                        .usingBirthMonth(dataTable.row(0).get(1))
                        .usingBirthDay(dataTable.row(1).get(1))
                        .usingBirthYear(dataTable.row(2).get(1))
        );
    }

    @When("filled out the Add your address section on the form with the data provided")
    public void filledOutTheAddYourAddressSectionOnTheFormWithTheDataProvided() {
        theActorInTheSpotlight().attemptsTo(
                fillYourAddressForm()
                        .usingCity(dataToValidate.row(3).get(1))
                        .usingZip(dataToValidate.row(4).get(1))
                        .usingCountry(dataToValidate.row(5).get(1))

        );
    }

    @When("filled out the Tell us about your devices section on the form")
    public void filledOutTheTellUsAboutYourDevicesSectionOnTheForm() {
        theActorInTheSpotlight().attemptsTo(
                fillYuorDivices()
                        /*.usingCity(dataToValidate.row(3).get(1))
                        .usingZip(dataToValidate.row(4).get(1))
                        .usingCountry(dataToValidate.row(5).get(1))*/

        );
    }

    @When("filled out the The last step section on the form with the data provided")
    public void filledOutTheTheLastStepSectionOnTheFormWithTheDataProvided() {
        theActorInTheSpotlight().attemptsTo(
                fillTheLastStepForm()
                        .usingPassword(dataToValidate.row(6).get(1)+dataUser.get(0))


        );
    }


    @When("browse the page and search for the user")
    public void browseThePageAndSearchForTheUser() {

        theActorInTheSpotlight().attemptsTo(
                searchUserPracticeForm()
                        .andUsingValidaEmailAddress(dataUser.get(2))
                        .andUsingValidaPassword(dataToValidate.row(6).get(1)+dataUser.get(0))
        );
    }


    @Then("the user will see a registration information")
    public void theStudentWillSeeARegistrationInformation() {
        theActorInTheSpotlight().should(
                seeThat(practiceForm()

                        .wasFullEmail(dataUser.get(2))

                        .is(), equalTo(true)
                )
                        .orComplainWith(
                                ValidationTextDoNotMatch.class,
                                String.format(VALIDATION_DO_NOT_MATCH, compareInWithSystemOutcome())
                        )
        );
    }

    private String compareInWithSystemOutcome() {
        return "\n" + "Data for test : System outcome"
                + "\n" + emailUser + " "+emailUser+ " : " + VALIDATION_EMAIL_QUESTION.resolveFor(theActorInTheSpotlight()).getText();

    }

 }
