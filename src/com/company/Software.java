package com.company;

import java.util.ArrayList;

public class Software extends Company {
    public Software(String name ){
        this.name = name;
    }
    ArrayList<String> Software = new ArrayList();
    public void SF_Employees() {
        for (int i = 0; i < Software.size(); i++) {
            System.out.println(Software.get(i));
        }
    }
}

