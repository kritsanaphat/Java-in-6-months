/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_3;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Kritsanaphat
 */
public class Lab2_3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.print("Enter year: (e.g.,2012):");
        Scanner num1 = new Scanner(System.in);
        int year = num1.nextInt();
        System.out.print("Enter month: 1-12 : ");
        Scanner num2 = new Scanner(System.in);
        int month = num2.nextInt();
        System.out.print("Enter day of the month: 1-31:");
        Scanner num3 = new Scanner(System.in);
        int day = num3.nextInt();
       
        if (month == 1 || month == 2) {
            month = month + 12;
            year=year-1;
        }
         int j = year / 100;
        int year1 = year % 100;
        int month1 = ((26 * (month + 1)) / 10);
        int h = ((day) + (month1) + (year1) + (year1 / 4) + (j / 4) + (5 * j)) % 7;
        String[] nameday={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        System.out.println("Day of the week is"+ nameday[h]);
    }
    
}
