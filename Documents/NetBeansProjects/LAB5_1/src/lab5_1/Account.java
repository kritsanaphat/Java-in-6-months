/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_1;


/**
 *
 * @author Kritsanaphat
 */
public class Account {

    private int id = 1122;
    private double balance = 20000;
    private double annualInterestRate =4.5;
    private java.util.Date dateCreated;

 
    public Account() {
        dateCreated = new java.util.Date();
    }
    
    
    Account(int id,double balance){
       this.balance = balance;
        this.id=id;
    }
    // Getter
  public int getid() {
    return id;
  }
  public double getbalance() {
    return  balance;
  }
  public double getannualInterestRate() {
    return  annualInterestRate;
  }
   public String getDateCreated() {
        return this.dateCreated.toString();
    }

   
   
  // Setter
  public void setid(int id) {
        int newid = 0;
        this.id = newid;
  }
  public void setbalance(double balance) {
        int newbalance = 0;
        this.balance = newbalance;
  }
  public void setannualInterestRate(double annualInterestRate) {
        int newannualInterestRate = 0;
        this.annualInterestRate = newannualInterestRate;
  }
  
  
  public double withdraw(double balance , double withdraw1){
      balance = balance-withdraw1;
        return  balance;
  } 
  public double deposit(double withdraw , double desposit1){
     
      balance = balance+ desposit1;
        return  balance;
      
  }
  public double getMonthlyInterest(double money , double annualInterestRate){
      money=((money*annualInterestRate)/12)/100;
        return  money;
  } 
}
