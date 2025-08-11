package com.testingacademy.ex_03_Testng_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Api_testing_Lab_05_testcase {
    String pincode="110048";


@Test
    public void test_positive_tc01(){
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


@Test
    public void test_negative_tc02(){
        String pincode="@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
    @Test
    public void test_negative_tc03(){
        String pincode=" ";
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
