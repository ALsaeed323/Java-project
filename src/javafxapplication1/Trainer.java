/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication1;
import java.io.Serializable;
import static javafxapplication1.AdminProcess.map0;

/**
 *
 * @author alsae
 */
public class Trainer  implements Serializable {
     private String username;
    private String first_name;
    private String last_name;
    private String password ;
    private String address;
    private int phone ;

    public Trainer() {
    }

    public Trainer(String username, String first_name, String last_name, String password, String address, int phone) {
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    Object toString(String key) {
          StringBuffer b = new StringBuffer();
        b.append(map0.get(key).getUsername());
        b.append("  ");
        b.append(map0.get(key).getPassword());
        b.append("  ");
        b.append(map0.get(key).getFirst_name());
        b.append("  ");
        b.append(map0.get(key).getLast_name());
        b.append("  ");
        b.append(map0.get(key).getPhone());
        b.append("  ");
        b.append(map0.get(key).getAddress());
        b.append("  ");
        

        return b;
    }
    
    
    
}

