/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication1;
import java.io.Serializable;
import static javafxapplication1.Trainees.map;

/**
 *
 * @author alsae
 */
public class Trainee implements Serializable {
    private String  username;
    private String first_name;
    private String second_name;
    private int  phone;
    private String addres;
    private String password;
    private boolean active= false  ;
    private  StringBuffer pakage;
    private StringBuffer supp;

    public Trainee() {
    }
    

    public Trainee(String username, String first_name, String second_name, int phone, String addres, String password) {
        this.username = username;
        this.first_name = first_name;
        this.second_name = second_name;
        this.phone = phone;
        this.addres = addres;
        this.password = password;
    }

    public StringBuffer getPakage() {
        return pakage;
    }

    public StringBuffer getSupp() {
        return supp;
    }

    public void setPakage(StringBuffer pakage) {
        this.pakage = pakage;
    }

    public void setSupp(StringBuffer supp) {
        this.supp = supp;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    
    
    public boolean isActive() {
        return active;
    }

    
    public String getUsername() {
        return username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddres() {
        return addres;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    Object toString(String key) {
          StringBuffer b = new StringBuffer();
        b.append(map.get(key).getUsername());
        b.append("  ");
        b.append(map.get(key).getPassword());
        b.append("  ");
        b.append(map.get(key).getFirst_name());
        b.append("  ");
        b.append(map.get(key).getSecond_name());
        b.append("  ");
        b.append(map.get(key).getPhone());
        b.append("  ");
        b.append(map.get(key).getAddres());
        b.append("  ");
        b.append(map.get(key).getSupp());
        b.append("  ");
        b.append(map.get(key).getPakage());
        b.append("  ");
        b.append(map.get(key).isActive());
        b.append("  ");

        return b;
    }
    
}


