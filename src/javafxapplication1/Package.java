/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import static javafxapplication1.AdminProcess.map0;
import static javafxapplication1.AdminProcess.pak;

/**
 *
 * @author alsae
 */
public class Package implements Serializable{
   private int p_id;
    private String discrption;
    private int cost;
    private String recommendatin;

    public Package() {
    }

    public Package(int p_id, String discrption, int cost, String recommendatin) {
        this.p_id = p_id;
        this.discrption = discrption;
        this.cost = cost;
        this.recommendatin = recommendatin;
    }

   
    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public void setDiscrption(String discrption) {
        this.discrption = discrption;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setRecommendatin(String recomendatin) {
        this.recommendatin = recomendatin;
    }

    public int getP_id() {
        return p_id;
    }

    public String getDiscrption() {
        return discrption;
    }

    public int getCost() {
        return cost;
    }

    public String getRecommendatin() {
        return recommendatin;
    }
    
     public void writeToFile_pack(HashMap<Integer, Package> store) throws IOException {
        try {
            File file = new File("package.bin");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(store);
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void readFromFile_pack() {
        
       // HashMap<Integer, Package> temp = new HashMap<Integer, Package>();
        try {
            File file = new File("package.bin");
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            pak = (HashMap<Integer, Package>) in.readObject();
            //System.out.println(pak.keySet());
            System.out.println("sddfghjfg");
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    Object toString(Integer key) {
        StringBuffer b = new StringBuffer();
        b.append(pak.get(key).getP_id());
        b.append("  ");
         b.append(pak.get(key).getDiscrption());
        b.append("  ");
         b.append(pak.get(key).getRecommendatin());
        b.append("  ");
         b.append(pak.get(key).getCost());
        b.append("  ");
        return b;
    }
    
}
