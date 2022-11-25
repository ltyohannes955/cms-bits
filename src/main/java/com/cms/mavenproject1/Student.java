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
    private String First_Name;
    private String Last_Name;
    private String Gender;
    private int Average;
    private String Grade;

    public Student(){
    }
    public Student( int ID,String First_Name, String Last_Name, String Gender){
        this.ID = ID;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Gender = Gender;
    }
    public Student (int ID, String First_Name, String Last_Name, String Gender, int Average, String Grade ){
        this(ID, First_Name, Last_Name, Gender);
        this.Average = Average;
        this.Grade = Grade;
    }
    
    public int getID(){
        return ID;
    }
    public String getFirst_Name(){
        return First_Name;
    }
    public String getLast_Name(){
        return Last_Name;
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
}
