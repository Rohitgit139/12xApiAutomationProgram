package com.testingacademy.ex_05_TestNG_examples;

import org.testng.annotations.Test;

public class testNG_Priority_017 {


    @Test(priority = 4)
    public void test_tc_01(){
        System.out.println("1");
    }
    @Test(priority = 2)
    public void test_tc_02(){
        System.out.println("3");
    }
    @Test(priority = 3)
    public void test_tc_03(){
        System.out.println(2);
    }
    @Test(priority = 1)
    public void test_tc_04(){
        System.out.println(4);
    }
}
