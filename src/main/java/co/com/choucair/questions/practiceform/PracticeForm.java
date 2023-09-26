package co.com.choucair.questions.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.userinterfaces.practiceform.PracticeForm.*;

public class PracticeForm implements Question<Boolean> {

    private String email;

    String getTextSpamEmailUserValidation;


    public PracticeForm wasFullEmail(String email) {
        this.email = email;
        return this;
    }

    public PracticeForm is(){
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
//
        getTextSpamEmailUserValidation=VALIDATION_EMAIL_QUESTION.resolveFor(actor).getText();

        if(getTextSpamEmailUserValidation.equals(email)){

            return true;
        }
        return false;

    }

    public static PracticeForm practiceForm(){
        return new PracticeForm();
    }
}
