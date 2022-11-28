/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cms.mavenproject1;

/**
 *
 * @author samab
 */
public class Student {
    private int ID;
    private String fname;
    private String lname;
    private String Gender;
    private int Average;
    private String Grade;

    public Student(){
    }
    public Student( int ID,String fname, String lname, String Gender){
        this.ID = ID;
        this.fname = fname;
        this.lname = lname;
        this.Gender = Gender;
    }
    public Student ( String fname, String lname, String Gender, int Average, String Grade ){
        this.fname= fname;
        this.lname = lname;
        this.Gender = Gender;
        this.Average = Average;
        this.Grade = Grade;
    }
    public Student ( int ID, String fname, String lname, String Gender, int Average, String Grade ){
        this.ID = ID;
        this.fname= fname;
        this.lname = lname;
        this.Gender = Gender;
        this.Average = Average;
        this.Grade = Grade;
    }    
    public int getID(){
        return ID;
    }
    public String getFirst_Name(){
        return fname;
    }
    public String getLast_Name(){
        return lname;
    }
    public String getGender(){
        return Gender;
    }
    public int getAverage(){
        return Average;
    }
    public String getGrade(){
        return Grade;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFirstName(String fname) {
        this.fname = fname;
    }

    public void setLastName(String lname) {
        this.lname = lname;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setAverage(int Average) {
        this.Average = Average;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }
    
    
}
