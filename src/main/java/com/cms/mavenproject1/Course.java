/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cms.mavenproject1;

/**
 *
 * @author samab
 */
public class Course {
    
    private String Id;
    private String Name;
    private String Description;
    
    public Course(String Id, String Name, String Description){
        this.Id = Id;
        this.Name = Name;
        this.Description = Description;
    }

    public String getId() {
        return Id;
    }
    public String getName() {
        return Name;
    }
    public String getDescription() {
        return Description;
    }
    public void setId(String id) {
        Id = id;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setDescription(String description) {
        Description = description;
    }
}
