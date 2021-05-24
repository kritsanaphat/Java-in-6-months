/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_1new;

/**
 *
 * @author Kritsanaphat
 */
public class SavingAccount extends Account{
    private double balance;
    public SavingAccount() {
    }

    public void chkbalance(double balance){
        if(balance>0){
            
        }
        else System.out.println("ERROR");
    }

    
    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public String toString() {
        return super.toString()+"SavingAccount{" + '}';
    }

    
    
}
