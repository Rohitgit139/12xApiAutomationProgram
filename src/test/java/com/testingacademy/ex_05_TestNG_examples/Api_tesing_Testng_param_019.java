package com.testingacademy.ex_05_TestNG_examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Api_tesing_Testng_param_019 {


@Parameters("browser")
    @Test
    public void demoA(String value){
    System.out.println("demo");
    System.out.println("you are running parameter");


    if (value.equalsIgnoreCase("firefox")){

        System.out.println("start firefox");
    }
if (value.equalsIgnoreCase("chrome")){
    System.out.println("start chrome");
}
}
}
