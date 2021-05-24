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
public class Faculty extends Employee{
    private String officeHours;
    private String rank;

 


    public Faculty() {
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

 

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+"Faculty{" + "officeHours=" + officeHours + ", rank=" + rank + '}';
    }

   


}
