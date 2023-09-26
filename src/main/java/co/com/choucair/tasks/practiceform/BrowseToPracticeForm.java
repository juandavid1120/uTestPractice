package co.com.choucair.tasks.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static co.com.choucair.userinterfaces.practiceform.PracticeForm.*;

public class BrowseToPracticeForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(JOIN_TODAY)
        );
    }

    public static BrowseToPracticeForm browseToPracticeForm(){
        return new BrowseToPracticeForm();
    }
}
