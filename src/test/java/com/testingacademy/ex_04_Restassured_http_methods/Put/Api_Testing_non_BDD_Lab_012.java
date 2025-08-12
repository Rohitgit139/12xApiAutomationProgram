package com.testingacademy.ex_04_Restassured_http_methods.Put;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Api_Testing_non_BDD_Lab_012 {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_put_nonbdd(){
        String token="f43ce73c6cb3423";
        String bookingid="30961";

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
        r .contentType(ContentType.JSON);
        r.body(payload).log().all();

        System.out.println("part 2");
        response=r.when().log().all().put();

        System.out.println("part 3");
        vr=response.then().log().all();
    vr.statusCode(200);
    }
}
