/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_3;

/**
 *
 * @author Kritsanaphat
 */
public class Student extends Person {
   
    private String levelname;

    public Student() {
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname;
    }

   

    public String getLevelname() {
        return levelname;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" + "levelname=" + levelname + '}';
    }

   

  
}
