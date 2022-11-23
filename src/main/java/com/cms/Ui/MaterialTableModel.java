/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cms.Ui;

import Service.MaterialService;
import com.cms.mavenproject1.Material;
import com.cms.mavenproject1.Util;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author samab
 */
public class MaterialTableModel extends AbstractTableModel {
    List<Material> materials = new ArrayList<>();
    String columnNames[] = {"File Name","File Path", "Course"};
    Class<?> columnClasses[] = {String.class, String.class, String.class};
    
    Map fieldMap = new HashMap();
    
    MaterialTableModel(){
        fieldMap.put(0, "File Name");
        fieldMap.put(1, "File Path");
        fieldMap.put(2, "Course");
    }

    @Override
    public int getRowCount() {
        return materials.size();
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
        Method method = Util.getByMethodName(materials.get(rowIndex), methodName);
        return (String) Util.callMethod(method, materials.get(rowIndex));
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
        Method method = Util.getByMethodName(materials.get(rowIndex), methodName, String.class);
        Util.callMethod(method, materials.get(rowIndex), aValue);

        fireTableCellUpdated(rowIndex, columnIndex);
        
        MaterialService service = new MaterialService();
        service.writeAll(materials);    
    }
    
    
}
