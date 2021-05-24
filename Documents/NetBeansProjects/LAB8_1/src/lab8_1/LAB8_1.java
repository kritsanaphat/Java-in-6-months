/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_1;

import java.util.Scanner;

/**
 *
 * @author Kritsanaphat
 */
public class LAB8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input side 1 :");
        double side1=input.nextDouble();
        System.out.print("Input side 2 :");
        double side2=input.nextDouble();
        System.out.print("Input side 3 :");
        double side3=input.nextDouble();
        System.out.print("Input Color :");
        String color =input.nextLine();
        color =input.nextLine();
        System.out.print("Input filled(true/false) :");
        boolean filled =input.nextBoolean();
        TriangleClass T = new TriangleClass(side1,side2,side3,color,filled);
        T.show();
    }
    
    
}
