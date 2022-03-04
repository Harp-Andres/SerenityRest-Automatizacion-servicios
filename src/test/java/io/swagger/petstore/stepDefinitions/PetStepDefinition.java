package io.swagger.petstore.stepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import io.swagger.petstore.steps.PetstoreSteps;
import net.thucydides.core.annotations.Steps;

public class PetStepDefinition {

    @Steps
    PetstoreSteps petstoreSteps = new PetstoreSteps();

    @Cuando("^agrego un objeto de mascota a la tienda$")
    public void agregoUnObjetoDeMascotaALaTienda() {
        petstoreSteps.agregarObjeto();
    }


    @Cuando("^ingreso el estado que debe tenerse encuenta en un filtro$")
    public void ingresoElEstadoQueDebeTenerseEncuentaEnUnFiltro() {
       petstoreSteps.consultaEstado();
    }



    @Entonces("^elimino el ID de una mascota$")
    public void eliminoElIDDeUnaMascota() {
        petstoreSteps.eliminoIDMascota();


    }

}
