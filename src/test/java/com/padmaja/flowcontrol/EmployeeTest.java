package com.padmaja.flowcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.lang.String;
import static org.junit.Assert.*;


public class EmployeeTest {

    private Employee employee;
    private Programmer programmer;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("set up class");
        // ForLoopExample forLoopExample = new ForLoopExample();
    }

    @Before
    public void setUp() {
        employee = new Employee();
        programmer = new Programmer();
    }

    @After
    public void tearDown() {
        System.out.println("tear down");
        employee = null;
    }

    @Test
    public void inheritanceExample() {
        System.out.println(employee.name);
        System.out.println(programmer.name);
        employee.printName();
        programmer.printName();

        //System.out.println(result);
        //int expectedresult = 6;
        //assertEquals(expectedresult,result);
    }

    @Test
    public void inheritanceExample11() {
        //System.out.println(employee.name);
        //System.out.println(programmer.name);
        employee.printName();
        programmer.printName();

        //System.out.println(result);
        //int expectedresult = 6;
        //assertEquals(expectedresult,result);
    }




}

