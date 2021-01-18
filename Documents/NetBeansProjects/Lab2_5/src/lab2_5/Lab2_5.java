/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_5;

import java.util.Scanner;

/**
 *
 * @author Kritsanaphat
 */
public class Lab2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter the number of lines: ");
     Scanner num1 = new Scanner(System.in);
     int num=num1.nextInt();
     for(int i=0;i<num;i++){
         for(int k=0;i+k<num;k++)
         {
            System.out.print("  ");
         }
         for(int k=i;k>=1;k--)
         {
             System.out.print(k+" ");
         }
         for(int k=2;k<=i;k++){
             System.out.print(k+" ");
         }
         System.out.println();
     }
    }
    
}
