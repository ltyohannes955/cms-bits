/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cms.Ui;

import Service.CourseService;
import com.cms.mavenproject1.Course;
import com.cms.mavenproject1.Util;
import java.awt.List;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author samab
 */
public class CourseTableModel extends AbstractTableModel {
    java.util.List<Course> courses = new ArrayList<>();
    String columnNames[] = {"Course Code","Name","Description","Catagory"};
    
    Class<?> columnClasses[] = {String.class, String.class, String.class, String.class};
    
    Map fieldMap = new HashMap();
    
    CourseTableModel(){
        fieldMap.put(0, "Course Code");
        fieldMap.put(1, "Name");
        fieldMap.put(2,"Description");
        fieldMap.put(3, "Catagory");
    }

    @Override
    public int getRowCount() {
        return courses.size();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        var methodName = String.format("get%s", (String) fieldMap.get(columnIndex));
        Method method = Util.getByMethodName(courses.get(rowIndex), methodName);
        return (String) Util.callMethod(method, courses.get(rowIndex));
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClasses[columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex != 0;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        var methodName = String.format("set%s", (String) fieldMap.get(columnIndex));
        Method method = Util.getByMethodName(courses.get(rowIndex), methodName, String.class);
        Util.callMethod(method, courses.get(rowIndex), aValue);

        fireTableCellUpdated(rowIndex, columnIndex);
        
        CourseService service = new CourseService();
        service.writeAll(courses);
    }
    
    
    
}
