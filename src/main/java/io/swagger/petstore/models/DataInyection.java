package io.swagger.petstore.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInyection {
    Faker faker = new Faker(new Locale("en-US"));

    private String urlStorePost, urlPetPost,urlPetGet,urlPetDelete, urlPostUser,urlGetUser,urlDeleteUser, urlStoreGetDelete7, urlStoreGetDelete9;
    private String bodyPetPost, bodyOrder9,bodyOrder7, bodyUserPost, headers;
    private final int STATUSCODE;

    //url de consumos: https://petstore.swagger.io/#/
    public DataInyection() {
        this.urlStorePost = "https://petstore.swagger.io/v2/store/order";
        this.urlStoreGetDelete7 = "https://petstore.swagger.io/v2/store/order/7";
        this.urlStoreGetDelete9 = "https://petstore.swagger.io/v2/store/order/9";
        this.urlPetPost = "https://petstore.swagger.io/v2/pet";
        this.urlPetGet = "https://petstore.swagger.io/v2/pet/1";
        this.urlPetDelete = "https://petstore.swagger.io/v2/pet/1";
        this.urlPostUser = "https://petstore.swagger.io/v2/user/createWithArray";
        this.urlGetUser = "https://petstore.swagger.io/v2/user/Andres";
        this.urlDeleteUser = "https://petstore.swagger.io/v2/user/Andres";
        this.headers = "application/json";
        this.bodyOrder9 = "{\n" +
                "  \"id\": 9,\n" +
                "  \"petId\": 9,\n" +
                "  \"quantity\": 1,\n" +
                "  \"shipDate\": \"2022-03-01T22:29:18.962+0000\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true,\n" +
                "}";
        this.bodyOrder7= "{\n" +
                "  \"id\": 4,\n" +
                "  \"petId\": 4,\n" +
                "  \"quantity\": 1,\n" +
                "  \"shipDate\": \"2022-03-01T22:29:18.962+0000\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true,\n" +
                "}";

        this.bodyPetPost = "{\n" +
                "\"id\": 1,\n"  +
                "\" category\": {\n"+
                "\" id\": 1,\n"+
                "\"name\": \"string\"  },\n"+
                "\"name\": \"doggie\",\n"+
                "\"photoUrls\": [ \n"+
                " \"string\"\n" +
                "  ],\n"+
                " \"tags\": [\n" +
                "{\n"+
                "\"id\": 1,\n"+
                "\"name\": \"string\"\n"+
                "}\n"+
                "],\n"+
                "\"status\": \"available\"\n"+
                "}";

        this.bodyUserPost = "[\n" +
                "  {\n" +
                "    \"id\": 5,\n" +
                "    \"username\": \"Andres\",\n" +
                "    \"firstName\": \"Andres\",\n" +
                "    \"lastName\": \"Rodriguez\",\n" +
                "    \"email\": \"prueba@test.com\",\n" +
                "    \"password\": \"1234\",\n" +
                "    \"phone\": \"3203256987\",\n" +
                "    \"userStatus\": 0\n" +
                "  }\n" +
                "]";

        this.STATUSCODE = 200;
    }

    public String getUrlPetPost() {
        return urlPetPost;
    }



    public String getUrlStorePost() {
        return urlStorePost;
    }

    public String getUrlStoreGetDelete7() {
        return urlStoreGetDelete7;
    }

    public String getUrlStoreGetDelete9() {
        return urlStoreGetDelete9;
    }

    public String getBodyOrder9() {
        return bodyOrder9;
    }

    public String getBodyOrder7() {
        return bodyOrder7;
    }
    public String getHeaders() {
        return headers;
    }

    public String getBodyPetPost() {
        return bodyPetPost;
    }


    public String getUrlPetDelete() {
        return urlPetDelete;
    }

    public String getUrlPetGet() {
        return urlPetGet;
    }

    public String getUrlPostUser() {
        return urlPostUser;
    }

    public String getBodyUserPost() {
        return bodyUserPost;
    }

    public String getUrlGetUser() {
        return urlGetUser;
    }

    public String getUrlDeleteUser() {
        return urlDeleteUser;
    }

    public int getSTATUSCODE() {
        return STATUSCODE;
    }
}
