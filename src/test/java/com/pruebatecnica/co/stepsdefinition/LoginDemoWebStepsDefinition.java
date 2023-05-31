package com.pruebatecnica.co.stepsdefinition;

import com.pruebatecnica.co.questions.*;
import com.pruebatecnica.co.tasks.CredencialesAcmeDemo;
import com.pruebatecnica.co.tasks.LanzarNavegador;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static org.hamcrest.Matchers.equalTo;

public class LoginDemoWebStepsDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("como {string} deseo loguearme")
    public void comoDeseoLoguearme(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                LanzarNavegador.paraLaPrueba()
        );
    }
    @When("las credenciales usuario {string} y contrasena {string}")
    public void lasCredencialesUsuarioYContrasena(String usuario, String contrasena) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new CredencialesAcmeDemo(usuario,contrasena)
        );
    }

    @Then("valido inicio de sesion")
    public void validoInicioDeSesion() {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarUrl.DeLaPaginaActual(), equalTo(true))
        );

    }

    @Then("valido numero transaccion {int} en el home")
    public void validoNumeroTransaccionEnElHome(Integer numeroTransacciones) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarTransacciones.deLaPagina(), equalTo(numeroTransacciones))
        );
    }
    @Then("valido el total balance de {int}")
    public void validoElTotalBalanceDe(Integer totalBalance) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarTotal.deLaPagina(), equalTo(totalBalance))
        );
    }
    @Then("valido el credit avalible de {string}")
    public void validoElCreditAvalibleDe(String CreditAvalible) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarCreditAvalable.inLabel(), equalTo(CreditAvalible))
        );
    }
    @Then("valido contengan el carecter {string} con formato {string}")
    public void validoContenganElCarecterConFormato(String charter, String classNameRow) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarChartColorAmount.Amount(charter, classNameRow), equalTo(true))
        );
    }
    @Then("valido el estado {string} con color {string}")
    public void validoElEstadoConColor(String status, String colorLabel) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarChartColorStatus.InTheColumn(status, colorLabel), equalTo(true))
        );
    }
}
