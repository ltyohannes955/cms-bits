/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cms.mavenproject1;

/**
 *
 * @author samab
 */
public class Enroll {
    private Student student;
    private Course course;


    public void setStudents(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
    public void setCourse(Course course){
        this.course = course;
    }
    public Course getCourse(){
        return course;
    }
}
