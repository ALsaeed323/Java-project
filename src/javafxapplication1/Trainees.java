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
public class Trainees implements Serializable {

   
    public static HashMap<String, Trainee> map = new HashMap<>();
    // private  HashMap<String, Trainee> map=this.readFromFile();

    public Trainees() {

    }

    public HashMap<String, Trainee> getMap() {
        return map;
    }

    public int addTrainee(Trainee emp) throws IOException {
        if (map.containsKey(emp.getUsername())) {
            System.out.println("User alredy exists");
            return 2;
        } else {
            map.put(emp.getUsername(), emp);
            this.writeToFile(map);
            return 1;
        }
    }

    public void writeToFile(HashMap<String, Trainee> store) throws IOException {
        try {
            File file = new File("Trainees.bin");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(store);
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void readFromFile() {
        File file = new File("Trainees.bin");
        //HashMap<String, Trainee> temp = new HashMap<String, Trainee>();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            map = (HashMap<String, Trainee>) in.readObject();
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void LogIn(String Username, String Password) {
        if (map.containsKey(Username)) {
            if (map.get(Username).getPassword().equals(Password)) {
                System.out.println("Welcom " + map.get(Username).getFirst_name());
            } else {
                System.out.println("password incorrect");
            }
        } else {
            System.out.println("username incorrect");
        }
    }
    //HashMap<String, Trainee> tmap = this.readFromFile();
//       for(String key : map.keySet()){
//            System.out.println(key);

    //System.out.println("the username is "+Username);
    public void Update_first_name(Trainee emp, String username, String first_name) throws IOException {
        // HashMap<String, Trainee> tmap = this.readFromFile();
        emp.setFirst_name(first_name);
        if (map.containsKey(username)) {
            map.replace(username, emp);
            this.writeToFile(map);

        }
    }

    public void Update_second_name(Trainee emp, String username, String second_name) throws IOException {
        //HashMap<String, Trainee> tmap = this.readFromFile();
        emp.setSecond_name(second_name);
        if (map.containsKey(username)) {
            map.replace(username, emp);
            this.writeToFile(map);

        }
    }

    public void Update_phone(Trainee emp, String username, int phone) throws IOException {
        //HashMap<String, Trainee> tmap = this.readFromFile();
        emp.setPhone(phone);
        if (map.containsKey(username)) {
            map.replace(username, emp);
            this.writeToFile(map);
        }
    }

    public void Update_address(Trainee emp, String username, String address) throws IOException {
        //HashMap<String, Trainee> tmap = this.readFromFile();
        emp.setAddres(address);
        if (map.containsKey(username)) {
            map.replace(username, emp);

            this.writeToFile(map);

        }
    }

    public void Update_password(Trainee emp, String username, String password) throws IOException {
        // HashMap<String, Trainee> tmap = this.readFromFile();
        emp.setPassword(password);
        if (map.containsKey(username)) {
            map.replace(username, emp);
            this.writeToFile(map);
        }
    }

    public StringBuffer display_info(String usernaem, Trainee emp) {
        //HashMap<String, Trainee> tmap = this.readFromFile();
        StringBuffer b = new StringBuffer();
        b.append(map.getOrDefault(usernaem, emp).getUsername());
        b.append("  ");
        b.append(map.getOrDefault(usernaem, emp).getFirst_name());
        b.append("  ");
        b.append(map.getOrDefault(usernaem, emp).getSecond_name());
        b.append("  ");
        b.append(map.getOrDefault(usernaem, emp).getPakage());
        b.append("  ");
        b.append(map.getOrDefault(usernaem, emp).getAddres());
        b.append("  ");
        b.append(map.getOrDefault(usernaem, emp).getPassword());
        b.append("  ");
        b.append(map.getOrDefault(usernaem, emp).getPhone());
        b.append("  ");
        b.append(map.getOrDefault(usernaem, emp).getSupp());
        b.append("  ");
        b.append(map.getOrDefault(usernaem, emp).isActive());
        b.append("  ");
        // System.out.println(map.getOrDefault(b, emp).getFirst_name());

        return b;
    }

    public StringBuffer display_allpak() {
       // HashMap<Integer, Package> tmap = emp.readFromFile_pack();
        StringBuffer b = new StringBuffer();
                 
        for (Integer key : pak.keySet()) {
            //System.out.println("the key is"+key);
            b.append(pak.get(key).toString(key));
            b.append("   ");
        }
        return b;
        
    }

    public void select_pakage(Package p, Trainee emp, int key) throws IOException {
        //HashMap<Integer, Package> pak = p.readFromFile_pack();

        StringBuffer temp = new StringBuffer();
        if (pak.containsKey(key)) {
            temp.append(pak.getOrDefault(key, p).getP_id());
            temp.append("   ");
            temp.append(pak.getOrDefault(key, p).getCost());
            temp.append("   ");
            temp.append(pak.getOrDefault(key, p).getDiscrption());
            temp.append("   ");
            temp.append(pak.getOrDefault(key, p).getRecommendatin());
            temp.append("   ");
            //System.out.println(temp);
            emp.setPakage(temp);
            map.put(emp.getUsername(), emp);
            this.writeToFile(map);

        } else {
            System.out.println("The package is not exist ");
        }
    }

    public void changPak(Package p, Trainee emp, int newkey) throws IOException {
       // HashMap<Integer, Package> pak = p.readFromFile_pack();
        StringBuffer temp = new StringBuffer();
        if (pak.containsKey(newkey)) {
            temp.append(pak.getOrDefault(newkey, p).getP_id());
            temp.append("   ");
            temp.append(pak.getOrDefault(newkey, p).getCost());
            temp.append("   ");
            temp.append(pak.getOrDefault(newkey, p).getDiscrption());
            temp.append("   ");
            temp.append(pak.getOrDefault(newkey, p).getRecommendatin());
            temp.append("   ");
            //System.out.println(temp);
            emp.setPakage(temp);
            map.put(emp.getUsername(), emp);
            this.writeToFile(map);

        } else {
            System.out.println("The package is not exist ");
        }
    }

    public StringBuffer display_allsupp( ) {
      //  HashMap<Integer, Supplement> tmap = emp.readFromFile_supp();
         StringBuffer b = new StringBuffer();
                 
        for (Integer key : supp.keySet()) {
            //System.out.println("the key is"+key);
            b.append(supp.get(key).toString(key));
            b.append("   ");
        }
        return b;
       
    }

    public void select_supp(Supplement s, Trainee emp, int key) throws IOException {
      //  HashMap<Integer, Supplement> supp = s.readFromFile_supp();
        StringBuffer temp = new StringBuffer();
        if (supp.containsKey(s.getS_id())) {
            temp.append(supp.getOrDefault(s.getS_id(), s).getS_id());
            temp.append("   ");
            temp.append(supp.getOrDefault(s.getS_id(), s).getCost());
            temp.append("   ");
            temp.append(supp.getOrDefault(s.getS_id(), s).getS_discreption());
            temp.append("   ");
            temp.append(supp.getOrDefault(s.getS_id(), s).getS_recommendation());
            temp.append("   ");
            //System.out.println(temp);
            emp.setSupp(temp);
            map.put(emp.getUsername(), emp);
            this.writeToFile(map);

        } else {
            System.out.println("The package is not exist ");
        }

    }

    public void changsupp(Supplement s, Trainee emp, int newkey) throws IOException {
       // HashMap<Integer, Supplement> supp = s.readFromFile_supp();
        StringBuffer temp = new StringBuffer();
        if (supp.containsKey(newkey)) {
            temp.append(supp.getOrDefault(newkey, s).getS_id());
            temp.append("   ");
            temp.append(supp.getOrDefault(newkey, s).getCost());
            temp.append("   ");
            temp.append(supp.getOrDefault(newkey, s).getS_discreption());
            temp.append("   ");
            temp.append(supp.getOrDefault(newkey, s).getS_recommendation());
            temp.append("   ");
            //System.out.println(temp);
            emp.setSupp(temp);
            map.put(emp.getUsername(), emp);
            this.writeToFile(map);

        } else {
            System.out.println("The package is not exist ");
        }
    }

    public boolean payCredit(String username, int cardNum, int Expday, int Expmon, String type, double amount, PayCredit c, Trainee emp) throws IOException {
        //HashMap<String, Trainee> tmap = this.readFromFile();

        emp.setActive(true);
        map.put(username, emp);
        this.writeToFile(map);
        return c.pay(cardNum, Expday, Expmon, type, amount);

    }
}
