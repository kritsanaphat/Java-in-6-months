/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_3;

import java.time.LocalDate;

/**
 *
 * @author Kritsanaphat
 */
public class Staff extends Employee{
     
    private String title;

   

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Staff() {
    }

    @Override
    public String toString() {
        return super.toString()+"Staff{" + "title=" + title + '}';
    }

    
    
}
