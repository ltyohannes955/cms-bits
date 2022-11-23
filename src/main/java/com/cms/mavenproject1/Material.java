/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cms.mavenproject1;

import java.io.Serializable;

/**
 *
 * @author samab
 */
public class Material implements Serializable{
    private String File_path;
    private String course;
    private String File_name;
    
    public Material(String File_path, String course, String File_name){
        this.File_path = File_path;
        this.course= course;
        this.File_name= File_name;
    }




    public String getFile_path() {
        return File_path;
    }

    public void setFile_path(String File_path) {
        this.File_path = File_path;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFile_name() {
        return File_name;
    }

    public void setFile_name(String File_name) {
        this.File_name = File_name;
    }
}
