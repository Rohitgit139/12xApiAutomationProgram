package com.testingacademy.ex_04_Restassured_http_methods.Patch;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Patch_non_bdd_013 {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_patch_nonbdd(){
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
        r.body(payload).log().all();

        System.out.println("part 2");
        response=r.when().log().all().patch();

        System.out.println("part 3");
        vr=response.then().log().all();
        vr.statusCode(200);
    }
}


