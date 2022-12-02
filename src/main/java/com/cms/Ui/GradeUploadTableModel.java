/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cms.Ui;

import Service.StudentService;
import com.cms.mavenproject1.Student;
import com.cms.mavenproject1.Util;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author samab
 */
public class GradeUploadTableModel extends AbstractTableModel {
    java.util.List<Student> students =  new ArrayList<>();
    String columnNames [] = {"ID","First_Name", "Last_Name", "Gender", "Average", "Grade"};
    
    Class<?> columnClasses[] = {int.class, String.class, String.class, String.class, int.class, String.class};
    
    Map fieldMap = new HashMap();
    
    GradeUploadTableModel(){
        fieldMap.put(0, "ID");
        fieldMap.put(1, "First_Name");
        fieldMap.put(2, "Last_Name");
        fieldMap.put(3, "Gender");
        fieldMap.put(4, "Average");
        fieldMap.put(5, "Grade");

    }
    
    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        var methodName = String.format("get%s", (String) fieldMap.get(columnIndex));
        Method method = Util.getByMethodName(students.get(rowIndex), methodName);
        Object result = Util.callMethod(method, students.get(rowIndex));   
        return columnIndex == 0 || columnIndex == 4 ? (int)result : (String) result;
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
        Student student = students.get(rowIndex);
        String column = (String) fieldMap.get(columnIndex);
        var methodName = String.format("set%s", (String) fieldMap.get(columnIndex));
        Method method = Util.getByMethodName(students.get(rowIndex), methodName, String.class);
        Util.callMethod(method, students.get(rowIndex), aValue);

        fireTableCellUpdated(rowIndex, columnIndex);
        
        StudentService service = new StudentService();
        service.update(student ,column, (String) aValue);
    }    
}
