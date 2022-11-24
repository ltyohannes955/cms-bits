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
public class MaterialTest {
    
    public MaterialTest() {
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
     * Test of getID method, of class Material.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Material instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Material.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int id = 0;
        Material instance = null;
        instance.setID(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getpath method, of class Material.
     */
    @Test
    public void testGetpath() {
        System.out.println("getpath");
        Material instance = null;
        String expResult = "";
        String result = instance.getpath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setpath method, of class Material.
     */
    @Test
    public void testSetpath() {
        System.out.println("setpath");
        String path = "";
        Material instance = null;
        instance.setpath(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourse method, of class Material.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Material instance = null;
        String expResult = "";
        String result = instance.getCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourse method, of class Material.
     */
    @Test
    public void testSetCourse() {
        System.out.println("setCourse");
        String course = "";
        Material instance = null;
        instance.setCourse(course);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getfName method, of class Material.
     */
    @Test
    public void testGetfName() {
        System.out.println("getfName");
        Material instance = null;
        String expResult = "";
        String result = instance.getfName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setfName method, of class Material.
     */
    @Test
    public void testSetfName() {
        System.out.println("setfName");
        String fname = "";
        Material instance = null;
        instance.setfName(fname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
