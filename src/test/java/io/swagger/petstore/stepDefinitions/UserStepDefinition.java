package io.swagger.petstore.stepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import io.swagger.petstore.steps.PetstoreSteps;
import net.thucydides.core.annotations.Steps;

public class UserStepDefinition {

    @Steps
    PetstoreSteps petstoreSteps = new PetstoreSteps();



    @Cuando("^creo un usuario$")
    public void creoUnUsuario() {
        petstoreSteps.agregarUsuario();
    }

    @Cuando("^consulto un usuario por nombre de usuario$")
    public void consultoUnUsuarioPorNombreDeUsuario() {
        petstoreSteps.consultaUsuario();


    }

    @Entonces("^elimino un usuario$")
    public void eliminoUnUsuario() {
        petstoreSteps.eliminoUsuario();


    }

}
