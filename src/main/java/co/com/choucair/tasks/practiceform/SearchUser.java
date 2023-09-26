package co.com.choucair.tasks.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.userinterfaces.practiceform.PracticeForm.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchUser implements Task {
     private String validateEmailAddress;
     private String validatePassword;

    public SearchUser andUsingValidaEmailAddress(String validateEmailAddress) {
        this.validateEmailAddress = validateEmailAddress;
        return this;
    } public SearchUser andUsingValidaPassword(String validatePassword) {
        this.validatePassword = validatePassword;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOG_IN, isVisible()).forNoMoreThan(30).seconds(),
                JavaScriptClick.on(LOG_IN),

                WaitUntil.the(EMAIL_SIGN_IN, isVisible()).forNoMoreThan(5).seconds(),

                Enter.theValue(validateEmailAddress).into(EMAIL_SIGN_IN),

                Enter.theValue(validatePassword).into(PASSWORD_SIGN_IN),

                Click.on(BUTTON_SIGN_IN)

        );


    }

    public static SearchUser searchUserPracticeForm(){
        return new SearchUser();
    }
}
