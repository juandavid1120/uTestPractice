package co.com.choucair.tasks.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.choucair.userinterfaces.practiceform.PracticeForm.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillYourAddressForm implements Task {
    private String city;
    private String zip;
    private String country;

    public FillYourAddressForm usingCity(String city) {
        this.city = city;
        return this;
    }

    public FillYourAddressForm usingZip(String zip) {
        this.zip = zip;
        return this;
    }

    public FillYourAddressForm usingCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(city).into(CITY),
                WaitUntil.the(CITY, isVisible()).forNoMoreThan(2).seconds(),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                WaitUntil.the(CITY, isVisible()).forNoMoreThan(2).seconds(),
                Hit.the(Keys.ENTER).into(CITY),

                Enter.theValue(zip).into(ZIP),

                Click.on(BUTTON_FROM_FORM_2)
        );

    }

    public static FillYourAddressForm fillYourAddressForm() {
        return new FillYourAddressForm();
    }
}
