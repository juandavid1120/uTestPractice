package co.com.choucair.tasks.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.choucair.userinterfaces.practiceform.PracticeForm.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillYourDivicesFom implements Task {
     private String yourComputer;
    private String version;
    private String lenguaje;
    private String yourMobileDivice;
    private String model;
    private String operatingSystem;

    public FillYourDivicesFom usingYourComputer(String yourComputer) {
        this.yourComputer = yourComputer;
        return this;
    }
    public FillYourDivicesFom usingVersion(String version) {
        this.version = version;
        return this;
    }

    public FillYourDivicesFom usingLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
        return this;
    }public FillYourDivicesFom usingYourMobileDivice(String yourMobileDivice) {
        this.yourMobileDivice = yourMobileDivice;
        return this;
    }

    public FillYourDivicesFom usingModel(String model) {
        this.model = model;
        return this;
    }
    public FillYourDivicesFom usingOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Hit.the(Keys.TAB).into(YOUR_COMPUTER),
                Hit.the(Keys.ENTER).into(YOUR_COMPUTER),

                JavaScriptClick.on(YOUR_COMPUTER),
                JavaScriptClick.on(YOUR_COM_WINDOWS),

                Hit.the(Keys.TAB).into(VERSION),
                Hit.the(Keys.ENTER).into(VERSION),
                JavaScriptClick.on(VERSION),
                JavaScriptClick.on(VERSION_VISTA),

                Hit.the(Keys.TAB).into(LENGUAGE),
                Hit.the(Keys.ENTER).into(LENGUAGE),
                JavaScriptClick.on(LENGUAGE),
                JavaScriptClick.on(LENGUAGE_ENGLISH),

                Hit.the(Keys.TAB).into(YOUR_MOBILE_DIVICE),
                Hit.the(Keys.ENTER).into(YOUR_MOBILE_DIVICE),
                JavaScriptClick.on(YOUR_MOBILE_DIVICE),
                WaitUntil.the(YOUR_MOBILE_DIVICE_SAMSUNG, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(YOUR_MOBILE_DIVICE_SAMSUNG),

                Hit.the(Keys.TAB).into(MODEL),
                Hit.the(Keys.ENTER).into(MODEL),
                JavaScriptClick.on(MODEL),
                JavaScriptClick.on(MODEL_SGH),

                Hit.the(Keys.TAB).into(OPERATING_SYSTEM),
                Hit.the(Keys.ENTER).into(OPERATING_SYSTEM),
                JavaScriptClick.on(OPERATING_SYSTEM),
                JavaScriptClick.on(OPERATING_SYSTEM_SYMBIAN),

                Click.on(BUTTON_FORM_3)
        );

    }

    public static FillYourDivicesFom fillYuorDivices() {
        return new FillYourDivicesFom();
    }
}
