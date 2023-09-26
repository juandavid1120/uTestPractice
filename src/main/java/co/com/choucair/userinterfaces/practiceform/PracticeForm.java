package co.com.choucair.userinterfaces.practiceform;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;

public class PracticeForm extends PageObject {
   public static String XPATH_VALIDATION_EMAIL= "//span [contains(text(), '%s')])]";
    public static final Target JOIN_TODAY = Target
            .the("join today")
            .located(xpath("//a [@ class = 'unauthenticated-nav-bar__sign-up']"));

    public static final Target LOG_IN = Target
            .the("log in user")
            .located(xpath("//a [@ class = 'unauthenticated-nav-bar__link']"));
    public static final Target FIRST_NAME = Target
                .the("User first name")
                .located(id("firstName"));

    public static final Target LAST_NAME = Target
            .the("User lastName")
            .located(id("lastName"));

    public static final Target EMAIL = Target
            .the("User EMAIL")
            .located(id("email"));
    public static final Target BIRTH_MONTH = Target
            .the(" User birthMonth")
            .located(id("birthMonth"));

    public static final Target BIRTH_DAY = Target
            .the("User birthDay")
            .located(id("birthDay"));

    public static final Target BIRTH_YEAR = Target
            .the("User birthYear")
            .located(id("birthYear"));

    public static final Target BUTTON_FORM_1 = Target
            .the("BUTTON FORM 1")
            .located(xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target CITY = Target
            .the("user location")
            .located(id("city"));
    public static final Target ZIP = Target
            .the("user location zip")
            .located(id("zip"));

    public static final Target COUNTRY = Target
            .the("User country")
            .located(xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target BUTTON_FROM_FORM_2 = Target
            .the("BUTTON_FROM_FORM_2")
            .located(xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target YOUR_COMPUTER = Target
            .the("User your computer")
            .located(cssSelector("#web-device > div:nth-child(1) > div.ui-select-box > div > div.ui-select-match > span"));
    public static final Target YOUR_COM_WINDOWS = Target
            .the("User your computer")
            .located(xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/ul/li/div[4]/span/div"));
    public static final Target VERSION_VISTA = Target
            .the("User your computer")
            .located(xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/ul/li/div[3]/span/div"));
    public static final Target VERSION = Target
            .the("User version")
            .located(xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target LENGUAGE = Target
            .the("User lenguage")
            .located(xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span"));

    public static final Target LENGUAGE_ENGLISH = Target
            .the("User lenguage inglish")
            .located(xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/ul/li/div[13]/span/div"));
    public static final Target YOUR_MOBILE_DIVICE = Target
            .the("User mobile divice ")
            .located(xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span"));
    public static final Target YOUR_MOBILE_DIVICE_SAMSUNG = Target
            .the("User mobile divice samsung ")
            .located(xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[41]"));
    public static final Target MODEL = Target
            .the("User model")
            .located(xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target MODEL_SGH = Target
            .the("User model")
            .located(xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[3]/span/div"));
    public static final Target OPERATING_SYSTEM = Target
            .the("User operating system")
            .located(xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target OPERATING_SYSTEM_SYMBIAN = Target
            .the("User operating system")
            .located(xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[3]/span/div"));
    public static final Target BUTTON_FORM_3 = Target
            .the("BUTTON NEXT 3")
            .located(xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target PASSWORD = Target
            .the("password")
            .located(id("password"));
    public static final Target COMFIRM_PASSWORD = Target
            .the("confirmPassword")
            .located(id("confirmPassword"));
    public static final Target STAY_INFORMED = Target
            .the("confirmPassword")
            .located(id("confirmPassword"));
    public static final Target TERMS_OF_USE = Target
            .the("termOfUse")
            .located(id("termOfUse"));
    public static final Target PRIVACY = Target
            .the("privacySetting")
            .located(id("privacySetting"));
    public static final Target BUTTON_COMPLETE_SETUP = Target
            .the("complete register")
            .located(id("laddaBtn"));
    public static final Target EMAIL_SIGN_IN = Target
            .the("email sign in")
            .located(id("username"));
    public static final Target PASSWORD_SIGN_IN = Target
            .the("password sign in")
            .located(id("password"));
    public static final Target BUTTON_SIGN_IN = Target
            .the("button sign in")
            .located(id("kc-login"));
    public static Target VALIDATION_EMAIL_QUESTION = Target
            .the("{0} span")
            .located(cssSelector("#kc-form-wrapper > div > section > div:nth-child(1) > span"));

}
