/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.cms.Ui;

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
public class GradeUploadFrameTest extends GradeUploadFrame{
    
    public GradeUploadFrameTest() {
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
     * Test of grade method, of class GradeUploadFrame.
     */
    @Test
    void sixtiyIsF() throws IllegalAccessException{
       var GradeUploadFrame = new GradeUploadFrame();
        assertEquals("F", GradeUploadFrame.grade(60));
    }
    @Test
    void seventyIsD() throws IllegalAccessException{
       var GradeUploadFrame = new GradeUploadFrame();
        assertEquals("D", GradeUploadFrame.grade(70));
        
    }@Test
    void eightyIsC() throws IllegalAccessException{
       var GradeUPloadFrame = new GradeUploadFrame();
        assertEquals("C", GradeUPloadFrame.grade(80));
        
    }@Test
    void ninetyIsB() throws IllegalAccessException{
       var gradeTable = new GradeUploadFrame();
        assertEquals("B", gradeTable.grade(90));
    }
    @Test
    void oneHundredIsA() throws IllegalAccessException{
       var GradeUploadFrame = new GradeUploadFrame();
        assertEquals("A", GradeUploadFrame.grade(100));
    }
    
       
}
