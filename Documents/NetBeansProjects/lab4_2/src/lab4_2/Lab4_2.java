/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_2;

import java.util.GregorianCalendar;

public class Lab4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GregorianCalendar calender1 = new GregorianCalendar();
        long day = 86400000L;
        long current = calender1.getTimeInMillis();
        
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + calender1.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + calender1.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + calender1.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + calender1.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("------------");
        
        calender1.setTimeInMillis(current + day);
        System.out.println("After specified the elapsed time od one day after current day");
        System.out.println("Year is " + calender1.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + calender1.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + calender1.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + calender1.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(calender1.getTime());
    }
    }
    

