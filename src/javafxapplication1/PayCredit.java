/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication1;
/**
 *
 * @author alsae
 */
public class PayCredit {
    public int cardNum;
    public double amount;
    public int Expday;
    public int Expmon;
    public String type;

    public PayCredit() {
    }
    

    public PayCredit(int cardNum, double amount, int Expday, int Expmon, String type) {
        this.cardNum = cardNum;
        this.amount = amount;
        this.Expday = Expday;
        this.Expmon = Expmon;
        this.type = type;
    }

  public boolean pay(int cardNum,int Expday,int  Expmon, String type , double amount)
  {
     this.cardNum = cardNum;
        this.amount = amount;
        this.Expday = Expday;
        this.Expmon = Expmon;
        this.type = type;
      System.out.println("payment done ");
      return  true ;
  }
}
