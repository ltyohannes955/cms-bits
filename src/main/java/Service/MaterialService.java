/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import base.AppendableObjectOutputStream;
import com.cms.mavenproject1.Material;
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
public class MaterialService {
    private final String filename = "materials.obj";
    
    public void save(Material material) throws IOException {
        File f = new File(filename);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            if (f.exists()) {
                fos = new FileOutputStream(filename, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(filename);
                oos = new ObjectOutputStream(fos);
            }
            
            oos.writeObject(material);
            
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
    
    public ArrayList<Material> getAll() {
        boolean eof = false;
        ArrayList<Material> data = new ArrayList<>();
        
        try (
                FileInputStream fis = new FileInputStream(filename);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
                Material material;
                
                while (!eof){
                    material = (Material)ois.readObject();
                    if (material != null) {
                        data.add(material);
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
    
    public void writeAll(List<Material> materials) {
        try {
            try (FileOutputStream fos = new FileOutputStream(filename);
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (Material material: materials) {
                    oos.writeObject(material);
                }
            }
        } catch (IOException ex){
            
        }
    }    
    
}
