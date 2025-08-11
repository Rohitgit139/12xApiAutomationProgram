package com.testingacademy.ex_02_RA_Concepts;

public class API_testing_Lab_02 {
    public void step1(){
        System.out.println("Step 1");
    }
    public void step2() {
        System.out.println("Step 2");
    }
    public void step3(String param1) {
        System.out.println("Step 3");
    }
    public static void main(String[]args){
        API_testing_Lab_02 np=new API_testing_Lab_02();
        np.step1();
        np.step2();
        np.step3("rohit");

    }
}
