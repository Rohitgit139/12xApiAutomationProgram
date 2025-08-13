package com.testingacademy.ex_06_test_assertions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Api_Testing_025_Restassured_assertions {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String token;
    Integer bookingID;


@Test
public void test_create_booking_post() {

    String payload = "{\n" +
            "    \"firstname\" : \"Rohit\",\n" +
            "    \"lastname\" : \"Brown\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : true,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2018-01-01\",\n" +
            "        \"checkout\" : \"2019-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}";

    requestSpecification = RestAssured.given();
    requestSpecification.baseUri("https://restful-booker.herokuapp.com");
    requestSpecification.basePath("/booking");
    requestSpecification.cookie("token", token);
    requestSpecification.contentType("application/json");
    requestSpecification.body(payload).log().all();

    System.out.println("=== Sending POST Request ===");
    response = requestSpecification.when().post();

    System.out.println("=== Validating Response ===");
    validatableResponse = response.then().log().all();
    validatableResponse.statusCode(200); // or 201 if needed
    validatableResponse.body("bookingid", Matchers.notNullValue());
    validatableResponse.body("booking.firstname", Matchers.equalTo("Rohit"));
    validatableResponse.body("booking.lastname", Matchers.equalTo("Brown"));
    validatableResponse.body("booking.depositpaid", Matchers.equalTo(true));
}}

