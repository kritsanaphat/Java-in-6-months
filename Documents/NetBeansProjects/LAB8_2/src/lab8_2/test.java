/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_2;

import java.util.Scanner;

/**
 *
 * @author Kritsanaphat
 */
public class test {
    public static double sumArea(Geometric[] a) {
        double total = 0;
        for(int i=0;i<a.length;i++){
            total += a[i].getArea();
        }
        return total;
    }
    public static void main(String[] args) {
        double total=0;
        Geometric[] a= new Geometric[5];
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("---Circle1---");
        System.out.print("Input radius :");
        double radius1 = input.nextDouble();
        System.out.print("Input Color :");
        String color1 = input.nextLine();
        color1 = input.nextLine();
        System.out.print("is filled(true/false) :");
        Boolean fill1 = input.nextBoolean();
        a[0] = new Circle(radius1,color1,fill1);
        a[0].show();
        
         
        System.out.println("---Circle2---");
        System.out.print("Input radius :");
        double radius2 = input.nextDouble();
        System.out.print("Input Color :");
        String color2 = input.nextLine();
        color2 = input.nextLine();
        System.out.print("is filled(true/false) :");
        Boolean fill2 = input.nextBoolean();
        a[1] = new Circle(radius2,color2,fill2);
        a[1].show();
        
        System.out.println("---Rectangle1---");
        System.out.print("Input side1 :");
        double side1 = input.nextDouble();
        System.out.print("Input side2 :");
        double side2 = input.nextDouble();     
        System.out.print("Input Color :");
        String color3 = input.nextLine();
        color3 = input.nextLine();
        System.out.print("is filled(true/false) :");
        Boolean fill3 = input.nextBoolean();
        a[2] = new rectangles(side1,side2,color3,fill3);
        a[2].show();
        
        System.out.println("---Rectangle2---");
        System.out.print("Input side1 :");
        double side3 = input.nextDouble();
        System.out.print("Input side2 :");
        double side4 = input.nextDouble();     
        System.out.print("Input Color :");
        String color4 = input.nextLine();
        color4 = input.nextLine();
        System.out.print("is filled(true/false) :");
        Boolean fill4 = input.nextBoolean();
        a[3] = new rectangles(side3,side4,color4,fill4);
        a[3].show();
        
         System.out.println("---Triangle---");
        System.out.print("Input side1 :");
        double side5 = input.nextDouble();
        System.out.print("Input side2 :");
        double side6 = input.nextDouble(); 
        System.out.print("Input side3 :");
        double side7 = input.nextDouble();
        System.out.print("Input Color :");
        String color5 = input.nextLine();
        color5 = input.nextLine();
        System.out.print("is filled(true/false) :");
        Boolean fill5 = input.nextBoolean();
        a[4] = new Triangle(side5,side6,side7,color5,fill5);
        a[4].show();
        
        total = sumArea(a);
        System.out.println("------------------------");
        System.out.println("Total area = "+total);
    }
    

}


