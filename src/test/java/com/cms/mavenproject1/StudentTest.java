/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.cms.mavenproject1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author samab
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getID method, of class Student.
     */
    @Test
    public void testGetID() {
        System.out.println("getID()");
        Student instance = new Student(1234,"Ahmed","mohamed","male");
        int expResult = 1234;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst_Name method, of class Student.
     */
    @Test
    public void testGetFirst_Name() {
        System.out.println("getFirst_Name()");
        Student instance = new Student(1234,"Samuel","Abera","male");
        String expResult = "Samuel";
        String result = instance.getFirst_Name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLast_Name method, of class Student.
     */
    @Test
    public void testGetLast_Name() {
        System.out.println("getLast_Name()");
        Student instance = new Student(3456,"Bereket","Tesfaye","male");
        String expResult = "Tesfaye";
        String result = instance.getLast_Name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class Student.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender()");
        Student instance = new Student(9990,"Leul","Yohannes","male");
        String expResult = "male";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAverage method, of class Student.
     */
    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        Student instance = new Student(9990,"Sara","Fitsum","female",88,"A");
        int expResult = 88;
        int result = instance.getAverage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGrade method, of class Student.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade()");
        Student instance = new Student(9876,"Mahlet","Girma","female",98,"A");
        String expResult = "A";
        String result = instance.getGrade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Student.
     */
    @Test
    public void testSetID() {
        System.out.println("setID()");
        int ID = 5555;
        Student instance = new Student(9120,"Hana","Yohannes","female");
        instance.setID(ID);
        int expResult = 5555;
        int result = instance.getID();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of setFirst_Name method, of class Student.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirst_Name");
        String fname = "Kebede";
        Student instance = new Student(9990,"Leul","Yohannes","male");
        String expResult = "Kebede";
        instance.setFirstName(fname);
        String result = instance.getFirst_Name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLast_Name method, of class Student.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLast_Name");
        String lname = "sam";
        Student instance = new Student(7650,"kaleab","Yohannes","male");
        String expResult = "sam";
        instance.setLastName(lname);
        String result = instance.getLast_Name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class Student.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String Gender = "male";
        Student instance = new Student(1230,"Habib","Temam","male");
        String expResult = "male";
        instance.setGender(Gender);
        String result = instance.getGender();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAverage method, of class Student.
     */
    @Test
    public void testSetAverage() {
        System.out.println("setAverage");
        int Average = 77;
        Student instance = new Student(9990,"Leul","Yohannes","male",55,"D");
        int expResult = 77;
        instance.setAverage(Average);
        int result = instance.getAverage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGrade method, of class Student.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        String Grade = "B";
        Student instance = new Student(3450,"Sifen","Yohannes","male",67,"C");
        String expResult = "B";
        instance.setGrade(Grade);
        String result = instance.getGrade();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
