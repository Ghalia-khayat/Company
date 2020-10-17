package com.company;

import java.util.ArrayList;

public class Networks extends Company {
    public Networks (String name ){
        this.name = name;
    }
    ArrayList<String> Networks = new ArrayList();

    public void NW_Employees() {
        for (int i = 0; i < Networks.size(); i++) {
            System.out.println(Networks.get(i));
        }
    }
}



