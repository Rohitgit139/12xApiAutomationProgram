package com.testingacademy.ex_02_RA_Concepts;

public class Api_testing_Lab_03_bp {
    public Api_testing_Lab_03_bp step1(){
        System.out.println("step 1");
        return this;
    }
    public Api_testing_Lab_03_bp step2(){
        System.out.println("step 2");
        return this;

    }
    public Api_testing_Lab_03_bp step3(String param1){
        System.out.println("step 3");
        return this;
    }
    public static void main(String[]args){
        Api_testing_Lab_03_bp bp=new Api_testing_Lab_03_bp();
        bp.step1().step2().step3("rohit");
    }

}
