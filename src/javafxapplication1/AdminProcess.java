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
import static javafxapplication1.Trainees.map;

/**
 *
 * @author alsae
 */
public class AdminProcess implements Serializable {

    public String username_admin;
    private HashMap<String, Admin> map1 = new HashMap<>();
    public static HashMap<String, Trainer> map0 = new HashMap<>();
    public static HashMap<Integer, Package> pak = new HashMap();
    public static HashMap<Integer, Supplement> supp = new HashMap();

    public AdminProcess() {

    }

    public HashMap<String, Trainer> getMap0Trainer() {
        return map0;
    }

    public HashMap<String, Admin> getMap1Admin() {
        return map1;
    }

    public HashMap<Integer, Package> getPak() {
        return pak;
    }

    public static HashMap<Integer, Supplement> getSupp() {
        return supp;
    }

    public void addAdmin(Admin mp) throws IOException {
        if (map1.containsKey(mp.getUsername())) {
            System.out.println("User alredy exists");
            return;
        } else {
            map1.put(mp.getUsername(), mp);
            this.writeToFile_Admin(map1);
        }
    }

    public void Update_first_name(Admin emp, String username, String first_name) throws IOException {
        // HashMap<String, Trainee> tmap = this.readFromFile();
        emp.setFirst_name(first_name);
        if (map1.containsKey(username)) {
            map1.replace(username, emp);
            this.writeToFile_Admin(map1);

        }
    }

    public void Update_second_name(Admin emp, String username, String second_name) throws IOException {
        //HashMap<String, Trainee> tmap = this.readFromFile();
        emp.setLast_name(second_name);
        if (map1.containsKey(username)) {
            map1.replace(username, emp);
            this.writeToFile_Admin(map1);

        }
    }

    public void Update_phone(Admin emp, String username, int phone) throws IOException {
        //HashMap<String, Trainee> tmap = this.readFromFile();
        emp.setPhone(phone);
        if (map1.containsKey(username)) {
            map1.replace(username, emp);
            this.writeToFile_Admin(map1);
        }
    }

    public void Update_address(Admin emp, String username, String address) throws IOException {
        //HashMap<String, Trainee> tmap = this.readFromFile();
        emp.setAddress(address);
        if (map1.containsKey(username)) {
            map1.replace(username, emp);

            this.writeToFile_Admin(map1);

        }
    }

    public void Update_password(Admin emp, String username, String password) throws IOException {
        // HashMap<String, Trainee> tmap = this.readFromFile();
        emp.setPassword(password);
        if (map1.containsKey(username)) {
            map1.replace(username, emp);
            this.writeToFile_Admin(map1);
        }
    }

    public int  addTrainer(Trainer tmp, TrainerProcess s) throws IOException {
        //HashMap<String, Trainer> tmap = s.readFromFile_Trainer();
        if (map0.containsKey(tmp.getUsername())) {
           // System.out.println("User alredy exists");
            return 2;
        } else {
            map0.put(tmp.getUsername(), tmp);
            s.writeToFile_Trainer(map0);
            return 1;
        }
    }

    public StringBuffer display_all_trainers() {
        // emp.readFromFile_Trainer();
        //HashMap<String, Trainer> tmap = emp.readFromFile_Trainer();
        StringBuffer b = new StringBuffer();

//              
        for (String key : map0.keySet()) {
            //System.out.println("the key is"+key);
            b.append(map0.get(key).toString(key));
            b.append("   ");
        }
        return b;
    }

    public StringBuffer display_all_trainees() {
       // emp.readFromFile();
        //System.out.println(emp.getMap().entrySet());
        StringBuffer b = new StringBuffer();

        //System.out.println(emp.getMap().keySet());
//              
        for (String key : map.keySet()) {
            //System.out.println(key);
            b.append(map.get(key).toString(key));
            b.append("   ");
        }
        return b;

    }

    public int delete_Trainer(Trainer n, TrainerProcess s, String username) throws IOException {
        s.readFromFile_Trainer();
        //HashMap<String, Trainer> tmap = s.readFromFile_Trainer();
        if (map0.containsKey(username)) {
            map0.remove(username);
            
            s.writeToFile_Trainer(map0);
            return 1;
        } else {
            System.out.println("The Trainer is not esists to delete it ");
            return 2;
        }
    }

    public void delete_Trainee(Trainee n, Trainees s, String username) throws IOException {
        s.readFromFile();
        if (s.getMap().containsKey(username)) {
            s.getMap().remove(username);
            map0.remove(username);
            s.writeToFile(s.getMap());
            return;
        } else {
            System.out.println("The Trainer is not esists to delete it ");
        }
    }

