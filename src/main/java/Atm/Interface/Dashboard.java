package Atm.Interface;


import net.serenitybdd.screenplay.targets.Target;

public class Dashboard {
    public static final Target SearchBox = Target.the("Caja de busqueda").locatedBy("//input[@placeholder='Search']");
}
