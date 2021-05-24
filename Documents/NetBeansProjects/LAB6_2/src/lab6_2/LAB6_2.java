/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_2;

import java.util.ArrayList;

/**
 *
 * @author Bravo 15
 */
public class LAB6_2 {

    public static void main(String[] args) {
     ArrayList<String> student;
        Course course = new Course("OOP");
        System.out.println("----ADD----");
        course.addStudent("a1");
        course.addStudent("a2");
        course.addStudent("a3");
        
        System.out.println(course.getStudent());
        course.dropStudent("a2");
        System.out.println("----DROP---");
        System.out.println(course.getStudent());
        
        System.out.println("---CLEAR---");
        course.clear();
        System.out.println(course.getStudent());
        }
   
}
