/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_4;

import java.util.Scanner;

/**
 *
 * @author Kritsanaphat
 */
public class Lab2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter the first city: ");
        Scanner input1 = new Scanner(System.in);
        String fcity = input1.nextLine();
        System.out.print("Enter the second city: ");
        Scanner input2 = new Scanner(System.in);
        String scity = input2.nextLine();
        System.out.print("Enter the third city: ");
        Scanner input3 = new Scanner(System.in);
        String tcity = input3.nextLine();
        char F = fcity.charAt(0);
        char S = scity.charAt(0);
        char T = tcity.charAt(0);
        System.out.print("The three cities in alphabetical order are ");
            if (F < S) {
                if (F < T) {
                    System.out.print(fcity+" ");
                    if(T>S){
                        System.out.print(scity+" "+tcity);
                    }
                    else{
                        System.out.print(tcity+" "+scity);
                    }
                } else {
                    System.out.print(tcity+" " +fcity+" " +scity);
                }
            } 
            else if (F > S) {
                if (S < T) {
                    System.out.print(scity+" ");
                    if(T<F){
                        System.out.print(tcity+" " +fcity);
                    }
                    else {
                        System.out.print(fcity+" "+ tcity);
                    }
                }
                else {
                    System.out.print(tcity+" "+scity+" "+fcity);
                }
        }
    }
}
