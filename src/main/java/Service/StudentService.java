/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import com.cms.mavenproject1.Student;
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
public class StudentService implements Serializable{
    public void save(Student student) throws IOException {
        String sql = String.format(
        "INSERT INTO student(first_name, last_name, gender, average, grade) VALUES('%s', '%s', '%s','%s','%s')",
                student.getFirst_Name(),
                student.getLast_Name(),
                student.getGender(),
                student.getAverage(),
                student.getGrade());
        DatabaseService service = new DatabaseService();
        service.execute(sql);
    }
    
    public ArrayList<Student> getAll() {
        ArrayList<Student> data = new ArrayList<>();
        String sql = "SELECT * FROM student ORDER BY id";
        DatabaseService service = new DatabaseService();
        
        try(
                Connection conn = service.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
        ){
            while(rs.next()){
                data.add(
                    new Student(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("gender"),
                        rs.getInt("average"),
                        rs.getString("grade")
                    )
                );
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }finally{
            return data;
        }
        
    }
    public void update(Student student, String column, String value){
        String sql = String.format(
                "UPDATE student SET %s='%s' WHERE id=%d",
                column,
                value,
                student.getID()
        );
        DatabaseService service = new DatabaseService();
        service.execute(sql);
    }    
}
