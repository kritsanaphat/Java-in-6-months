/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_1new;

import java.util.Scanner;

/**
 *
 * @author Kritsanaphat
 */
public class LAB7_1new {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account account = new Account();
        CheckingAccount Chk = new CheckingAccount();
        SavingAccount save = new SavingAccount();
        Scanner input1 = new Scanner(System.in);
        
        double withdraw1=0;
        double limit;
        double balance;
        
        System.out.println("Checkings");
        System.out.print("Overdraft Limit: ");
        limit = input1.nextDouble();
        Chk.setLimit(limit);
        
        
        System.out.print("balance :");
        balance=input1.nextDouble();
        account.setbalance(balance);
        Chk.setbalance(balance);
        save.setbalance(balance);
        
        save.chkbalance(balance);
        
        System.out.print("withdraw : ");
        withdraw1=input1.nextDouble();
        Chk.setWithdraw(withdraw1);
        
        
        
       Chk.chkover(limit, withdraw1, balance);
       
        System.out.println(Chk.toString());
        System.out.println(save.toString());
     
        
       
    }
    
}
