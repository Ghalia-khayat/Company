package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Company {
    String name = "Omniya";

    ArrayList<String> my_employees = new ArrayList();
    public Company()
    {}

    public Company(String name) {
        this.name = name;
    }

    public void allStudents() {
        for (int i = 0; i < my_employees.size(); i++) {

            System.out.println(my_employees.get(i));
        }
    }
}
