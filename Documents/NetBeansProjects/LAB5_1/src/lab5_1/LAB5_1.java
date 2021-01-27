/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_1;

import java.util.Scanner;

/**
 *
 * @author Kritsanaphat
 */
public class LAB5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Account account = new Account();
      
        double withdraw1=0;
        double deposit1=0;
      
        System.out.println("id :"+account.getid());
        System.out.println("balance :"+"$"+account.getbalance());
        System.out.print("withdraw : ");
        Scanner input1 = new Scanner(System.in);
        withdraw1=input1.nextDouble();
        if(withdraw1>account.getbalance()){
            System.out.println("Error");
        }
        else {
        System.out.println("balance :"+"$"+account.withdraw(account.getbalance(), withdraw1));
        }
        System.out.print("deposit :");
        Scanner input2 = new Scanner(System.in);
        deposit1=input2.nextDouble();
        double money=account.deposit(account.getbalance(), deposit1)-withdraw1;
        System.out.println("balance :"+"$"+money);
        System.out.println("annualInterestRate :"+ account.getMonthlyInterest(money, account.getannualInterestRate())+"%");
        System.out.println("Data create :" +account.getDateCreated());
    }
    
}
