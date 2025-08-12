package com.testingacademy.ex_04_Restassured_http_methods.Delete;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Api_testing_delete_014_nbdd {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_delete_non_bdd(){
        String token="b55b7c75bd9ab69";
        String bookingid="8059";

        String payload="{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";


        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" +bookingid);
        r.cookie("token" ,token);
        r .contentType("application/json");


        System.out.println("part 2");
        response=r.when().log().all().delete();

        System.out.println("part 3");
        vr=response.then().log().all();
        vr.statusCode(201);
    }
}