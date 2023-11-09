package Atm.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static Atm.Interface.PaginaLogin.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Logueo implements Task {
    private static String Usuario;
    private static String Passw;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(usuario, isVisible()).forNoMoreThan(60).seconds().then(SendKeys.of(Usuario).into(usuario)),
                WaitUntil.the(Contrasena, isVisible()).forNoMoreThan(60).seconds().then(SendKeys.of(Passw).into(Contrasena)),
                WaitUntil.the(BtonLogin, isVisible()).forNoMoreThan(60).seconds().then(Click.on(BtonLogin))
        );

    }

    public static Logueo go(String usuar,String Contras){
        Usuario=usuar;
        Passw=Contras;
        return instrumented(Logueo.class);
    }
}
