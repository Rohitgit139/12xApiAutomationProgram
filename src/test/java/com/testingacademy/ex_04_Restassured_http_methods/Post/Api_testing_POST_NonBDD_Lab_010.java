package com.testingacademy.ex_04_Restassured_http_methods.Post;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Api_testing_POST_NonBDD_Lab_010 {

    RequestSpecification r ;
    Response response ;
    ValidatableResponse vr;


    @Test
    public void test_post_non_bdd(){
        String payload ="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        System.out.println("part 1");

        r=RestAssured.given();
                r.baseUri("https://restful-booker.herokuapp.com");
                r.basePath("/auth");
               r .contentType("application/json");
               r.body(payload).log().all();

        System.out.println("part 2");
        response=r.when().log().all().post();

        System.out.println("part 3");
        vr=response.then().log().all().statusCode(200);
    }

}
