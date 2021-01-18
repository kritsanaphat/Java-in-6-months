/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_1;

import java.util.Scanner;

/**
 *
 * @author Kritsanaphat
 */
public class Lab2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter today's day: ");
        Scanner input = new Scanner(System.in);
        int today = input.nextInt();
         System.out.print("Enter the number of days elapsed since today: ");
        Scanner input1 = new Scanner(System.in);
        int skip = input1.nextInt();
        int now=(today+skip)%7;
        String[] nameday={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Today is "+nameday[today]+" the future day is "+nameday[now]);
        
        
    }
    
}
