package com.padmaja.flowcontrol;
import java.lang.String;

public class Employee {

    String name = "Employee";

    void printName() {
        System.out.println(name);
    }
}


    class  Programmer extends Employee{
        String name = "Programmer";
        void printName() {
            System.out.println(name);
        }
    }

