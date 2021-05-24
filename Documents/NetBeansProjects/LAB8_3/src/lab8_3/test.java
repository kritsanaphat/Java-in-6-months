/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_3;

import java.util.Scanner;

/**
 *
 * @author Kritsanaphat
 */
public class test {

    public static void main(String[] args) throws CloneNotSupportedException {
        int menu = 0;
        while (menu != 4) {
            System.out.print("1 = Circle , 2 = Rectangle , 3 = Triangle , 4 = Exit :");
            Scanner input = new Scanner(System.in);
            menu = input.nextInt();
            if (menu == 1) {

                System.out.print("Circle c1(radius color weight) : ");
                double radius1 = input.nextDouble();
                String color1 = input.next();
                double weight1 = input.nextDouble();

                System.out.print("Circle c2(radius color weight) : ");
                double radius2 = input.nextDouble();
                String color2 = input.next();
                double weight2 = input.nextDouble();

                System.out.print("3.1 Find the larger object using max method :");
                String in1 = input.next();
                String in2 = input.next();

                Cricle c1 = new Cricle("c1", radius1, color1, weight1);
                Cricle c2 = new Cricle("c2", radius2, color2, weight2);

                if (in1.equals("c1") && in2.equals("c2")) {

                    System.out.println(c1.max(c1, c2));
                } else if (in1.equals("c2") && in2.equals("c1")) {
                    System.out.println(c1.max(c2, c1));

                } else {
                    System.out.println("Please enter c1 and c2 only !!");
                }

                ///end compare 1 2
                System.out.print("Cloning Circle c3 by using :");
                String in3 = input.next();

                if (in3.equals("c1")) {
                    Cricle c3 = (Cricle) c1.clone();
                    
                    System.out.println(in1 + " == " + in3 + " is :" + (c1 == c3));
                    System.out.println(in3 + ".equals(c3) is : " + c1.equals(c3));

                    System.out.print("3.2 Find the larger of 2 instances of comparable objects : ");
                    String name1 = input.next();
                    String name2 = input.next(); 
                    c3.name = "c3";
                    if (name1.equals("c1") && name2.equals("c2")) {
                        System.out.println(c1.max(c1, c2));
                    } else if (name1.equals("c2") && name2.equals("c1")) {
                        System.out.println(c1.max(c2, c1));
                    } else if (name1.equals("c2") && name2.equals("c3")) {
                        System.out.println(c1.max(c2, c3));
                    } else if (name1.equals("c1") && name2.equals("c3")) {
                        System.out.println(c1.max(c1, c3));
                    } else if (name1.equals("c3") && name2.equals("c1")) {
                        System.out.println(c1.max(c3, c1));
                    } else if (name1.equals("c3") && name2.equals("c2")) {
                        System.out.println(c1.max(c3, c2));
                    } else {
                        System.out.println("Please enter c1 or c2 or c3 only !!");
                    }

                } else if (in3.equals("c2")) {
                    Cricle c3 = (Cricle) c2.clone();
                    System.out.println(in2 + " == " + in3 + " is :" + (c2 == c3));
                    System.out.println(in3 + ".equals(c3) is : " + c2.equals(c3));
                    
                    System.out.print("3.2 Find the larger of 2 instances of comparable objects : ");
                    String name1 = input.next();
                    String name2 = input.next();
                    c3.name = "c3";
                       
                    if (name1.equals("c1") && name2.equals("c2")) {
                        System.out.println(c1.max(c1, c2));
                    } else if (name1.equals("c2") && name2.equals("c1")) {
                        System.out.println(c1.max(c2, c1));
                    } else if (name1.equals("c2") && name2.equals("c3")) {
                        System.out.println(c1.max(c2, c3));
                    } else if (name1.equals("c1") && name2.equals("c3")) {
                        System.out.println(c1.max(c1, c3));
                    } else if (name1.equals("c3") && name2.equals("c1")) {
                        System.out.println(c1.max(c3, c1));
                    } else if (name1.equals("c3") && name2.equals("c2")) {
                        System.out.println(c1.max(c3, c2));
                    } else {
                        System.out.println("Please enter c1 or c2 or c3 only !!");
                    }
                } else {
                    System.out.println("Please enter only c1 or c2 !!");
                }

            } else if (menu == 2) {
                
               
                System.out.print("Rectangle1 r1(width height color weight) : ");
                double width0 = input.nextDouble();
                double height0 = input.nextDouble();
                String color0 = input.next();
                double weight0 = input.nextDouble();
                
                
                System.out.print("Rectangle2 r2(width height color weight) : ");
                double width1= input.nextDouble();
                double height1 = input.nextDouble();
                String color1 = input.next();
                double weight1 = input.nextDouble();
               
                Rectangle r1 = new Rectangle("r1",width0,height0,color0,weight0);
                Rectangle r2 = new Rectangle("r2",width1,height1,color1,weight1);
                
                System.out.print("3.1 Find the larger object using max method :");
                String in1 = input.next();
                String in2 = input.next();
                
                
                if (in1.equals("r1") && in2.equals("r2")) {

                    System.out.println(r1.max(r1, r2));
                } else if (in1.equals("r2") && in2.equals("r1")) {
                    System.out.println(r1.max(r2, r1));

                } else {
                    System.out.println("Please enter r1 and r2 only !!");
                }
                
                ///end compare 1 2
                System.out.print("Cloning Circle r3 by using :");
                String in3 = input.next();

                if (in3.equals("r1")) {
                    Rectangle r3 = (Rectangle) r1.clone();
                    System.out.println(in1 + " == " + in3 + " is :" + (r1 == r3));
                    System.out.println(in3 + ".equals(r3) is : " + r1.equals(r3));

                    System.out.print("3.2 Find the larger of 2 instances of comparable objects : ");
                    String name1 = input.next();
                    String name2 = input.next();
                    r3.name = "r3";

                    if (name1.equals("r1") && name2.equals("r2")) {
                        System.out.println(r1.max(r1, r2));
                    } else if (name1.equals("r2") && name2.equals("r1")) {
                        System.out.println(r1.max(r2, r1));
                    } else if (name1.equals("r2") && name2.equals("r3")) {
                        System.out.println(r1.max(r2, r3));
                    } else if (name1.equals("r1") && name2.equals("r3")) {
                        System.out.println(r1.max(r1, r3));
                    } else if (name1.equals("r3") && name2.equals("r1")) {
                        System.out.println(r3.max(r3, r1));
                    } else if (name1.equals("r3") && name2.equals("r2")) {
                        System.out.println(r3.max(r3, r2));
                    } else {
                        System.out.println("Please enter r1 or r2 or r3 only !!");
                    }

                } else if (in3.equals("r2")) {
                    Rectangle r3 = (Rectangle) r2.clone();
                    System.out.println(in2 + " == " + in3 + "is :" + (r2 == r3));
                    System.out.println(in3 + ".equals(r3) is : " + r2.equals(r3));
                    
                    System.out.print("3.2 Find the larger of 2 instances of comparable objects : ");
                    String name1 = input.next();
                    String name2 = input.next();
                     r3.name = "r3";

                    if (name1.equals("r1") && name2.equals("r2")) {
                        System.out.println(r1.max(r1, r2));
                    } else if (name1.equals("r2") && name2.equals("r1")) {
                        System.out.println(r1.max(r2, r1));
                    } else if (name1.equals("r2") && name2.equals("r3")) {
                        System.out.println(r1.max(r2, r3));
                    } else if (name1.equals("r1") && name2.equals("r3")) {
                        System.out.println(r1.max(r1, r3));
                    } else if (name1.equals("r3") && name2.equals("r1")) {
                        System.out.println(r1.max(r3, r1));
                    } else if (name1.equals("r3") && name2.equals("r2")) {
                        System.out.println(r1.max(r3, r2));
                    } else {
                        System.out.println("Please enter r1 or r2 or r3 only !!");
                    }
                } else {
                    System.out.println("Please enter only r1 or r2 !!");
                }
             
                

            } else if (menu == 3) {
                
               
               
               System.out.print("Triangle t1(side1 side2 side3 color weight) : ");
                double side10 = input.nextDouble();
                double side20 = input.nextDouble();
                double side30 = input.nextDouble();
                String color0 = input.next();
                double weight0 = input.nextDouble();         
      
                  
               System.out.print("Triangle t2(side1 side2 side3 color weight) : ");
                double side11 = input.nextDouble();
                double side21 = input.nextDouble();
                double side31 = input.nextDouble();
                String color1 = input.next();
                double weight1 = input.nextDouble();
                
                Triangle t1 = new Triangle("t1",side10,side20,side30,color0,weight0);
                Triangle t2 = new Triangle("t2",side11,side21,side31,color1,weight1);
                
                System.out.print("3.1 Find the larger object using max method :");
                String in1 = input.next();
                String in2 = input.next();
                
                
                if (in1.equals("t1") && in2.equals("t2")) {

                    System.out.println(t1.max(t1, t2));
                } else if (in1.equals("t2") && in2.equals("t1")) {
                    System.out.println(t1.max(t2, t1));

                } else {
                    System.out.println("Please enter t1 and t2 only !!");
                }
                
               
                
                ///end compare 1 2
                System.out.print("Cloning Rectangle t3 by using :");
                String in3 = input.next();

                if (in3.equals("t1")) {
                    Triangle t3 = (Triangle) t1.clone();
                    System.out.println(in1 + " == " + in3 + " is :" + (t1 == t3));
                    System.out.println(in3 + ".equals(t3) is : " + t1.equals(t3));

                    System.out.print("3.2 Find the larger of 2 instances of comparable objects : ");
                    String name1 = input.next();
                    String name2 = input.next();
                     t3.name = "t3";

                    if (name1.equals("t1") && name2.equals("t2")) {
                        System.out.println(t1.max(t1, t2));
                    } else if (name1.equals("t2") && name2.equals("t1")) {
                        System.out.println(t1.max(t2, t1));
                    } else if (name1.equals("t2") && name2.equals("t3")) {
                        System.out.println(t1.max(t2, t3));
                    } else if (name1.equals("t1") && name2.equals("t3")) {
                        System.out.println(t1.max(t1, t3));
                    } else if (name1.equals("t3") && name2.equals("t1")) {
                        System.out.println(t1.max(t3, t1));
                    } else if (name1.equals("t3") && name2.equals("t2")) {
                        System.out.println(t1.max(t3, t2));
                    } else {
                        System.out.println("Please enter t1 or t2 or t3 only !!");
                    }
                    
                    
                } else if (in3.equals("t2")) {
                    Triangle t3 = (Triangle) t2.clone();
                    System.out.println(in2 + " == " + in3 + " is :" + (t2 == t3));
                    System.out.println(in3 + ".equals(t3) is : " + t2.equals(t3));
                    
                    System.out.print("3.2 Find the larger of 2 instances of comparable objects : ");
                    String name1 = input.next();
                    String name2 = input.next();
                    t3.name = "t3";

                    if (name1.equals("t1") && name2.equals("t2")) {
                        System.out.println(t1.max(t1, t2));
                    } else if (name1.equals("t2") && name2.equals("t1")) {
                        System.out.println(t1.max(t2, t1));
                    } else if (name1.equals("t2") && name2.equals("t3")) {
                        System.out.println(t1.max(t2, t3));
                    } else if (name1.equals("t1") && name2.equals("t3")) {
                        System.out.println(t1.max(t1, t3));
                    } else if (name1.equals("t3") && name2.equals("t1")) {
                        System.out.println(t1.max(t3, t1));
                    } else if (name1.equals("t3") && name2.equals("t2")) {
                        System.out.println(t1.max(t3, t2));
                    } else {
                        System.out.println("Please enter t1 or t2 or t3 only !!");
                    }
                } else {
                    System.out.println("Please enter only t1 or t2 !!");
                }
            }

            if (menu == 4) {
                System.out.println("End Program");
            }
        }
    }
}
