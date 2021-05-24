/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_2;

import java.util.ArrayList;



public class Course {

    private String courseName;
    private ArrayList<String> students = new ArrayList<String>();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student) {
        this.students.add(student);
        numberOfStudents++;
    }
    public ArrayList<String> getStudent() {
        return students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student) {
        this.students.remove(student);
    }
    
    public void clear() {
       students.clear();
    }
}
