package com.testingacademy.ex_05_TestNG_examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Api_testing_lab_19 {


    @Test
    public void serverStartedok() {
        System.out.println("i will run first");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedok")
    public void test1() {
        System.out.println("method 1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedok")
    public void test2() {
        System.out.println("method 2");
        Assert.assertTrue(true);
    }
}

