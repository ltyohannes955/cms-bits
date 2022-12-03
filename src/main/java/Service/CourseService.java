/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import base.AppendableObjectOutputStream;
import com.cms.mavenproject1.Course;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author samab
 */
public class CourseService {
    private final String fname = "courses.obj";
    
    public void save(Course course) throws IOException {
        File f = new File(fname);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            if (f.exists()) {
                fos = new FileOutputStream(fname, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(fname);
                oos = new ObjectOutputStream(fos);
            }
            
            oos.writeObject(course);
            
            oos.close();
            fos.close();
        }finally {
            if (oos != null){
                oos.close();
            }
            if (fos != null){
                fos.close();
            }                            
        }
    }
    
    public ArrayList<Course> getAll() {
        boolean eof = false;
        ArrayList<Course> data = new ArrayList<>();
        
        try (
                FileInputStream fis = new FileInputStream(fname);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
                Course course;
                
                while (!eof){
                    course = (Course)ois.readObject();
                    if (course != null) {
                        data.add(course);
                    } else {
                        eof = true;
                    }
                }
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            return data;
        }
    }
    
    public void writeAll(List<Course> courses) {
        try {
            try (FileOutputStream fos = new FileOutputStream(fname);
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (Course course: courses) {
                    oos.writeObject(course);
                }
            }
        } catch (IOException ex){
            
        }
    }
}
