package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Company com = new Company("Omniya");
        DataBase com1 = new DataBase("DataBase");
        Software com2 = new Software("Software");
        Networks com3 = new Networks("Networks");
        Employee emp = new Employee(" ", " ");

        System.out.println("Choose a section ");
        System.out.println("1-DataBase");
        System.out.println("2-Software");
        System.out.println("3-Networks");
        int n = sc.nextInt();

        System.out.println("Choose an operation ");
        System.out.println("1-Add an employee");
        System.out.println("2-Show all employees in the section");
        System.out.println("3-Delete an employee");
        System.out.println("4-Show all the employees in the Company");
        int o = sc.nextInt();


        if (n == 1) {
            System.out.println("We are now in DataBase Section");

            switch (o) {
                case 1:

                    System.out.println("How many Employees do you want to add ? ");
                    int m = sc.nextInt();
                    for (int i = 0; i < m; i++) {
                        System.out.println("Enter Employee name: ");
                        String a = sc.next();
                        System.out.println("Enter Employee's last name: ");
                        String b = sc.next();
                        Employee emp1 = new Employee(a, b);

                        com.my_employees.add(i, a + b);
                        com1.DataBase.add(i, a + b);
                        System.out.println("Employee is added successfully ! ");
                    }
                    break;


                case 2:
                    System.out.println("All Employees in DataBase :");
                    com1.DB_Employees();
                    break;

                case 3:
                    System.out.println("Enter employee number ");
                    String a = sc.next();
                    com1.DataBase.remove(a);
                    break;
                case 4 :
                    com.allStudents();
            }
        }
    }
}







