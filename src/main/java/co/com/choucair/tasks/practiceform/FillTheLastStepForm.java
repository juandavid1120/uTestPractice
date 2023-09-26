package co.com.choucair.tasks.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.userinterfaces.practiceform.PracticeForm.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillTheLastStepForm implements Task {
    private String password;

    public FillTheLastStepForm usingPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(PASSWORD, isVisible()).forNoMoreThan(4).seconds(),
                Enter.theValue(password).into(PASSWORD),

                Enter.theValue(password).into(COMFIRM_PASSWORD),

                Click.on(STAY_INFORMED),

                Click.on(TERMS_OF_USE),

                Click.on(PRIVACY),

                Click.on(BUTTON_COMPLETE_SETUP)

        );

    }

    public static FillTheLastStepForm fillTheLastStepForm() {
        return new FillTheLastStepForm();
    }
}
