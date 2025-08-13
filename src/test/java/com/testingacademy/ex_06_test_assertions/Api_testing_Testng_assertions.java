package com.testingacademy.ex_06_test_assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Api_testing_Testng_assertions {

    @Test(enabled = true)
    public void hard_assertion(){
        System.out.println("start of program" );
        Boolean neeruisfemale=false;
        Assert.assertEquals("rohit","Rohit" );
        System.out.println("end of the program");
    }


@Test
public void soft_assertion(){
    SoftAssert softAssert=new SoftAssert();
    System.out.println("start of program" );
    softAssert.assertEquals("rohit","Rohit" );
    System.out.println("end of the program");
}}

