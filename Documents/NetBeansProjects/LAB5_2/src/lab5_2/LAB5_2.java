/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_2;

import java.util.Scanner;

/**
 *
 * @author Kritsanaphat
 */
public class LAB5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       RegularPolygon r = new  RegularPolygon();
       int i=0;
       int defines1=0,side1=0;
       int x1=0,y1=0;
       
       while(i!=4){
           System.out.println("Select choice below");
           System.out.println("1 No-arg ");
           System.out.println("2 RegularPolygon2");
           System.out.println("3 RegularPolygon3");
           System.out.println("4 Exit");
           Scanner input1 = new Scanner(System.in);
           i=input1.nextInt();
           if(i==1){
                System.out.println("Perimeter = "+r.getPerimeter(r.getdefines(), r.getdeside()));
                 System.out.println("Arae = "+ r.getArea(r.getdefines(), r.getdeside()));
           }
           else if(i==2){
               System.out.print("number of side :");
                 Scanner input2 = new Scanner(System.in);
                 defines1=input2.nextInt();
               System.out.print("Length of each side :");
               Scanner input3 = new Scanner(System.in);
                 side1=input3.nextInt();
                 System.out.println("Perimeter = "+r.getPerimeter(defines1, side1));
                 System.out.println("Arae = "+ r.getArea(defines1, side1));
           }
           else if(i==3){
               System.out.print("number of side :");
                 Scanner input2 = new Scanner(System.in);
                 defines1=input2.nextInt();
               System.out.print("Length of each side :");
               Scanner input3 = new Scanner(System.in);
                 side1=input3.nextInt();
                  System.out.print("x-coordinate :");
               Scanner input4 = new Scanner(System.in);
                 x1=input4.nextInt();
                 System.out.print("y-coordinate :");
                Scanner input5 = new Scanner(System.in);
                 y1=input5.nextInt();
                 System.out.println("Perimeter = "+r.getPerimeter(defines1, side1));
                 System.out.println("Arae = "+ r.getArea(defines1, side1));
           }
       }
    }
    
}
