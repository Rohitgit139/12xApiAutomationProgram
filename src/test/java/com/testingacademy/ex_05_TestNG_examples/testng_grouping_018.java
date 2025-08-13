package com.testingacademy.ex_05_TestNG_examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testng_grouping_018 {

    @Test(groups = {"sanity","regression"})
    public void test_sanity(){
        System.out.println("sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }
    @Test(groups = {"regression"})
    public void test_regression(){
        System.out.println("regression");
        System.out.println("QA");
        Assert.assertTrue(false);
    }
    @Test(groups ={"smoke","regression"})
    public void test_smoke(){
        System.out.println("smoke");
        System.out.println("QA");
        Assert.assertTrue(false);
    }
}
