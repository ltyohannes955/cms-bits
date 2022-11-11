/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cms.mavenproject1;

/**
 *
 * @author samab
 */
public class Material {
    private int id;
    private String path;
    private String course;
    private String fname;
    
    
    public Material(String path , String course, String fname){
        this.path = path;
        this.course = course;
        this.fname = fname;
    }
    public Material(int id, String path, String course, String fname){
        this(path, course, fname);
        this.id = id;
    }
    
    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id = id;
    }
    public String getpath() {
        return path;
    }

    public void setpath(String path) {
        this.path = path;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getfName() {
        return fname;
    }

    public void setfName(String fname) {
        this.fname = fname;
    }
}
