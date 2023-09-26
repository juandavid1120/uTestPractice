package co.com.choucair.tasks.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.userinterfaces.practiceform.PracticeForm.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FillAboutYourselfForm implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String birthYear;


    public FillAboutYourselfForm usingFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public FillAboutYourselfForm usingLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FillAboutYourselfForm usingEmail(String email) {
        this.email = email;
        return this;
    }

    public FillAboutYourselfForm usingBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
        return this;
    }

    public FillAboutYourselfForm usingBirthDay(String birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    public FillAboutYourselfForm usingBirthYear(String birthYear) {
        this.birthYear = birthYear;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(FIRST_NAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(firstName).into(FIRST_NAME),

                Enter.theValue(lastName).into(LAST_NAME),

                Enter.theValue(email).into(EMAIL),

                SelectFromOptions.byVisibleText("January").from(BIRTH_MONTH),
                SelectFromOptions.byVisibleText("3").from(BIRTH_DAY),
                SelectFromOptions.byVisibleText("2005").from(BIRTH_YEAR),

                Click.on(BUTTON_FORM_1)

        );

    }

    public static FillAboutYourselfForm fillAboutYourselfForm() {
        return new FillAboutYourselfForm();
    }
}
