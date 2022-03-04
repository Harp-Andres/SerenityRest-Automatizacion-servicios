package io.swagger.petstore.steps;

import io.restassured.RestAssured;
import io.swagger.petstore.models.DataInyection;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class PetstoreSteps {
    DataInyection dataInyection = new DataInyection();

    @Step
    public void crearOrden7(){
        SerenityRest.given().baseUri(dataInyection.getUrlStorePost()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyOrder7()).post();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void consultarOrden9(){
        SerenityRest.given().baseUri(dataInyection.getUrlStoreGetDelete9()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyOrder9()).get();
        System.out.println(SerenityRest.lastResponse().asString());
    }
    @Step
    public void consultarOrden7(){
        SerenityRest.given().baseUri(dataInyection.getUrlStoreGetDelete7()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyOrder7()).get();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void eliminarOrden9() {
        SerenityRest.given().baseUri(dataInyection.getUrlStoreGetDelete9()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyOrder9()).delete();
        System.out.println(SerenityRest.lastResponse().asString());
    }




    @Step
    public void agregarObjeto(){
        SerenityRest.given().baseUri(dataInyection.getUrlPetPost()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyPetPost()).post();
        System.out.println(SerenityRest.lastResponse().asString());
    }
    @Step
    public void consultaEstado(){
        SerenityRest.given().baseUri(dataInyection.getUrlPetGet()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyPetPost()).get();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void eliminoIDMascota() {
        SerenityRest.given().baseUri(dataInyection.getUrlPetDelete()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyPetPost()).delete();
        System.out.println(SerenityRest.lastResponse().asString());
    }




    @Step
    public void agregarUsuario(){
        SerenityRest.given().baseUri(dataInyection.getUrlPostUser()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyUserPost()).post();
        System.out.println(SerenityRest.lastResponse().asString());
    }
    @Step
    public void consultaUsuario(){
        SerenityRest.given().baseUri(dataInyection.getUrlGetUser()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyUserPost()).get();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void eliminoUsuario() {
        SerenityRest.given().baseUri(dataInyection.getUrlDeleteUser()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyUserPost()).delete();
        System.out.println(SerenityRest.lastResponse().asString());
    }


}
