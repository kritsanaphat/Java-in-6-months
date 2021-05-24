/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_3;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Kritsanaphat
 */
public class Employee extends Person{
    private String office;
    private String salary;
    LocalDate DateHired;

    public Employee() {
    }


    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String  getSalary() {
        return salary;
    }

    public void setSalary(String  salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return DateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.DateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString()+"Employee{" + "office=" + office + ", salary=" + salary + ", DateHired=" + DateHired + ", dateHired=" + DateHired + '}';
    }

 
    
}
