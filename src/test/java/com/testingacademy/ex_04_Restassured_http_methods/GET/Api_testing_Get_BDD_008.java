package com.testingacademy.ex_04_Restassured_http_methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Api_testing_Get_BDD_008 {

    @Test
    public void test_01(){
        String pincode="110048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);


    }
}
