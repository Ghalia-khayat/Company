package com.company;

import java.util.Scanner;

public class Employee {
    private String name;
    private String lastName;
    private int age;
    private String studies ;
    private String student_number;


    public Employee (String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Employee (String name , String lastName , String studies ){

       this.name = name;
       this.lastName = lastName;
       this.studies=studies;

}
public static boolean test (String s){
        boolean numeric = false;
        try{
            int k = Integer.valueOf(s) ;
        }
        catch (java.lang.NumberFormatException e ){
           numeric = true;
        }
    if (s.startsWith("0") || s.length()!= 7 || numeric ){
        return true;

    }
    return false;
}





}


