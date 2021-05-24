/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_1;

import java.util.Scanner;

/**
 *
 * @author Kritsanaphat
 */
public class LAB6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Enter your age");
        double age = input.nextInt();
        System.out.println("Enter your weight");
        double weight = input.nextDouble();
        System.out.println("Enter your feet");
        double feet = input.nextDouble();
        System.out.println("Enter your inches");
        double inches = input.nextDouble();
       
        BMIClass bmi = new BMIClass((int) age, name, weight , feet , inches);
        
        System.out.println("Your Name = "+bmi.getName());
        System.out.println("Your Age = "+bmi.getAge());
        System.out.println("Your BMI = "+bmi.bmicalculator(bmi.getWeight(), bmi.getFeet(),bmi.getInches()));
        bmi.Interpretation(bmi.getWeight(), bmi.getFeet(),bmi.getInches());
        
       }
}
