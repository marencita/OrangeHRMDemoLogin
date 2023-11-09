package stepdefinitions;

import Atm.task.Logueo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static Atm.Question.LoginOK.ConfirmarLogin;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepdefs {

    @Before
    public void Inicio(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Admin");
      }


    @Given("acceso a la pagina de orangeHRMDemo")
    public void acceso_a_la_pagina_de_orange_hrm_demo() {
        theActorInTheSpotlight().attemptsTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
    }

    @When("ingreso nombre de usuario {string}, contrasena {string} y doy click en ingresar")
    public void ingreso_nombre_de_usuario_contraseña_y_doy_click_en_ingresar(String usuario, String password) {
        theActorInTheSpotlight().attemptsTo(Logueo.go(usuario,password));
    }
    @Then("valido que haya ingresado")
    public void valido_que_haya_ingresado() {
        theActorInTheSpotlight().should(seeThat(ConfirmarLogin(), Matchers.equalTo(true)));
    }




}
