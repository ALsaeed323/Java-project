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
/**
 *
 * @author alsae
 */
public class TrainerProcess implements Serializable  {

    

    
    public TrainerProcess() {
    }
    
        public  void writeToFile_Trainer(HashMap<String, Trainer> store) throws IOException {
        try {
            File file = new File("Trainer.bin");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(store);
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
               public  void readFromFile_Trainer() {
           File file = new File("Trainer.bin");
        //HashMap<String, Trainer> temp = new HashMap<String, Trainer>();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            map0 = (HashMap<String, Trainer>) in.readObject();
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }


   public int LogIn(String Username, String Password) {
       // HashMap<String, Trainer> tmap = this.readFromFile_Trainer();
//       for(String key : tmap.keySet()){
//            System.out.println(key);
//}
        //System.out.println("the username is "+Username);
       
        if (map0.containsKey(Username)) {
            if (map0.get(Username).getPassword().equals(Password)) {
                System.out.println("Welcom " + map0.get(Username).getFirst_name());
                return 1;
            } else {
                System.out.println("password incorrect");
                return 2;
            }
        } else {
            System.out.println("username incorrect");
            return 3;
        }
    }
   public void Update_first_name(Trainer emp, String username, String first_name) throws IOException {
          //HashMap<String, Trainer> tmap = this.readFromFile_Trainer();
             emp.setFirst_name(first_name);
        if (map0.containsKey(username)) {
            map0.replace(username, emp);
            this.writeToFile_Trainer(map0);

        }
    }

    public void Update_second_name(Trainer emp, String username, String second_name) throws IOException {
          //HashMap<String, Trainer> tmap = this.readFromFile_Trainer();
        emp.setLast_name(second_name);
        if (map0.containsKey(username)) {
            map0.replace(username, emp);
            this.writeToFile_Trainer(map0);
            
        }
    }

    public void Update_phone(Trainer emp, String username, int phone) throws IOException  {
        //HashMap<String, Trainer> tmap = this.readFromFile_Trainer();
        emp.setPhone(phone);
        if (map0.containsKey(username)) {
            map0.replace(username, emp);
            this.writeToFile_Trainer(map0);
        }
    }


     public void Update_address(Trainer emp, String username, String address) throws IOException {
       // HashMap<String, Trainer> tmap = this.readFromFile_Trainer();
        emp.setAddress(address);
        if (map0.containsKey(username)) {
            map0.replace(username, emp);
                this.writeToFile_Trainer(map0);
           
        }
    }

    public void Update_password(Trainer emp, String username, String password) throws IOException {
       // HashMap<String, Trainer> tmap = this.readFromFile_Trainer();
        emp.setPassword(password);
        if (map0.containsKey(username)) {
            map0.replace(username, emp);
            this.writeToFile_Trainer(map0);
        }
    }
     public StringBuffer display_info(String usernaem,Trainer emp) {
         //HashMap<String, Trainer> tmap = this.readFromFile_Trainer();
         StringBuffer b=new StringBuffer();
       b.append(map0.getOrDefault(usernaem, emp).getUsername());
       b.append("  ");
          b.append(map0.getOrDefault(usernaem, emp).getFirst_name());
          b.append("  ");
          b.append(map0.getOrDefault(usernaem, emp).getLast_name());
            b.append("  ");
          b.append(map0.getOrDefault(usernaem, emp).getAddress());
            b.append("  ");
          b.append(map0.getOrDefault(usernaem, emp).getPassword());
            b.append("  ");
          b.append(map0.getOrDefault(usernaem, emp).getPhone());
            b.append("  ");
          
         // System.out.println(map.getOrDefault(b, emp).getFirst_name());
         
         return b;
   }
   }