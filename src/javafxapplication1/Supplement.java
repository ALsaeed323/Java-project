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
import static javafxapplication1.AdminProcess.pak;
import static javafxapplication1.AdminProcess.supp;

/**
 *
 * @author alsae
 */
public class Supplement implements Serializable {
  private int s_id ;
    private String  s_discreption;
    private int cost ;
    private String s_recommendation ;

    public Supplement() {
    }

    public Supplement(int s_id, String s_discreption, int cost, String s_recommendation) {
        this.s_id = s_id;
        this.s_discreption = s_discreption;
        this.cost = cost;
        this.s_recommendation = s_recommendation;
    }

    public int getS_id() {
        return s_id;
    }

    public String getS_discreption() {
        return s_discreption;
    }

    public int getCost() {
        return cost;
    }

    public String getS_recommendation() {
        return s_recommendation;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public void setS_discreption(String s_discreption) {
        this.s_discreption = s_discreption;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setS_recommendation(String s_recommendation) {
        this.s_recommendation = s_recommendation;
    }
    
    
      public void writeToFile_supp(HashMap<Integer, Supplement> store) throws IOException {
        try {
            File file = new File("supp.bin");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(store);
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void readFromFile_supp() {
       
        //HashMap<Integer, Supplement> temp = new HashMap<Integer, Supplement>();
        try {
             File file = new File("supp.bin");
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            supp = (HashMap<Integer, Supplement>) in.readObject();
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    Object toString(Integer key) {
        StringBuffer b = new StringBuffer();
        b.append(supp.get(key).getS_id());
        b.append("  ");
         b.append(supp.get(key).getS_discreption());
        b.append("  ");
         b.append(supp.get(key).getS_recommendation());
        b.append("  ");
         b.append(supp.get(key).getCost());
        b.append("  ");
        return b; 
    }
}