    public StringBuffer display_info(String usernaem, Admin emp) {
        StringBuffer b = new StringBuffer();

        b.append(map1.getOrDefault(usernaem, emp).getUsername());
        b.append("  ");
        b.append(map1.getOrDefault(usernaem, emp).getFirst_name());
        b.append("  ");
        b.append(map1.getOrDefault(usernaem, emp).getLast_name());
        b.append("  ");
        b.append(map1.getOrDefault(usernaem, emp).getAddress());
        b.append("  ");
        b.append(map1.getOrDefault(usernaem, emp).getPassword());
        b.append("  ");
        b.append(map1.getOrDefault(usernaem, emp).getPhone());
        b.append("  ");

        // System.out.println(map.getOrDefault(b, emp).getFirst_name());
        return b;
    }

    public void writeToFile_Admin(HashMap<String, Admin> store) throws IOException {
        try {
            File file = new File("Admin.bin");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(store);
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void readFromFile_Admin() {
        File file = new File("Admin.bin");
        //HashMap<String, Admin> temp = new HashMap<String, Admin>();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            map1 = (HashMap<String, Admin>) in.readObject();
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public int LogIn(String Username, String Password) {
        // HashMap<String, Admin> tmap = this.readFromFile_Admin();
//       for(String key : map1.keySet()){
//            System.out.println(key);
//}
        //System.out.println("the username is "+Username);

        if (map1.containsKey(Username)) {
            if (map1.get(Username).getPassword().equals(Password)) {
               return 1;
            } else {
                return 2;
            }
        } else {
           return 3;
        }
    }

    public int add_pak(Package p) throws IOException {
        if (pak.containsKey(p.getP_id())) {
            System.out.println("package alredy exists");
            return 2;
        } else {
            pak.put(p.getP_id(), p);
            System.out.println(pak);
            p.writeToFile_pack(pak);
            return 1;
        }

    }

    public int add_supp(Supplement s) throws IOException {

        if (supp.containsKey(s.getS_id())) {
            System.out.println("Supplement alredy exists");
            return 2;
        } else {
            supp.put(s.getS_id(), s);
            s.writeToFile_supp(supp);
            return 1;
        }
    }

    public int delete_pak(Package p, int pak_id) throws IOException {
        if (pak.containsKey(pak_id)) {
            pak.remove(pak_id);
            p.writeToFile_pack(pak);
            return 1;
        } else {
            System.out.println("The package is not exists to delete it");
            return 2;
        }
    }

    public int delete_supp(Supplement s, int supp_id) throws IOException {
        if (supp.containsKey(supp_id)) {
            supp.remove(supp_id);
            s.writeToFile_supp(supp);
            return 1;
        } else {
            System.out.println("The Supplement is not exists to delete it ");
            return 2;
        }
    }

    public int update_pakcost(Package p, int pak_id, int newcost) throws IOException {
        p.setCost(newcost);
        if (pak.containsKey(pak_id)) {
            pak.replace(pak_id, p);
            p.writeToFile_pack(pak);

            return 1;
        } else {
            System.out.println("The package is not exists to update it");
            return 2;
        }
    }

    public int update_pakdisc(Package p, int pak_id, String newdisc) throws IOException {
        p.setDiscrption(newdisc);
        if (pak.containsKey(pak_id)) {
            pak.replace(pak_id, p);
            p.writeToFile_pack(pak);
            return 1;

     
        } else {
            System.out.println("The package is not exists to update it");
            return 2;
        }
    }

    public int update_pakrcomm(Package p, int pak_id, String newrecomm) throws IOException {
        p.setRecommendatin(newrecomm);
        if (pak.containsKey(pak_id)) {
            pak.replace(pak_id, p);
            p.writeToFile_pack(pak);

            return 1;
        } else {
            System.out.println("The package is not exists to update it");
            return 2;
        }
    }

    public int update_suppcost(Supplement s, int supp_id, int newcost) throws IOException {
        s.setCost(newcost);
        if (supp.containsKey(supp_id)) {
            supp.replace(supp_id, s);
            s.writeToFile_supp(supp);

            return 1;
        } else {
            System.out.println("The Supplement is not exists to update it");
            return 1;
        }
    }

    public int update_suppdisc(Supplement s, int supp_id, String disc) throws IOException {
        s.setS_discreption(disc);
        if (supp.containsKey(supp_id)) {
            supp.replace(supp_id, s);
            s.writeToFile_supp(supp);

            return 1;
        } else {
            System.out.println("The Supplement is not exists to update it");
            return 2;
        }
    }

    public int update_suppRecomm(Supplement s, int supp_id, String recomm) throws IOException {
        s.setS_recommendation(recomm);
        if (supp.containsKey(supp_id)) {
            supp.replace(supp_id, s);
            s.writeToFile_supp(supp);

            return 1;
        } else {
            System.out.println("The Supplement is not exists to update it");
            return 2;
        }
    }
    public StringBuffer display_allpak() {
       // HashMap<Integer, Package> tmap = emp.readFromFile_pack();
        StringBuffer b = new StringBuffer();
                 
        for (Integer key : pak.keySet()) {
            System.out.println("the key is"+key);
            b.append(pak.get(key).toString(key));
            b.append("   ");
        }
        return b;
        
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
}
