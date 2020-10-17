package com.company;

import java.util.ArrayList;

public class DataBase extends Company {
    public DataBase (String name)
    {
        this.name = name;
    }
    ArrayList<String> DataBase = new ArrayList();

    public void DB_Employees() {
        for (int i = 0; i < DataBase.size(); i++) {
            System.out.println(DataBase.get(i));
        }
    }
    public void Delete( Employee e1 ){

        if(DataBase.contains(e1)){
        int e = DataBase.indexOf(e1);
        System.out.println("Employee will be deleted , just wait a moment ");
        DataBase.remove(e1);

        }

    }
}