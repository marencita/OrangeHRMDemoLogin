package Atm.Interface;


import net.serenitybdd.screenplay.targets.Target;

public class PaginaLogin {
    public static final Target usuario = Target.the("usuario").locatedBy("//input[@name='username']");
    public static final Target Contrasena = Target.the("Contrasena").locatedBy("//input[@name='password']");
    public static final Target BtonLogin = Target.the("Boton Login").locatedBy("//button[@type='submit']");
}
