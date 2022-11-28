/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.cms.Ui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tito
 */
public class GradeUploadFrameTest extends GradeUploadFrame{
     @Test
    void sixtiyIsF() throws IllegalAccessException{
       var GradeUploadFrame = new GradeUploadFrameTest();
        assertEquals("F", GradeUploadFrame.grade(60));
    }
    @Test
    void seventyIsD() throws IllegalAccessException{
       var GradeUploadFrame = new GradeUploadFrameTest();
        assertEquals("D", GradeUploadFrame.grade(70));
        
    }@Test
    void eightyIsC() throws IllegalAccessException{
       var GradeUploadFrame = new GradeUploadFrameTest();
        assertEquals("C", GradeUploadFrame.grade(80));
        
    }@Test
    void ninetyIsB() throws IllegalAccessException{
       var GradeUploadFrameTest = new GradeUploadFrameTest();
        assertEquals("B", GradeUploadFrameTest.grade(90));
    }
@Test
    void oneHundredIsA() throws IllegalAccessException{
       var GradeUploadFrame = new GradeUploadFrameTest();
        assertEquals("A", GradeUploadFrame.grade(100));
    }   

    
}
