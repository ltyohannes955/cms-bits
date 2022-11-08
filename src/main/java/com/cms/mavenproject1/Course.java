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
public class Course implements Serializable{
    
    private String Code;
    private String Name;
    private String Description;
    private String Catagory;
    
    public Course(String Code, String Name, String Description){
        this.Code = Code;
        this.Name = Name;
        this.Description = Description;
    }
    public Course(String Code, String Name, String Description, String Catagory){
        this(Code, Name, Description);
        this.Catagory = Catagory;
    }
    public String getCatagory(){
        return Catagory;
    }
    public void setCatagory(String Catagory){
        this.Catagory = Catagory;
    }
    
    public String getCode() {
        return Code;
    }
    public String getName() {
        return Name;
    }
    public String getDescription() {
        return Description;
    }
    public void setCode(String Code) {
        this.Code = Code;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setDescription(String Description) {
        this.Description = Description;
    }
}
