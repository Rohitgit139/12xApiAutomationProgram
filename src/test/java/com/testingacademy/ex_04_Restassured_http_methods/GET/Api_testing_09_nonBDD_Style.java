package com.testingacademy.ex_04_Restassured_http_methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Api_testing_09_nonBDD_Style {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String pincode;




    @Test
    public void test_non_bdd_01(){
        pincode="560048";

        //given()
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
                r.basePath("/IN/" +pincode);


                //When()
        response=r.when().log().all().get();
        System.out.println(response.asString());


        //then

        vr=response.then().log().all().statusCode(200);

    }
    @Test
    public void test_non_bdd_02(){
        pincode="@";

        //given()
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" +pincode);


        //When()
        response=r.when().log().all().get();
        System.out.println(response.asString());


        //then

        vr=response.then().log().all().statusCode(404);

    }
    @Test
    public void test_non_bdd_03(){
        pincode=" ";

        //given()
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" +pincode);


        //When()
        response=r.when().log().all().get();
        System.out.println(response.asString());


        //then

        vr=response.then().log().all().statusCode(404);

    }
}
