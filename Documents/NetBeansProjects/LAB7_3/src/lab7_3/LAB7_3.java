/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_3;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Kritsanaphat
 */
public class LAB7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student();
        employee();
        faculty();
        Staff();
        
        
    }
    public static void student() {
        System.out.print("Enter name Student : ");
        Student s1 = new Student();
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        s1.setName(name);
         System.out.print("Enter Level : ");
        String levelname= input.nextLine();
        s1.setLevelname(levelname);
        System.out.print("Enter Address : ");
        String address= input.nextLine();
        s1.setAddress(address);
        System.out.print("Enter phone : ");
        String phone= input.nextLine();
        s1.setPhoneNumber(phone);
        System.out.print("Enter email : ");
        String email= input.nextLine();
        s1.setEmailAddress(email);
        System.out.println(s1.toString());
        
    }
    
    public static void employee() {
        System.out.print("Enter name Employee : ");
        Employee e1 = new Employee();
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        e1.setName(name);
        System.out.print("Enter Address : ");
        String address= input.nextLine();
        e1.setAddress(address);
        System.out.print("Enter phone : ");
        String phone= input.nextLine();
        e1.setPhoneNumber(phone);
        System.out.print("Enter email : ");
        String email= input.nextLine();
        e1.setEmailAddress(email);
        System.out.print("Enter office :");
        String office = input.nextLine();
        e1.setOffice(office);
        System.out.print("Enter salary :");
        String  salary = input.nextLine();
        e1.setSalary(salary);
        LocalDate ld = LocalDate.of(1988, Month.MARCH, 1);
        e1.setDateHired(ld);
       System.out.println(e1.toString());

    }
    
    public static void faculty() {
        System.out.print("Enter name faculty : ");
        Faculty f1 = new Faculty();
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        f1.setName(name);
        System.out.print("Enter Address : ");
        String address= input.nextLine();
        f1.setAddress(address);
        System.out.print("Enter phone : ");
        String phone= input.nextLine();
        f1.setPhoneNumber(phone);
        System.out.print("Enter email : ");
        String email= input.nextLine();
        f1.setEmailAddress(email);
        System.out.print("Enter office :");
        String office = input.nextLine();
        f1.setOffice(office);
        System.out.print("Enter salary :");
        String  salary = input.nextLine();
        f1.setSalary(salary);
        System.out.print("Enter office hours :");
        String officeHours = input.nextLine();
        f1.setOfficeHours(officeHours);
        System.out.print("Enter rank :");
        String rank = input.nextLine();
        f1.setRank(rank);
        LocalDate ld = LocalDate.of(1908, Month.JULY, 5);
        f1.setDateHired(ld);
        System.out.println(f1.toString());
       

    }
    
    public static void Staff() {
        System.out.print("Enter name Staff : ");
        Faculty t1 = new Faculty();
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
       t1.setName(name);
        System.out.print("Enter Address : ");
        String address= input.nextLine();
        t1.setAddress(address);
        System.out.print("Enter phone : ");
        String phone= input.nextLine();
        t1.setPhoneNumber(phone);
        System.out.print("Enter email : ");
        String email= input.nextLine();
        t1.setEmailAddress(email);
        System.out.print("Enter office :");
        String office = input.nextLine();
        t1.setOffice(office);
        System.out.print("Enter salary :");
        String  salary = input.nextLine();
        t1.setSalary(salary);
        System.out.print("Enter office hours :");
        String officeHours = input.nextLine();
        t1.setOfficeHours(officeHours);
        System.out.print("Enter rank :");
        String rank = input.nextLine();
        t1.setRank(rank);
        LocalDate ld = LocalDate.of(1900, Month.APRIL, 23);
        t1.setDateHired(ld);
        System.out.print("Enter title:");
        String title = input.nextLine();
        t1.setRank(title);
       System.out.println(t1.toString());

    }
}
