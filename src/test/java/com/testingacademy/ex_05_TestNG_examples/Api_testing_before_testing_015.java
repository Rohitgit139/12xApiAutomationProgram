package com.testingacademy.ex_05_TestNG_examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Api_testing_before_testing_015 {

    @BeforeTest
    public void gettoken(){
        System.out.println("get a token");
    }
    @BeforeTest
    public void get_booking_id(){
        System.out.println("get a booking");
    }

    @Test
    public void test_put(){
        System.out.println("put request");
    }
    @AfterTest
    public void close_all_things(){
        System.out.println("close");
    }


}
