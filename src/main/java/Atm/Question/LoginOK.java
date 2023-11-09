package Atm.Question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static Atm.Interface.Dashboard.SearchBox;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginOK implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        boolean LoginOK = false;
        actor.attemptsTo(
                WaitUntil.the(SearchBox, isVisible()).forNoMoreThan(15).seconds()
        );
        if(SearchBox.isVisibleFor(actor)){
            LoginOK = true;
        }

        return LoginOK;
    }

    public static LoginOK ConfirmarLogin(){
        return new  LoginOK();
    }
}
