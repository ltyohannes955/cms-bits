/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import base.AppendableObjectOutputStream;
import com.cms.mavenproject1.Course;
import com.cms.mavenproject1.Material;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author samab
 */
public class CourseService implements Serializable{
    
    public void save(Course course) throws IOException {
        String sql = String.format(
        "INSERT INTO course(course_name, description, catagory) VALUES('%s', '%s', '%s')",
                course.getName(),
                course.getDescription(),
                course.getCatagory());
        DatabaseService service = new DatabaseService();
        service.execute(sql);
    }
    
    public ArrayList<Course> getAll() {
        ArrayList<Course> data = new ArrayList<>();
        String sql = "SELECT * FROM course ORDER BY id";
        DatabaseService service = new DatabaseService();
        
        try(
                Connection conn = service.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
        ){
            while(rs.next()){
                data.add(
                    new Course(
                        rs.getInt("id"),
                        rs.getString("course_name"),
                        rs.getString("description"),
                        rs.getString("catagory")
                    )
                );
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }finally{
            return data;
        }
        
    }
    public void update(Course course, String column, String value){
        String sql = String.format(
                "UPDATE course SET %s='%s' WHERE id=%d",
                column,
                value,
                course.getID()
        );
        DatabaseService service = new DatabaseService();
        service.execute(sql);
    }
}
