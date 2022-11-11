/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import com.cms.mavenproject1.Material;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author samab
 */
public class MaterialService implements Serializable{
    
    public void add(Material material) throws IOException {
        String sql = String.format(
        "INSERT INTO material(file_name,file_path, course_name) VALUES('%s', '%s', '%s')",
                material.getfName(),
                material.getpath(),
                material.getCourse());
        DatabaseService service = new DatabaseService();
        service.execute(sql);
    }
    public ArrayList<Material> getAll(){
        ArrayList<Material> data = new ArrayList<>();
        String sql = "SELECT * FROM material ORDER BY id";
        DatabaseService service = new DatabaseService();
    
        try(
                Connection conn = service.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
        ){
            while(rs.next()){
                data.add(
                    new Material(
                        rs.getString(""),
                        rs.getString(""),
                        rs.getString("")
                    )
                );
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }finally{
            return data;
        }
    }
    
    public void update(Material material, String column, String value){
        String sql = String.format(
                "UPDATE material SET %s='%s' WHERE id=%d",
                column,
                value,
                material.getID()
        );
        DatabaseService service = new DatabaseService();
        service.execute(sql);
    }
}
