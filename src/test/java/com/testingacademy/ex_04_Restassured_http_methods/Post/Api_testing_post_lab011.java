package com.testingacademy.ex_04_Restassured_http_methods.Post;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Api_testing_post_lab011 {


    @Test
    public void test_auth_token(){

        String payload ="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType("application/json")
                .log().all()
                .body(payload)
                .when().log().all().post()
                .then().log().all().statusCode(200);
    }
}
