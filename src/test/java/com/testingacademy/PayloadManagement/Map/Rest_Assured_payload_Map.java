package com.testingacademy.PayloadManagement.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Rest_Assured_payload_Map {


    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;


    @Test
    public void payload_map() {
        //String payload = "{\n" +
       // "    \"firstname\" : \"Rohit\",\n" +
         //       "    \"lastname\" : \"Brown\",\n" +
           //     "    \"totalprice\" : 111,\n" +
             //  "    \"depositpaid\" : true,\n" +
              //  "    \"bookingdates\" : {\n" +
                //"        \"checkin\" : \"2018-01-01\",\n" +
               // " //       \"checkout\" : \"2019-01-01\"\n" +
              //  "    },\n" +
                //"    \"additionalneeds\" : \"Breakfast\"\n" +
                //"}";

        Map<String,Object>json_using_HASHMAP=new LinkedHashMap<>();
        json_using_HASHMAP.put("firstname","Rohit");
        json_using_HASHMAP.put("lastname","Brown");
        json_using_HASHMAP.put("totalprice",111);
        json_using_HASHMAP.put("depositpaid",true);

        Map<String,Object>bookingdatesMap=new LinkedHashMap<>();
        bookingdatesMap.put("checkin","2018-01-01");
        bookingdatesMap.put("checkout","2019-01-01");

        json_using_HASHMAP.put("bookingdates",bookingdatesMap);
        json_using_HASHMAP.put("additionalneeds","Breakfast");
        System.out.println(json_using_HASHMAP);



        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType("application/json");
        requestSpecification.body(json_using_HASHMAP).log().all();

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